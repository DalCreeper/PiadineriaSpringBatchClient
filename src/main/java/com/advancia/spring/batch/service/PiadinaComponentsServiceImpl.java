package com.advancia.spring.batch.service;

import com.advancia.spring.soapclient.Dough;
import com.advancia.spring.soapclient.MeatBase;
import com.advancia.spring.soapclient.OptionalElements;
import com.advancia.spring.soapclient.PiadinaComponentsApiSoap;
import com.advancia.spring.soapclient.PiadinaComponentsApiSoapService;
import com.advancia.spring.soapclient.Sauces;

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
	public Dough updateDough(int id, Dough dough) {
		PiadinaComponentsApiSoapService service = new PiadinaComponentsApiSoapService();
        PiadinaComponentsApiSoap port = service.getPiadinaComponentsApiSoapPort();

        System.out.println("SOAP API for updating dough called.");
        try {
            Dough updatedDough = port.updateDough(id, dough);
            System.out.println("Dough updated successfully: " + updatedDough.getType());
            return updatedDough;
        } catch(Exception e) {
            System.out.println("Error while calling the SOAP API to update dough: " + e.getMessage());
            e.printStackTrace();
            return null;
        }
	}

	@Override
	public void deleteDough(int id) {
		PiadinaComponentsApiSoapService service = new PiadinaComponentsApiSoapService();
        PiadinaComponentsApiSoap port = service.getPiadinaComponentsApiSoapPort();

        System.out.println("SOAP API for deleting dough called.");
        try {
            port.deleteDough(id);
            System.out.println("Dough with ID " + id + " deleted successfully.");
        } catch(Exception e) {
            System.out.println("Error while calling the SOAP API to delete dough: " + e.getMessage());
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
	public MeatBase updateMeatBase(int id, MeatBase meatBase) {
		PiadinaComponentsApiSoapService service = new PiadinaComponentsApiSoapService();
        PiadinaComponentsApiSoap port = service.getPiadinaComponentsApiSoapPort();

        System.out.println("SOAP API for updating meatBase called.");
        try {
        	MeatBase updatedMeatBase = port.updateMeatBase(id, meatBase);
            System.out.println("MeatBase updated successfully: " + updatedMeatBase.getType());
            return updatedMeatBase;
        } catch(Exception e) {
            System.out.println("Error while calling the SOAP API to update meatBase: " + e.getMessage());
            e.printStackTrace();
            return null;
        }
	}

	@Override
	public void deleteMeatBase(int id) {
		PiadinaComponentsApiSoapService service = new PiadinaComponentsApiSoapService();
        PiadinaComponentsApiSoap port = service.getPiadinaComponentsApiSoapPort();

        System.out.println("SOAP API for deleting meatBase called.");
        try {
            port.deleteMeatBase(id);
            System.out.println("MeatBase with ID " + id + " deleted successfully.");
        } catch(Exception e) {
            System.out.println("Error while calling the SOAP API to delete meatBase: " + e.getMessage());
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
	public Sauces updateSauces(int id, Sauces sauces) {
		PiadinaComponentsApiSoapService service = new PiadinaComponentsApiSoapService();
        PiadinaComponentsApiSoap port = service.getPiadinaComponentsApiSoapPort();

        System.out.println("SOAP API for updating sauces called.");
        try {
        	Sauces updatedSauces = port.updateSauces(id, sauces);
            System.out.println("Sauces updated successfully: " + updatedSauces.getType());
            return updatedSauces;
        } catch(Exception e) {
            System.out.println("Error while calling the SOAP API to update sauces: " + e.getMessage());
            e.printStackTrace();
            return null;
        }
	}

	@Override
	public void deleteSauces(int id) {
		PiadinaComponentsApiSoapService service = new PiadinaComponentsApiSoapService();
        PiadinaComponentsApiSoap port = service.getPiadinaComponentsApiSoapPort();

        System.out.println("SOAP API for deleting sauces called.");
        try {
            port.deleteSauces(id);
            System.out.println("Sauces with ID " + id + " deleted successfully.");
        } catch(Exception e) {
            System.out.println("Error while calling the SOAP API to delete sauces: " + e.getMessage());
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
	public OptionalElements updateOptionalElements(int id, OptionalElements optionalElements) {
		PiadinaComponentsApiSoapService service = new PiadinaComponentsApiSoapService();
        PiadinaComponentsApiSoap port = service.getPiadinaComponentsApiSoapPort();

        System.out.println("SOAP API for updating optionalElements called.");
        try {
        	OptionalElements updatedOptionalElements = port.updateOptionalElements(id, optionalElements);
            System.out.println("OptionalElements updated successfully: " + updatedOptionalElements.getType());
            return updatedOptionalElements;
        } catch(Exception e) {
            System.out.println("Error while calling the SOAP API to update optionalElements: " + e.getMessage());
            e.printStackTrace();
            return null;
        }
	}

	@Override
	public void deleteOptionalElements(int id) {
		PiadinaComponentsApiSoapService service = new PiadinaComponentsApiSoapService();
        PiadinaComponentsApiSoap port = service.getPiadinaComponentsApiSoapPort();

        System.out.println("SOAP API for deleting optionalElements called.");
        try {
            port.deleteOptionalElements(id);
            System.out.println("OptionalElements with ID " + id + " deleted successfully.");
        } catch(Exception e) {
            System.out.println("Error while calling the SOAP API to delete optionalElements: " + e.getMessage());
            e.printStackTrace();
        }
	}
}