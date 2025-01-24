
package com.advancia.spring.soapclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per addDough complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="addDough"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="newDough" type="{http://soap.api.PiadineriaAdvancia.advancia.com/}dough" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addDough", propOrder = {
    "newDough"
})
public class AddDough {

    protected Dough newDough;

    /**
     * Recupera il valore della proprietà newDough.
     * 
     * @return
     *     possible object is
     *     {@link Dough }
     *     
     */
    public Dough getNewDough() {
        return newDough;
    }

    /**
     * Imposta il valore della proprietà newDough.
     * 
     * @param value
     *     allowed object is
     *     {@link Dough }
     *     
     */
    public void setNewDough(Dough value) {
        this.newDough = value;
    }

}
