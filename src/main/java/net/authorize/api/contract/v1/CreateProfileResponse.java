//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.06.13 at 02:31:45 PM IST 
//


package net.authorize.api.contract.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for createProfileResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="createProfileResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="messages" type="{AnetApi/xml/v1/schema/AnetApiSchema.xsd}messagesType"/>
 *         &lt;element name="customerProfileId" type="{AnetApi/xml/v1/schema/AnetApiSchema.xsd}numericString" minOccurs="0"/>
 *         &lt;element name="customerPaymentProfileIdList" type="{AnetApi/xml/v1/schema/AnetApiSchema.xsd}ArrayOfNumericString" minOccurs="0"/>
 *         &lt;element name="customerShippingAddressIdList" type="{AnetApi/xml/v1/schema/AnetApiSchema.xsd}ArrayOfNumericString" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createProfileResponse", propOrder = {
    "messages",
    "customerProfileId",
    "customerPaymentProfileIdList",
    "customerShippingAddressIdList"
})
public class CreateProfileResponse {

    @XmlElement(required = true)
    protected MessagesType messages;
    protected String customerProfileId;
    protected ArrayOfNumericString customerPaymentProfileIdList;
    protected ArrayOfNumericString customerShippingAddressIdList;

    /**
     * Gets the value of the messages property.
     * 
     * @return
     *     possible object is
     *     {@link MessagesType }
     *     
     */
    public MessagesType getMessages() {
        return messages;
    }

    /**
     * Sets the value of the messages property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessagesType }
     *     
     */
    public void setMessages(MessagesType value) {
        this.messages = value;
    }

    /**
     * Gets the value of the customerProfileId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerProfileId() {
        return customerProfileId;
    }

    /**
     * Sets the value of the customerProfileId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerProfileId(String value) {
        this.customerProfileId = value;
    }

    /**
     * Gets the value of the customerPaymentProfileIdList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfNumericString }
     *     
     */
    public ArrayOfNumericString getCustomerPaymentProfileIdList() {
        return customerPaymentProfileIdList;
    }

    /**
     * Sets the value of the customerPaymentProfileIdList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfNumericString }
     *     
     */
    public void setCustomerPaymentProfileIdList(ArrayOfNumericString value) {
        this.customerPaymentProfileIdList = value;
    }

    /**
     * Gets the value of the customerShippingAddressIdList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfNumericString }
     *     
     */
    public ArrayOfNumericString getCustomerShippingAddressIdList() {
        return customerShippingAddressIdList;
    }

    /**
     * Sets the value of the customerShippingAddressIdList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfNumericString }
     *     
     */
    public void setCustomerShippingAddressIdList(ArrayOfNumericString value) {
        this.customerShippingAddressIdList = value;
    }

}
