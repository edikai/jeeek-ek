package com.ek.controller.permssion;

import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ek.controller.commons.EKController;
import com.ek.entry.commons.JSONMsg;
import net.sf.json.JSONArray;

import net.sf.json.JSONObject;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ek.bo.commons.StaticConst;
import com.ek.entry.permission.EkPermission;
import com.ek.entry.user.EkUser;
import com.ek.services.permission.PermissionService;
import com.ek.services.resource.ResourceService;
import com.ek.services.user.UserService;

/**
 * @包名 com.ek.controller.permssion
 * @文件名 PermissionController.java
 * @作者 Qin_HQing
 * @创建日期 2015年5月27日
 * @版本 V 1.0
 * @描述
 */
@Component
@RequestMapping("/permission")
public class PermissionController extends EKController {

	private Logger log = Logger.getLogger(this.getClass());
	private PermissionService permService;
	private ResourceService resouService;
	private UserService userService;

	@RequestMapping("/toQuery.html")
	public ModelAndView toQuery(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView("/permission/toQuery");
		
		try {
			List<?> list = this.permService.getList();
			if (null != list && !list.isEmpty()) {
				request.setAttribute(StaticConst.EK_RETURN_FLAG, StaticConst.EK_RETURN_SUCCESS);
			}else {
				request.setAttribute(StaticConst.EK_RETURN_FLAG, StaticConst.EK_RETURN_NODATA);
			}
			request.setAttribute("permList", list);
		} catch (SQLException e) {
			request.setAttribute(StaticConst.EK_RETURN_FLAG, StaticConst.EK_RETURN_ERROR);
			e.printStackTrace();
		}
		
		return mav;
	}
	/**
	 * 授权初始化
	*@param request
	*@param response
	*@return
	*@author qin_hqing
	*@date 2015年6月1日 上午10:29:34
	*@comment
	 */
	@RequestMapping("/toDistrInit.html")
	public ModelAndView toDistributePermInit(HttpServletRequest request,
			HttpServletResponse response) {
		ModelAndView mav = new ModelAndView("/permission/toDistrInit");

		request.setAttribute(StaticConst.EK_RETURN_FLAG,
				StaticConst.EK_RETURN_SUCCESS);
		request.setAttribute(StaticConst.PAGE_EK_PAGE_FLAG, StaticConst.PAGE_EK_PAGE_INIT);
		return mav;
	}
	
	/**
	 * 授权初始化-获取用户信息
	*@param request
	*@param response
	*@return
	*@author qin_hqing
	*@date 2015年6月1日 上午10:32:02
	*@comment
	 */
	@RequestMapping("/toDistrInit_t.html")
	public ModelAndView toDistributePermInit_t(HttpServletRequest request,
			HttpServletResponse response) {
		ModelAndView mav = new ModelAndView("/permission/toDistrInit_t");

		try {
			@SuppressWarnings("unchecked")
			List<EkUser> userList = (List<EkUser>) this.userService.getList();
			request.setAttribute("userList", userList);//用户 （用户组、角色、角色组）

			request.setAttribute(StaticConst.EK_RETURN_FLAG,
					StaticConst.EK_RETURN_SUCCESS);
		} catch (SQLException e) {
			request.setAttribute(StaticConst.EK_RETURN_FLAG,
					StaticConst.EK_RETURN_ERROR);
			log.error(e);
			e.printStackTrace();
		}

		return mav;
	}

	/**
	 * 已授权未授权权限
	*@param request
	*@param response
	*@return
	*@author qin_hqing
	*@date 2015年6月1日 上午10:33:03
	*@comment
	 */
	@RequestMapping("/toDistrInit_b.html")
	public ModelAndView toDistributePermInit_b(HttpServletRequest request,
			HttpServletResponse response) {
		ModelAndView mav = new ModelAndView("/permission/toDistrInit_b");

		request.setAttribute(StaticConst.PAGE_EK_PAGE_FLAG,
				StaticConst.PAGE_EK_PAGE_INIT);

		return mav;
	}

	/**
	 * 已授权未授权权限
	*@param request
	*@param response
	*@return
	*@author qin_hqing
	*@date 2015年6月1日 上午10:30:04
	*@comment
	 */
	@RequestMapping("/getPerm.html")
	public ModelAndView getPerm(HttpServletRequest request,
			HttpServletResponse response) {
		ModelAndView mav = new ModelAndView("/permission/toDistrInit_b");
		
		String userId = request.getParameter("userId");
		try {
			this.setPermInfo(request, userId);
			request.setAttribute(StaticConst.EK_RETURN_FLAG, StaticConst.EK_RETURN_SUCCESS);
			request.setAttribute(StaticConst.PAGE_EK_PAGE_FLAG, StaticConst.PAGE_EK_PAGE_ACCESS);
		} catch (SQLException e) {
			log.error(e);
			e.printStackTrace();
		}
		return mav;
	}
	
	/**
	 * 给用户授权
	*@param request
	*@param response
	*@return
	*@author qin_hqing
	*@date 2015年6月1日 上午10:33:28
	*@comment
	 */
	@RequestMapping("/grantPerm.html")
	public ModelAndView grantPerm(HttpServletRequest request,
			HttpServletResponse response) {
		ModelAndView mav = new ModelAndView("/permission/toDistrInit_b");

		String userId = request.getParameter("userId");
		String[] pids = request.getParameter("pid").split(",");
		EkUser logUser = (EkUser) request.getSession().getAttribute("loginUser");
		try {
			boolean bl = this.permService.grantPerm2User(userId, pids, logUser.getUserId()); //授权
			this.setPermInfo(request, userId);
			if (bl) {
				request.setAttribute(StaticConst.EK_RETURN_FLAG, StaticConst.EK_RETURN_SUCCESS);
			}else {
				request.setAttribute(StaticConst.EK_RETURN_FLAG, StaticConst.EK_RETURN_ERROR);
			}
			
			request.setAttribute(StaticConst.PAGE_EK_PAGE_FLAG, StaticConst.PAGE_EK_PAGE_ACCESS);
		} catch (SQLException e) {
			log.error(e);
			e.printStackTrace();
		}
		return mav;
	}

	@RequestMapping("/revokePerm.html")
	public ModelAndView revokePerm(HttpServletRequest request, HttpServletResponse response){
		ModelAndView mav = new ModelAndView("/permission/toDistrInit_b");
		
		String userId = request.getParameter("userId");
		String[] pids = request.getParameter("pid").split(",");
		EkUser logUser = (EkUser) request.getSession().getAttribute("loginUser");
		
		try {
			boolean bl = this.permService.revokePermFromUser(userId, pids, logUser.getUserId()); //撤销权限
			this.setPermInfo(request, userId);
			if (bl) {
				request.setAttribute(StaticConst.EK_RETURN_FLAG, StaticConst.EK_RETURN_SUCCESS);
			}else {
				request.setAttribute(StaticConst.EK_RETURN_FLAG, StaticConst.EK_RETURN_ERROR);
			}
			request.setAttribute(StaticConst.PAGE_EK_PAGE_FLAG, StaticConst.PAGE_EK_PAGE_ACCESS);
		} catch (Exception e) {
			log.error(e);
			e.printStackTrace();
		}
		
		return mav;
	}
	
	/**
	 * 暂存权限
	*@param request
	*@param userId
	*@throws SQLException
	*@author qin_hqing
	*@date 2015年6月1日 上午10:29:45
	*@comment
	 */
	protected void setPermInfo(HttpServletRequest request, String userId)
			throws SQLException {
		@SuppressWarnings("unchecked")
		List<EkPermission> permList = (List<EkPermission>) this.permService
		.getList(null, null);
		List<EkPermission> permGrantList = this.permService.getPermFromMapping(
				StaticConst.TAB_EK_USER_PERMISSION_MAPPING, userId);
		for (int i = 0; i < permGrantList.size(); i++) {
			EkPermission p1 = permGrantList.get(i);
			for (int j = 0; j < permList.size(); j++) {
				EkPermission p2 = permList.get(j);
				if (p1.getPermsnId() == p2.getPermsnId()) {
					permList.remove(j);
				}
			}
		}
		log.info("-------"+permGrantList.size()+"--"+permList.size());
		request.setAttribute("userId", userId);
		request.setAttribute("permGrantList", permGrantList);
		request.setAttribute("permList", permList);
	}

	/**
	 * 添加权限
	*@param perm
	*@param request
	*@return
	*@author qin_hqing
	*@date 2015年6月1日 上午10:29:26
	*@comment
	 */
	@RequestMapping("/toAdd.html")
	public ModelAndView toAdd(EkPermission perm, HttpServletRequest request) {
		ModelAndView mav = new ModelAndView("/permission/toAddInit");

		EkUser logUser = (EkUser) request.getSession()
				.getAttribute("loginUser");
		perm.setCreateUserId(logUser.getUserId());
		boolean rbl = false;
		try {
			rbl = this.permService.add(perm);

			if (rbl) {
				request.setAttribute(StaticConst.EK_RETURN_FLAG,
						StaticConst.EK_RETURN_SUCCESS);
			} else {
				request.setAttribute(StaticConst.EK_RETURN_FLAG,
						StaticConst.EK_RETURN_ERROR);
			}
			List<?> rss = this.resouService.getList();
			JSONArray ja = JSONArray.fromObject(rss);
			request.setAttribute("rss", ja.toString());
			request.setAttribute("perm", perm);
		} catch (SQLException e) {
			log.error(e);
			e.printStackTrace();
		}

		return mav;
	}

	/**
	 * 添加权限初始化
	*@param request
	*@return
	*@author qin_hqing
	*@date 2015年6月1日 上午10:29:05
	*@comment
	 */
	@RequestMapping("/toAddInit.html")
	public ModelAndView toAddInit(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView("/permission/toAddInit");

		try {
			List<?> rss = this.resouService.getList();
			JSONArray ja = JSONArray.fromObject(rss);
			request.setAttribute("rss", ja.toString());
			request.setAttribute("perm", new EkPermission());
		} catch (SQLException e) {
			log.error(e);
			e.printStackTrace();
		}

		return mav;
	}
	
	@Autowired
	public void setPermService(PermissionService permService) {
		this.permService = permService;
	}

	@Autowired
	public void setResouService(ResourceService resouService) {
		this.resouService = resouService;
	}

	@Autowired
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

}
