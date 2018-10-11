package com.ek.controller.user;

import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ek.bo.commons.StaticConst;
import com.ek.entry.user.EkUser;
import com.ek.services.user.UserService;

/**
 * @包名   ek.controller.user
 * @文件名 UserController.java
 * @作者   qin_hqing
 * @创建日期 2014-10-20
 * @版本 V 1.0
 */
@Component
@RequestMapping("/user")
public class UserController {

	Logger logger = Logger.getLogger(this.getClass());
	
	@SuppressWarnings("unchecked")
	@RequestMapping("/toQuery.html")
	public ModelAndView toQuery(HttpServletRequest request){
		ModelAndView mav = new ModelAndView("/user/toQuery");
		
		try {
			List<EkUser> list = (List<EkUser>) this.userService.getList();
			request.setAttribute("users", list);
			if (null != list) {
				request.setAttribute(StaticConst.EK_RETURN_FLAG, StaticConst.EK_RETURN_SUCCESS);
			}else {
				request.setAttribute(StaticConst.EK_RETURN_FLAG, StaticConst.EK_RETURN_NODATA);
			}
		} catch (Exception e) {
			request.setAttribute(StaticConst.EK_RETURN_FLAG, StaticConst.EK_RETURN_ERROR);
			logger.error(e);
			e.printStackTrace();
		}finally{
		}
		
		return mav;
	}
	@RequestMapping("/toAdd.html")
	public ModelAndView toAdd(EkUser user, HttpServletRequest request){
		ModelAndView mav = null;
		mav = new ModelAndView("/user/toAddInit");
		try {
			EkUser logUser = (EkUser) request.getSession().getAttribute("loginUser");
			user.setCreateUserId(logUser.getUserId());
			boolean bl = this.userService.add(user);
			request.setAttribute("user", user);
			if (bl) {
				request.setAttribute("success", "1");
			}else {
				request.setAttribute("error", "1");
			}
		} catch (SQLException e) {
			request.setAttribute("error", "1");
			logger.error(e);
			e.printStackTrace();
		}
		return mav;
	}
	
	@RequestMapping("/toAddInit.html")
	public ModelAndView toAddInit(HttpServletRequest request){
		ModelAndView mav = null;
		mav = new ModelAndView("/user/toAddInit");
		request.setAttribute("user", new EkUser());
		return mav;
	}
	
	private UserService userService;
	@Autowired
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
}
