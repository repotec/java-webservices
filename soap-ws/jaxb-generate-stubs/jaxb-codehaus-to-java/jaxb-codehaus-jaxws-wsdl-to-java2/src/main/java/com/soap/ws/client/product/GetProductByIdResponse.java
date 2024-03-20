
package com.soap.ws.client.product;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getProductByIdResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getProductByIdResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="getProductByIdResponse" type="{http://www.delte.com/products}product" minOccurs="0" form="qualified"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getProductByIdResponse", propOrder = {
    "getProductByIdResponse"
})
public class GetProductByIdResponse {

    protected Product getProductByIdResponse;

    /**
     * Gets the value of the getProductByIdResponse property.
     * 
     * @return
     *     possible object is
     *     {@link Product }
     *     
     */
    public Product getGetProductByIdResponse() {
        return getProductByIdResponse;
    }

    /**
     * Sets the value of the getProductByIdResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link Product }
     *     
     */
    public void setGetProductByIdResponse(Product value) {
        this.getProductByIdResponse = value;
    }

}
