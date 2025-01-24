
package com.advancia.spring.soapclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per addMeatBase complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="addMeatBase"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="newMeatBase" type="{http://soap.api.PiadineriaAdvancia.advancia.com/}meatBase" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addMeatBase", propOrder = {
    "newMeatBase"
})
public class AddMeatBase {

    protected MeatBase newMeatBase;

    /**
     * Recupera il valore della proprietà newMeatBase.
     * 
     * @return
     *     possible object is
     *     {@link MeatBase }
     *     
     */
    public MeatBase getNewMeatBase() {
        return newMeatBase;
    }

    /**
     * Imposta il valore della proprietà newMeatBase.
     * 
     * @param value
     *     allowed object is
     *     {@link MeatBase }
     *     
     */
    public void setNewMeatBase(MeatBase value) {
        this.newMeatBase = value;
    }

}
