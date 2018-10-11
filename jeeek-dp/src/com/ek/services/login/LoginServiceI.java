package com.ek.services.login;

import java.sql.SQLException;

import com.ek.entry.user.EkUser;


/**
 * @包名   ek.services.login
 * @文件名 LoginServiceI.java
 * @作者   qin_hqing
 * @创建日期 2014-12-24
 * @版本 V 1.0
 */
public interface LoginServiceI {

	/**
	 * 验证用户登陆信息并返回User
	 * @author qin_hqing
	 * @param user
	 * @return User
	 * @throws SQLException 
	 */
	public EkUser loginUser(EkUser user) throws Exception;
}
