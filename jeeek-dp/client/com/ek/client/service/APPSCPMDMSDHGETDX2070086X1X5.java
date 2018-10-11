
package com.ek.client.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>APPS.CP_MDM_SDH_GET_DX2070086X1X5 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="APPS.CP_MDM_SDH_GET_DX2070086X1X5">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="X_SDH_ADDR_CONT_SET_ITEM" type="{http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/}APPS.CP_MDM_SDH_GET_DX2070086X1X6" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "APPS.CP_MDM_SDH_GET_DX2070086X1X5", propOrder = {
    "xsdhaddrcontsetitem"
})
public class APPSCPMDMSDHGETDX2070086X1X5 {

    @XmlElement(name = "X_SDH_ADDR_CONT_SET_ITEM", nillable = true)
    protected List<APPSCPMDMSDHGETDX2070086X1X6> xsdhaddrcontsetitem;

    /**
     * Gets the value of the xsdhaddrcontsetitem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the xsdhaddrcontsetitem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getXSDHADDRCONTSETITEM().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link APPSCPMDMSDHGETDX2070086X1X6 }
     * 
     * 
     */
    public List<APPSCPMDMSDHGETDX2070086X1X6> getXSDHADDRCONTSETITEM() {
        if (xsdhaddrcontsetitem == null) {
            xsdhaddrcontsetitem = new ArrayList<APPSCPMDMSDHGETDX2070086X1X6>();
        }
        return this.xsdhaddrcontsetitem;
    }

}
