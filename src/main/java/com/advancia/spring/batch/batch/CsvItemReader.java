package com.advancia.spring.batch.batch;

import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.List;

import javax.annotation.PostConstruct;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.batch.item.ItemReader;
import org.springframework.stereotype.Component;

import com.advancia.spring.batch.model.Operation;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

@Component
public class CsvItemReader implements ItemReader<Operation> {
    private Iterator<Operation> operationIterator;
    
    private static final Logger logger = LogManager.getLogger(CsvItemReader.class);

    @PostConstruct
    public void init() throws Exception {
        try(Reader reader = Files.newBufferedReader(Paths.get("PiadineriaAdvancia_operations.csv"))) {
            CsvToBean<Operation> csvToBean = new CsvToBeanBuilder<Operation>(reader)
                .withType(Operation.class)
                .withIgnoreLeadingWhiteSpace(true)
                .build();

            List<Operation> operations = csvToBean.parse();
            operationIterator = operations.iterator();
        }
    }

    @Override
    public Operation read() {
    	if(operationIterator != null && operationIterator.hasNext()) {
            Operation operation = operationIterator.next();
            logger.info("Reading operation: {}", operation);
            return operation;
        }
        return null;
    }
}