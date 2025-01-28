package com.advancia.spring.batch.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.advancia.spring.batch.model.Operation;
import com.advancia.spring.batch.soapclient.Dough;
import com.advancia.spring.batch.soapclient.MeatBase;
import com.advancia.spring.batch.soapclient.OptionalElements;
import com.advancia.spring.batch.soapclient.Sauces;

@Component
public class SoapClient {
	
    @Autowired
    private PiadinaComponentsService piadinaCS;

    public void executeOperation(Operation operation) throws Exception {
        switch(operation.getTable()) {
            case "Dough":
                handleDoughOperation(operation);
                break;
            case "MeatBase":
                handleMeatBaseOperation(operation);
                break;
            case "Sauces":
                handleSaucesOperation(operation);
                break;
            case "OptionalElement":
                handleOptionalElementOperation(operation);
                break;
            default:
                throw new IllegalArgumentException("Unknown table selection: " + operation.getTable());
        }
    }
        
    private void handleDoughOperation(Operation operation) throws Exception {
        Dough dough = new Dough();
        dough.setType(operation.getType());
        dough.setDescription(operation.getDescription());
        switch(operation.getOperationtype()) {
            case "ADD":
            	dough.setPrice(Double.parseDouble(operation.getPrice()));
            	piadinaCS.addDough(dough);
                break;
            case "UPDATE":
            	dough.setPrice(Double.parseDouble(operation.getPrice()));
            	piadinaCS.updateDoughByType(operation.getType(), dough);
                break;
            case "REMOVE":
            	piadinaCS.deleteDoughByType(operation.getType());
                break;
            default:
                throw new IllegalArgumentException("Invalid operation type: " + operation.getOperationtype());
        }
    }
    
    private void handleMeatBaseOperation(Operation operation) throws Exception {
        MeatBase meatBase = new MeatBase();
        meatBase.setType(operation.getType());
        meatBase.setDescription(operation.getDescription());
        switch(operation.getOperationtype()) {
            case "ADD":
            	meatBase.setPrice(Double.parseDouble(operation.getPrice()));
            	piadinaCS.addMeatBase(meatBase);
                break;
            case "UPDATE":
            	meatBase.setPrice(Double.parseDouble(operation.getPrice()));
            	piadinaCS.updateMeatBaseByType(operation.getType(), meatBase);
                break;
            case "REMOVE":
            	piadinaCS.deleteMeatBaseByType(operation.getType());
                break;
            default:
                throw new IllegalArgumentException("Invalid operation type: " + operation.getOperationtype());
        }
    }
    
    private void handleSaucesOperation(Operation operation) throws Exception {
        Sauces sauces = new Sauces();
        sauces.setType(operation.getType());
        sauces.setDescription(operation.getDescription());
        switch(operation.getOperationtype()) {
            case "ADD":
            	sauces.setPrice(Double.parseDouble(operation.getPrice()));
            	piadinaCS.addSauces(sauces);
                break;
            case "UPDATE":
            	sauces.setPrice(Double.parseDouble(operation.getPrice()));
            	piadinaCS.updateSaucesByType(operation.getType(), sauces);
                break;
            case "REMOVE":
            	piadinaCS.deleteSaucesByType(operation.getType());
                break;
            default:
                throw new IllegalArgumentException("Invalid operation type: " + operation.getOperationtype());
        }
    }
    
    private void handleOptionalElementOperation(Operation operation) throws Exception {
        OptionalElements optionalElements = new OptionalElements();
        optionalElements.setType(operation.getType());
        optionalElements.setDescription(operation.getDescription());
        switch(operation.getOperationtype()) {
            case "ADD":
            	optionalElements.setPrice(Double.parseDouble(operation.getPrice()));
            	piadinaCS.addOptionalElements(optionalElements);
                break;
            case "UPDATE":
            	optionalElements.setPrice(Double.parseDouble(operation.getPrice()));
            	piadinaCS.updateOptionalElementsByType(operation.getType(), optionalElements);
                break;
            case "REMOVE":
            	piadinaCS.deleteOptionalElementsByType(operation.getType());
                break;
            default:
                throw new IllegalArgumentException("Invalid operation type: " + operation.getOperationtype());
        }
    }
}