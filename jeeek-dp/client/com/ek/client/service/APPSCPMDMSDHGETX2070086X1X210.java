
package com.ek.client.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>APPS.CP_MDM_SDH_GETX2070086X1X210 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="APPS.CP_MDM_SDH_GETX2070086X1X210">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SUPPLIER_NAME" type="{http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/}string240" minOccurs="0"/>
 *         &lt;element name="SUPPLIER_CODE" type="{http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/}string30" minOccurs="0"/>
 *         &lt;element name="ORG_NAME" type="{http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/}string240" minOccurs="0"/>
 *         &lt;element name="ORG_CODE" type="{http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/}string150" minOccurs="0"/>
 *         &lt;element name="SITE_CODE" type="{http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/}string15" minOccurs="0"/>
 *         &lt;element name="DISABLE_DATE" type="{http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/}string28" minOccurs="0"/>
 *         &lt;element name="ADDR_NAME" type="{http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/}string240" minOccurs="0"/>
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
@XmlType(name = "APPS.CP_MDM_SDH_GETX2070086X1X210", propOrder = {
    "suppliername",
    "suppliercode",
    "orgname",
    "orgcode",
    "sitecode",
    "disabledate",
    "addrname",
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
public class APPSCPMDMSDHGETX2070086X1X210 {

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
    @XmlElementRef(name = "DISABLE_DATE", namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", type = JAXBElement.class)
    protected JAXBElement<String> disabledate;
    @XmlElementRef(name = "ADDR_NAME", namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", type = JAXBElement.class)
    protected JAXBElement<String> addrname;
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
     * 获取disabledate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDISABLEDATE() {
        return disabledate;
    }

    /**
     * 设置disabledate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDISABLEDATE(JAXBElement<String> value) {
        this.disabledate = value;
    }

    /**
     * 获取addrname属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getADDRNAME() {
        return addrname;
    }

    /**
     * 设置addrname属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setADDRNAME(JAXBElement<String> value) {
        this.addrname = value;
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
