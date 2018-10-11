package com.ek.client.call;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.cxf.binding.soap.saaj.SAAJOutInterceptor;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.apache.cxf.ws.security.wss4j.WSS4JOutInterceptor;
import org.apache.ws.security.WSConstants;
import org.apache.ws.security.handler.WSHandlerConstants;

import com.ek.client.interceptor.ExampleServiceClientInterceptor;
import com.ek.client.services.example.ExampleService;
import com.ek.client.services.example.User;

/** 
 * @author Qin_HQing
 * @version 创建时间：2015年5月15日 上午11:05:06 
 * 类说明 
 */
public class ExampleServiceClient {

	public static void main(String[] args) {
//		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring-cxf-client.xml");
//		ExampleService es = (ExampleService) ctx.getBean("exampleService");
		Map<String, Object> map = new HashMap<String, Object>();
		map.put(WSHandlerConstants.ACTION, WSHandlerConstants.USERNAME_TOKEN);
		map.put(WSHandlerConstants.USER, "admin");
		map.put(WSHandlerConstants.PASSWORD_TYPE, WSConstants.PW_TEXT);
		map.put(WSHandlerConstants.PW_CALLBACK_CLASS, ExampleServiceClientInterceptor.class.getName());
		
		List list = new ArrayList();
		list.add(new SAAJOutInterceptor());
		list.add(new WSS4JOutInterceptor(map));
		
		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
		factory.setServiceClass(ExampleService.class);
		factory.setAddress("http://localhost:18080/jeeek-dp/services/ExampleService");
		factory.getOutInterceptors().addAll(list);
		ExampleService es = (ExampleService) factory.create();
		
		User u = es.getStr("ssss");
		
		System.out.println("奶奶的"+u.getAddress());
	}
}
