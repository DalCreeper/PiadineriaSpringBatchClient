
package com.advancia.spring.soapclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per updateSauces complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="updateSauces"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="updatedSauces" type="{http://soap.api.PiadineriaAdvancia.advancia.com/}sauces" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateSauces", propOrder = {
    "id",
    "updatedSauces"
})
public class UpdateSauces {

    protected Integer id;
    protected Sauces updatedSauces;

    /**
     * Recupera il valore della proprietà id.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getId() {
        return id;
    }

    /**
     * Imposta il valore della proprietà id.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setId(Integer value) {
        this.id = value;
    }

    /**
     * Recupera il valore della proprietà updatedSauces.
     * 
     * @return
     *     possible object is
     *     {@link Sauces }
     *     
     */
    public Sauces getUpdatedSauces() {
        return updatedSauces;
    }

    /**
     * Imposta il valore della proprietà updatedSauces.
     * 
     * @param value
     *     allowed object is
     *     {@link Sauces }
     *     
     */
    public void setUpdatedSauces(Sauces value) {
        this.updatedSauces = value;
    }

}
