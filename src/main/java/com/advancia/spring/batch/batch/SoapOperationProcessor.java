package com.advancia.spring.batch.batch;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.advancia.spring.batch.model.Operation;
import com.advancia.spring.batch.service.SoapClient;

@Component
public class SoapOperationProcessor implements ItemProcessor<Operation, Operation> {

    @Autowired
    private SoapClient soapClient;

    @Override
    public Operation process(Operation operation) throws Exception {
        soapClient.executeOperation(operation);
        return operation;
    }
}