
package com.ek.client.service;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ek.client.service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ISGServiceFault_QNAME = new QName("http://xmlns.oracle.com/isg/servicefault", "ISGServiceFault");
    private final static QName _OutputParametersXSDHADDRCONTSET_QNAME = new QName("http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", "X_SDH_ADDR_CONT_SET");
    private final static QName _OutputParametersXSDHSITESET_QNAME = new QName("http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", "X_SDH_SITE_SET");
    private final static QName _OutputParametersXSDHBASEINFOSET_QNAME = new QName("http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", "X_SDH_BASE_INFO_SET");
    private final static QName _OutputParametersXSDHFININFOSET_QNAME = new QName("http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", "X_SDH_FIN_INFO_SET");
    private final static QName _OutputParametersXSDHBUYERSET_QNAME = new QName("http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", "X_SDH_BUYER_SET");
    private final static QName _OutputParametersXSDHADDRESSSET_QNAME = new QName("http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", "X_SDH_ADDRESS_SET");
    private final static QName _OutputParametersXSDHPAYMETHODSET_QNAME = new QName("http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", "X_SDH_PAY_METHOD_SET");
    private final static QName _OutputParametersXRETURNSTATUS_QNAME = new QName("http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", "X_RETURN_STATUS");
    private final static QName _OutputParametersXSDHTAXINFOSET_QNAME = new QName("http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", "X_SDH_TAX_INFO_SET");
    private final static QName _OutputParametersXSDHBANKSET_QNAME = new QName("http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", "X_SDH_BANK_SET");
    private final static QName _OutputParametersXRETURNMSG_QNAME = new QName("http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", "X_RETURN_MSG");
    private final static QName _OutputParametersXSDHCERTSUPSET_QNAME = new QName("http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", "X_SDH_CERT_SUP_SET");
    private final static QName _OutputParametersXSDHCONTSET_QNAME = new QName("http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", "X_SDH_CONT_SET");
    private final static QName _APPSCPMDMSDHGETX2070086X1X99ATTRIBUTE7_QNAME = new QName("http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", "ATTRIBUTE7");
    private final static QName _APPSCPMDMSDHGETX2070086X1X99CREATIONDATE_QNAME = new QName("http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", "CREATION_DATE");
    private final static QName _APPSCPMDMSDHGETX2070086X1X99LASTUPDATEDATE_QNAME = new QName("http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", "LAST_UPDATE_DATE");
    private final static QName _APPSCPMDMSDHGETX2070086X1X99ATTRIBUTE6_QNAME = new QName("http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", "ATTRIBUTE6");
    private final static QName _APPSCPMDMSDHGETX2070086X1X99BUYERSTARTDATE_QNAME = new QName("http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", "BUYER_START_DATE");
    private final static QName _APPSCPMDMSDHGETX2070086X1X99BUYERENDDATE_QNAME = new QName("http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", "BUYER_END_DATE");
    private final static QName _APPSCPMDMSDHGETX2070086X1X99ATTRIBUTE5_QNAME = new QName("http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", "ATTRIBUTE5");
    private final static QName _APPSCPMDMSDHGETX2070086X1X99ATTRIBUTE4_QNAME = new QName("http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", "ATTRIBUTE4");
    private final static QName _APPSCPMDMSDHGETX2070086X1X99BUYERSTAFFNUM_QNAME = new QName("http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", "BUYER_STAFF_NUM");
    private final static QName _APPSCPMDMSDHGETX2070086X1X99SUPPLIERCODE_QNAME = new QName("http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", "SUPPLIER_CODE");
    private final static QName _APPSCPMDMSDHGETX2070086X1X99ATTRIBUTE8_QNAME = new QName("http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", "ATTRIBUTE8");
    private final static QName _APPSCPMDMSDHGETX2070086X1X99ORGNAME_QNAME = new QName("http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", "ORG_NAME");
    private final static QName _APPSCPMDMSDHGETX2070086X1X99ATTRIBUTE3_QNAME = new QName("http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", "ATTRIBUTE3");
    private final static QName _APPSCPMDMSDHGETX2070086X1X99ATTRIBUTE2_QNAME = new QName("http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", "ATTRIBUTE2");
    private final static QName _APPSCPMDMSDHGETX2070086X1X99ATTRIBUTE1_QNAME = new QName("http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", "ATTRIBUTE1");
    private final static QName _APPSCPMDMSDHGETX2070086X1X99SUPPLIERNAME_QNAME = new QName("http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", "SUPPLIER_NAME");
    private final static QName _APPSCPMDMSDHGETX2070086X1X99ORGCODE_QNAME = new QName("http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", "ORG_CODE");
    private final static QName _APPSCPMDMSDHGETX2070086X1X99DELFLAG_QNAME = new QName("http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", "DEL_FLAG");
    private final static QName _APPSCPMDMSDHGETX2070086X1X99BUYERID_QNAME = new QName("http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", "BUYER_ID");
    private final static QName _APPSCPMDMSDHGETX2070086X1X99BUYERNAME_QNAME = new QName("http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", "BUYER_NAME");
    private final static QName _APPSCPMDMSDHGETX2070086X1X99SUPPLIERCREATEFLAG_QNAME = new QName("http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", "SUPPLIER_CREATE_FLAG");
    private final static QName _APPSCPMDMSDHGETX2070086X1X229EFFECITIVESTARTDATE_QNAME = new QName("http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", "EFFECITIVE_START_DATE");
    private final static QName _APPSCPMDMSDHGETX2070086X1X229VATRATE_QNAME = new QName("http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", "VAT_RATE");
    private final static QName _APPSCPMDMSDHGETX2070086X1X229SITECODE_QNAME = new QName("http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", "SITE_CODE");
    private final static QName _APPSCPMDMSDHGETX2070086X1X229EFFECITIVEENDDATE_QNAME = new QName("http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", "EFFECITIVE_END_DATE");
    private final static QName _APPSCPMDMSDHGETX2070086X1X229VATTYPE_QNAME = new QName("http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", "VAT_TYPE");
    private final static QName _APPSCPMDMSDHGETDX2070086X1X6ADDRESSID_QNAME = new QName("http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", "ADDRESS_ID");
    private final static QName _APPSCPMDMSDHGETDX2070086X1X6ADDRNAME_QNAME = new QName("http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", "ADDR_NAME");
    private final static QName _APPSCPMDMSDHGETDX2070086X1X6LINKMAN_QNAME = new QName("http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", "LINKMAN");
    private final static QName _APPSCPMDMSDHGETDX2070086X1X6ADDRCONTID_QNAME = new QName("http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", "ADDR_CONT_ID");
    private final static QName _APPSCPMDMSDHGETX2070086X1X25STATUS_QNAME = new QName("http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", "STATUS");
    private final static QName _APPSCPMDMSDHGETX2070086X1X25ADDRESS_QNAME = new QName("http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", "ADDRESS");
    private final static QName _APPSCPMDMSDHGETX2070086X1X25REGION_QNAME = new QName("http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", "REGION");
    private final static QName _APPSCPMDMSDHGETX2070086X1X190PAYMETHODDEFAULT_QNAME = new QName("http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", "PAY_METHOD_DEFAULT");
    private final static QName _APPSCPMDMSDHGETX2070086X1X190PAYMETHODENDDATE_QNAME = new QName("http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", "PAY_METHOD_END_DATE");
    private final static QName _APPSCPMDMSDHGETX2070086X1X190PAYMETHOD_QNAME = new QName("http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", "PAY_METHOD");
    private final static QName _APPSCPMDMSDHGETX2070086X1X122CERTID_QNAME = new QName("http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", "CERT_ID");
    private final static QName _APPSCPMDMSDHGETX2070086X1X122CERTCODE_QNAME = new QName("http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", "CERT_CODE");
    private final static QName _APPSCPMDMSDHGETX2070086X1X122CERTTYPE_QNAME = new QName("http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", "CERT_TYPE");
    private final static QName _APPSCPMDMSDHGETX2070086X1X142TELEPHONE_QNAME = new QName("http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", "TELEPHONE");
    private final static QName _APPSCPMDMSDHGETX2070086X1X142TAX_QNAME = new QName("http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", "TAX");
    private final static QName _APPSCPMDMSDHGETX2070086X1X142MOBILE_QNAME = new QName("http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", "MOBILE");
    private final static QName _APPSCPMDMSDHGETX2070086X1X142GENDER_QNAME = new QName("http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", "GENDER");
    private final static QName _APPSCPMDMSDHGETX2070086X1X142POST_QNAME = new QName("http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", "POST");
    private final static QName _APPSCPMDMSDHGETX2070086X1X142HOTLINE_QNAME = new QName("http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", "HOT_LINE");
    private final static QName _APPSCPMDMSDHGETX2070086X1X142CONTID_QNAME = new QName("http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", "CONT_ID");
    private final static QName _APPSCPMDMSDHGETX2070086X1X142SUPPLIERURL_QNAME = new QName("http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", "SUPPLIER_URL");
    private final static QName _APPSCPMDMSDHGETX2070086X1X142EMAIL_QNAME = new QName("http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", "EMAIL");
    private final static QName _APPSCPMDMSDHGETX2070086X1X169LIABILITYACCOUNT_QNAME = new QName("http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", "LIABILITY_ACCOUNT");
    private final static QName _APPSCPMDMSDHGETX2070086X1X169PAYCURRENCY_QNAME = new QName("http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", "PAY_CURRENCY");
    private final static QName _APPSCPMDMSDHGETX2070086X1X169PREPAYACCOUNT_QNAME = new QName("http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", "PREPAY_ACCOUNT");
    private final static QName _APPSCPMDMSDHGETX2070086X1X169PAYMENTTERM_QNAME = new QName("http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", "PAYMENT_TERM");
    private final static QName _APPSCPMDMSDHGETX2070086X1X69TAXREGNUM_QNAME = new QName("http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", "TAX_REG_NUM");
    private final static QName _APPSCPMDMSDHGETX2070086X1X69REGIO_QNAME = new QName("http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", "REGIO");
    private final static QName _APPSCPMDMSDHGETX2070086X1X69INITSOURCE_QNAME = new QName("http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", "INIT_SOURCE");
    private final static QName _APPSCPMDMSDHGETX2070086X1X69BUSINESSTYPE_QNAME = new QName("http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", "BUSINESS_TYPE");
    private final static QName _APPSCPMDMSDHGETX2070086X1X69EFFECTIVEENDDATE_QNAME = new QName("http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", "EFFECTIVE_END_DATE");
    private final static QName _APPSCPMDMSDHGETX2070086X1X69ECONOMYTYPE_QNAME = new QName("http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", "ECONOMY_TYPE");
    private final static QName _APPSCPMDMSDHGETX2070086X1X69BUSINESSLICENSENUM_QNAME = new QName("http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", "BUSINESS_LICENSE_NUM");
    private final static QName _APPSCPMDMSDHGETX2070086X1X69PARENTSUPPLIERCODE_QNAME = new QName("http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", "PARENT_SUPPLIER_CODE");
    private final static QName _APPSCPMDMSDHGETX2070086X1X69PARENTSUPPLIERNAME_QNAME = new QName("http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", "PARENT_SUPPLIER_NAME");
    private final static QName _APPSCPMDMSDHGETX2070086X1X69BLENDDATE_QNAME = new QName("http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", "BL_END_DATE");
    private final static QName _APPSCPMDMSDHGETX2070086X1X69PERSONCERTCODE_QNAME = new QName("http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", "PERSON_CERT_CODE");
    private final static QName _APPSCPMDMSDHGETX2070086X1X69CLASSTYPE_QNAME = new QName("http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", "CLASS_TYPE");
    private final static QName _APPSCPMDMSDHGETX2070086X1X69PERSONCERTTYPE_QNAME = new QName("http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", "PERSON_CERT_TYPE");
    private final static QName _APPSCPMDMSDHGETX2070086X1X69LEGALPERSON_QNAME = new QName("http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", "LEGAL_PERSON");
    private final static QName _APPSCPMDMSDHGETX2070086X1X69INSTCODE_QNAME = new QName("http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", "INST_CODE");
    private final static QName _APPSCPMDMSDHGETX2070086X1X69INDUSTYTYPE_QNAME = new QName("http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", "INDUSTY_TYPE");
    private final static QName _InputParametersXORGCODE_QNAME = new QName("http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", "X_ORG_CODE");
    private final static QName _InputParametersXINFOTYPE_QNAME = new QName("http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", "X_INFO_TYPE");
    private final static QName _InputParametersXBEGINDATE_QNAME = new QName("http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", "X_BEGIN_DATE");
    private final static QName _InputParametersXENDDATE_QNAME = new QName("http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", "X_END_DATE");
    private final static QName _APPSCPMDMSDHGETX2070086X1X210DISABLEDATE_QNAME = new QName("http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", "DISABLE_DATE");
    private final static QName _APPSCPMDMSDHGETX2070086X1X44BANKNAME_QNAME = new QName("http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", "BANK_NAME");
    private final static QName _APPSCPMDMSDHGETX2070086X1X44REGACCOUNTNAME_QNAME = new QName("http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", "REG_ACCOUNT_NAME");
    private final static QName _APPSCPMDMSDHGETX2070086X1X44ACCOUNTNUM_QNAME = new QName("http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", "ACCOUNT_NUM");
    private final static QName _APPSCPMDMSDHGETX2070086X1X44BANKCOMMENT_QNAME = new QName("http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", "BANK_COMMENT");
    private final static QName _APPSCPMDMSDHGETX2070086X1X44CURRENCYTYPE_QNAME = new QName("http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", "CURRENCY_TYPE");
    private final static QName _APPSCPMDMSDHGETX2070086X1X44ACCOUNTBANKCODE_QNAME = new QName("http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", "ACCOUNT_BANK_CODE");
    private final static QName _APPSCPMDMSDHGETX2070086X1X44SUBBANKNAME_QNAME = new QName("http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", "SUB_BANK_NAME");
    private final static QName _APPSCPMDMSDHGETX2070086X1X44SUPBANKID_QNAME = new QName("http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", "SUP_BANK_ID");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ek.client.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link InputParameters }
     * 
     */
    public InputParameters createInputParameters() {
        return new InputParameters();
    }

    /**
     * Create an instance of {@link OutputParameters }
     * 
     */
    public OutputParameters createOutputParameters() {
        return new OutputParameters();
    }

    /**
     * Create an instance of {@link APPSCPMDMSDHGETDX2070086X1X5 }
     * 
     */
    public APPSCPMDMSDHGETDX2070086X1X5 createAPPSCPMDMSDHGETDX2070086X1X5() {
        return new APPSCPMDMSDHGETDX2070086X1X5();
    }

    /**
     * Create an instance of {@link APPSCPMDMSDHGETX2070086X1X24 }
     * 
     */
    public APPSCPMDMSDHGETX2070086X1X24 createAPPSCPMDMSDHGETX2070086X1X24() {
        return new APPSCPMDMSDHGETX2070086X1X24();
    }

    /**
     * Create an instance of {@link APPSCPMDMSDHGETX2070086X1X43 }
     * 
     */
    public APPSCPMDMSDHGETX2070086X1X43 createAPPSCPMDMSDHGETX2070086X1X43() {
        return new APPSCPMDMSDHGETX2070086X1X43();
    }

    /**
     * Create an instance of {@link APPSCPMDMSDHGETX2070086X1X68 }
     * 
     */
    public APPSCPMDMSDHGETX2070086X1X68 createAPPSCPMDMSDHGETX2070086X1X68() {
        return new APPSCPMDMSDHGETX2070086X1X68();
    }

    /**
     * Create an instance of {@link APPSCPMDMSDHGETX2070086X1X98 }
     * 
     */
    public APPSCPMDMSDHGETX2070086X1X98 createAPPSCPMDMSDHGETX2070086X1X98() {
        return new APPSCPMDMSDHGETX2070086X1X98();
    }

    /**
     * Create an instance of {@link APPSCPMDMSDHGETX2070086X1X121 }
     * 
     */
    public APPSCPMDMSDHGETX2070086X1X121 createAPPSCPMDMSDHGETX2070086X1X121() {
        return new APPSCPMDMSDHGETX2070086X1X121();
    }

    /**
     * Create an instance of {@link APPSCPMDMSDHGETX2070086X1X141 }
     * 
     */
    public APPSCPMDMSDHGETX2070086X1X141 createAPPSCPMDMSDHGETX2070086X1X141() {
        return new APPSCPMDMSDHGETX2070086X1X141();
    }

    /**
     * Create an instance of {@link APPSCPMDMSDHGETX2070086X1X168 }
     * 
     */
    public APPSCPMDMSDHGETX2070086X1X168 createAPPSCPMDMSDHGETX2070086X1X168() {
        return new APPSCPMDMSDHGETX2070086X1X168();
    }

    /**
     * Create an instance of {@link APPSCPMDMSDHGETX2070086X1X189 }
     * 
     */
    public APPSCPMDMSDHGETX2070086X1X189 createAPPSCPMDMSDHGETX2070086X1X189() {
        return new APPSCPMDMSDHGETX2070086X1X189();
    }

    /**
     * Create an instance of {@link APPSCPMDMSDHGETX2070086X1X209 }
     * 
     */
    public APPSCPMDMSDHGETX2070086X1X209 createAPPSCPMDMSDHGETX2070086X1X209() {
        return new APPSCPMDMSDHGETX2070086X1X209();
    }

    /**
     * Create an instance of {@link APPSCPMDMSDHGETX2070086X1X228 }
     * 
     */
    public APPSCPMDMSDHGETX2070086X1X228 createAPPSCPMDMSDHGETX2070086X1X228() {
        return new APPSCPMDMSDHGETX2070086X1X228();
    }

    /**
     * Create an instance of {@link APPSCPMDMSDHGETX2070086X1X44 }
     * 
     */
    public APPSCPMDMSDHGETX2070086X1X44 createAPPSCPMDMSDHGETX2070086X1X44() {
        return new APPSCPMDMSDHGETX2070086X1X44();
    }

    /**
     * Create an instance of {@link APPSCPMDMSDHGETDX2070086X1X6 }
     * 
     */
    public APPSCPMDMSDHGETDX2070086X1X6 createAPPSCPMDMSDHGETDX2070086X1X6() {
        return new APPSCPMDMSDHGETDX2070086X1X6();
    }

    /**
     * Create an instance of {@link APPSCPMDMSDHGETX2070086X1X229 }
     * 
     */
    public APPSCPMDMSDHGETX2070086X1X229 createAPPSCPMDMSDHGETX2070086X1X229() {
        return new APPSCPMDMSDHGETX2070086X1X229();
    }

    /**
     * Create an instance of {@link APPSCPMDMSDHGETX2070086X1X69 }
     * 
     */
    public APPSCPMDMSDHGETX2070086X1X69 createAPPSCPMDMSDHGETX2070086X1X69() {
        return new APPSCPMDMSDHGETX2070086X1X69();
    }

    /**
     * Create an instance of {@link APPSCPMDMSDHGETX2070086X1X142 }
     * 
     */
    public APPSCPMDMSDHGETX2070086X1X142 createAPPSCPMDMSDHGETX2070086X1X142() {
        return new APPSCPMDMSDHGETX2070086X1X142();
    }

    /**
     * Create an instance of {@link APPSCPMDMSDHGETX2070086X1X25 }
     * 
     */
    public APPSCPMDMSDHGETX2070086X1X25 createAPPSCPMDMSDHGETX2070086X1X25() {
        return new APPSCPMDMSDHGETX2070086X1X25();
    }

    /**
     * Create an instance of {@link APPSCPMDMSDHGETX2070086X1X99 }
     * 
     */
    public APPSCPMDMSDHGETX2070086X1X99 createAPPSCPMDMSDHGETX2070086X1X99() {
        return new APPSCPMDMSDHGETX2070086X1X99();
    }

    /**
     * Create an instance of {@link APPSCPMDMSDHGETX2070086X1X210 }
     * 
     */
    public APPSCPMDMSDHGETX2070086X1X210 createAPPSCPMDMSDHGETX2070086X1X210() {
        return new APPSCPMDMSDHGETX2070086X1X210();
    }

    /**
     * Create an instance of {@link APPSCPMDMSDHGETX2070086X1X190 }
     * 
     */
    public APPSCPMDMSDHGETX2070086X1X190 createAPPSCPMDMSDHGETX2070086X1X190() {
        return new APPSCPMDMSDHGETX2070086X1X190();
    }

    /**
     * Create an instance of {@link APPSCPMDMSDHGETX2070086X1X122 }
     * 
     */
    public APPSCPMDMSDHGETX2070086X1X122 createAPPSCPMDMSDHGETX2070086X1X122() {
        return new APPSCPMDMSDHGETX2070086X1X122();
    }

    /**
     * Create an instance of {@link APPSCPMDMSDHGETX2070086X1X169 }
     * 
     */
    public APPSCPMDMSDHGETX2070086X1X169 createAPPSCPMDMSDHGETX2070086X1X169() {
        return new APPSCPMDMSDHGETX2070086X1X169();
    }

    /**
     * Create an instance of {@link SOAHeader }
     * 
     */
    public SOAHeader createSOAHeader() {
        return new SOAHeader();
    }

    /**
     * Create an instance of {@link ISGServiceFault }
     * 
     */
    public ISGServiceFault createISGServiceFault() {
        return new ISGServiceFault();
    }

    /**
     * Create an instance of {@link ServiceDetail }
     * 
     */
    public ServiceDetail createServiceDetail() {
        return new ServiceDetail();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ISGServiceFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/isg/servicefault", name = "ISGServiceFault")
    public JAXBElement<ISGServiceFault> createISGServiceFault(ISGServiceFault value) {
        return new JAXBElement<ISGServiceFault>(_ISGServiceFault_QNAME, ISGServiceFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link APPSCPMDMSDHGETDX2070086X1X5 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "X_SDH_ADDR_CONT_SET", scope = OutputParameters.class)
    public JAXBElement<APPSCPMDMSDHGETDX2070086X1X5> createOutputParametersXSDHADDRCONTSET(APPSCPMDMSDHGETDX2070086X1X5 value) {
        return new JAXBElement<APPSCPMDMSDHGETDX2070086X1X5>(_OutputParametersXSDHADDRCONTSET_QNAME, APPSCPMDMSDHGETDX2070086X1X5 .class, OutputParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link APPSCPMDMSDHGETX2070086X1X209 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "X_SDH_SITE_SET", scope = OutputParameters.class)
    public JAXBElement<APPSCPMDMSDHGETX2070086X1X209> createOutputParametersXSDHSITESET(APPSCPMDMSDHGETX2070086X1X209 value) {
        return new JAXBElement<APPSCPMDMSDHGETX2070086X1X209>(_OutputParametersXSDHSITESET_QNAME, APPSCPMDMSDHGETX2070086X1X209 .class, OutputParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link APPSCPMDMSDHGETX2070086X1X68 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "X_SDH_BASE_INFO_SET", scope = OutputParameters.class)
    public JAXBElement<APPSCPMDMSDHGETX2070086X1X68> createOutputParametersXSDHBASEINFOSET(APPSCPMDMSDHGETX2070086X1X68 value) {
        return new JAXBElement<APPSCPMDMSDHGETX2070086X1X68>(_OutputParametersXSDHBASEINFOSET_QNAME, APPSCPMDMSDHGETX2070086X1X68 .class, OutputParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link APPSCPMDMSDHGETX2070086X1X168 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "X_SDH_FIN_INFO_SET", scope = OutputParameters.class)
    public JAXBElement<APPSCPMDMSDHGETX2070086X1X168> createOutputParametersXSDHFININFOSET(APPSCPMDMSDHGETX2070086X1X168 value) {
        return new JAXBElement<APPSCPMDMSDHGETX2070086X1X168>(_OutputParametersXSDHFININFOSET_QNAME, APPSCPMDMSDHGETX2070086X1X168 .class, OutputParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link APPSCPMDMSDHGETX2070086X1X98 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "X_SDH_BUYER_SET", scope = OutputParameters.class)
    public JAXBElement<APPSCPMDMSDHGETX2070086X1X98> createOutputParametersXSDHBUYERSET(APPSCPMDMSDHGETX2070086X1X98 value) {
        return new JAXBElement<APPSCPMDMSDHGETX2070086X1X98>(_OutputParametersXSDHBUYERSET_QNAME, APPSCPMDMSDHGETX2070086X1X98 .class, OutputParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link APPSCPMDMSDHGETX2070086X1X24 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "X_SDH_ADDRESS_SET", scope = OutputParameters.class)
    public JAXBElement<APPSCPMDMSDHGETX2070086X1X24> createOutputParametersXSDHADDRESSSET(APPSCPMDMSDHGETX2070086X1X24 value) {
        return new JAXBElement<APPSCPMDMSDHGETX2070086X1X24>(_OutputParametersXSDHADDRESSSET_QNAME, APPSCPMDMSDHGETX2070086X1X24 .class, OutputParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link APPSCPMDMSDHGETX2070086X1X189 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "X_SDH_PAY_METHOD_SET", scope = OutputParameters.class)
    public JAXBElement<APPSCPMDMSDHGETX2070086X1X189> createOutputParametersXSDHPAYMETHODSET(APPSCPMDMSDHGETX2070086X1X189 value) {
        return new JAXBElement<APPSCPMDMSDHGETX2070086X1X189>(_OutputParametersXSDHPAYMETHODSET_QNAME, APPSCPMDMSDHGETX2070086X1X189 .class, OutputParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "X_RETURN_STATUS", scope = OutputParameters.class)
    public JAXBElement<String> createOutputParametersXRETURNSTATUS(String value) {
        return new JAXBElement<String>(_OutputParametersXRETURNSTATUS_QNAME, String.class, OutputParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link APPSCPMDMSDHGETX2070086X1X228 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "X_SDH_TAX_INFO_SET", scope = OutputParameters.class)
    public JAXBElement<APPSCPMDMSDHGETX2070086X1X228> createOutputParametersXSDHTAXINFOSET(APPSCPMDMSDHGETX2070086X1X228 value) {
        return new JAXBElement<APPSCPMDMSDHGETX2070086X1X228>(_OutputParametersXSDHTAXINFOSET_QNAME, APPSCPMDMSDHGETX2070086X1X228 .class, OutputParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link APPSCPMDMSDHGETX2070086X1X43 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "X_SDH_BANK_SET", scope = OutputParameters.class)
    public JAXBElement<APPSCPMDMSDHGETX2070086X1X43> createOutputParametersXSDHBANKSET(APPSCPMDMSDHGETX2070086X1X43 value) {
        return new JAXBElement<APPSCPMDMSDHGETX2070086X1X43>(_OutputParametersXSDHBANKSET_QNAME, APPSCPMDMSDHGETX2070086X1X43 .class, OutputParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "X_RETURN_MSG", scope = OutputParameters.class)
    public JAXBElement<String> createOutputParametersXRETURNMSG(String value) {
        return new JAXBElement<String>(_OutputParametersXRETURNMSG_QNAME, String.class, OutputParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link APPSCPMDMSDHGETX2070086X1X121 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "X_SDH_CERT_SUP_SET", scope = OutputParameters.class)
    public JAXBElement<APPSCPMDMSDHGETX2070086X1X121> createOutputParametersXSDHCERTSUPSET(APPSCPMDMSDHGETX2070086X1X121 value) {
        return new JAXBElement<APPSCPMDMSDHGETX2070086X1X121>(_OutputParametersXSDHCERTSUPSET_QNAME, APPSCPMDMSDHGETX2070086X1X121 .class, OutputParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link APPSCPMDMSDHGETX2070086X1X141 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "X_SDH_CONT_SET", scope = OutputParameters.class)
    public JAXBElement<APPSCPMDMSDHGETX2070086X1X141> createOutputParametersXSDHCONTSET(APPSCPMDMSDHGETX2070086X1X141 value) {
        return new JAXBElement<APPSCPMDMSDHGETX2070086X1X141>(_OutputParametersXSDHCONTSET_QNAME, APPSCPMDMSDHGETX2070086X1X141 .class, OutputParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "ATTRIBUTE7", scope = APPSCPMDMSDHGETX2070086X1X99 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X99ATTRIBUTE7(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X99ATTRIBUTE7_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X99 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "CREATION_DATE", scope = APPSCPMDMSDHGETX2070086X1X99 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X99CREATIONDATE(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X99CREATIONDATE_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X99 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "LAST_UPDATE_DATE", scope = APPSCPMDMSDHGETX2070086X1X99 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X99LASTUPDATEDATE(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X99LASTUPDATEDATE_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X99 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "ATTRIBUTE6", scope = APPSCPMDMSDHGETX2070086X1X99 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X99ATTRIBUTE6(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X99ATTRIBUTE6_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X99 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "BUYER_START_DATE", scope = APPSCPMDMSDHGETX2070086X1X99 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X99BUYERSTARTDATE(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X99BUYERSTARTDATE_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X99 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "BUYER_END_DATE", scope = APPSCPMDMSDHGETX2070086X1X99 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X99BUYERENDDATE(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X99BUYERENDDATE_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X99 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "ATTRIBUTE5", scope = APPSCPMDMSDHGETX2070086X1X99 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X99ATTRIBUTE5(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X99ATTRIBUTE5_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X99 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "ATTRIBUTE4", scope = APPSCPMDMSDHGETX2070086X1X99 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X99ATTRIBUTE4(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X99ATTRIBUTE4_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X99 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "BUYER_STAFF_NUM", scope = APPSCPMDMSDHGETX2070086X1X99 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X99BUYERSTAFFNUM(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X99BUYERSTAFFNUM_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X99 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "SUPPLIER_CODE", scope = APPSCPMDMSDHGETX2070086X1X99 .class)
    public JAXBElement<BigDecimal> createAPPSCPMDMSDHGETX2070086X1X99SUPPLIERCODE(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_APPSCPMDMSDHGETX2070086X1X99SUPPLIERCODE_QNAME, BigDecimal.class, APPSCPMDMSDHGETX2070086X1X99 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "ATTRIBUTE8", scope = APPSCPMDMSDHGETX2070086X1X99 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X99ATTRIBUTE8(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X99ATTRIBUTE8_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X99 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "ORG_NAME", scope = APPSCPMDMSDHGETX2070086X1X99 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X99ORGNAME(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X99ORGNAME_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X99 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "ATTRIBUTE3", scope = APPSCPMDMSDHGETX2070086X1X99 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X99ATTRIBUTE3(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X99ATTRIBUTE3_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X99 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "ATTRIBUTE2", scope = APPSCPMDMSDHGETX2070086X1X99 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X99ATTRIBUTE2(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X99ATTRIBUTE2_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X99 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "ATTRIBUTE1", scope = APPSCPMDMSDHGETX2070086X1X99 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X99ATTRIBUTE1(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X99ATTRIBUTE1_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X99 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "SUPPLIER_NAME", scope = APPSCPMDMSDHGETX2070086X1X99 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X99SUPPLIERNAME(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X99SUPPLIERNAME_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X99 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "ORG_CODE", scope = APPSCPMDMSDHGETX2070086X1X99 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X99ORGCODE(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X99ORGCODE_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X99 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "DEL_FLAG", scope = APPSCPMDMSDHGETX2070086X1X99 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X99DELFLAG(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X99DELFLAG_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X99 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "BUYER_ID", scope = APPSCPMDMSDHGETX2070086X1X99 .class)
    public JAXBElement<BigDecimal> createAPPSCPMDMSDHGETX2070086X1X99BUYERID(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_APPSCPMDMSDHGETX2070086X1X99BUYERID_QNAME, BigDecimal.class, APPSCPMDMSDHGETX2070086X1X99 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "BUYER_NAME", scope = APPSCPMDMSDHGETX2070086X1X99 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X99BUYERNAME(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X99BUYERNAME_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X99 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "SUPPLIER_CREATE_FLAG", scope = APPSCPMDMSDHGETX2070086X1X99 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X99SUPPLIERCREATEFLAG(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X99SUPPLIERCREATEFLAG_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X99 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "ATTRIBUTE7", scope = APPSCPMDMSDHGETX2070086X1X229 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X229ATTRIBUTE7(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X99ATTRIBUTE7_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X229 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "CREATION_DATE", scope = APPSCPMDMSDHGETX2070086X1X229 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X229CREATIONDATE(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X99CREATIONDATE_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X229 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "LAST_UPDATE_DATE", scope = APPSCPMDMSDHGETX2070086X1X229 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X229LASTUPDATEDATE(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X99LASTUPDATEDATE_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X229 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "ATTRIBUTE6", scope = APPSCPMDMSDHGETX2070086X1X229 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X229ATTRIBUTE6(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X99ATTRIBUTE6_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X229 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "ATTRIBUTE5", scope = APPSCPMDMSDHGETX2070086X1X229 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X229ATTRIBUTE5(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X99ATTRIBUTE5_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X229 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "ATTRIBUTE4", scope = APPSCPMDMSDHGETX2070086X1X229 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X229ATTRIBUTE4(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X99ATTRIBUTE4_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X229 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "SUPPLIER_CODE", scope = APPSCPMDMSDHGETX2070086X1X229 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X229SUPPLIERCODE(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X99SUPPLIERCODE_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X229 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "EFFECITIVE_START_DATE", scope = APPSCPMDMSDHGETX2070086X1X229 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X229EFFECITIVESTARTDATE(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X229EFFECITIVESTARTDATE_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X229 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "ATTRIBUTE8", scope = APPSCPMDMSDHGETX2070086X1X229 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X229ATTRIBUTE8(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X99ATTRIBUTE8_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X229 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "ORG_NAME", scope = APPSCPMDMSDHGETX2070086X1X229 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X229ORGNAME(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X99ORGNAME_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X229 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "ATTRIBUTE3", scope = APPSCPMDMSDHGETX2070086X1X229 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X229ATTRIBUTE3(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X99ATTRIBUTE3_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X229 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "VAT_RATE", scope = APPSCPMDMSDHGETX2070086X1X229 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X229VATRATE(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X229VATRATE_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X229 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "ATTRIBUTE2", scope = APPSCPMDMSDHGETX2070086X1X229 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X229ATTRIBUTE2(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X99ATTRIBUTE2_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X229 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "SITE_CODE", scope = APPSCPMDMSDHGETX2070086X1X229 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X229SITECODE(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X229SITECODE_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X229 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "EFFECITIVE_END_DATE", scope = APPSCPMDMSDHGETX2070086X1X229 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X229EFFECITIVEENDDATE(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X229EFFECITIVEENDDATE_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X229 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "ATTRIBUTE1", scope = APPSCPMDMSDHGETX2070086X1X229 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X229ATTRIBUTE1(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X99ATTRIBUTE1_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X229 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "SUPPLIER_NAME", scope = APPSCPMDMSDHGETX2070086X1X229 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X229SUPPLIERNAME(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X99SUPPLIERNAME_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X229 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "VAT_TYPE", scope = APPSCPMDMSDHGETX2070086X1X229 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X229VATTYPE(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X229VATTYPE_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X229 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "ORG_CODE", scope = APPSCPMDMSDHGETX2070086X1X229 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X229ORGCODE(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X99ORGCODE_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X229 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "ATTRIBUTE7", scope = APPSCPMDMSDHGETDX2070086X1X6 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETDX2070086X1X6ATTRIBUTE7(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X99ATTRIBUTE7_QNAME, String.class, APPSCPMDMSDHGETDX2070086X1X6 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "CREATION_DATE", scope = APPSCPMDMSDHGETDX2070086X1X6 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETDX2070086X1X6CREATIONDATE(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X99CREATIONDATE_QNAME, String.class, APPSCPMDMSDHGETDX2070086X1X6 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "LAST_UPDATE_DATE", scope = APPSCPMDMSDHGETDX2070086X1X6 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETDX2070086X1X6LASTUPDATEDATE(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X99LASTUPDATEDATE_QNAME, String.class, APPSCPMDMSDHGETDX2070086X1X6 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "ATTRIBUTE6", scope = APPSCPMDMSDHGETDX2070086X1X6 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETDX2070086X1X6ATTRIBUTE6(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X99ATTRIBUTE6_QNAME, String.class, APPSCPMDMSDHGETDX2070086X1X6 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "ATTRIBUTE5", scope = APPSCPMDMSDHGETDX2070086X1X6 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETDX2070086X1X6ATTRIBUTE5(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X99ATTRIBUTE5_QNAME, String.class, APPSCPMDMSDHGETDX2070086X1X6 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "ATTRIBUTE4", scope = APPSCPMDMSDHGETDX2070086X1X6 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETDX2070086X1X6ATTRIBUTE4(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X99ATTRIBUTE4_QNAME, String.class, APPSCPMDMSDHGETDX2070086X1X6 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "SUPPLIER_CODE", scope = APPSCPMDMSDHGETDX2070086X1X6 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETDX2070086X1X6SUPPLIERCODE(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X99SUPPLIERCODE_QNAME, String.class, APPSCPMDMSDHGETDX2070086X1X6 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "ATTRIBUTE8", scope = APPSCPMDMSDHGETDX2070086X1X6 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETDX2070086X1X6ATTRIBUTE8(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X99ATTRIBUTE8_QNAME, String.class, APPSCPMDMSDHGETDX2070086X1X6 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "ADDRESS_ID", scope = APPSCPMDMSDHGETDX2070086X1X6 .class)
    public JAXBElement<BigDecimal> createAPPSCPMDMSDHGETDX2070086X1X6ADDRESSID(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_APPSCPMDMSDHGETDX2070086X1X6ADDRESSID_QNAME, BigDecimal.class, APPSCPMDMSDHGETDX2070086X1X6 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "ATTRIBUTE3", scope = APPSCPMDMSDHGETDX2070086X1X6 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETDX2070086X1X6ATTRIBUTE3(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X99ATTRIBUTE3_QNAME, String.class, APPSCPMDMSDHGETDX2070086X1X6 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "ATTRIBUTE2", scope = APPSCPMDMSDHGETDX2070086X1X6 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETDX2070086X1X6ATTRIBUTE2(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X99ATTRIBUTE2_QNAME, String.class, APPSCPMDMSDHGETDX2070086X1X6 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "ATTRIBUTE1", scope = APPSCPMDMSDHGETDX2070086X1X6 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETDX2070086X1X6ATTRIBUTE1(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X99ATTRIBUTE1_QNAME, String.class, APPSCPMDMSDHGETDX2070086X1X6 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "SUPPLIER_NAME", scope = APPSCPMDMSDHGETDX2070086X1X6 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETDX2070086X1X6SUPPLIERNAME(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X99SUPPLIERNAME_QNAME, String.class, APPSCPMDMSDHGETDX2070086X1X6 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "ADDR_NAME", scope = APPSCPMDMSDHGETDX2070086X1X6 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETDX2070086X1X6ADDRNAME(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETDX2070086X1X6ADDRNAME_QNAME, String.class, APPSCPMDMSDHGETDX2070086X1X6 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "DEL_FLAG", scope = APPSCPMDMSDHGETDX2070086X1X6 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETDX2070086X1X6DELFLAG(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X99DELFLAG_QNAME, String.class, APPSCPMDMSDHGETDX2070086X1X6 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "LINKMAN", scope = APPSCPMDMSDHGETDX2070086X1X6 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETDX2070086X1X6LINKMAN(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETDX2070086X1X6LINKMAN_QNAME, String.class, APPSCPMDMSDHGETDX2070086X1X6 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "ADDR_CONT_ID", scope = APPSCPMDMSDHGETDX2070086X1X6 .class)
    public JAXBElement<BigDecimal> createAPPSCPMDMSDHGETDX2070086X1X6ADDRCONTID(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_APPSCPMDMSDHGETDX2070086X1X6ADDRCONTID_QNAME, BigDecimal.class, APPSCPMDMSDHGETDX2070086X1X6 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "ATTRIBUTE7", scope = APPSCPMDMSDHGETX2070086X1X25 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X25ATTRIBUTE7(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X99ATTRIBUTE7_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X25 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "STATUS", scope = APPSCPMDMSDHGETX2070086X1X25 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X25STATUS(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X25STATUS_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X25 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "CREATION_DATE", scope = APPSCPMDMSDHGETX2070086X1X25 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X25CREATIONDATE(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X99CREATIONDATE_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X25 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "LAST_UPDATE_DATE", scope = APPSCPMDMSDHGETX2070086X1X25 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X25LASTUPDATEDATE(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X99LASTUPDATEDATE_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X25 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "ATTRIBUTE6", scope = APPSCPMDMSDHGETX2070086X1X25 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X25ATTRIBUTE6(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X99ATTRIBUTE6_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X25 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "ATTRIBUTE5", scope = APPSCPMDMSDHGETX2070086X1X25 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X25ATTRIBUTE5(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X99ATTRIBUTE5_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X25 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "ATTRIBUTE4", scope = APPSCPMDMSDHGETX2070086X1X25 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X25ATTRIBUTE4(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X99ATTRIBUTE4_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X25 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "SUPPLIER_CODE", scope = APPSCPMDMSDHGETX2070086X1X25 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X25SUPPLIERCODE(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X99SUPPLIERCODE_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X25 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "ATTRIBUTE8", scope = APPSCPMDMSDHGETX2070086X1X25 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X25ATTRIBUTE8(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X99ATTRIBUTE8_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X25 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "ADDRESS", scope = APPSCPMDMSDHGETX2070086X1X25 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X25ADDRESS(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X25ADDRESS_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X25 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "ADDRESS_ID", scope = APPSCPMDMSDHGETX2070086X1X25 .class)
    public JAXBElement<BigDecimal> createAPPSCPMDMSDHGETX2070086X1X25ADDRESSID(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_APPSCPMDMSDHGETDX2070086X1X6ADDRESSID_QNAME, BigDecimal.class, APPSCPMDMSDHGETX2070086X1X25 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "ATTRIBUTE3", scope = APPSCPMDMSDHGETX2070086X1X25 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X25ATTRIBUTE3(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X99ATTRIBUTE3_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X25 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "ATTRIBUTE2", scope = APPSCPMDMSDHGETX2070086X1X25 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X25ATTRIBUTE2(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X99ATTRIBUTE2_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X25 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "ATTRIBUTE1", scope = APPSCPMDMSDHGETX2070086X1X25 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X25ATTRIBUTE1(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X99ATTRIBUTE1_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X25 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "SUPPLIER_NAME", scope = APPSCPMDMSDHGETX2070086X1X25 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X25SUPPLIERNAME(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X99SUPPLIERNAME_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X25 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "REGION", scope = APPSCPMDMSDHGETX2070086X1X25 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X25REGION(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X25REGION_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X25 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "ADDR_NAME", scope = APPSCPMDMSDHGETX2070086X1X25 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X25ADDRNAME(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETDX2070086X1X6ADDRNAME_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X25 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "ATTRIBUTE7", scope = APPSCPMDMSDHGETX2070086X1X190 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X190ATTRIBUTE7(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X99ATTRIBUTE7_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X190 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "CREATION_DATE", scope = APPSCPMDMSDHGETX2070086X1X190 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X190CREATIONDATE(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X99CREATIONDATE_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X190 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "LAST_UPDATE_DATE", scope = APPSCPMDMSDHGETX2070086X1X190 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X190LASTUPDATEDATE(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X99LASTUPDATEDATE_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X190 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "ATTRIBUTE6", scope = APPSCPMDMSDHGETX2070086X1X190 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X190ATTRIBUTE6(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X99ATTRIBUTE6_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X190 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "PAY_METHOD_DEFAULT", scope = APPSCPMDMSDHGETX2070086X1X190 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X190PAYMETHODDEFAULT(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X190PAYMETHODDEFAULT_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X190 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "ATTRIBUTE5", scope = APPSCPMDMSDHGETX2070086X1X190 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X190ATTRIBUTE5(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X99ATTRIBUTE5_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X190 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "ATTRIBUTE4", scope = APPSCPMDMSDHGETX2070086X1X190 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X190ATTRIBUTE4(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X99ATTRIBUTE4_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X190 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "SUPPLIER_CODE", scope = APPSCPMDMSDHGETX2070086X1X190 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X190SUPPLIERCODE(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X99SUPPLIERCODE_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X190 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "ATTRIBUTE8", scope = APPSCPMDMSDHGETX2070086X1X190 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X190ATTRIBUTE8(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X99ATTRIBUTE8_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X190 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "ORG_NAME", scope = APPSCPMDMSDHGETX2070086X1X190 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X190ORGNAME(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X99ORGNAME_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X190 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "ATTRIBUTE3", scope = APPSCPMDMSDHGETX2070086X1X190 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X190ATTRIBUTE3(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X99ATTRIBUTE3_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X190 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "ATTRIBUTE2", scope = APPSCPMDMSDHGETX2070086X1X190 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X190ATTRIBUTE2(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X99ATTRIBUTE2_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X190 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "SITE_CODE", scope = APPSCPMDMSDHGETX2070086X1X190 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X190SITECODE(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X229SITECODE_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X190 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "PAY_METHOD_END_DATE", scope = APPSCPMDMSDHGETX2070086X1X190 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X190PAYMETHODENDDATE(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X190PAYMETHODENDDATE_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X190 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "ATTRIBUTE1", scope = APPSCPMDMSDHGETX2070086X1X190 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X190ATTRIBUTE1(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X99ATTRIBUTE1_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X190 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "SUPPLIER_NAME", scope = APPSCPMDMSDHGETX2070086X1X190 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X190SUPPLIERNAME(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X99SUPPLIERNAME_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X190 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "PAY_METHOD", scope = APPSCPMDMSDHGETX2070086X1X190 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X190PAYMETHOD(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X190PAYMETHOD_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X190 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "ORG_CODE", scope = APPSCPMDMSDHGETX2070086X1X190 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X190ORGCODE(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X99ORGCODE_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X190 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "ATTRIBUTE7", scope = APPSCPMDMSDHGETX2070086X1X122 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X122ATTRIBUTE7(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X99ATTRIBUTE7_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X122 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "CREATION_DATE", scope = APPSCPMDMSDHGETX2070086X1X122 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X122CREATIONDATE(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X99CREATIONDATE_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X122 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "LAST_UPDATE_DATE", scope = APPSCPMDMSDHGETX2070086X1X122 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X122LASTUPDATEDATE(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X99LASTUPDATEDATE_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X122 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "ATTRIBUTE6", scope = APPSCPMDMSDHGETX2070086X1X122 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X122ATTRIBUTE6(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X99ATTRIBUTE6_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X122 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "ATTRIBUTE5", scope = APPSCPMDMSDHGETX2070086X1X122 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X122ATTRIBUTE5(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X99ATTRIBUTE5_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X122 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "ATTRIBUTE4", scope = APPSCPMDMSDHGETX2070086X1X122 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X122ATTRIBUTE4(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X99ATTRIBUTE4_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X122 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "CERT_ID", scope = APPSCPMDMSDHGETX2070086X1X122 .class)
    public JAXBElement<BigDecimal> createAPPSCPMDMSDHGETX2070086X1X122CERTID(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_APPSCPMDMSDHGETX2070086X1X122CERTID_QNAME, BigDecimal.class, APPSCPMDMSDHGETX2070086X1X122 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "SUPPLIER_CODE", scope = APPSCPMDMSDHGETX2070086X1X122 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X122SUPPLIERCODE(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X99SUPPLIERCODE_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X122 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "ATTRIBUTE8", scope = APPSCPMDMSDHGETX2070086X1X122 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X122ATTRIBUTE8(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X99ATTRIBUTE8_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X122 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "ORG_NAME", scope = APPSCPMDMSDHGETX2070086X1X122 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X122ORGNAME(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X99ORGNAME_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X122 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "CERT_CODE", scope = APPSCPMDMSDHGETX2070086X1X122 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X122CERTCODE(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X122CERTCODE_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X122 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "ATTRIBUTE3", scope = APPSCPMDMSDHGETX2070086X1X122 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X122ATTRIBUTE3(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X99ATTRIBUTE3_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X122 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "ATTRIBUTE2", scope = APPSCPMDMSDHGETX2070086X1X122 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X122ATTRIBUTE2(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X99ATTRIBUTE2_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X122 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "ATTRIBUTE1", scope = APPSCPMDMSDHGETX2070086X1X122 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X122ATTRIBUTE1(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X99ATTRIBUTE1_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X122 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "SUPPLIER_NAME", scope = APPSCPMDMSDHGETX2070086X1X122 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X122SUPPLIERNAME(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X99SUPPLIERNAME_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X122 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "ORG_CODE", scope = APPSCPMDMSDHGETX2070086X1X122 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X122ORGCODE(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X99ORGCODE_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X122 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "DEL_FLAG", scope = APPSCPMDMSDHGETX2070086X1X122 .class)
    public JAXBElement<BigDecimal> createAPPSCPMDMSDHGETX2070086X1X122DELFLAG(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_APPSCPMDMSDHGETX2070086X1X99DELFLAG_QNAME, BigDecimal.class, APPSCPMDMSDHGETX2070086X1X122 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "CERT_TYPE", scope = APPSCPMDMSDHGETX2070086X1X122 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X122CERTTYPE(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X122CERTTYPE_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X122 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "CREATION_DATE", scope = APPSCPMDMSDHGETX2070086X1X142 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X142CREATIONDATE(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X99CREATIONDATE_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X142 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "LAST_UPDATE_DATE", scope = APPSCPMDMSDHGETX2070086X1X142 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X142LASTUPDATEDATE(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X99LASTUPDATEDATE_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X142 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "ATTRIBUTE7", scope = APPSCPMDMSDHGETX2070086X1X142 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X142ATTRIBUTE7(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X99ATTRIBUTE7_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X142 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "TELEPHONE", scope = APPSCPMDMSDHGETX2070086X1X142 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X142TELEPHONE(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X142TELEPHONE_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X142 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "ATTRIBUTE6", scope = APPSCPMDMSDHGETX2070086X1X142 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X142ATTRIBUTE6(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X99ATTRIBUTE6_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X142 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "ATTRIBUTE5", scope = APPSCPMDMSDHGETX2070086X1X142 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X142ATTRIBUTE5(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X99ATTRIBUTE5_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X142 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "ATTRIBUTE4", scope = APPSCPMDMSDHGETX2070086X1X142 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X142ATTRIBUTE4(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X99ATTRIBUTE4_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X142 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "ATTRIBUTE8", scope = APPSCPMDMSDHGETX2070086X1X142 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X142ATTRIBUTE8(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X99ATTRIBUTE8_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X142 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "ATTRIBUTE3", scope = APPSCPMDMSDHGETX2070086X1X142 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X142ATTRIBUTE3(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X99ATTRIBUTE3_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X142 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "TAX", scope = APPSCPMDMSDHGETX2070086X1X142 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X142TAX(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X142TAX_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X142 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "ATTRIBUTE2", scope = APPSCPMDMSDHGETX2070086X1X142 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X142ATTRIBUTE2(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X99ATTRIBUTE2_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X142 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "ATTRIBUTE1", scope = APPSCPMDMSDHGETX2070086X1X142 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X142ATTRIBUTE1(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X99ATTRIBUTE1_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X142 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "DEL_FLAG", scope = APPSCPMDMSDHGETX2070086X1X142 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X142DELFLAG(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X99DELFLAG_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X142 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "ORG_CODE", scope = APPSCPMDMSDHGETX2070086X1X142 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X142ORGCODE(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X99ORGCODE_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X142 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "MOBILE", scope = APPSCPMDMSDHGETX2070086X1X142 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X142MOBILE(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X142MOBILE_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X142 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "GENDER", scope = APPSCPMDMSDHGETX2070086X1X142 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X142GENDER(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X142GENDER_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X142 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "LINKMAN", scope = APPSCPMDMSDHGETX2070086X1X142 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X142LINKMAN(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETDX2070086X1X6LINKMAN_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X142 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "POST", scope = APPSCPMDMSDHGETX2070086X1X142 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X142POST(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X142POST_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X142 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "HOT_LINE", scope = APPSCPMDMSDHGETX2070086X1X142 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X142HOTLINE(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X142HOTLINE_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X142 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "CONT_ID", scope = APPSCPMDMSDHGETX2070086X1X142 .class)
    public JAXBElement<BigDecimal> createAPPSCPMDMSDHGETX2070086X1X142CONTID(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_APPSCPMDMSDHGETX2070086X1X142CONTID_QNAME, BigDecimal.class, APPSCPMDMSDHGETX2070086X1X142 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "SUPPLIER_CODE", scope = APPSCPMDMSDHGETX2070086X1X142 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X142SUPPLIERCODE(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X99SUPPLIERCODE_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X142 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "ORG_NAME", scope = APPSCPMDMSDHGETX2070086X1X142 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X142ORGNAME(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X99ORGNAME_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X142 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "SUPPLIER_URL", scope = APPSCPMDMSDHGETX2070086X1X142 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X142SUPPLIERURL(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X142SUPPLIERURL_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X142 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "SUPPLIER_NAME", scope = APPSCPMDMSDHGETX2070086X1X142 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X142SUPPLIERNAME(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X99SUPPLIERNAME_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X142 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "EMAIL", scope = APPSCPMDMSDHGETX2070086X1X142 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X142EMAIL(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X142EMAIL_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X142 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "ATTRIBUTE7", scope = APPSCPMDMSDHGETX2070086X1X169 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X169ATTRIBUTE7(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X99ATTRIBUTE7_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X169 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "CREATION_DATE", scope = APPSCPMDMSDHGETX2070086X1X169 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X169CREATIONDATE(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X99CREATIONDATE_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X169 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "LAST_UPDATE_DATE", scope = APPSCPMDMSDHGETX2070086X1X169 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X169LASTUPDATEDATE(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X99LASTUPDATEDATE_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X169 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "ATTRIBUTE6", scope = APPSCPMDMSDHGETX2070086X1X169 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X169ATTRIBUTE6(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X99ATTRIBUTE6_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X169 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "ATTRIBUTE5", scope = APPSCPMDMSDHGETX2070086X1X169 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X169ATTRIBUTE5(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X99ATTRIBUTE5_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X169 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "ATTRIBUTE4", scope = APPSCPMDMSDHGETX2070086X1X169 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X169ATTRIBUTE4(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X99ATTRIBUTE4_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X169 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "LIABILITY_ACCOUNT", scope = APPSCPMDMSDHGETX2070086X1X169 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X169LIABILITYACCOUNT(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X169LIABILITYACCOUNT_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X169 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "SUPPLIER_CODE", scope = APPSCPMDMSDHGETX2070086X1X169 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X169SUPPLIERCODE(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X99SUPPLIERCODE_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X169 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "ATTRIBUTE8", scope = APPSCPMDMSDHGETX2070086X1X169 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X169ATTRIBUTE8(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X99ATTRIBUTE8_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X169 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "ORG_NAME", scope = APPSCPMDMSDHGETX2070086X1X169 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X169ORGNAME(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X99ORGNAME_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X169 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "ATTRIBUTE3", scope = APPSCPMDMSDHGETX2070086X1X169 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X169ATTRIBUTE3(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X99ATTRIBUTE3_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X169 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "PAY_CURRENCY", scope = APPSCPMDMSDHGETX2070086X1X169 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X169PAYCURRENCY(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X169PAYCURRENCY_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X169 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "PREPAY_ACCOUNT", scope = APPSCPMDMSDHGETX2070086X1X169 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X169PREPAYACCOUNT(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X169PREPAYACCOUNT_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X169 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "ATTRIBUTE2", scope = APPSCPMDMSDHGETX2070086X1X169 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X169ATTRIBUTE2(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X99ATTRIBUTE2_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X169 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "SITE_CODE", scope = APPSCPMDMSDHGETX2070086X1X169 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X169SITECODE(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X229SITECODE_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X169 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "ATTRIBUTE1", scope = APPSCPMDMSDHGETX2070086X1X169 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X169ATTRIBUTE1(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X99ATTRIBUTE1_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X169 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "SUPPLIER_NAME", scope = APPSCPMDMSDHGETX2070086X1X169 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X169SUPPLIERNAME(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X99SUPPLIERNAME_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X169 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "ORG_CODE", scope = APPSCPMDMSDHGETX2070086X1X169 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X169ORGCODE(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X99ORGCODE_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X169 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "PAYMENT_TERM", scope = APPSCPMDMSDHGETX2070086X1X169 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X169PAYMENTTERM(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X169PAYMENTTERM_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X169 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "ATTRIBUTE7", scope = APPSCPMDMSDHGETX2070086X1X69 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X69ATTRIBUTE7(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X99ATTRIBUTE7_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X69 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "CREATION_DATE", scope = APPSCPMDMSDHGETX2070086X1X69 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X69CREATIONDATE(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X99CREATIONDATE_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X69 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "LAST_UPDATE_DATE", scope = APPSCPMDMSDHGETX2070086X1X69 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X69LASTUPDATEDATE(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X99LASTUPDATEDATE_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X69 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "ATTRIBUTE6", scope = APPSCPMDMSDHGETX2070086X1X69 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X69ATTRIBUTE6(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X99ATTRIBUTE6_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X69 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "ATTRIBUTE5", scope = APPSCPMDMSDHGETX2070086X1X69 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X69ATTRIBUTE5(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X99ATTRIBUTE5_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X69 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "ATTRIBUTE4", scope = APPSCPMDMSDHGETX2070086X1X69 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X69ATTRIBUTE4(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X99ATTRIBUTE4_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X69 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "ATTRIBUTE8", scope = APPSCPMDMSDHGETX2070086X1X69 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X69ATTRIBUTE8(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X99ATTRIBUTE8_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X69 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "TAX_REG_NUM", scope = APPSCPMDMSDHGETX2070086X1X69 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X69TAXREGNUM(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X69TAXREGNUM_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X69 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "REGIO", scope = APPSCPMDMSDHGETX2070086X1X69 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X69REGIO(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X69REGIO_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X69 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "ATTRIBUTE3", scope = APPSCPMDMSDHGETX2070086X1X69 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X69ATTRIBUTE3(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X99ATTRIBUTE3_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X69 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "ATTRIBUTE2", scope = APPSCPMDMSDHGETX2070086X1X69 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X69ATTRIBUTE2(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X99ATTRIBUTE2_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X69 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "ATTRIBUTE1", scope = APPSCPMDMSDHGETX2070086X1X69 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X69ATTRIBUTE1(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X99ATTRIBUTE1_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X69 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "INIT_SOURCE", scope = APPSCPMDMSDHGETX2070086X1X69 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X69INITSOURCE(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X69INITSOURCE_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X69 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "BUSINESS_TYPE", scope = APPSCPMDMSDHGETX2070086X1X69 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X69BUSINESSTYPE(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X69BUSINESSTYPE_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X69 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "EFFECTIVE_END_DATE", scope = APPSCPMDMSDHGETX2070086X1X69 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X69EFFECTIVEENDDATE(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X69EFFECTIVEENDDATE_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X69 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "ECONOMY_TYPE", scope = APPSCPMDMSDHGETX2070086X1X69 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X69ECONOMYTYPE(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X69ECONOMYTYPE_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X69 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "BUSINESS_LICENSE_NUM", scope = APPSCPMDMSDHGETX2070086X1X69 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X69BUSINESSLICENSENUM(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X69BUSINESSLICENSENUM_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X69 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "PARENT_SUPPLIER_CODE", scope = APPSCPMDMSDHGETX2070086X1X69 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X69PARENTSUPPLIERCODE(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X69PARENTSUPPLIERCODE_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X69 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "PARENT_SUPPLIER_NAME", scope = APPSCPMDMSDHGETX2070086X1X69 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X69PARENTSUPPLIERNAME(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X69PARENTSUPPLIERNAME_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X69 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "SUPPLIER_CODE", scope = APPSCPMDMSDHGETX2070086X1X69 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X69SUPPLIERCODE(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X99SUPPLIERCODE_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X69 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "BL_END_DATE", scope = APPSCPMDMSDHGETX2070086X1X69 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X69BLENDDATE(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X69BLENDDATE_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X69 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "PERSON_CERT_CODE", scope = APPSCPMDMSDHGETX2070086X1X69 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X69PERSONCERTCODE(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X69PERSONCERTCODE_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X69 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "CLASS_TYPE", scope = APPSCPMDMSDHGETX2070086X1X69 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X69CLASSTYPE(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X69CLASSTYPE_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X69 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "SUPPLIER_NAME", scope = APPSCPMDMSDHGETX2070086X1X69 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X69SUPPLIERNAME(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X99SUPPLIERNAME_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X69 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "PERSON_CERT_TYPE", scope = APPSCPMDMSDHGETX2070086X1X69 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X69PERSONCERTTYPE(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X69PERSONCERTTYPE_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X69 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "LEGAL_PERSON", scope = APPSCPMDMSDHGETX2070086X1X69 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X69LEGALPERSON(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X69LEGALPERSON_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X69 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "INST_CODE", scope = APPSCPMDMSDHGETX2070086X1X69 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X69INSTCODE(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X69INSTCODE_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X69 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "INDUSTY_TYPE", scope = APPSCPMDMSDHGETX2070086X1X69 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X69INDUSTYTYPE(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X69INDUSTYTYPE_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X69 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "X_ORG_CODE", scope = InputParameters.class)
    public JAXBElement<String> createInputParametersXORGCODE(String value) {
        return new JAXBElement<String>(_InputParametersXORGCODE_QNAME, String.class, InputParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "X_INFO_TYPE", scope = InputParameters.class)
    public JAXBElement<String> createInputParametersXINFOTYPE(String value) {
        return new JAXBElement<String>(_InputParametersXINFOTYPE_QNAME, String.class, InputParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "X_BEGIN_DATE", scope = InputParameters.class)
    public JAXBElement<String> createInputParametersXBEGINDATE(String value) {
        return new JAXBElement<String>(_InputParametersXBEGINDATE_QNAME, String.class, InputParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "X_END_DATE", scope = InputParameters.class)
    public JAXBElement<String> createInputParametersXENDDATE(String value) {
        return new JAXBElement<String>(_InputParametersXENDDATE_QNAME, String.class, InputParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "ATTRIBUTE7", scope = APPSCPMDMSDHGETX2070086X1X210 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X210ATTRIBUTE7(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X99ATTRIBUTE7_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X210 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "CREATION_DATE", scope = APPSCPMDMSDHGETX2070086X1X210 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X210CREATIONDATE(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X99CREATIONDATE_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X210 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "LAST_UPDATE_DATE", scope = APPSCPMDMSDHGETX2070086X1X210 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X210LASTUPDATEDATE(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X99LASTUPDATEDATE_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X210 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "ATTRIBUTE6", scope = APPSCPMDMSDHGETX2070086X1X210 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X210ATTRIBUTE6(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X99ATTRIBUTE6_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X210 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "ATTRIBUTE5", scope = APPSCPMDMSDHGETX2070086X1X210 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X210ATTRIBUTE5(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X99ATTRIBUTE5_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X210 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "ATTRIBUTE4", scope = APPSCPMDMSDHGETX2070086X1X210 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X210ATTRIBUTE4(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X99ATTRIBUTE4_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X210 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "SUPPLIER_CODE", scope = APPSCPMDMSDHGETX2070086X1X210 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X210SUPPLIERCODE(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X99SUPPLIERCODE_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X210 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "ATTRIBUTE8", scope = APPSCPMDMSDHGETX2070086X1X210 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X210ATTRIBUTE8(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X99ATTRIBUTE8_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X210 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "DISABLE_DATE", scope = APPSCPMDMSDHGETX2070086X1X210 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X210DISABLEDATE(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X210DISABLEDATE_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X210 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "ORG_NAME", scope = APPSCPMDMSDHGETX2070086X1X210 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X210ORGNAME(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X99ORGNAME_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X210 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "ATTRIBUTE3", scope = APPSCPMDMSDHGETX2070086X1X210 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X210ATTRIBUTE3(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X99ATTRIBUTE3_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X210 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "ATTRIBUTE2", scope = APPSCPMDMSDHGETX2070086X1X210 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X210ATTRIBUTE2(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X99ATTRIBUTE2_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X210 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "SITE_CODE", scope = APPSCPMDMSDHGETX2070086X1X210 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X210SITECODE(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X229SITECODE_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X210 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "ATTRIBUTE1", scope = APPSCPMDMSDHGETX2070086X1X210 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X210ATTRIBUTE1(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X99ATTRIBUTE1_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X210 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "SUPPLIER_NAME", scope = APPSCPMDMSDHGETX2070086X1X210 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X210SUPPLIERNAME(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X99SUPPLIERNAME_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X210 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "ADDR_NAME", scope = APPSCPMDMSDHGETX2070086X1X210 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X210ADDRNAME(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETDX2070086X1X6ADDRNAME_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X210 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "ORG_CODE", scope = APPSCPMDMSDHGETX2070086X1X210 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X210ORGCODE(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X99ORGCODE_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X210 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "ATTRIBUTE7", scope = APPSCPMDMSDHGETX2070086X1X44 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X44ATTRIBUTE7(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X99ATTRIBUTE7_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X44 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "LAST_UPDATE_DATE", scope = APPSCPMDMSDHGETX2070086X1X44 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X44LASTUPDATEDATE(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X99LASTUPDATEDATE_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X44 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "CREATION_DATE", scope = APPSCPMDMSDHGETX2070086X1X44 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X44CREATIONDATE(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X99CREATIONDATE_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X44 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "ATTRIBUTE6", scope = APPSCPMDMSDHGETX2070086X1X44 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X44ATTRIBUTE6(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X99ATTRIBUTE6_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X44 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "ATTRIBUTE5", scope = APPSCPMDMSDHGETX2070086X1X44 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X44ATTRIBUTE5(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X99ATTRIBUTE5_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X44 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "BANK_NAME", scope = APPSCPMDMSDHGETX2070086X1X44 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X44BANKNAME(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X44BANKNAME_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X44 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "ATTRIBUTE4", scope = APPSCPMDMSDHGETX2070086X1X44 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X44ATTRIBUTE4(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X99ATTRIBUTE4_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X44 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "SUPPLIER_CODE", scope = APPSCPMDMSDHGETX2070086X1X44 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X44SUPPLIERCODE(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X99SUPPLIERCODE_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X44 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "ATTRIBUTE8", scope = APPSCPMDMSDHGETX2070086X1X44 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X44ATTRIBUTE8(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X99ATTRIBUTE8_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X44 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "REG_ACCOUNT_NAME", scope = APPSCPMDMSDHGETX2070086X1X44 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X44REGACCOUNTNAME(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X44REGACCOUNTNAME_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X44 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "ACCOUNT_NUM", scope = APPSCPMDMSDHGETX2070086X1X44 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X44ACCOUNTNUM(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X44ACCOUNTNUM_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X44 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "ORG_NAME", scope = APPSCPMDMSDHGETX2070086X1X44 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X44ORGNAME(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X99ORGNAME_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X44 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "ATTRIBUTE3", scope = APPSCPMDMSDHGETX2070086X1X44 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X44ATTRIBUTE3(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X99ATTRIBUTE3_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X44 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "ATTRIBUTE2", scope = APPSCPMDMSDHGETX2070086X1X44 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X44ATTRIBUTE2(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X99ATTRIBUTE2_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X44 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "BANK_COMMENT", scope = APPSCPMDMSDHGETX2070086X1X44 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X44BANKCOMMENT(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X44BANKCOMMENT_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X44 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "ATTRIBUTE1", scope = APPSCPMDMSDHGETX2070086X1X44 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X44ATTRIBUTE1(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X99ATTRIBUTE1_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X44 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "SITE_CODE", scope = APPSCPMDMSDHGETX2070086X1X44 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X44SITECODE(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X229SITECODE_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X44 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "SUPPLIER_NAME", scope = APPSCPMDMSDHGETX2070086X1X44 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X44SUPPLIERNAME(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X99SUPPLIERNAME_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X44 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "CURRENCY_TYPE", scope = APPSCPMDMSDHGETX2070086X1X44 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X44CURRENCYTYPE(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X44CURRENCYTYPE_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X44 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "ACCOUNT_BANK_CODE", scope = APPSCPMDMSDHGETX2070086X1X44 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X44ACCOUNTBANKCODE(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X44ACCOUNTBANKCODE_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X44 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "ORG_CODE", scope = APPSCPMDMSDHGETX2070086X1X44 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X44ORGCODE(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X99ORGCODE_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X44 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "SUB_BANK_NAME", scope = APPSCPMDMSDHGETX2070086X1X44 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X44SUBBANKNAME(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X44SUBBANKNAME_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X44 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/export_cp_sdh_info/", name = "SUP_BANK_ID", scope = APPSCPMDMSDHGETX2070086X1X44 .class)
    public JAXBElement<String> createAPPSCPMDMSDHGETX2070086X1X44SUPBANKID(String value) {
        return new JAXBElement<String>(_APPSCPMDMSDHGETX2070086X1X44SUPBANKID_QNAME, String.class, APPSCPMDMSDHGETX2070086X1X44 .class, value);
    }

}
