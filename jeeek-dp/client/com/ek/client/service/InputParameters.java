
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
 *         &lt;element name="X_BEGIN_DATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="X_END_DATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="X_INFO_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="X_ORG_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "xbegindate",
    "xenddate",
    "xinfotype",
    "xorgcode"
})
@XmlRootElement(name = "InputParameters")
public class InputParameters {

    @XmlElementRef(name = "X_BEGIN_DATE", namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", type = JAXBElement.class)
    protected JAXBElement<String> xbegindate;
    @XmlElementRef(name = "X_END_DATE", namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", type = JAXBElement.class)
    protected JAXBElement<String> xenddate;
    @XmlElementRef(name = "X_INFO_TYPE", namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", type = JAXBElement.class)
    protected JAXBElement<String> xinfotype;
    @XmlElementRef(name = "X_ORG_CODE", namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", type = JAXBElement.class)
    protected JAXBElement<String> xorgcode;

    /**
     * 获取xbegindate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getXBEGINDATE() {
        return xbegindate;
    }

    /**
     * 设置xbegindate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setXBEGINDATE(JAXBElement<String> value) {
        this.xbegindate = value;
    }

    /**
     * 获取xenddate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getXENDDATE() {
        return xenddate;
    }

    /**
     * 设置xenddate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setXENDDATE(JAXBElement<String> value) {
        this.xenddate = value;
    }

    /**
     * 获取xinfotype属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getXINFOTYPE() {
        return xinfotype;
    }

    /**
     * 设置xinfotype属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setXINFOTYPE(JAXBElement<String> value) {
        this.xinfotype = value;
    }

    /**
     * 获取xorgcode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getXORGCODE() {
        return xorgcode;
    }

    /**
     * 设置xorgcode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setXORGCODE(JAXBElement<String> value) {
        this.xorgcode = value;
    }

}
