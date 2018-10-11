package com.ekservice.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.ek.entry.user.User;

/** 
 * @author Administrator
 * @version 创建时间：2015-5-14 下午02:17:59 
 * 类说明 
 */
@WebService(targetNamespace="http://jeeek-dp/", name="ExampleService")
public interface ExampleService {

	@WebResult(name="password")
	@WebMethod(action="http://jeeek-dp/ExampleService/getStr")
	public User getStr(@WebParam(name="name")String userName);
}
