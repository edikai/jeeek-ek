package com.ek.controller.sectest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * @包名   com.ek.controller.sectest
 * @文件名 LoginLogoutController.java
 * @作者   qin_hqing
 * @创建日期 2015-1-14
 * @版本 V 1.0
 */
@Controller
@RequestMapping("/auth")
public class LoginLogoutController {

	protected static Logger logger = Logger.getLogger(LoginLogoutController.class);
	
	/** 
	* 指向登录页面 
	*/  
	@RequestMapping("/login.html")  
	public ModelAndView getLoginPage(@RequestParam(value = "error", required = false) boolean error,  
			ModelMap model) {  
		logger.debug("Received request to show login page");  
		if (error == true) {  
			// Assign an error message  
			model.put("error", "You have entered an invalid username or password!");  
		} else {  
			model.put("error", "");  
		}
		return new ModelAndView("/security/loginpage");  
	}
	
	/** 
	* 指定无访问额权限页面 
	*  
	* @return 
	*/  
	@RequestMapping(value = "/denied.html", method = RequestMethod.GET)  
	public String getDeniedPage() {  
  
		logger.debug("Received request to show denied page");  
		return "security/deniedpage";  
	}
}
