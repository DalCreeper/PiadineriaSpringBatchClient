
package com.advancia.spring.soapclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per updateDough complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="updateDough"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="updatedDough" type="{http://soap.api.PiadineriaAdvancia.advancia.com/}dough" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateDough", propOrder = {
    "id",
    "updatedDough"
})
public class UpdateDough {

    protected Integer id;
    protected Dough updatedDough;

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
     * Recupera il valore della proprietà updatedDough.
     * 
     * @return
     *     possible object is
     *     {@link Dough }
     *     
     */
    public Dough getUpdatedDough() {
        return updatedDough;
    }

    /**
     * Imposta il valore della proprietà updatedDough.
     * 
     * @param value
     *     allowed object is
     *     {@link Dough }
     *     
     */
    public void setUpdatedDough(Dough value) {
        this.updatedDough = value;
    }

}
