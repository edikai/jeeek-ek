package com.ek.controller.menu;

import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import net.sf.json.JSONArray;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ek.bo.commons.StaticConst;
import com.ek.entry.menu.EKMenu;
import com.ek.entry.permission.EkPermission;
import com.ek.entry.permission.EkResource;
import com.ek.entry.user.EkUser;
import com.ek.services.menu.MenuService;
import com.ek.services.permission.PermissionService;

/**
 * @包名   com.ek.controller.resource
 * @文件名 ResourceController.java
 * @作者   Qin_HQing
 * @创建日期 2015年5月27日
 * @版本 V 1.0
 * @描述
 */
@Component
@RequestMapping("/menu")
public class MenuController {

	Logger logger = Logger.getLogger(this.getClass());
	
	private MenuService menuService;
	private PermissionService permService;
	
	@RequestMapping("/toQuerySubMenu")
	public ModelAndView toQuerySubMenu(HttpServletRequest request){
		ModelAndView mav = new ModelAndView("/menu/top");
		
		//String menuId = (String) request.getAttribute("menuId");
		String menuId = request.getParameter("menuId");
		try {
			List<EKMenu> list = this.menuService.getMenuListBySub(menuId);
			request.setAttribute(StaticConst.PAGE_EK_PAGE_FLAG, StaticConst.PAGE_EK_PAGE_ACCESS);
			if (null != list && !list.isEmpty()) {
				request.setAttribute(StaticConst.EK_RETURN_FLAG, StaticConst.EK_RETURN_SUCCESS);
			}else {
				request.setAttribute(StaticConst.EK_RETURN_FLAG, StaticConst.EK_RETURN_NODATA);
			}
			request.setAttribute("menuList", list);
			request.setAttribute("menuId", menuId);
			
		} catch (SQLException e) {
			request.setAttribute(StaticConst.EK_RETURN_FLAG, StaticConst.EK_RETURN_ERROR);
			this.logger.error(e);
			e.printStackTrace();
		}
		
		return mav;
	}
	@RequestMapping("/toBottom.html")
	public ModelAndView toBottom(){
		return new ModelAndView("/menu/bottom");
	}
	@RequestMapping("/toTop.html")
	public ModelAndView toTop(HttpServletRequest request){
		request.setAttribute(StaticConst.PAGE_EK_PAGE_FLAG, StaticConst.PAGE_EK_PAGE_INIT);
		return new ModelAndView("/menu/top");
	}
	@RequestMapping("/toLeft.html")
	public ModelAndView toLeft(HttpServletRequest request){
		try {
			List<?> list = this.menuService.getList();
			JSONArray ja = JSONArray.fromObject(list);
			request.setAttribute("menuList", ja.toString());
		} catch (SQLException e) {
			this.logger.error(e);
			e.printStackTrace();
		}
		return new ModelAndView("/menu/left");
	}
	
	@RequestMapping("/toQuery.html")
	public ModelAndView toQuery(HttpServletRequest request){
		return new ModelAndView("/menu/toQuery");
	}
	
	@SuppressWarnings("unchecked")
	@RequestMapping("/toAdd.html")
	public ModelAndView add(EKMenu menu, HttpServletRequest request) {
		ModelAndView mav = null;
		mav = new ModelAndView("/menu/toAddInit");
		try {
			EkUser logUser = (EkUser) request.getSession().getAttribute("loginUser");
			menu.setCreateUserId(logUser.getUserId());
			boolean rbl = menuService.add(menu);
			if (rbl) {
				request.setAttribute(StaticConst.EK_RETURN_FLAG, StaticConst.EK_RETURN_SUCCESS);
			}else {
				request.setAttribute(StaticConst.EK_RETURN_FLAG, StaticConst.EK_RETURN_ERROR);
			}
			List<Object> list = this.menuService.getList();
			JSONArray ja = JSONArray.fromObject(list);
			List<EkPermission> permList = (List<EkPermission>) this.permService.getList();
			JSONArray jPermList = JSONArray.fromObject(permList);
			logger.info(ja.toString());
			request.setAttribute("menuList", ja.toString());
			request.setAttribute("permList", jPermList.toString());
			request.setAttribute("menu", menu);
		} catch (Exception e) {
			//此处应该回滚事物
			logger.error(e);
			e.printStackTrace();
		}finally{
			//统一释放资源
		}
		
		return mav;
	}
	@SuppressWarnings("unchecked")
	@RequestMapping("/toAddInit.html")
	public ModelAndView toAdd(HttpServletRequest request) {
		ModelAndView mav = null;
		mav = new ModelAndView("/menu/toAddInit");
		request.setAttribute("resource", new EkResource());
		try {
			List<Object> list = this.menuService.getList();
			JSONArray ja = JSONArray.fromObject(list);
			List<EkPermission> permList = (List<EkPermission>) this.permService.getList();
			JSONArray jPermList = JSONArray.fromObject(permList);
			
			request.setAttribute("menuList", ja.toString());
			request.setAttribute("permList", jPermList.toString());
			request.setAttribute("menu", new EKMenu());
			
		} catch (SQLException e) {
			logger.error(e);
			e.printStackTrace();
		}
		return mav;
	}
	
	@RequestMapping("/toAddSubMenu.html")
	public ModelAndView addSubMenu(EKMenu menu, HttpServletRequest request) {
		ModelAndView mav = null;
		mav = new ModelAndView("/menu/toAddSubMenuInit");
		try {
			EkUser logUser = (EkUser) request.getSession().getAttribute("loginUser");
			menu.setCreateUserId(logUser.getUserId());
			boolean rbl = menuService.add(menu);
			if (rbl) {
				request.setAttribute(StaticConst.EK_RETURN_FLAG, StaticConst.EK_RETURN_SUCCESS);
			}else {
				request.setAttribute(StaticConst.EK_RETURN_FLAG, StaticConst.EK_RETURN_ERROR);
			}
			@SuppressWarnings("unchecked")
			List<EkPermission> permList = (List<EkPermission>) this.permService.getList();
			JSONArray jPermList = JSONArray.fromObject(permList);
			request.setAttribute("permList", jPermList.toString());
			request.setAttribute("menu", menu);
		} catch (Exception e) {
			//此处应该回滚事物
			logger.error(e);
			e.printStackTrace();
		}finally{
			//统一释放资源
		}
		
		return mav;
	}
	
	@RequestMapping("/toAddSubMenuInit.html")
	public ModelAndView toAddSubMenu(HttpServletRequest request) {
		ModelAndView mav = null;
		mav = new ModelAndView("/menu/toAddSubMenuInit");
		request.setAttribute("resource", new EkResource());
		String parMenuId = request.getParameter("menuId");
		try {
			@SuppressWarnings("unchecked")
			List<EkPermission> permList = (List<EkPermission>) this.permService.getList();
			JSONArray jPermList = JSONArray.fromObject(permList);
			
			request.setAttribute("permList", jPermList.toString());
			request.setAttribute("menu", new EKMenu());
			request.setAttribute("parMenuId", parMenuId);
			
		} catch (SQLException e) {
			logger.error(e);
			e.printStackTrace();
		}
		return mav;
	}
	
	@Autowired
	public void setPermService(PermissionService permService) {
		this.permService = permService;
	}
	@Autowired
	public void setMenuService(MenuService menuService) {
		this.menuService = menuService;
	}
}
