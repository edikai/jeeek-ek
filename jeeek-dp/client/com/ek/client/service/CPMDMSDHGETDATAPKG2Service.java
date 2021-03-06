package com.ek.client.service;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.7.7
 * 2015-05-15T10:25:36.087+08:00
 * Generated source version: 2.7.7
 * 
 */
@WebServiceClient(name = "CP_MDM_SDH_GET_DATA_PKG2_Service", 
                  wsdlLocation = "http://192.168.1.6:8916/soa-infra/services/default/DEV_PLSQL_CP_MDM_SDH_GET_DATA_PKG2/CP_MDM_SDH_GET_DATA_PKG2_Service?wsdl",
                  targetNamespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/") 
public class CPMDMSDHGETDATAPKG2Service extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/", "CP_MDM_SDH_GET_DATA_PKG2_Service");
    public final static QName CPMDMSDHGETDATAPKG2Port = new QName("http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/", "CP_MDM_SDH_GET_DATA_PKG2_Port");
    static {
        URL url = null;
        try {
            url = new URL("http://192.168.1.6:8916/soa-infra/services/default/DEV_PLSQL_CP_MDM_SDH_GET_DATA_PKG2/CP_MDM_SDH_GET_DATA_PKG2_Service?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(CPMDMSDHGETDATAPKG2Service.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://192.168.1.6:8916/soa-infra/services/default/DEV_PLSQL_CP_MDM_SDH_GET_DATA_PKG2/CP_MDM_SDH_GET_DATA_PKG2_Service?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public CPMDMSDHGETDATAPKG2Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public CPMDMSDHGETDATAPKG2Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CPMDMSDHGETDATAPKG2Service() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    /**
     *
     * @return
     *     returns CPMDMSDHGETDATAPKG2PortType
     */
    @WebEndpoint(name = "CP_MDM_SDH_GET_DATA_PKG2_Port")
    public CPMDMSDHGETDATAPKG2PortType getCPMDMSDHGETDATAPKG2Port() {
        return super.getPort(CPMDMSDHGETDATAPKG2Port, CPMDMSDHGETDATAPKG2PortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CPMDMSDHGETDATAPKG2PortType
     */
    @WebEndpoint(name = "CP_MDM_SDH_GET_DATA_PKG2_Port")
    public CPMDMSDHGETDATAPKG2PortType getCPMDMSDHGETDATAPKG2Port(WebServiceFeature... features) {
        return super.getPort(CPMDMSDHGETDATAPKG2Port, CPMDMSDHGETDATAPKG2PortType.class, features);
    }

}
