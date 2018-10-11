package com.ek.bo.commons;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @包名 com.ek.bo.commons
 * @文件名 CookieUtil.java
 * @作者 Qin_HQing
 * @创建日期 2015年6月12日
 * @版本 V 1.0
 * @描述
 */
public class CookieUtil {

	public static void addCookie(String name, String value, int timeLong,
			HttpServletResponse response) {
		Cookie cookie = new Cookie(name, value);
		cookie.setMaxAge(timeLong);
		response.addCookie(cookie);
	}

	public static String getCookie(String name, HttpServletRequest request) {
		Cookie[] cookies = request.getCookies();
		if (null != cookies && cookies.length != 0) {
			for (Cookie cookie : cookies) {
				if (cookie.getName().equals(name)) {
					return cookie.getValue();
				}
			}
		}
		return null;
	}

	public static void destroyCookie(String name, HttpServletResponse response,
			HttpServletRequest request) {
		Cookie[] cookies = request.getCookies();
		if (null != cookies && cookies.length !=0) {
			for (Cookie cookie : cookies) {
				if (cookie.getName().equals(name)) {
					cookie.setMaxAge(0);
					response.addCookie(cookie);
				}
			}
		}
		
	}
	
}
