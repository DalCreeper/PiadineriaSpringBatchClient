package com.advancia.spring.batch.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.advancia.spring.batch.model.Operation;
import com.advancia.spring.soapclient.Dough;
import com.advancia.spring.soapclient.MeatBase;
import com.advancia.spring.soapclient.OptionalElements;
import com.advancia.spring.soapclient.Sauces;

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
        switch (operation.getType()) {
            case "ADD":
            	piadinaCS.addDough(dough);
                break;
            case "UPDATE":
            	piadinaCS.updateDough(operation.getElementId(), dough);
                break;
            case "REMOVE":
            	piadinaCS.deleteDough(operation.getElementId());
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
            	piadinaCS.updateMeatBase(operation.getElementId(), meatBase);
                break;
            case "REMOVE":
            	piadinaCS.deleteMeatBase(operation.getElementId());
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
            	piadinaCS.updateSauces(operation.getElementId(), sauces);
                break;
            case "REMOVE":
            	piadinaCS.deleteSauces(operation.getElementId());
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
            	piadinaCS.updateOptionalElements(operation.getElementId(), optionalElement);
                break;
            case "REMOVE":
            	piadinaCS.deleteOptionalElements(operation.getElementId());
                break;
            default:
                throw new IllegalArgumentException("Invalid operation type: " + operation.getType());
        }
    }
}