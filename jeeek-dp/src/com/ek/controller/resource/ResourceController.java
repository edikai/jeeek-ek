package com.ek.controller.resource;

import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ek.bo.commons.StaticConst;
import com.ek.entry.permission.EkResource;
import com.ek.entry.user.EkUser;
import com.ek.services.resource.ResourceService;
import com.ek.services.resource.ResourceServiceI;

/**
 * @包名   com.ek.controller.resource
 * @文件名 ResourceController.java
 * @作者   Qin_HQing
 * @创建日期 2015年5月27日
 * @版本 V 1.0
 * @描述
 */
@Component
@RequestMapping("/resource")
public class ResourceController {

	Logger logger = Logger.getLogger(this.getClass());
	private ResourceServiceI resouService;
	
	@RequestMapping("/toQuery.html")
	public ModelAndView toQuery(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView("/resource/toQuery");
		
		try {
			List<?> list = this.resouService.getList();
			if (null != list && !list.isEmpty()) {
				request.setAttribute(StaticConst.EK_RETURN_FLAG, StaticConst.EK_RETURN_SUCCESS);
			}else {
				request.setAttribute(StaticConst.EK_RETURN_FLAG, StaticConst.EK_RETURN_NODATA);
			}
			request.setAttribute("resouList", list);
		} catch (SQLException e) {
			request.setAttribute(StaticConst.EK_RETURN_FLAG, StaticConst.EK_RETURN_ERROR);
			e.printStackTrace();
		}
		
		return mav;
	}
	@RequestMapping("/toAdd.html")
	public ModelAndView add(EkResource resource, HttpServletRequest request) {
		ModelAndView mav = null;
		mav = new ModelAndView("/resource/toAddInit");
		try {
			EkUser logUser = (EkUser) request.getSession().getAttribute("loginUser");
			resource.setCreateUserId(logUser.getUserId());
			boolean rbl = resouService.add(resource);
			logger.info(rbl);
			if (rbl) {
				request.setAttribute(StaticConst.EK_RETURN_FLAG, StaticConst.EK_RETURN_SUCCESS);
			}else {
				request.setAttribute(StaticConst.EK_RETURN_FLAG, StaticConst.EK_RETURN_ERROR);
			}
			request.setAttribute("resource", resource);
		} catch (Exception e) {
			//此处应该回滚事物
			logger.error(e);
			e.printStackTrace();
		}finally{
			//统一释放资源
		}
		
		return mav;
	}
	@RequestMapping("/toAddInit.html")
	public ModelAndView toAdd(HttpServletRequest request) {
		ModelAndView mav = null;
		mav = new ModelAndView("/resource/toAddInit");
		request.setAttribute("resource", new EkResource());
		return mav;
	}
	
	@Autowired
	public void setResouService(ResourceService resouService) {
		this.resouService = resouService;
	}
	
}
