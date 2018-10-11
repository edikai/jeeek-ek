package com.ek.controller.login;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ek.bo.commons.CookieUtil;
import com.ek.bo.commons.CryptUtil;
import com.ek.bo.commons.DateUtil;
import com.ek.entry.menu.EKMenu;
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
public class LoginController {

	private Logger logger = Logger.getLogger(this.getClass());
	private CryptUtil cryptUtil = new CryptUtil();
	@RequestMapping("/login.html")
	public ModelAndView login(EkUser user, HttpServletRequest request,
			HttpServletResponse response) {
		EkUser loginUser = null;
		ModelAndView mav = null;
		String clientTime = request.getParameter("nowTime");
		String rembme = request.getParameter("rembme");
		this.cryptUtil.setKey("ek_pwd");

		long[] it = DateUtil.getDateTimeInterval(new Date(), clientTime);
		try {
			if (null != rembme && rembme.equals("true")) {
				String li = CookieUtil.getCookie("loginInfo", request);
				if (null != li) {
					this.cryptUtil.setDesString(li.split(",")[1]);;
					user.setPassWord(this.cryptUtil.getStrMing());
				}
			}
			loginUser = this.loginService.loginUser(user);
			if (null != loginUser) {
				request.getSession().setAttribute("loginUser", loginUser);
				request.getSession().setAttribute("error", "0");
				request.getSession().setAttribute("timeIntv", it);
				
				this.cryptUtil.setEncString(user.getPassWord());
				String pwd = this.cryptUtil.getStrMi();
				if (null != rembme && rembme.equals("true")) {
					CookieUtil.addCookie("loginInfo", user.getLogName()
							+ "," + pwd, 7 * 24 * 60 * 60,
							response);
				}else {
					CookieUtil.destroyCookie("loginInfo", response, request);
				}
				mav = new ModelAndView("/login/loginSuc");
			} else {
				request.getSession().setAttribute("error", "1");
				mav = new ModelAndView("/login/login");
			}

		} catch (Exception e) {
			logger.error(e);
			e.printStackTrace();
		}
		return mav;
	}

	@RequestMapping("/toLogin.html")
	public ModelAndView toLogin(HttpServletRequest request) {
		ModelAndView mav = null;
		request.getSession().setAttribute("error", null);
		mav = new ModelAndView("/login/login");
		return mav;
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
	public ModelAndView toLeft(HttpServletRequest request) {
		ModelAndView mav = null;
		mav = new ModelAndView("/login/left");
		try {
			EkUser lUser = (EkUser) request.getSession().getAttribute(
					"loginUser");
			int logId = lUser.getUserId();
			List<String> permList = this.permService.getPermIDList(logId);
			List<Map<String, String>> resList = this.resouService
					.getResourceByPermId(permList);
			List<EKMenu> mList = this.menuService.getUserMenuList(permList);
			JSONArray jaMList = JSONArray.fromObject(mList);
			JSONArray jaRList = JSONArray.fromObject(resList);
			request.setAttribute("menuList", jaMList.toString());
			request.setAttribute("resList", jaRList.toString());
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return mav;
	}

	@RequestMapping("/toBottom.html")
	public ModelAndView toBottom(HttpServletRequest request) {
		ModelAndView mav = null;
		mav = new ModelAndView("/login/bottom");
		return mav;
	}

	public static void main(String[] args) {
		List<String> a = new ArrayList<String>();
		a.add("a");
		a.add("d");
		System.out.println(a.toString());
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
