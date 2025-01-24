package com.advancia.spring.batch.batch;

import javax.sql.DataSource;

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
import org.springframework.batch.support.transaction.ResourcelessTransactionManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.FileSystemResource;
import org.springframework.jndi.JndiTemplate;
import org.springframework.transaction.PlatformTransactionManager;

import com.advancia.spring.batch.model.Operation;
import com.advancia.spring.batch.service.SoapClient;

@Configuration
@EnableBatchProcessing
public class BatchConfig {
	
	@Autowired
    private JobBuilderFactory jobBuilderFactory;

    @Autowired
    private StepBuilderFactory stepBuilderFactory;

    @Autowired
    private SoapClient soapClient;
    
    @Bean
    public DataSource dataSource() {
        try {
            JndiTemplate jndiTemplate = new JndiTemplate();
            return (DataSource) jndiTemplate.lookup("java:comp/env/jdbc/OracleDataSource");
        } catch(Exception e) {
            throw new RuntimeException("Unable to lookup DataSource from JNDI", e);
        }
    }
    
    @Bean
    public JobRepository jobRepository() throws Exception {
        JobRepositoryFactoryBean factory = new JobRepositoryFactoryBean();
        factory.setDataSource(dataSource());
        factory.setTransactionManager(transactionManager());
        return factory.getObject();
    }
    
    @Bean
    public PlatformTransactionManager transactionManager() {
        return new ResourcelessTransactionManager();
    }
    
    @Bean
    public JobLauncher jobLauncher() throws Exception {
        SimpleJobLauncher jobLauncher = new SimpleJobLauncher();
        jobLauncher.setJobRepository(jobRepository());
        return jobLauncher;
    }
    
    @Bean
    public FlatFileItemReader<Operation> csvItemReader(@Value("#{jobParameters[filePath]}") String filePath) {
        return new FlatFileItemReaderBuilder<Operation>()
            .name("csvItemReader")
            .resource(new FileSystemResource(filePath))
            .delimited()
            .names("type", "elementType", "elementName", "timestamp")
            .fieldSetMapper(new BeanWrapperFieldSetMapper<Operation>() {{
                setTargetType(Operation.class);
            }})
            .build();
    }

    @Bean
    public ItemProcessor<Operation, Operation> itemProcessor() {
        return operation -> {
            // TODO : Validate or transform operation here
            return operation;
        };
    }

    @Bean
    public ItemWriter<Operation> itemWriter() {
        return operations -> {
            for(Operation operation : operations) {
                soapClient.executeOperation(operation);
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