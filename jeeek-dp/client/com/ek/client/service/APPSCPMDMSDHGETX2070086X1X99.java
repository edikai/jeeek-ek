
package com.ek.client.service;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>APPS.CP_MDM_SDH_GET_X2070086X1X99 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="APPS.CP_MDM_SDH_GET_X2070086X1X99">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BUYER_ID" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="SUPPLIER_CODE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="SUPPLIER_NAME" type="{http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/}string240" minOccurs="0"/>
 *         &lt;element name="ORG_CODE" type="{http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/}string150" minOccurs="0"/>
 *         &lt;element name="ORG_NAME" type="{http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/}string240" minOccurs="0"/>
 *         &lt;element name="DEL_FLAG" type="{http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/}string10" minOccurs="0"/>
 *         &lt;element name="BUYER_STAFF_NUM" type="{http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/}string150" minOccurs="0"/>
 *         &lt;element name="BUYER_NAME" type="{http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/}string150" minOccurs="0"/>
 *         &lt;element name="SUPPLIER_CREATE_FLAG" type="{http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/}string10" minOccurs="0"/>
 *         &lt;element name="BUYER_START_DATE" type="{http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/}string28" minOccurs="0"/>
 *         &lt;element name="BUYER_END_DATE" type="{http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/}string28" minOccurs="0"/>
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
@XmlType(name = "APPS.CP_MDM_SDH_GET_X2070086X1X99", propOrder = {
    "buyerid",
    "suppliercode",
    "suppliername",
    "orgcode",
    "orgname",
    "delflag",
    "buyerstaffnum",
    "buyername",
    "suppliercreateflag",
    "buyerstartdate",
    "buyerenddate",
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
public class APPSCPMDMSDHGETX2070086X1X99 {

    @XmlElementRef(name = "BUYER_ID", namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> buyerid;
    @XmlElementRef(name = "SUPPLIER_CODE", namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> suppliercode;
    @XmlElementRef(name = "SUPPLIER_NAME", namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", type = JAXBElement.class)
    protected JAXBElement<String> suppliername;
    @XmlElementRef(name = "ORG_CODE", namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", type = JAXBElement.class)
    protected JAXBElement<String> orgcode;
    @XmlElementRef(name = "ORG_NAME", namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", type = JAXBElement.class)
    protected JAXBElement<String> orgname;
    @XmlElementRef(name = "DEL_FLAG", namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", type = JAXBElement.class)
    protected JAXBElement<String> delflag;
    @XmlElementRef(name = "BUYER_STAFF_NUM", namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", type = JAXBElement.class)
    protected JAXBElement<String> buyerstaffnum;
    @XmlElementRef(name = "BUYER_NAME", namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", type = JAXBElement.class)
    protected JAXBElement<String> buyername;
    @XmlElementRef(name = "SUPPLIER_CREATE_FLAG", namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", type = JAXBElement.class)
    protected JAXBElement<String> suppliercreateflag;
    @XmlElementRef(name = "BUYER_START_DATE", namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", type = JAXBElement.class)
    protected JAXBElement<String> buyerstartdate;
    @XmlElementRef(name = "BUYER_END_DATE", namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", type = JAXBElement.class)
    protected JAXBElement<String> buyerenddate;
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
     * 获取buyerid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getBUYERID() {
        return buyerid;
    }

    /**
     * 设置buyerid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setBUYERID(JAXBElement<BigDecimal> value) {
        this.buyerid = value;
    }

    /**
     * 获取suppliercode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getSUPPLIERCODE() {
        return suppliercode;
    }

    /**
     * 设置suppliercode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setSUPPLIERCODE(JAXBElement<BigDecimal> value) {
        this.suppliercode = value;
    }

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
     * 获取delflag属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDELFLAG() {
        return delflag;
    }

    /**
     * 设置delflag属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDELFLAG(JAXBElement<String> value) {
        this.delflag = value;
    }

    /**
     * 获取buyerstaffnum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBUYERSTAFFNUM() {
        return buyerstaffnum;
    }

    /**
     * 设置buyerstaffnum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBUYERSTAFFNUM(JAXBElement<String> value) {
        this.buyerstaffnum = value;
    }

    /**
     * 获取buyername属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBUYERNAME() {
        return buyername;
    }

    /**
     * 设置buyername属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBUYERNAME(JAXBElement<String> value) {
        this.buyername = value;
    }

    /**
     * 获取suppliercreateflag属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSUPPLIERCREATEFLAG() {
        return suppliercreateflag;
    }

    /**
     * 设置suppliercreateflag属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSUPPLIERCREATEFLAG(JAXBElement<String> value) {
        this.suppliercreateflag = value;
    }

    /**
     * 获取buyerstartdate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBUYERSTARTDATE() {
        return buyerstartdate;
    }

    /**
     * 设置buyerstartdate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBUYERSTARTDATE(JAXBElement<String> value) {
        this.buyerstartdate = value;
    }

    /**
     * 获取buyerenddate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBUYERENDDATE() {
        return buyerenddate;
    }

    /**
     * 设置buyerenddate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBUYERENDDATE(JAXBElement<String> value) {
        this.buyerenddate = value;
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
