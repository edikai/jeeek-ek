
package com.ek.client.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>APPS.CP_MDM_SDH_GET_X2070086X1X69 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="APPS.CP_MDM_SDH_GET_X2070086X1X69">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SUPPLIER_NAME" type="{http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/}string240" minOccurs="0"/>
 *         &lt;element name="SUPPLIER_CODE" type="{http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/}string30" minOccurs="0"/>
 *         &lt;element name="PARENT_SUPPLIER_NAME" type="{http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/}string240" minOccurs="0"/>
 *         &lt;element name="PARENT_SUPPLIER_CODE" type="{http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/}string30" minOccurs="0"/>
 *         &lt;element name="EFFECTIVE_END_DATE" type="{http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/}string28" minOccurs="0"/>
 *         &lt;element name="INIT_SOURCE" type="{http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/}string150" minOccurs="0"/>
 *         &lt;element name="CLASS_TYPE" type="{http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/}string150" minOccurs="0"/>
 *         &lt;element name="ECONOMY_TYPE" type="{http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/}string150" minOccurs="0"/>
 *         &lt;element name="INDUSTY_TYPE" type="{http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/}string150" minOccurs="0"/>
 *         &lt;element name="BUSINESS_TYPE" type="{http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/}string150" minOccurs="0"/>
 *         &lt;element name="REGIO" type="{http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/}string150" minOccurs="0"/>
 *         &lt;element name="TAX_REG_NUM" type="{http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/}string150" minOccurs="0"/>
 *         &lt;element name="BUSINESS_LICENSE_NUM" type="{http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/}string150" minOccurs="0"/>
 *         &lt;element name="BL_END_DATE" type="{http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/}string28" minOccurs="0"/>
 *         &lt;element name="INST_CODE" type="{http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/}string20" minOccurs="0"/>
 *         &lt;element name="PERSON_CERT_TYPE" type="{http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/}string150" minOccurs="0"/>
 *         &lt;element name="PERSON_CERT_CODE" type="{http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/}string150" minOccurs="0"/>
 *         &lt;element name="LEGAL_PERSON" type="{http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/}string150" minOccurs="0"/>
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
@XmlType(name = "APPS.CP_MDM_SDH_GET_X2070086X1X69", propOrder = {
    "suppliername",
    "suppliercode",
    "parentsuppliername",
    "parentsuppliercode",
    "effectiveenddate",
    "initsource",
    "classtype",
    "economytype",
    "industytype",
    "businesstype",
    "regio",
    "taxregnum",
    "businesslicensenum",
    "blenddate",
    "instcode",
    "personcerttype",
    "personcertcode",
    "legalperson",
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
public class APPSCPMDMSDHGETX2070086X1X69 {

    @XmlElementRef(name = "SUPPLIER_NAME", namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", type = JAXBElement.class)
    protected JAXBElement<String> suppliername;
    @XmlElementRef(name = "SUPPLIER_CODE", namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", type = JAXBElement.class)
    protected JAXBElement<String> suppliercode;
    @XmlElementRef(name = "PARENT_SUPPLIER_NAME", namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", type = JAXBElement.class)
    protected JAXBElement<String> parentsuppliername;
    @XmlElementRef(name = "PARENT_SUPPLIER_CODE", namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", type = JAXBElement.class)
    protected JAXBElement<String> parentsuppliercode;
    @XmlElementRef(name = "EFFECTIVE_END_DATE", namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", type = JAXBElement.class)
    protected JAXBElement<String> effectiveenddate;
    @XmlElementRef(name = "INIT_SOURCE", namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", type = JAXBElement.class)
    protected JAXBElement<String> initsource;
    @XmlElementRef(name = "CLASS_TYPE", namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", type = JAXBElement.class)
    protected JAXBElement<String> classtype;
    @XmlElementRef(name = "ECONOMY_TYPE", namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", type = JAXBElement.class)
    protected JAXBElement<String> economytype;
    @XmlElementRef(name = "INDUSTY_TYPE", namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", type = JAXBElement.class)
    protected JAXBElement<String> industytype;
    @XmlElementRef(name = "BUSINESS_TYPE", namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", type = JAXBElement.class)
    protected JAXBElement<String> businesstype;
    @XmlElementRef(name = "REGIO", namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", type = JAXBElement.class)
    protected JAXBElement<String> regio;
    @XmlElementRef(name = "TAX_REG_NUM", namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", type = JAXBElement.class)
    protected JAXBElement<String> taxregnum;
    @XmlElementRef(name = "BUSINESS_LICENSE_NUM", namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", type = JAXBElement.class)
    protected JAXBElement<String> businesslicensenum;
    @XmlElementRef(name = "BL_END_DATE", namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", type = JAXBElement.class)
    protected JAXBElement<String> blenddate;
    @XmlElementRef(name = "INST_CODE", namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", type = JAXBElement.class)
    protected JAXBElement<String> instcode;
    @XmlElementRef(name = "PERSON_CERT_TYPE", namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", type = JAXBElement.class)
    protected JAXBElement<String> personcerttype;
    @XmlElementRef(name = "PERSON_CERT_CODE", namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", type = JAXBElement.class)
    protected JAXBElement<String> personcertcode;
    @XmlElementRef(name = "LEGAL_PERSON", namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", type = JAXBElement.class)
    protected JAXBElement<String> legalperson;
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
     * 获取parentsuppliername属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPARENTSUPPLIERNAME() {
        return parentsuppliername;
    }

    /**
     * 设置parentsuppliername属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPARENTSUPPLIERNAME(JAXBElement<String> value) {
        this.parentsuppliername = value;
    }

    /**
     * 获取parentsuppliercode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPARENTSUPPLIERCODE() {
        return parentsuppliercode;
    }

    /**
     * 设置parentsuppliercode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPARENTSUPPLIERCODE(JAXBElement<String> value) {
        this.parentsuppliercode = value;
    }

    /**
     * 获取effectiveenddate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEFFECTIVEENDDATE() {
        return effectiveenddate;
    }

    /**
     * 设置effectiveenddate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEFFECTIVEENDDATE(JAXBElement<String> value) {
        this.effectiveenddate = value;
    }

    /**
     * 获取initsource属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getINITSOURCE() {
        return initsource;
    }

    /**
     * 设置initsource属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setINITSOURCE(JAXBElement<String> value) {
        this.initsource = value;
    }

    /**
     * 获取classtype属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCLASSTYPE() {
        return classtype;
    }

    /**
     * 设置classtype属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCLASSTYPE(JAXBElement<String> value) {
        this.classtype = value;
    }

    /**
     * 获取economytype属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getECONOMYTYPE() {
        return economytype;
    }

    /**
     * 设置economytype属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setECONOMYTYPE(JAXBElement<String> value) {
        this.economytype = value;
    }

    /**
     * 获取industytype属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getINDUSTYTYPE() {
        return industytype;
    }

    /**
     * 设置industytype属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setINDUSTYTYPE(JAXBElement<String> value) {
        this.industytype = value;
    }

    /**
     * 获取businesstype属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBUSINESSTYPE() {
        return businesstype;
    }

    /**
     * 设置businesstype属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBUSINESSTYPE(JAXBElement<String> value) {
        this.businesstype = value;
    }

    /**
     * 获取regio属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getREGIO() {
        return regio;
    }

    /**
     * 设置regio属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setREGIO(JAXBElement<String> value) {
        this.regio = value;
    }

    /**
     * 获取taxregnum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTAXREGNUM() {
        return taxregnum;
    }

    /**
     * 设置taxregnum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTAXREGNUM(JAXBElement<String> value) {
        this.taxregnum = value;
    }

    /**
     * 获取businesslicensenum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBUSINESSLICENSENUM() {
        return businesslicensenum;
    }

    /**
     * 设置businesslicensenum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBUSINESSLICENSENUM(JAXBElement<String> value) {
        this.businesslicensenum = value;
    }

    /**
     * 获取blenddate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBLENDDATE() {
        return blenddate;
    }

    /**
     * 设置blenddate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBLENDDATE(JAXBElement<String> value) {
        this.blenddate = value;
    }

    /**
     * 获取instcode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getINSTCODE() {
        return instcode;
    }

    /**
     * 设置instcode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setINSTCODE(JAXBElement<String> value) {
        this.instcode = value;
    }

    /**
     * 获取personcerttype属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPERSONCERTTYPE() {
        return personcerttype;
    }

    /**
     * 设置personcerttype属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPERSONCERTTYPE(JAXBElement<String> value) {
        this.personcerttype = value;
    }

    /**
     * 获取personcertcode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPERSONCERTCODE() {
        return personcertcode;
    }

    /**
     * 设置personcertcode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPERSONCERTCODE(JAXBElement<String> value) {
        this.personcertcode = value;
    }

    /**
     * 获取legalperson属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLEGALPERSON() {
        return legalperson;
    }

    /**
     * 设置legalperson属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLEGALPERSON(JAXBElement<String> value) {
        this.legalperson = value;
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
