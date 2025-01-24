package com.advancia.spring.batch.service;

import com.advancia.spring.soapclient.Dough;
import com.advancia.spring.soapclient.MeatBase;
import com.advancia.spring.soapclient.OptionalElements;
import com.advancia.spring.soapclient.Sauces;

public interface PiadinaComponentsService {
	Dough addDough(Dough dough);
    Dough updateDough(int id, Dough dough);
    void deleteDough(int id);
    
    MeatBase addMeatBase(MeatBase meatBase);
    MeatBase updateMeatBase(int id, MeatBase meatBase);
    void deleteMeatBase(int id);
    
    Sauces addSauces(Sauces sauces);
    Sauces updateSauces(int id, Sauces sauces);
    void deleteSauces(int id);
    
    OptionalElements addOptionalElements(OptionalElements optionalElements);
    OptionalElements updateOptionalElements(int id, OptionalElements optionalElements);
    void deleteOptionalElements(int id);
}