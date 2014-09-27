
package com.mulesoft.workshop.servicedesk;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="createAccountResult" type="{http://schemas.datacontract.org/2004/07/ServiceDesk}AccountDetails" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "createAccountResult"
})
@XmlRootElement(name = "createAccountResponse")
public class CreateAccountResponse {

    @XmlElementRef(name = "createAccountResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<AccountDetails> createAccountResult;

    /**
     * Gets the value of the createAccountResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AccountDetails }{@code >}
     *     
     */
    public JAXBElement<AccountDetails> getCreateAccountResult() {
        return createAccountResult;
    }

    /**
     * Sets the value of the createAccountResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AccountDetails }{@code >}
     *     
     */
    public void setCreateAccountResult(JAXBElement<AccountDetails> value) {
        this.createAccountResult = value;
    }

}
