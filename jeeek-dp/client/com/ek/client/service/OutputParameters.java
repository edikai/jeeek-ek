
package com.ek.client.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="X_SDH_ADDR_CONT_SET" type="{http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/}APPS.CP_MDM_SDH_GET_DX2070086X1X5" minOccurs="0"/>
 *         &lt;element name="X_SDH_ADDRESS_SET" type="{http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/}APPS.CP_MDM_SDH_GET_X2070086X1X24" minOccurs="0"/>
 *         &lt;element name="X_SDH_BANK_SET" type="{http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/}APPS.CP_MDM_SDH_GET_X2070086X1X43" minOccurs="0"/>
 *         &lt;element name="X_SDH_BASE_INFO_SET" type="{http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/}APPS.CP_MDM_SDH_GET_X2070086X1X68" minOccurs="0"/>
 *         &lt;element name="X_SDH_BUYER_SET" type="{http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/}APPS.CP_MDM_SDH_GET_X2070086X1X98" minOccurs="0"/>
 *         &lt;element name="X_SDH_CERT_SUP_SET" type="{http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/}APPS.CP_MDM_SDH_GETX2070086X1X121" minOccurs="0"/>
 *         &lt;element name="X_SDH_CONT_SET" type="{http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/}APPS.CP_MDM_SDH_GETX2070086X1X141" minOccurs="0"/>
 *         &lt;element name="X_SDH_FIN_INFO_SET" type="{http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/}APPS.CP_MDM_SDH_GETX2070086X1X168" minOccurs="0"/>
 *         &lt;element name="X_SDH_PAY_METHOD_SET" type="{http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/}APPS.CP_MDM_SDH_GETX2070086X1X189" minOccurs="0"/>
 *         &lt;element name="X_SDH_SITE_SET" type="{http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/}APPS.CP_MDM_SDH_GETX2070086X1X209" minOccurs="0"/>
 *         &lt;element name="X_SDH_TAX_INFO_SET" type="{http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/}APPS.CP_MDM_SDH_GETX2070086X1X228" minOccurs="0"/>
 *         &lt;element name="X_RETURN_STATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="X_RETURN_MSG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "xsdhaddrcontset",
    "xsdhaddressset",
    "xsdhbankset",
    "xsdhbaseinfoset",
    "xsdhbuyerset",
    "xsdhcertsupset",
    "xsdhcontset",
    "xsdhfininfoset",
    "xsdhpaymethodset",
    "xsdhsiteset",
    "xsdhtaxinfoset",
    "xreturnstatus",
    "xreturnmsg"
})
@XmlRootElement(name = "OutputParameters")
public class OutputParameters {

    @XmlElementRef(name = "X_SDH_ADDR_CONT_SET", namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", type = JAXBElement.class)
    protected JAXBElement<APPSCPMDMSDHGETDX2070086X1X5> xsdhaddrcontset;
    @XmlElementRef(name = "X_SDH_ADDRESS_SET", namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", type = JAXBElement.class)
    protected JAXBElement<APPSCPMDMSDHGETX2070086X1X24> xsdhaddressset;
    @XmlElementRef(name = "X_SDH_BANK_SET", namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", type = JAXBElement.class)
    protected JAXBElement<APPSCPMDMSDHGETX2070086X1X43> xsdhbankset;
    @XmlElementRef(name = "X_SDH_BASE_INFO_SET", namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", type = JAXBElement.class)
    protected JAXBElement<APPSCPMDMSDHGETX2070086X1X68> xsdhbaseinfoset;
    @XmlElementRef(name = "X_SDH_BUYER_SET", namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", type = JAXBElement.class)
    protected JAXBElement<APPSCPMDMSDHGETX2070086X1X98> xsdhbuyerset;
    @XmlElementRef(name = "X_SDH_CERT_SUP_SET", namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", type = JAXBElement.class)
    protected JAXBElement<APPSCPMDMSDHGETX2070086X1X121> xsdhcertsupset;
    @XmlElementRef(name = "X_SDH_CONT_SET", namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", type = JAXBElement.class)
    protected JAXBElement<APPSCPMDMSDHGETX2070086X1X141> xsdhcontset;
    @XmlElementRef(name = "X_SDH_FIN_INFO_SET", namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", type = JAXBElement.class)
    protected JAXBElement<APPSCPMDMSDHGETX2070086X1X168> xsdhfininfoset;
    @XmlElementRef(name = "X_SDH_PAY_METHOD_SET", namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", type = JAXBElement.class)
    protected JAXBElement<APPSCPMDMSDHGETX2070086X1X189> xsdhpaymethodset;
    @XmlElementRef(name = "X_SDH_SITE_SET", namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", type = JAXBElement.class)
    protected JAXBElement<APPSCPMDMSDHGETX2070086X1X209> xsdhsiteset;
    @XmlElementRef(name = "X_SDH_TAX_INFO_SET", namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", type = JAXBElement.class)
    protected JAXBElement<APPSCPMDMSDHGETX2070086X1X228> xsdhtaxinfoset;
    @XmlElementRef(name = "X_RETURN_STATUS", namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", type = JAXBElement.class)
    protected JAXBElement<String> xreturnstatus;
    @XmlElementRef(name = "X_RETURN_MSG", namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", type = JAXBElement.class)
    protected JAXBElement<String> xreturnmsg;

    /**
     * 获取xsdhaddrcontset属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link APPSCPMDMSDHGETDX2070086X1X5 }{@code >}
     *     
     */
    public JAXBElement<APPSCPMDMSDHGETDX2070086X1X5> getXSDHADDRCONTSET() {
        return xsdhaddrcontset;
    }

    /**
     * 设置xsdhaddrcontset属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link APPSCPMDMSDHGETDX2070086X1X5 }{@code >}
     *     
     */
    public void setXSDHADDRCONTSET(JAXBElement<APPSCPMDMSDHGETDX2070086X1X5> value) {
        this.xsdhaddrcontset = value;
    }

    /**
     * 获取xsdhaddressset属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link APPSCPMDMSDHGETX2070086X1X24 }{@code >}
     *     
     */
    public JAXBElement<APPSCPMDMSDHGETX2070086X1X24> getXSDHADDRESSSET() {
        return xsdhaddressset;
    }

    /**
     * 设置xsdhaddressset属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link APPSCPMDMSDHGETX2070086X1X24 }{@code >}
     *     
     */
    public void setXSDHADDRESSSET(JAXBElement<APPSCPMDMSDHGETX2070086X1X24> value) {
        this.xsdhaddressset = value;
    }

    /**
     * 获取xsdhbankset属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link APPSCPMDMSDHGETX2070086X1X43 }{@code >}
     *     
     */
    public JAXBElement<APPSCPMDMSDHGETX2070086X1X43> getXSDHBANKSET() {
        return xsdhbankset;
    }

    /**
     * 设置xsdhbankset属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link APPSCPMDMSDHGETX2070086X1X43 }{@code >}
     *     
     */
    public void setXSDHBANKSET(JAXBElement<APPSCPMDMSDHGETX2070086X1X43> value) {
        this.xsdhbankset = value;
    }

    /**
     * 获取xsdhbaseinfoset属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link APPSCPMDMSDHGETX2070086X1X68 }{@code >}
     *     
     */
    public JAXBElement<APPSCPMDMSDHGETX2070086X1X68> getXSDHBASEINFOSET() {
        return xsdhbaseinfoset;
    }

    /**
     * 设置xsdhbaseinfoset属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link APPSCPMDMSDHGETX2070086X1X68 }{@code >}
     *     
     */
    public void setXSDHBASEINFOSET(JAXBElement<APPSCPMDMSDHGETX2070086X1X68> value) {
        this.xsdhbaseinfoset = value;
    }

    /**
     * 获取xsdhbuyerset属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link APPSCPMDMSDHGETX2070086X1X98 }{@code >}
     *     
     */
    public JAXBElement<APPSCPMDMSDHGETX2070086X1X98> getXSDHBUYERSET() {
        return xsdhbuyerset;
    }

    /**
     * 设置xsdhbuyerset属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link APPSCPMDMSDHGETX2070086X1X98 }{@code >}
     *     
     */
    public void setXSDHBUYERSET(JAXBElement<APPSCPMDMSDHGETX2070086X1X98> value) {
        this.xsdhbuyerset = value;
    }

    /**
     * 获取xsdhcertsupset属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link APPSCPMDMSDHGETX2070086X1X121 }{@code >}
     *     
     */
    public JAXBElement<APPSCPMDMSDHGETX2070086X1X121> getXSDHCERTSUPSET() {
        return xsdhcertsupset;
    }

    /**
     * 设置xsdhcertsupset属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link APPSCPMDMSDHGETX2070086X1X121 }{@code >}
     *     
     */
    public void setXSDHCERTSUPSET(JAXBElement<APPSCPMDMSDHGETX2070086X1X121> value) {
        this.xsdhcertsupset = value;
    }

    /**
     * 获取xsdhcontset属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link APPSCPMDMSDHGETX2070086X1X141 }{@code >}
     *     
     */
    public JAXBElement<APPSCPMDMSDHGETX2070086X1X141> getXSDHCONTSET() {
        return xsdhcontset;
    }

    /**
     * 设置xsdhcontset属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link APPSCPMDMSDHGETX2070086X1X141 }{@code >}
     *     
     */
    public void setXSDHCONTSET(JAXBElement<APPSCPMDMSDHGETX2070086X1X141> value) {
        this.xsdhcontset = value;
    }

    /**
     * 获取xsdhfininfoset属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link APPSCPMDMSDHGETX2070086X1X168 }{@code >}
     *     
     */
    public JAXBElement<APPSCPMDMSDHGETX2070086X1X168> getXSDHFININFOSET() {
        return xsdhfininfoset;
    }

    /**
     * 设置xsdhfininfoset属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link APPSCPMDMSDHGETX2070086X1X168 }{@code >}
     *     
     */
    public void setXSDHFININFOSET(JAXBElement<APPSCPMDMSDHGETX2070086X1X168> value) {
        this.xsdhfininfoset = value;
    }

    /**
     * 获取xsdhpaymethodset属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link APPSCPMDMSDHGETX2070086X1X189 }{@code >}
     *     
     */
    public JAXBElement<APPSCPMDMSDHGETX2070086X1X189> getXSDHPAYMETHODSET() {
        return xsdhpaymethodset;
    }

    /**
     * 设置xsdhpaymethodset属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link APPSCPMDMSDHGETX2070086X1X189 }{@code >}
     *     
     */
    public void setXSDHPAYMETHODSET(JAXBElement<APPSCPMDMSDHGETX2070086X1X189> value) {
        this.xsdhpaymethodset = value;
    }

    /**
     * 获取xsdhsiteset属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link APPSCPMDMSDHGETX2070086X1X209 }{@code >}
     *     
     */
    public JAXBElement<APPSCPMDMSDHGETX2070086X1X209> getXSDHSITESET() {
        return xsdhsiteset;
    }

    /**
     * 设置xsdhsiteset属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link APPSCPMDMSDHGETX2070086X1X209 }{@code >}
     *     
     */
    public void setXSDHSITESET(JAXBElement<APPSCPMDMSDHGETX2070086X1X209> value) {
        this.xsdhsiteset = value;
    }

    /**
     * 获取xsdhtaxinfoset属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link APPSCPMDMSDHGETX2070086X1X228 }{@code >}
     *     
     */
    public JAXBElement<APPSCPMDMSDHGETX2070086X1X228> getXSDHTAXINFOSET() {
        return xsdhtaxinfoset;
    }

    /**
     * 设置xsdhtaxinfoset属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link APPSCPMDMSDHGETX2070086X1X228 }{@code >}
     *     
     */
    public void setXSDHTAXINFOSET(JAXBElement<APPSCPMDMSDHGETX2070086X1X228> value) {
        this.xsdhtaxinfoset = value;
    }

    /**
     * 获取xreturnstatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getXRETURNSTATUS() {
        return xreturnstatus;
    }

    /**
     * 设置xreturnstatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setXRETURNSTATUS(JAXBElement<String> value) {
        this.xreturnstatus = value;
    }

    /**
     * 获取xreturnmsg属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getXRETURNMSG() {
        return xreturnmsg;
    }

    /**
     * 设置xreturnmsg属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setXRETURNMSG(JAXBElement<String> value) {
        this.xreturnmsg = value;
    }

}
