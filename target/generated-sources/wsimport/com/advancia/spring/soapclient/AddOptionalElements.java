
package com.advancia.spring.soapclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per addOptionalElements complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="addOptionalElements"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="newOptionalElement" type="{http://soap.api.PiadineriaAdvancia.advancia.com/}optionalElements" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addOptionalElements", propOrder = {
    "newOptionalElement"
})
public class AddOptionalElements {

    protected OptionalElements newOptionalElement;

    /**
     * Recupera il valore della proprietà newOptionalElement.
     * 
     * @return
     *     possible object is
     *     {@link OptionalElements }
     *     
     */
    public OptionalElements getNewOptionalElement() {
        return newOptionalElement;
    }

    /**
     * Imposta il valore della proprietà newOptionalElement.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionalElements }
     *     
     */
    public void setNewOptionalElement(OptionalElements value) {
        this.newOptionalElement = value;
    }

}
