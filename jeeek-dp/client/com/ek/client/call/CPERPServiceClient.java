package com.ek.client.call;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.cxf.binding.soap.saaj.SAAJOutInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.apache.cxf.ws.security.wss4j.WSS4JInInterceptor;
import org.apache.cxf.ws.security.wss4j.WSS4JOutInterceptor;
import org.apache.ws.security.WSConstants;
import org.apache.ws.security.handler.WSHandlerConstants;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ek.client.interceptor.CPERPServiceClientInterceptor;
import com.ek.client.service.CPMDMSDHGETDATAPKG2PortType;
import com.ek.client.service.ISGServiceFaultMessage;
import com.ek.client.service.InputParameters;
import com.ek.client.service.ObjectFactory;
import com.ek.client.service.OutputParameters;
import com.ek.client.service.SOAHeader;

/** 
 * @author Qin_HQing
 * @version 创建时间：2015年5月15日 上午11:05:06 
 * 类说明 
 */
public class CPERPServiceClient {

	public static void main(String[] args) throws ISGServiceFaultMessage {
//		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring-cxf-client.xml");
//		CPMDMSDHGETDATAPKG2PortType cppt = (CPMDMSDHGETDATAPKG2PortType) ctx.getBean("cperpService");
//		
//		ObjectFactory of = new ObjectFactory();
//		
//		SOAHeader header = of.createSOAHeader();
//		InputParameters body = of.createInputParameters();
//		
//		header.setNLSLanguage("AMERICAN");
//		header.setOrgId("");
//		header.setRespApplication("FND");
//		header.setResponsibility("FND_REP_APP");
//		header.setSecurityGroup("STANDARD");
//		
//		body.setXBEGINDATE(of.createInputParametersXBEGINDATE("20150101"));
//		body.setXENDDATE(of.createInputParametersXENDDATE("20150401"));
//		body.setXINFOTYPE(of.createInputParametersXINFOTYPE(""));
//		body.setXORGCODE(of.createInputParametersXORGCODE("A"));
//		
//		OutputParameters op = cppt.exportCPSDHINFO(header, body);
		
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put(WSHandlerConstants.ACTION, WSHandlerConstants.USERNAME_TOKEN);
		map.put(WSHandlerConstants.USER, "cpweb");
		map.put(WSHandlerConstants.PASSWORD_TYPE, WSConstants.PW_TEXT);
		map.put(WSHandlerConstants.PW_CALLBACK_CLASS, CPERPServiceClientInterceptor.class.getName());
		
		List list = new ArrayList();
		list.add(new SAAJOutInterceptor());
		list.add(new LoggingOutInterceptor());
		list.add(new WSS4JOutInterceptor(map));
		
		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
		factory.setServiceClass(CPMDMSDHGETDATAPKG2PortType.class);
		factory.setAddress("http://192.168.1.6:8916/soa-infra/services/default/DEV_PLSQL_CP_MDM_SDH_GET_DATA_PKG2/CP_MDM_SDH_GET_DATA_PKG2_Service");
		factory.getOutInterceptors().addAll(list);
		
		CPMDMSDHGETDATAPKG2PortType cppt = (CPMDMSDHGETDATAPKG2PortType) factory.create();
		
		ObjectFactory of = new ObjectFactory();
		
		SOAHeader header = of.createSOAHeader();
		InputParameters body = of.createInputParameters();
		
		header.setNLSLanguage("AMERICAN");
		header.setOrgId("");
		header.setRespApplication("FND");
		header.setResponsibility("FND_REP_APP");
		header.setSecurityGroup("STANDARD");
		
		body.setXBEGINDATE(of.createInputParametersXBEGINDATE("20150101"));
		body.setXENDDATE(of.createInputParametersXENDDATE("20150401"));
		body.setXINFOTYPE(of.createInputParametersXINFOTYPE(""));
		body.setXORGCODE(of.createInputParametersXORGCODE("A"));
		
		OutputParameters op = cppt.exportCPSDHINFO(header, body);
		System.out.println(op.getXRETURNSTATUS().getValue()+" "+op.getXRETURNMSG().getValue()+"---"+op);
	}
}
