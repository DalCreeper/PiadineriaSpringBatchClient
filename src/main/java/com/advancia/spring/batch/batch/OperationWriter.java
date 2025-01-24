package com.advancia.spring.batch.batch;

import java.util.List;

import org.springframework.batch.item.ItemWriter;
import org.springframework.stereotype.Component;

import com.advancia.spring.batch.model.Operation;

@Component
public class OperationWriter implements ItemWriter<Operation> {

    @Override
    public void write(List<? extends Operation> items) throws Exception {
        for(Operation operation : items) {
            System.out.println("Processed: " + operation);
        }
    }
}