package com.advancia.spring.batch.service;

import org.springframework.stereotype.Service;

import com.advancia.spring.batch.soapclient.Dough;
import com.advancia.spring.batch.soapclient.MeatBase;
import com.advancia.spring.batch.soapclient.OptionalElements;
import com.advancia.spring.batch.soapclient.PiadinaComponentsApiSoap;
import com.advancia.spring.batch.soapclient.PiadinaComponentsApiSoapService;
import com.advancia.spring.batch.soapclient.Sauces;

@Service
public class PiadinaComponentsServiceImpl implements PiadinaComponentsService {

	@Override
	public Dough addDough(Dough dough) {
		PiadinaComponentsApiSoapService service = new PiadinaComponentsApiSoapService();
        PiadinaComponentsApiSoap port = service.getPiadinaComponentsApiSoapPort();

        System.out.println("SOAP API for adding dough called.");
        try {
            Dough addedDough = port.addDough(dough);
            System.out.println("Dough added successfully: " + addedDough.getType());
            return addedDough;
        } catch(Exception e) {
            System.out.println("Error while calling the SOAP API to add dough: " + e.getMessage());
            e.printStackTrace();
            return null;
        }
	}
	
	@Override
	public Dough updateDoughByType(String type, Dough dough) {
	    PiadinaComponentsApiSoapService service = new PiadinaComponentsApiSoapService();
	    PiadinaComponentsApiSoap port = service.getPiadinaComponentsApiSoapPort();

	    System.out.println("SOAP API for updating dough by type called.");
	    try {
	        Dough updatedDough = port.updateDoughByType(type, dough);
	        System.out.println("Dough updated successfully by type: " + updatedDough.getType());
	        return updatedDough;
	    } catch(Exception e) {
	        System.out.println("Error while calling the SOAP API to update dough by type: " + e.getMessage());
	        e.printStackTrace();
	        return null;
	    }
	}

	@Override
	public void deleteDoughByType(String type) {
	    PiadinaComponentsApiSoapService service = new PiadinaComponentsApiSoapService();
	    PiadinaComponentsApiSoap port = service.getPiadinaComponentsApiSoapPort();

	    System.out.println("SOAP API for deleting dough by type called.");
	    try {
	        port.deleteDoughByType(type);
	        System.out.println("Dough with type " + type + " deleted successfully.");
	    } catch(Exception e) {
	        System.out.println("Error while calling the SOAP API to delete dough by type: " + e.getMessage());
	        e.printStackTrace();
	    }
	}

	@Override
	public MeatBase addMeatBase(MeatBase meatBase) {
		PiadinaComponentsApiSoapService service = new PiadinaComponentsApiSoapService();
        PiadinaComponentsApiSoap port = service.getPiadinaComponentsApiSoapPort();

        System.out.println("SOAP API for adding meatBase called.");
        try {
        	MeatBase addedMeatBase = port.addMeatBase(meatBase);
            System.out.println("MeatBase added successfully: " + addedMeatBase.getType());
            return addedMeatBase;
        } catch(Exception e) {
            System.out.println("Error while calling the SOAP API to add meatBase: " + e.getMessage());
            e.printStackTrace();
            return null;
        }
	}
	
	@Override
	public MeatBase updateMeatBaseByType(String type, MeatBase meatBase) {
	    PiadinaComponentsApiSoapService service = new PiadinaComponentsApiSoapService();
	    PiadinaComponentsApiSoap port = service.getPiadinaComponentsApiSoapPort();

	    System.out.println("SOAP API for updating meatBase by type called.");
	    try {
	        MeatBase updatedMeatBase = port.updateMeatBaseByType(type, meatBase);
	        System.out.println("MeatBase updated successfully by type: " + updatedMeatBase.getType());
	        return updatedMeatBase;
	    } catch(Exception e) {
	        System.out.println("Error while calling the SOAP API to update meatBase by type: " + e.getMessage());
	        e.printStackTrace();
	        return null;
	    }
	}

	@Override
	public void deleteMeatBaseByType(String type) {
	    PiadinaComponentsApiSoapService service = new PiadinaComponentsApiSoapService();
	    PiadinaComponentsApiSoap port = service.getPiadinaComponentsApiSoapPort();

	    System.out.println("SOAP API for deleting meatBase by type called.");
	    try {
	        port.deleteMeatBaseByType(type);
	        System.out.println("MeatBase with type " + type + " deleted successfully.");
	    } catch(Exception e) {
	        System.out.println("Error while calling the SOAP API to delete meatBase by type: " + e.getMessage());
	        e.printStackTrace();
	    }
	}

	@Override
	public Sauces addSauces(Sauces sauces) {
		PiadinaComponentsApiSoapService service = new PiadinaComponentsApiSoapService();
        PiadinaComponentsApiSoap port = service.getPiadinaComponentsApiSoapPort();

        System.out.println("SOAP API for adding sauces called.");
        try {
        	Sauces addedSauces = port.addSauces(sauces);
            System.out.println("Sauces added successfully: " + addedSauces.getType());
            return addedSauces;
        } catch(Exception e) {
            System.out.println("Error while calling the SOAP API to add sauces: " + e.getMessage());
            e.printStackTrace();
            return null;
        }
	}
	
	@Override
	public Sauces updateSaucesByType(String type, Sauces sauces) {
	    PiadinaComponentsApiSoapService service = new PiadinaComponentsApiSoapService();
	    PiadinaComponentsApiSoap port = service.getPiadinaComponentsApiSoapPort();

	    System.out.println("SOAP API for updating sauces by type called.");
	    try {
	        Sauces updatedSauces = port.updateSaucesByType(type, sauces);
	        System.out.println("Sauces updated successfully by type: " + updatedSauces.getType());
	        return updatedSauces;
	    } catch(Exception e) {
	        System.out.println("Error while calling the SOAP API to update sauces by type: " + e.getMessage());
	        e.printStackTrace();
	        return null;
	    }
	}

	@Override
	public void deleteSaucesByType(String type) {
	    PiadinaComponentsApiSoapService service = new PiadinaComponentsApiSoapService();
	    PiadinaComponentsApiSoap port = service.getPiadinaComponentsApiSoapPort();

	    System.out.println("SOAP API for deleting sauces by type called.");
	    try {
	        port.deleteSaucesByType(type);
	        System.out.println("Sauces with type " + type + " deleted successfully.");
	    } catch(Exception e) {
	        System.out.println("Error while calling the SOAP API to delete sauces by type: " + e.getMessage());
	        e.printStackTrace();
	    }
	}

	@Override
	public OptionalElements addOptionalElements(OptionalElements optionalElements) {
		PiadinaComponentsApiSoapService service = new PiadinaComponentsApiSoapService();
        PiadinaComponentsApiSoap port = service.getPiadinaComponentsApiSoapPort();

        System.out.println("SOAP API for adding optionalElements called.");
        try {
        	OptionalElements addedOptionalElements = port.addOptionalElements(optionalElements);
            System.out.println("OptionalElements added successfully: " + addedOptionalElements.getType());
            return addedOptionalElements;
        } catch(Exception e) {
            System.out.println("Error while calling the SOAP API to add optionalElements: " + e.getMessage());
            e.printStackTrace();
            return null;
        }
	}
	
	@Override
	public OptionalElements updateOptionalElementsByType(String type, OptionalElements optionalElements) {
	    PiadinaComponentsApiSoapService service = new PiadinaComponentsApiSoapService();
	    PiadinaComponentsApiSoap port = service.getPiadinaComponentsApiSoapPort();

	    System.out.println("SOAP API for updating optionalElements by type called.");
	    try {
	        OptionalElements updatedOptionalElements = port.updateOptionalElementsByType(type, optionalElements);
	        System.out.println("OptionalElements updated successfully by type: " + updatedOptionalElements.getType());
	        return updatedOptionalElements;
	    } catch(Exception e) {
	        System.out.println("Error while calling the SOAP API to update optionalElements by type: " + e.getMessage());
	        e.printStackTrace();
	        return null;
	    }
	}

	@Override
	public void deleteOptionalElementsByType(String type) {
	    PiadinaComponentsApiSoapService service = new PiadinaComponentsApiSoapService();
	    PiadinaComponentsApiSoap port = service.getPiadinaComponentsApiSoapPort();

	    System.out.println("SOAP API for deleting optionalElements by type called.");
	    try {
	        port.deleteOptionalElementsByType(type);
	        System.out.println("OptionalElements with type " + type + " deleted successfully.");
	    } catch(Exception e) {
	        System.out.println("Error while calling the SOAP API to delete optionalElements by type: " + e.getMessage());
	        e.printStackTrace();
	    }
	}
}