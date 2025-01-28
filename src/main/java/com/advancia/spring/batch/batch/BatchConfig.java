package com.advancia.spring.batch.batch;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import javax.naming.InitialContext;
import javax.sql.DataSource;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.*;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.launch.support.SimpleJobLauncher;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.core.repository.support.JobRepositoryFactoryBean;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.builder.FlatFileItemReaderBuilder;
import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.FileSystemResource;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

import com.advancia.spring.batch.model.Operation;
import com.advancia.spring.batch.service.SoapClient;

@Configuration
@EnableBatchProcessing
public class BatchConfig {
	private static final Logger logger = LogManager.getLogger(BatchConfig.class);
	
	@Autowired
    private JobBuilderFactory jobBuilderFactory;

    @Autowired
    private StepBuilderFactory stepBuilderFactory;

    @Autowired
    private SoapClient soapClient;
    
    @Bean
    public DataSource dataSource() {
        try {
        	InitialContext initialContext = new InitialContext();
            return (DataSource) initialContext.lookup("java:comp/env/jdbc/OracleDataSource");
        } catch(Exception e) {
            throw new RuntimeException("Unable to lookup DataSource from JNDI", e);
        }
    }
    
    @Bean
    public JobRepository jobRepository(DataSource dataSource, PlatformTransactionManager transactionManager) throws Exception {
        JobRepositoryFactoryBean factory = new JobRepositoryFactoryBean();
        factory.setDataSource(dataSource);
        factory.setTransactionManager(transactionManager);
        factory.setDatabaseType("ORACLE");
        factory.setTablePrefix("BATCH_");
        factory.setIsolationLevelForCreate("ISOLATION_DEFAULT");
        return factory.getObject();
    }
    
    @Bean
    public PlatformTransactionManager transactionManager(DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }
    
    @Bean
    public JobLauncher jobLauncher(JobRepository jobRepository) throws Exception {
        SimpleJobLauncher jobLauncher = new SimpleJobLauncher();
        jobLauncher.setJobRepository(jobRepository);
        return jobLauncher;
    }
    
    @Bean
    @StepScope
    public FlatFileItemReader<Operation> csvItemReader(@Value("#{jobParameters[filePath]}") String filePath) {
        return new FlatFileItemReaderBuilder<Operation>()
            .name("csvItemReader")
            .resource(new FileSystemResource(filePath))
            .delimited()
            .names("operationtype", "table", "type", "description", "price", "timestamp")
            .fieldSetMapper(new BeanWrapperFieldSetMapper<Operation>() {{
                setTargetType(Operation.class);
            }})
            .saveState(false)
            .build();
    }

    @Bean
    public ItemProcessor<Operation, Operation> itemProcessor() {
        return operation -> {
            long delay = calculateDelay(operation.getTimestamp());

            if(delay > 0) {
                ScheduledExecutorService scheduler = Executors.newSingleThreadScheduledExecutor();
                scheduler.schedule(() -> {
                    try {
						executeOperation(operation);
					} catch(Exception e) {
						logger.error("Operation failed on execute: {}", e);
					}
                }, Math.max(calculateDelay(operation.getTimestamp()), 0), TimeUnit.MILLISECONDS);
            } else {
                executeOperation(operation);
            }
            return null;
        };
    }
    
    private long calculateDelay(String timestamp) {
    	LocalDateTime operationTime = LocalDateTime.parse(timestamp, DateTimeFormatter.ISO_DATE_TIME);
        LocalDateTime now = LocalDateTime.now();
        long delay = operationTime.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli() - now.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
        return Math.max(delay, 0);
    }
    
    private void executeOperation(Operation operation) throws Exception {
        soapClient.executeOperation(operation);
    }

    @Bean
    public ItemWriter<Operation> itemWriter() {
        return operations -> {
            for(Operation operation : operations) {
            	System.out.println("Operation already scheduled: " + operation);
            }
        };
    }

    @Bean
    public Step step() {
        return stepBuilderFactory.get("step")
            .<Operation, Operation>chunk(10)
            .reader(csvItemReader(null))
            .processor(itemProcessor())
            .writer(itemWriter())
            .build();
    }

    @Bean
    public Job job() {
        return jobBuilderFactory.get("job")
            .start(step())
            .build();
    }
}