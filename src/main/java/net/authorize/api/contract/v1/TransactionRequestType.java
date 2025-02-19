//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.11.14 at 11:09:15 AM IST 
//


package net.authorize.api.contract.v1;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for transactionRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="transactionRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="transactionType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="currencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="payment" type="{AnetApi/xml/v1/schema/AnetApiSchema.xsd}paymentType" minOccurs="0"/>
 *         &lt;element name="profile" type="{AnetApi/xml/v1/schema/AnetApiSchema.xsd}customerProfilePaymentType" minOccurs="0"/>
 *         &lt;element name="solution" type="{AnetApi/xml/v1/schema/AnetApiSchema.xsd}solutionType" minOccurs="0"/>
 *         &lt;element name="callId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="terminalNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="authCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="refTransId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="splitTenderId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="order" type="{AnetApi/xml/v1/schema/AnetApiSchema.xsd}orderType" minOccurs="0"/>
 *         &lt;element name="lineItems" type="{AnetApi/xml/v1/schema/AnetApiSchema.xsd}ArrayOfLineItem" minOccurs="0"/>
 *         &lt;element name="tax" type="{AnetApi/xml/v1/schema/AnetApiSchema.xsd}extendedAmountType" minOccurs="0"/>
 *         &lt;element name="duty" type="{AnetApi/xml/v1/schema/AnetApiSchema.xsd}extendedAmountType" minOccurs="0"/>
 *         &lt;element name="shipping" type="{AnetApi/xml/v1/schema/AnetApiSchema.xsd}extendedAmountType" minOccurs="0"/>
 *         &lt;element name="taxExempt" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}boolean">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="poNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customer" type="{AnetApi/xml/v1/schema/AnetApiSchema.xsd}customerDataType" minOccurs="0"/>
 *         &lt;element name="billTo" type="{AnetApi/xml/v1/schema/AnetApiSchema.xsd}customerAddressType" minOccurs="0"/>
 *         &lt;element name="shipTo" type="{AnetApi/xml/v1/schema/AnetApiSchema.xsd}nameAndAddressType" minOccurs="0"/>
 *         &lt;element name="customerIP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardholderAuthentication" type="{AnetApi/xml/v1/schema/AnetApiSchema.xsd}ccAuthenticationType" minOccurs="0"/>
 *         &lt;element name="retail" type="{AnetApi/xml/v1/schema/AnetApiSchema.xsd}transRetailInfoType" minOccurs="0"/>
 *         &lt;element name="employeeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transactionSettings" type="{AnetApi/xml/v1/schema/AnetApiSchema.xsd}ArrayOfSetting" minOccurs="0"/>
 *         &lt;element name="userFields" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="userField" type="{AnetApi/xml/v1/schema/AnetApiSchema.xsd}userField" maxOccurs="20" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="surcharge" type="{AnetApi/xml/v1/schema/AnetApiSchema.xsd}extendedAmountType" minOccurs="0"/>
 *         &lt;element name="merchantDescriptor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subMerchant" type="{AnetApi/xml/v1/schema/AnetApiSchema.xsd}subMerchantType" minOccurs="0"/>
 *         &lt;element name="tip" type="{AnetApi/xml/v1/schema/AnetApiSchema.xsd}extendedAmountType" minOccurs="0"/>
 *         &lt;element name="processingOptions" type="{AnetApi/xml/v1/schema/AnetApiSchema.xsd}processingOptions" minOccurs="0"/>
 *         &lt;element name="subsequentAuthInformation" type="{AnetApi/xml/v1/schema/AnetApiSchema.xsd}subsequentAuthInformation" minOccurs="0"/>
 *         &lt;element name="otherTax" type="{AnetApi/xml/v1/schema/AnetApiSchema.xsd}otherTaxType" minOccurs="0"/>
 *         &lt;element name="shipFrom" type="{AnetApi/xml/v1/schema/AnetApiSchema.xsd}nameAndAddressType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "transactionRequestType", propOrder = {
    "transactionType",
    "amount",
    "currencyCode",
    "payment",
    "profile",
    "solution",
    "callId",
    "terminalNumber",
    "authCode",
    "refTransId",
    "splitTenderId",
    "order",
    "lineItems",
    "tax",
    "duty",
    "shipping",
    "taxExempt",
    "poNumber",
    "customer",
    "billTo",
    "shipTo",
    "customerIP",
    "cardholderAuthentication",
    "retail",
    "employeeId",
    "transactionSettings",
    "userFields",
    "surcharge",
    "merchantDescriptor",
    "subMerchant",
    "tip",
    "processingOptions",
    "subsequentAuthInformation",
    "otherTax",
    "shipFrom"
})
public class TransactionRequestType {

    @XmlElement(required = true)
    protected String transactionType;
    protected BigDecimal amount;
    protected String currencyCode;
    protected PaymentType payment;
    protected CustomerProfilePaymentType profile;
    protected SolutionType solution;
    protected String callId;
    protected String terminalNumber;
    protected String authCode;
    protected String refTransId;
    protected String splitTenderId;
    protected OrderType order;
    protected ArrayOfLineItem lineItems;
    protected ExtendedAmountType tax;
    protected ExtendedAmountType duty;
    protected ExtendedAmountType shipping;
    protected Boolean taxExempt;
    protected String poNumber;
    protected CustomerDataType customer;
    protected CustomerAddressType billTo;
    protected NameAndAddressType shipTo;
    protected String customerIP;
    protected CcAuthenticationType cardholderAuthentication;
    protected TransRetailInfoType retail;
    protected String employeeId;
    protected ArrayOfSetting transactionSettings;
    protected TransactionRequestType.UserFields userFields;
    protected ExtendedAmountType surcharge;
    protected String merchantDescriptor;
    protected SubMerchantType subMerchant;
    protected ExtendedAmountType tip;
    protected ProcessingOptions processingOptions;
    protected SubsequentAuthInformation subsequentAuthInformation;
    protected OtherTaxType otherTax;
    protected NameAndAddressType shipFrom;

    /**
     * Gets the value of the transactionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionType() {
        return transactionType;
    }

    /**
     * Sets the value of the transactionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionType(String value) {
        this.transactionType = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmount(BigDecimal value) {
        this.amount = value;
    }

    /**
     * Gets the value of the currencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyCode(String value) {
        this.currencyCode = value;
    }

    /**
     * Gets the value of the payment property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentType }
     *     
     */
    public PaymentType getPayment() {
        return payment;
    }

    /**
     * Sets the value of the payment property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentType }
     *     
     */
    public void setPayment(PaymentType value) {
        this.payment = value;
    }

    /**
     * Gets the value of the profile property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerProfilePaymentType }
     *     
     */
    public CustomerProfilePaymentType getProfile() {
        return profile;
    }

    /**
     * Sets the value of the profile property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerProfilePaymentType }
     *     
     */
    public void setProfile(CustomerProfilePaymentType value) {
        this.profile = value;
    }

    /**
     * Gets the value of the solution property.
     * 
     * @return
     *     possible object is
     *     {@link SolutionType }
     *     
     */
    public SolutionType getSolution() {
        return solution;
    }

    /**
     * Sets the value of the solution property.
     * 
     * @param value
     *     allowed object is
     *     {@link SolutionType }
     *     
     */
    public void setSolution(SolutionType value) {
        this.solution = value;
    }

    /**
     * Gets the value of the callId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallId() {
        return callId;
    }

    /**
     * Sets the value of the callId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallId(String value) {
        this.callId = value;
    }

    /**
     * Gets the value of the terminalNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminalNumber() {
        return terminalNumber;
    }

    /**
     * Sets the value of the terminalNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminalNumber(String value) {
        this.terminalNumber = value;
    }

    /**
     * Gets the value of the authCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthCode() {
        return authCode;
    }

    /**
     * Sets the value of the authCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthCode(String value) {
        this.authCode = value;
    }

    /**
     * Gets the value of the refTransId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefTransId() {
        return refTransId;
    }

    /**
     * Sets the value of the refTransId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefTransId(String value) {
        this.refTransId = value;
    }

    /**
     * Gets the value of the splitTenderId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSplitTenderId() {
        return splitTenderId;
    }

    /**
     * Sets the value of the splitTenderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSplitTenderId(String value) {
        this.splitTenderId = value;
    }

    /**
     * Gets the value of the order property.
     * 
     * @return
     *     possible object is
     *     {@link OrderType }
     *     
     */
    public OrderType getOrder() {
        return order;
    }

    /**
     * Sets the value of the order property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderType }
     *     
     */
    public void setOrder(OrderType value) {
        this.order = value;
    }

    /**
     * Gets the value of the lineItems property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLineItem }
     *     
     */
    public ArrayOfLineItem getLineItems() {
        return lineItems;
    }

    /**
     * Sets the value of the lineItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLineItem }
     *     
     */
    public void setLineItems(ArrayOfLineItem value) {
        this.lineItems = value;
    }

    /**
     * Gets the value of the tax property.
     * 
     * @return
     *     possible object is
     *     {@link ExtendedAmountType }
     *     
     */
    public ExtendedAmountType getTax() {
        return tax;
    }

    /**
     * Sets the value of the tax property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtendedAmountType }
     *     
     */
    public void setTax(ExtendedAmountType value) {
        this.tax = value;
    }

    /**
     * Gets the value of the duty property.
     * 
     * @return
     *     possible object is
     *     {@link ExtendedAmountType }
     *     
     */
    public ExtendedAmountType getDuty() {
        return duty;
    }

    /**
     * Sets the value of the duty property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtendedAmountType }
     *     
     */
    public void setDuty(ExtendedAmountType value) {
        this.duty = value;
    }

    /**
     * Gets the value of the shipping property.
     * 
     * @return
     *     possible object is
     *     {@link ExtendedAmountType }
     *     
     */
    public ExtendedAmountType getShipping() {
        return shipping;
    }

    /**
     * Sets the value of the shipping property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtendedAmountType }
     *     
     */
    public void setShipping(ExtendedAmountType value) {
        this.shipping = value;
    }

    /**
     * Gets the value of the taxExempt property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTaxExempt() {
        return taxExempt;
    }

    /**
     * Sets the value of the taxExempt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTaxExempt(Boolean value) {
        this.taxExempt = value;
    }

    /**
     * Gets the value of the poNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoNumber() {
        return poNumber;
    }

    /**
     * Sets the value of the poNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoNumber(String value) {
        this.poNumber = value;
    }

    /**
     * Gets the value of the customer property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerDataType }
     *     
     */
    public CustomerDataType getCustomer() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerDataType }
     *     
     */
    public void setCustomer(CustomerDataType value) {
        this.customer = value;
    }

    /**
     * Gets the value of the billTo property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerAddressType }
     *     
     */
    public CustomerAddressType getBillTo() {
        return billTo;
    }

    /**
     * Sets the value of the billTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerAddressType }
     *     
     */
    public void setBillTo(CustomerAddressType value) {
        this.billTo = value;
    }

    /**
     * Gets the value of the shipTo property.
     * 
     * @return
     *     possible object is
     *     {@link NameAndAddressType }
     *     
     */
    public NameAndAddressType getShipTo() {
        return shipTo;
    }

    /**
     * Sets the value of the shipTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameAndAddressType }
     *     
     */
    public void setShipTo(NameAndAddressType value) {
        this.shipTo = value;
    }

    /**
     * Gets the value of the customerIP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerIP() {
        return customerIP;
    }

    /**
     * Sets the value of the customerIP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerIP(String value) {
        this.customerIP = value;
    }

    /**
     * Gets the value of the cardholderAuthentication property.
     * 
     * @return
     *     possible object is
     *     {@link CcAuthenticationType }
     *     
     */
    public CcAuthenticationType getCardholderAuthentication() {
        return cardholderAuthentication;
    }

    /**
     * Sets the value of the cardholderAuthentication property.
     * 
     * @param value
     *     allowed object is
     *     {@link CcAuthenticationType }
     *     
     */
    public void setCardholderAuthentication(CcAuthenticationType value) {
        this.cardholderAuthentication = value;
    }

    /**
     * Gets the value of the retail property.
     * 
     * @return
     *     possible object is
     *     {@link TransRetailInfoType }
     *     
     */
    public TransRetailInfoType getRetail() {
        return retail;
    }

    /**
     * Sets the value of the retail property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransRetailInfoType }
     *     
     */
    public void setRetail(TransRetailInfoType value) {
        this.retail = value;
    }

    /**
     * Gets the value of the employeeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployeeId() {
        return employeeId;
    }

    /**
     * Sets the value of the employeeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployeeId(String value) {
        this.employeeId = value;
    }

    /**
     * Gets the value of the transactionSettings property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSetting }
     *     
     */
    public ArrayOfSetting getTransactionSettings() {
        return transactionSettings;
    }

    /**
     * Sets the value of the transactionSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSetting }
     *     
     */
    public void setTransactionSettings(ArrayOfSetting value) {
        this.transactionSettings = value;
    }

    /**
     * Gets the value of the userFields property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionRequestType.UserFields }
     *     
     */
    public TransactionRequestType.UserFields getUserFields() {
        return userFields;
    }

    /**
     * Sets the value of the userFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionRequestType.UserFields }
     *     
     */
    public void setUserFields(TransactionRequestType.UserFields value) {
        this.userFields = value;
    }

    /**
     * Gets the value of the surcharge property.
     * 
     * @return
     *     possible object is
     *     {@link ExtendedAmountType }
     *     
     */
    public ExtendedAmountType getSurcharge() {
        return surcharge;
    }

    /**
     * Sets the value of the surcharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtendedAmountType }
     *     
     */
    public void setSurcharge(ExtendedAmountType value) {
        this.surcharge = value;
    }

    /**
     * Gets the value of the merchantDescriptor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantDescriptor() {
        return merchantDescriptor;
    }

    /**
     * Sets the value of the merchantDescriptor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantDescriptor(String value) {
        this.merchantDescriptor = value;
    }

    /**
     * Gets the value of the subMerchant property.
     * 
     * @return
     *     possible object is
     *     {@link SubMerchantType }
     *     
     */
    public SubMerchantType getSubMerchant() {
        return subMerchant;
    }

    /**
     * Sets the value of the subMerchant property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubMerchantType }
     *     
     */
    public void setSubMerchant(SubMerchantType value) {
        this.subMerchant = value;
    }

    /**
     * Gets the value of the tip property.
     * 
     * @return
     *     possible object is
     *     {@link ExtendedAmountType }
     *     
     */
    public ExtendedAmountType getTip() {
        return tip;
    }

    /**
     * Sets the value of the tip property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtendedAmountType }
     *     
     */
    public void setTip(ExtendedAmountType value) {
        this.tip = value;
    }

    /**
     * Gets the value of the processingOptions property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessingOptions }
     *     
     */
    public ProcessingOptions getProcessingOptions() {
        return processingOptions;
    }

    /**
     * Sets the value of the processingOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessingOptions }
     *     
     */
    public void setProcessingOptions(ProcessingOptions value) {
        this.processingOptions = value;
    }

    /**
     * Gets the value of the subsequentAuthInformation property.
     * 
     * @return
     *     possible object is
     *     {@link SubsequentAuthInformation }
     *     
     */
    public SubsequentAuthInformation getSubsequentAuthInformation() {
        return subsequentAuthInformation;
    }

    /**
     * Sets the value of the subsequentAuthInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubsequentAuthInformation }
     *     
     */
    public void setSubsequentAuthInformation(SubsequentAuthInformation value) {
        this.subsequentAuthInformation = value;
    }

    /**
     * Gets the value of the otherTax property.
     * 
     * @return
     *     possible object is
     *     {@link OtherTaxType }
     *     
     */
    public OtherTaxType getOtherTax() {
        return otherTax;
    }

    /**
     * Sets the value of the otherTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherTaxType }
     *     
     */
    public void setOtherTax(OtherTaxType value) {
        this.otherTax = value;
    }

    /**
     * Gets the value of the shipFrom property.
     * 
     * @return
     *     possible object is
     *     {@link NameAndAddressType }
     *     
     */
    public NameAndAddressType getShipFrom() {
        return shipFrom;
    }

    /**
     * Sets the value of the shipFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameAndAddressType }
     *     
     */
    public void setShipFrom(NameAndAddressType value) {
        this.shipFrom = value;
    }


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
     *         &lt;element name="userField" type="{AnetApi/xml/v1/schema/AnetApiSchema.xsd}userField" maxOccurs="20" minOccurs="0"/>
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
        "userField"
    })
    public static class UserFields {

        protected List<UserField> userField;

        /**
         * Gets the value of the userField property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the userField property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getUserField().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link UserField }
         * 
         * 
         */
        public List<UserField> getUserField() {
            if (userField == null) {
                userField = new ArrayList<UserField>();
            }
            return this.userField;
        }

    }

}
