
package com.ek.client.service;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.7.7
 * 2015-05-15T10:25:36.027+08:00
 * Generated source version: 2.7.7
 * 
 */
public final class CPMDMSDHGETDATAPKG2PortType_CPMDMSDHGETDATAPKG2Port_Client {

    private static final QName SERVICE_NAME = new QName("http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cp_mdm_sdh_get_data_pkg2/", "CP_MDM_SDH_GET_DATA_PKG2_Service");

    private CPMDMSDHGETDATAPKG2PortType_CPMDMSDHGETDATAPKG2Port_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = CPMDMSDHGETDATAPKG2Service.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        CPMDMSDHGETDATAPKG2Service ss = new CPMDMSDHGETDATAPKG2Service(wsdlURL, SERVICE_NAME);
        CPMDMSDHGETDATAPKG2PortType port = ss.getCPMDMSDHGETDATAPKG2Port();  
        
        {
        System.out.println("Invoking exportCPSDHINFO...");
        com.ek.client.service.SOAHeader _exportCPSDHINFO_header = null;
        com.ek.client.service.InputParameters _exportCPSDHINFO_body = null;
        try {
            com.ek.client.service.OutputParameters _exportCPSDHINFO__return = port.exportCPSDHINFO(_exportCPSDHINFO_header, _exportCPSDHINFO_body);
            System.out.println("exportCPSDHINFO.result=" + _exportCPSDHINFO__return);

        } catch (ISGServiceFaultMessage e) { 
            System.out.println("Expected exception: ISGServiceFaultMessage has occurred.");
            System.out.println(e.toString());
        }
            }

        System.exit(0);
    }

}
