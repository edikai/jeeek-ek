package com.ek.controller.sectest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @包名   com.ek.controller.sectest
 * @文件名 MainController.java
 * @作者   qin_hqing
 * @创建日期 2015-1-14
 * @版本 V 1.0
 */
@Controller
@RequestMapping("/main")
public class MainController {
	protected static Logger logger = Logger.getLogger(MainController.class);
	
	/** 
	* 跳转到commonpage页面 
	* @return 
	*/  
	@RequestMapping(value = "/common.html", method = RequestMethod.GET)  
	public String getCommonPage() {
		logger.debug("Received request to show common page");  
		return "security/commonpage";  
	}
	
	/** 
	* 跳转到adminpage页面 
	*  
	* @return 
	*/  
	@RequestMapping(value = "/admin.html", method = RequestMethod.GET)  
	public String getAadminPage() {  
		logger.debug("Received request to show admin page");  
		return "security/adminpage";  
	}
}
