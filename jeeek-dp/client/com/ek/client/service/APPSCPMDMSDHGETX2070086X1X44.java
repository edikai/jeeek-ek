
package com.ek.client.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>APPS.CP_MDM_SDH_GET_X2070086X1X44 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="APPS.CP_MDM_SDH_GET_X2070086X1X44">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SUPPLIER_NAME" type="{http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/}string240" minOccurs="0"/>
 *         &lt;element name="SUPPLIER_CODE" type="{http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/}string30" minOccurs="0"/>
 *         &lt;element name="ORG_NAME" type="{http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/}string240" minOccurs="0"/>
 *         &lt;element name="ORG_CODE" type="{http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/}string150" minOccurs="0"/>
 *         &lt;element name="SITE_CODE" type="{http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/}string60" minOccurs="0"/>
 *         &lt;element name="SUP_BANK_ID" type="{http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/}string190" minOccurs="0"/>
 *         &lt;element name="CURRENCY_TYPE" type="{http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/}string80" minOccurs="0"/>
 *         &lt;element name="ACCOUNT_BANK_CODE" type="{http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/}string30" minOccurs="0"/>
 *         &lt;element name="BANK_NAME" type="{http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/}string360" minOccurs="0"/>
 *         &lt;element name="REG_ACCOUNT_NAME" type="{http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/}string240" minOccurs="0"/>
 *         &lt;element name="SUB_BANK_NAME" type="{http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/}string360" minOccurs="0"/>
 *         &lt;element name="ACCOUNT_NUM" type="{http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/}string100" minOccurs="0"/>
 *         &lt;element name="BANK_COMMENT" type="{http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/}string150" minOccurs="0"/>
 *         &lt;element name="CREATION_DATE" type="{http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/}string28" minOccurs="0"/>
 *         &lt;element name="LAST_UPDATE_DATE" type="{http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/}string28" minOccurs="0"/>
 *         &lt;element name="ATTRIBUTE1" type="{http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/}string240" minOccurs="0"/>
 *         &lt;element name="ATTRIBUTE2" type="{http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/}string240" minOccurs="0"/>
 *         &lt;element name="ATTRIBUTE3" type="{http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/}string240" minOccurs="0"/>
 *         &lt;element name="ATTRIBUTE4" type="{http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/}string240" minOccurs="0"/>
 *         &lt;element name="ATTRIBUTE5" type="{http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/}string240" minOccurs="0"/>
 *         &lt;element name="ATTRIBUTE6" type="{http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/}string240" minOccurs="0"/>
 *         &lt;element name="ATTRIBUTE7" type="{http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/}string240" minOccurs="0"/>
 *         &lt;element name="ATTRIBUTE8" type="{http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/}string240" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "APPS.CP_MDM_SDH_GET_X2070086X1X44", propOrder = {
    "suppliername",
    "suppliercode",
    "orgname",
    "orgcode",
    "sitecode",
    "supbankid",
    "currencytype",
    "accountbankcode",
    "bankname",
    "regaccountname",
    "subbankname",
    "accountnum",
    "bankcomment",
    "creationdate",
    "lastupdatedate",
    "attribute1",
    "attribute2",
    "attribute3",
    "attribute4",
    "attribute5",
    "attribute6",
    "attribute7",
    "attribute8"
})
public class APPSCPMDMSDHGETX2070086X1X44 {

    @XmlElementRef(name = "SUPPLIER_NAME", namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", type = JAXBElement.class)
    protected JAXBElement<String> suppliername;
    @XmlElementRef(name = "SUPPLIER_CODE", namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", type = JAXBElement.class)
    protected JAXBElement<String> suppliercode;
    @XmlElementRef(name = "ORG_NAME", namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", type = JAXBElement.class)
    protected JAXBElement<String> orgname;
    @XmlElementRef(name = "ORG_CODE", namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", type = JAXBElement.class)
    protected JAXBElement<String> orgcode;
    @XmlElementRef(name = "SITE_CODE", namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", type = JAXBElement.class)
    protected JAXBElement<String> sitecode;
    @XmlElementRef(name = "SUP_BANK_ID", namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", type = JAXBElement.class)
    protected JAXBElement<String> supbankid;
    @XmlElementRef(name = "CURRENCY_TYPE", namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", type = JAXBElement.class)
    protected JAXBElement<String> currencytype;
    @XmlElementRef(name = "ACCOUNT_BANK_CODE", namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", type = JAXBElement.class)
    protected JAXBElement<String> accountbankcode;
    @XmlElementRef(name = "BANK_NAME", namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", type = JAXBElement.class)
    protected JAXBElement<String> bankname;
    @XmlElementRef(name = "REG_ACCOUNT_NAME", namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", type = JAXBElement.class)
    protected JAXBElement<String> regaccountname;
    @XmlElementRef(name = "SUB_BANK_NAME", namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", type = JAXBElement.class)
    protected JAXBElement<String> subbankname;
    @XmlElementRef(name = "ACCOUNT_NUM", namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", type = JAXBElement.class)
    protected JAXBElement<String> accountnum;
    @XmlElementRef(name = "BANK_COMMENT", namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", type = JAXBElement.class)
    protected JAXBElement<String> bankcomment;
    @XmlElementRef(name = "CREATION_DATE", namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", type = JAXBElement.class)
    protected JAXBElement<String> creationdate;
    @XmlElementRef(name = "LAST_UPDATE_DATE", namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", type = JAXBElement.class)
    protected JAXBElement<String> lastupdatedate;
    @XmlElementRef(name = "ATTRIBUTE1", namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", type = JAXBElement.class)
    protected JAXBElement<String> attribute1;
    @XmlElementRef(name = "ATTRIBUTE2", namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", type = JAXBElement.class)
    protected JAXBElement<String> attribute2;
    @XmlElementRef(name = "ATTRIBUTE3", namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", type = JAXBElement.class)
    protected JAXBElement<String> attribute3;
    @XmlElementRef(name = "ATTRIBUTE4", namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", type = JAXBElement.class)
    protected JAXBElement<String> attribute4;
    @XmlElementRef(name = "ATTRIBUTE5", namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", type = JAXBElement.class)
    protected JAXBElement<String> attribute5;
    @XmlElementRef(name = "ATTRIBUTE6", namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", type = JAXBElement.class)
    protected JAXBElement<String> attribute6;
    @XmlElementRef(name = "ATTRIBUTE7", namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", type = JAXBElement.class)
    protected JAXBElement<String> attribute7;
    @XmlElementRef(name = "ATTRIBUTE8", namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", type = JAXBElement.class)
    protected JAXBElement<String> attribute8;

    /**
     * 获取suppliername属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSUPPLIERNAME() {
        return suppliername;
    }

    /**
     * 设置suppliername属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSUPPLIERNAME(JAXBElement<String> value) {
        this.suppliername = value;
    }

    /**
     * 获取suppliercode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSUPPLIERCODE() {
        return suppliercode;
    }

    /**
     * 设置suppliercode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSUPPLIERCODE(JAXBElement<String> value) {
        this.suppliercode = value;
    }

    /**
     * 获取orgname属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getORGNAME() {
        return orgname;
    }

    /**
     * 设置orgname属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setORGNAME(JAXBElement<String> value) {
        this.orgname = value;
    }

    /**
     * 获取orgcode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getORGCODE() {
        return orgcode;
    }

    /**
     * 设置orgcode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setORGCODE(JAXBElement<String> value) {
        this.orgcode = value;
    }

    /**
     * 获取sitecode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSITECODE() {
        return sitecode;
    }

    /**
     * 设置sitecode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSITECODE(JAXBElement<String> value) {
        this.sitecode = value;
    }

    /**
     * 获取supbankid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSUPBANKID() {
        return supbankid;
    }

    /**
     * 设置supbankid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSUPBANKID(JAXBElement<String> value) {
        this.supbankid = value;
    }

    /**
     * 获取currencytype属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCURRENCYTYPE() {
        return currencytype;
    }

    /**
     * 设置currencytype属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCURRENCYTYPE(JAXBElement<String> value) {
        this.currencytype = value;
    }

    /**
     * 获取accountbankcode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getACCOUNTBANKCODE() {
        return accountbankcode;
    }

    /**
     * 设置accountbankcode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setACCOUNTBANKCODE(JAXBElement<String> value) {
        this.accountbankcode = value;
    }

    /**
     * 获取bankname属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBANKNAME() {
        return bankname;
    }

    /**
     * 设置bankname属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBANKNAME(JAXBElement<String> value) {
        this.bankname = value;
    }

    /**
     * 获取regaccountname属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getREGACCOUNTNAME() {
        return regaccountname;
    }

    /**
     * 设置regaccountname属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setREGACCOUNTNAME(JAXBElement<String> value) {
        this.regaccountname = value;
    }

    /**
     * 获取subbankname属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSUBBANKNAME() {
        return subbankname;
    }

    /**
     * 设置subbankname属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSUBBANKNAME(JAXBElement<String> value) {
        this.subbankname = value;
    }

    /**
     * 获取accountnum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getACCOUNTNUM() {
        return accountnum;
    }

    /**
     * 设置accountnum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setACCOUNTNUM(JAXBElement<String> value) {
        this.accountnum = value;
    }

    /**
     * 获取bankcomment属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBANKCOMMENT() {
        return bankcomment;
    }

    /**
     * 设置bankcomment属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBANKCOMMENT(JAXBElement<String> value) {
        this.bankcomment = value;
    }

    /**
     * 获取creationdate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCREATIONDATE() {
        return creationdate;
    }

    /**
     * 设置creationdate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCREATIONDATE(JAXBElement<String> value) {
        this.creationdate = value;
    }

    /**
     * 获取lastupdatedate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLASTUPDATEDATE() {
        return lastupdatedate;
    }

    /**
     * 设置lastupdatedate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLASTUPDATEDATE(JAXBElement<String> value) {
        this.lastupdatedate = value;
    }

    /**
     * 获取attribute1属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getATTRIBUTE1() {
        return attribute1;
    }

    /**
     * 设置attribute1属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setATTRIBUTE1(JAXBElement<String> value) {
        this.attribute1 = value;
    }

    /**
     * 获取attribute2属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getATTRIBUTE2() {
        return attribute2;
    }

    /**
     * 设置attribute2属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setATTRIBUTE2(JAXBElement<String> value) {
        this.attribute2 = value;
    }

    /**
     * 获取attribute3属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getATTRIBUTE3() {
        return attribute3;
    }

    /**
     * 设置attribute3属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setATTRIBUTE3(JAXBElement<String> value) {
        this.attribute3 = value;
    }

    /**
     * 获取attribute4属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getATTRIBUTE4() {
        return attribute4;
    }

    /**
     * 设置attribute4属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setATTRIBUTE4(JAXBElement<String> value) {
        this.attribute4 = value;
    }

    /**
     * 获取attribute5属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getATTRIBUTE5() {
        return attribute5;
    }

    /**
     * 设置attribute5属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setATTRIBUTE5(JAXBElement<String> value) {
        this.attribute5 = value;
    }

    /**
     * 获取attribute6属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getATTRIBUTE6() {
        return attribute6;
    }

    /**
     * 设置attribute6属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setATTRIBUTE6(JAXBElement<String> value) {
        this.attribute6 = value;
    }

    /**
     * 获取attribute7属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getATTRIBUTE7() {
        return attribute7;
    }

    /**
     * 设置attribute7属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setATTRIBUTE7(JAXBElement<String> value) {
        this.attribute7 = value;
    }

    /**
     * 获取attribute8属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getATTRIBUTE8() {
        return attribute8;
    }

    /**
     * 设置attribute8属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setATTRIBUTE8(JAXBElement<String> value) {
        this.attribute8 = value;
    }

}
