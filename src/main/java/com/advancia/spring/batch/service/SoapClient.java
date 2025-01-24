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
        switch(operation.getElementType()) {
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
                throw new IllegalArgumentException("Unknown element type: " + operation.getElementType());
        }
    }
        
    private void handleDoughOperation(Operation operation) throws Exception {
        Dough dough = new Dough();
        dough.setType(operation.getElementName());
        switch(operation.getType()) {
            case "ADD":
            	piadinaCS.addDough(dough);
                break;
            case "UPDATE":
            	piadinaCS.updateDoughByType(operation.getElementName(), dough);
                break;
            case "REMOVE":
            	piadinaCS.deleteDoughByType(operation.getElementName());
                break;
            default:
                throw new IllegalArgumentException("Invalid operation type: " + operation.getType());
        }
    }
    
    private void handleMeatBaseOperation(Operation operation) throws Exception {
        MeatBase meatBase = new MeatBase();
        meatBase.setType(operation.getElementName());
        switch(operation.getType()) {
            case "ADD":
            	piadinaCS.addMeatBase(meatBase);
                break;
            case "UPDATE":
            	piadinaCS.updateMeatBaseByType(operation.getElementName(), meatBase);
                break;
            case "REMOVE":
            	piadinaCS.deleteMeatBaseByType(operation.getElementName());
                break;
            default:
                throw new IllegalArgumentException("Invalid operation type: " + operation.getType());
        }
    }
    
    private void handleSaucesOperation(Operation operation) throws Exception {
        Sauces sauces = new Sauces();
        sauces.setType(operation.getElementName());
        switch(operation.getType()) {
            case "ADD":
            	piadinaCS.addSauces(sauces);
                break;
            case "UPDATE":
            	piadinaCS.updateSaucesByType(operation.getElementName(), sauces);
                break;
            case "REMOVE":
            	piadinaCS.deleteSaucesByType(operation.getElementName());
                break;
            default:
                throw new IllegalArgumentException("Invalid operation type: " + operation.getType());
        }
    }
    
    private void handleOptionalElementOperation(Operation operation) throws Exception {
        OptionalElements optionalElements = new OptionalElements();
        optionalElements.setType(operation.getElementName());
        switch(operation.getType()) {
            case "ADD":
            	piadinaCS.addOptionalElements(optionalElements);
                break;
            case "UPDATE":
            	piadinaCS.updateOptionalElementsByType(operation.getElementName(), optionalElements);
                break;
            case "REMOVE":
            	piadinaCS.deleteOptionalElementsByType(operation.getElementName());
                break;
            default:
                throw new IllegalArgumentException("Invalid operation type: " + operation.getType());
        }
    }
}