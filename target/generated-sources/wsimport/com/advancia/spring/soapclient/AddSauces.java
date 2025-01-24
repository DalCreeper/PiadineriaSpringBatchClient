
package com.advancia.spring.soapclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per addSauces complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="addSauces"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="newSauces" type="{http://soap.api.PiadineriaAdvancia.advancia.com/}sauces" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addSauces", propOrder = {
    "newSauces"
})
public class AddSauces {

    protected Sauces newSauces;

    /**
     * Recupera il valore della proprietà newSauces.
     * 
     * @return
     *     possible object is
     *     {@link Sauces }
     *     
     */
    public Sauces getNewSauces() {
        return newSauces;
    }

    /**
     * Imposta il valore della proprietà newSauces.
     * 
     * @param value
     *     allowed object is
     *     {@link Sauces }
     *     
     */
    public void setNewSauces(Sauces value) {
        this.newSauces = value;
    }

}
