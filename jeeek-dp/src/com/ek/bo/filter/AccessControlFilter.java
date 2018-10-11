package com.ek.bo.filter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.ek.entry.user.EkUser;

/**
 * @包名   com.ek.bo.filter
 * @文件名 AccessControlFilter.java
 * @作者   Qin_HQing
 * @创建日期 2015年5月25日
 * @版本 V 1.0
 * @描述
 */
public class AccessControlFilter implements Filter{

	Logger log = Logger.getLogger(this.getClass());
	private String toLoginUrl = "";
	private String loginUrl = "";
	private String acceddDeny = "";
	private String failure = "";
	private List<String> listUrl = null;
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		log.info("AccessControlFilter init!");
		this.toLoginUrl = filterConfig.getInitParameter("toLogin").trim();
		this.loginUrl = filterConfig.getInitParameter("login").trim();
		this.acceddDeny = filterConfig.getInitParameter("accessDeny").trim();
		this.failure = filterConfig.getInitParameter("failure").trim();
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		
		HttpServletRequest req = (HttpServletRequest)request;
		HttpServletResponse res = (HttpServletResponse) response;
		String contextPath = req.getContextPath();
		String path = req.getRequestURI();
		
		if (isLoginURL(path, this.toLoginUrl, contextPath.length())) {
			chain.doFilter(request, response);
		}else {
			EkUser logUser = (EkUser) req.getSession().getAttribute("loginUser");
			if (null != logUser) {
				chain.doFilter(request, response);
			}else {
				log.info("未登录或登录超时！");
				res.sendRedirect(contextPath + this.toLoginUrl);
			}
		}
	}

	/**
	 * 
	*@param path /jeeek-dp/user/toAddInit.html
	*@param loginUrl /xcom/toLogin.html
	*@param length 9
	*@return
	*@author qin_hqing
	*@date 2015年5月26日 上午9:38:41
	*@comment
	 */
	private boolean isLoginURL(String path, String toLoginUrl, int length) {
		boolean flag = false;
		
		if (length > 0) {
			path = path.trim();
			path = path.substring(length, path.length()); // /user/toAddInit.html
		}
		int tmp1 = path.trim().indexOf(toLoginUrl);
		int tmp2 = path.trim().indexOf(this.loginUrl);
		if (tmp1 >= 0 || tmp2 >= 0) { //登录URL
			flag = true;
		}
		//
		if (null == listUrl || !listUrl.isEmpty()) {
			listUrl = new ArrayList<String>();
			
		}
		return flag;
	}

	@Override
	public void destroy() {
		log.info("AccessControlFilter destroy!");
	}
	
}
