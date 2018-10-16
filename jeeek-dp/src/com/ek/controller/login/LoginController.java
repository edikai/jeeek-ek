package com.ek.controller.login;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ek.bo.commons.StaticConst;
import com.ek.controller.commons.EKController;
import com.ek.entry.menu.TreeEkMenu;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import net.sf.json.JsonConfig;
import net.sf.json.util.PropertyFilter;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ek.bo.commons.CookieUtil;
import com.ek.bo.commons.CryptUtil;
import com.ek.bo.commons.DateUtil;
import com.ek.entry.user.EkUser;
import com.ek.services.login.LoginService;
import com.ek.services.login.LoginServiceI;
import com.ek.services.menu.MenuServiceI;
import com.ek.services.permission.PermissionServiceI;
import com.ek.services.resource.ResourceServiceI;

/**
 * @包名 ek.controller.login
 * @文件名 LoginController.java
 * @作者 qin_hqing
 * @创建日期 2014-10-20
 * @版本 V 1.0
 */
@Controller
@RequestMapping("/xcom")
public class LoginController extends EKController {

	private Logger logger = Logger.getLogger(this.getClass());
	private CryptUtil cryptUtil = new CryptUtil();
	
	/**
	* 登陆操作
	* @param
	* @Return:
	* @Author: Qin_HQing
	* @Date: 2018/10/11 11:15
	* @Description:
	**/
	@RequestMapping("/login.html")
	public ModelAndView login(@ModelAttribute("user")EkUser user, HttpServletRequest request,
	                          HttpServletResponse response) {
		
		EkUser loginUser = null;
		ModelAndView mav = null;
		String clientTime = request.getParameter("nowTime");
		String rembme = request.getParameter("rembme");
		String pwdChanged = request.getParameter("pwdChanged");
		
		boolean pwdC = (pwdChanged == null || pwdChanged.trim().length()<=0) ? false : true;

		long[] it = DateUtil.getDateTimeInterval(new Date(), clientTime);
		try {
			
			if (!pwdC){//密码未出现改动，则取cookie中的值作比较
				String li = CookieUtil.getCookie("loginInfo", request);
				if (null != li) {
					user.setPassWord(li.split(",")[1]);
				}
			}else {//密码出现改动，则加密后比较
				cryptUtil.setStr2MD5(user.getPassWord());
				user.setPassWord(cryptUtil.get_MD5Str());
			}
			
			loginUser = this.loginService.loginUser(user);
			if (null != loginUser) {
				if (loginUser.getValidFlag().equals("0")){
					request.getSession().setAttribute("error", StaticConst.EK_RETURN_PAGE_PWD_INVALID);
					mav = new ModelAndView("/login/login");
					return mav;
				}
				request.getSession().setAttribute("loginUser", loginUser);
				request.getSession().setAttribute("timeIntv", it);
				
				String pwd = user.getPassWord();
				if (null != rembme && rembme.equals("true")) {
					CookieUtil.addCookie("loginInfo", user.getLogName()
							+ "," + pwd, 7 * 24 * 60 * 60,
							response);
				}else {
					CookieUtil.destroyCookie("loginInfo", response, request);
				}
				//mav = new ModelAndView("/login/loginSuc");
				mav = new ModelAndView("/login/bootstrap");
			} else {
				request.getSession().setAttribute("error", StaticConst.EK_RETURN_PAGE_PWD_ERROR);
				mav = new ModelAndView("/login/login");
			}

		} catch (Exception e) {
			logger.error(e);
			e.printStackTrace();
		}
		return mav;
	}

	@RequestMapping("/toLogin.html")
	public String toLogin(HttpServletRequest request) {
		request.getSession().setAttribute("error", null);
		return "/login/login";
	}

	@RequestMapping("/appLogin.html")
	public ModelAndView appLogin(EkUser user, HttpServletRequest request,
			HttpServletResponse response) {
		EkUser loginUser = null;
		ModelAndView mav = null;
		try {

			loginUser = this.loginService.loginUser(user);
			JSONObject jo = new JSONObject();
			if (null != loginUser) {
				request.getSession().setAttribute("loginUser", loginUser);
				jo.put("user", loginUser);
			}

			response.setCharacterEncoding("UTF-8");
			response.getWriter().print(jo.toString());
			response.getWriter().flush();
			response.getWriter().close();
		} catch (Exception e) {
			logger.error(e);
			e.printStackTrace();
		}
		return mav;
	}

	@RequestMapping("/toTop.html")
	public ModelAndView toTop(HttpServletRequest request) {
		ModelAndView mav = null;
		mav = new ModelAndView("/login/top");
		request.setAttribute("serverTime", new Date());

		return mav;
	}

	@RequestMapping("/toMain.html")
	public ModelAndView toMain(HttpServletRequest request) {
		ModelAndView mav = null;
		mav = new ModelAndView("/login/main");
		return mav;
	}

	@RequestMapping("/toLeft.html")
	public ModelAndView toLeft(HttpServletRequest request, HttpServletResponse response) {
		try {
			EkUser lUser = (EkUser) request.getSession().getAttribute(
					"loginUser");
			int logId = lUser.getUserId();
			List<String> permList = this.permService.getPermIDList(logId);
			List<Map<String, String>> resList = this.resouService
					.getResourceByPermId(permList);
			List<TreeEkMenu> mList = this.menuService.getUserMenuList(permList);
			JsonConfig jsonConfig = new JsonConfig();
			PropertyFilter filter = new PropertyFilter() {
				public boolean apply(Object object, String fieldName, Object fieldValue) {
					return null == fieldValue;
				}
			};
			jsonConfig.setJsonPropertyFilter(filter);
			
			JSONArray jaMList = JSONArray.fromObject(mList, jsonConfig);
			logger.info(jaMList.toString());
			request.setAttribute("menuList", jaMList.toString());
			
			super.printTEXT(jaMList.toString(), response);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@RequestMapping("/toBottom.html")
	public ModelAndView toBottom(HttpServletRequest request) {
		ModelAndView mav = null;
		mav = new ModelAndView("/login/bottom");
		return mav;
	}

	private LoginServiceI loginService;
	private MenuServiceI menuService;
	private PermissionServiceI permService;
	private ResourceServiceI resouService;

	@Autowired
	public void setLoginService(LoginService loginService) {
		this.loginService = loginService;
	}

	@Autowired
	public void setMenuService(MenuServiceI menuService) {
		this.menuService = menuService;
	}

	@Autowired
	public void setPermService(PermissionServiceI permService) {
		this.permService = permService;
	}

	@Autowired
	public void setResouService(ResourceServiceI resouService) {
		this.resouService = resouService;
	}
}
