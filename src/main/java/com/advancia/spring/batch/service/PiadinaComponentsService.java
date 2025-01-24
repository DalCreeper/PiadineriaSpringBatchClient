package com.advancia.spring.batch.service;

import com.advancia.spring.batch.soapclient.Dough;
import com.advancia.spring.batch.soapclient.MeatBase;
import com.advancia.spring.batch.soapclient.OptionalElements;
import com.advancia.spring.batch.soapclient.Sauces;

public interface PiadinaComponentsService {
	Dough addDough(Dough dough);
    Dough updateDoughByType(String type, Dough dough);
    void deleteDoughByType(String type);
    
    MeatBase addMeatBase(MeatBase meatBase);
    MeatBase updateMeatBaseByType(String type, MeatBase meatBase);
    void deleteMeatBaseByType(String type);
    
    Sauces addSauces(Sauces sauces);
    Sauces updateSaucesByType(String type, Sauces sauces);
    void deleteSaucesByType(String type);
    
    OptionalElements addOptionalElements(OptionalElements optionalElements);
    OptionalElements updateOptionalElementsByType(String type, OptionalElements optionalElements);
    void deleteOptionalElementsByType(String type);
}