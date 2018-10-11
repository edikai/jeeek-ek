package com.ekservice.impl;

import javax.jws.WebService;

import com.ek.entry.user.User;
import com.ekservice.service.ExampleService;

/** 
 * @author Administrator
 * @version 创建时间：2015-5-14 下午02:30:35 
 * 类说明 
 */
@WebService(targetNamespace="http://jeeek-dp/", serviceName="ExampleService", name="ExampleService")
public class ExampleServiceImpl implements ExampleService {

	public User getStr(String userName) {
		System.out.println(userName);
		User user = new User();
		user.setAddress("北京市海淀区222号");
		user.setMobilePhone("010-1101111");
		return user;
	}

}
