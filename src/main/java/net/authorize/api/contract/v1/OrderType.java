//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.11.14 at 11:09:15 AM IST 
//


package net.authorize.api.contract.v1;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for orderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="orderType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="invoiceNumber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="description" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="discountAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="taxIsAfterDiscount" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="totalTaxTypeCode" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="purchaserVATRegistrationNumber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="21"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="merchantVATRegistrationNumber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="21"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="vatInvoiceReferenceNumber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="15"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="purchaserCode" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="17"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="summaryCommodityCode" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="purchaseOrderDateUTC" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="supplierOrderReference" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="25"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="authorizedContactName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="36"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="cardAcceptorRefNumber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="25"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="amexDataTAA1" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="40"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="amexDataTAA2" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="40"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="amexDataTAA3" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="40"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="amexDataTAA4" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="40"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "orderType", propOrder = {
    "invoiceNumber",
    "description",
    "discountAmount",
    "taxIsAfterDiscount",
    "totalTaxTypeCode",
    "purchaserVATRegistrationNumber",
    "merchantVATRegistrationNumber",
    "vatInvoiceReferenceNumber",
    "purchaserCode",
    "summaryCommodityCode",
    "purchaseOrderDateUTC",
    "supplierOrderReference",
    "authorizedContactName",
    "cardAcceptorRefNumber",
    "amexDataTAA1",
    "amexDataTAA2",
    "amexDataTAA3",
    "amexDataTAA4"
})
@XmlSeeAlso({
    OrderExType.class
})
public class OrderType {

    protected String invoiceNumber;
    protected String description;
    protected BigDecimal discountAmount;
    protected Boolean taxIsAfterDiscount;
    protected String totalTaxTypeCode;
    protected String purchaserVATRegistrationNumber;
    protected String merchantVATRegistrationNumber;
    protected String vatInvoiceReferenceNumber;
    protected String purchaserCode;
    protected String summaryCommodityCode;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar purchaseOrderDateUTC;
    protected String supplierOrderReference;
    protected String authorizedContactName;
    protected String cardAcceptorRefNumber;
    protected String amexDataTAA1;
    protected String amexDataTAA2;
    protected String amexDataTAA3;
    protected String amexDataTAA4;

    /**
     * Gets the value of the invoiceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    /**
     * Sets the value of the invoiceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceNumber(String value) {
        this.invoiceNumber = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the discountAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDiscountAmount() {
        return discountAmount;
    }

    /**
     * Sets the value of the discountAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDiscountAmount(BigDecimal value) {
        this.discountAmount = value;
    }

    /**
     * Gets the value of the taxIsAfterDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTaxIsAfterDiscount() {
        return taxIsAfterDiscount;
    }

    /**
     * Sets the value of the taxIsAfterDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTaxIsAfterDiscount(Boolean value) {
        this.taxIsAfterDiscount = value;
    }

    /**
     * Gets the value of the totalTaxTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalTaxTypeCode() {
        return totalTaxTypeCode;
    }

    /**
     * Sets the value of the totalTaxTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalTaxTypeCode(String value) {
        this.totalTaxTypeCode = value;
    }

    /**
     * Gets the value of the purchaserVATRegistrationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchaserVATRegistrationNumber() {
        return purchaserVATRegistrationNumber;
    }

    /**
     * Sets the value of the purchaserVATRegistrationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchaserVATRegistrationNumber(String value) {
        this.purchaserVATRegistrationNumber = value;
    }

    /**
     * Gets the value of the merchantVATRegistrationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantVATRegistrationNumber() {
        return merchantVATRegistrationNumber;
    }

    /**
     * Sets the value of the merchantVATRegistrationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantVATRegistrationNumber(String value) {
        this.merchantVATRegistrationNumber = value;
    }

    /**
     * Gets the value of the vatInvoiceReferenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVatInvoiceReferenceNumber() {
        return vatInvoiceReferenceNumber;
    }

    /**
     * Sets the value of the vatInvoiceReferenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVatInvoiceReferenceNumber(String value) {
        this.vatInvoiceReferenceNumber = value;
    }

    /**
     * Gets the value of the purchaserCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchaserCode() {
        return purchaserCode;
    }

    /**
     * Sets the value of the purchaserCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchaserCode(String value) {
        this.purchaserCode = value;
    }

    /**
     * Gets the value of the summaryCommodityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSummaryCommodityCode() {
        return summaryCommodityCode;
    }

    /**
     * Sets the value of the summaryCommodityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSummaryCommodityCode(String value) {
        this.summaryCommodityCode = value;
    }

    /**
     * Gets the value of the purchaseOrderDateUTC property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPurchaseOrderDateUTC() {
        return purchaseOrderDateUTC;
    }

    /**
     * Sets the value of the purchaseOrderDateUTC property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPurchaseOrderDateUTC(XMLGregorianCalendar value) {
        this.purchaseOrderDateUTC = value;
    }

    /**
     * Gets the value of the supplierOrderReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplierOrderReference() {
        return supplierOrderReference;
    }

    /**
     * Sets the value of the supplierOrderReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplierOrderReference(String value) {
        this.supplierOrderReference = value;
    }

    /**
     * Gets the value of the authorizedContactName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorizedContactName() {
        return authorizedContactName;
    }

    /**
     * Sets the value of the authorizedContactName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorizedContactName(String value) {
        this.authorizedContactName = value;
    }

    /**
     * Gets the value of the cardAcceptorRefNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardAcceptorRefNumber() {
        return cardAcceptorRefNumber;
    }

    /**
     * Sets the value of the cardAcceptorRefNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardAcceptorRefNumber(String value) {
        this.cardAcceptorRefNumber = value;
    }

    /**
     * Gets the value of the amexDataTAA1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmexDataTAA1() {
        return amexDataTAA1;
    }

    /**
     * Sets the value of the amexDataTAA1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmexDataTAA1(String value) {
        this.amexDataTAA1 = value;
    }

    /**
     * Gets the value of the amexDataTAA2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmexDataTAA2() {
        return amexDataTAA2;
    }

    /**
     * Sets the value of the amexDataTAA2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmexDataTAA2(String value) {
        this.amexDataTAA2 = value;
    }

    /**
     * Gets the value of the amexDataTAA3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmexDataTAA3() {
        return amexDataTAA3;
    }

    /**
     * Sets the value of the amexDataTAA3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmexDataTAA3(String value) {
        this.amexDataTAA3 = value;
    }

    /**
     * Gets the value of the amexDataTAA4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmexDataTAA4() {
        return amexDataTAA4;
    }

    /**
     * Sets the value of the amexDataTAA4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmexDataTAA4(String value) {
        this.amexDataTAA4 = value;
    }

}
