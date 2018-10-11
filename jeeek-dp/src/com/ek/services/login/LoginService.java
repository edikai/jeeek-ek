package com.ek.services.login;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ek.dao.user.UserDAO;
import com.ek.entry.user.EkUser;


/**
 * @包名   ek.services.login
 * @文件名 LoginService.java
 * @作者   qin_hqing
 * @创建日期 2014-12-24
 * @版本 V 1.0
 */
@Component
public class LoginService implements LoginServiceI {

	/**
	 * 验证用户登陆信息并返回User
	 * @author qin_hqing
	 * @param user
	 * @return User
	 * @throws SQLException 
	 */
	public EkUser loginUser(EkUser user) throws Exception {
		return this.userDAO.checkUser(user);
	}

	private UserDAO userDAO;

	/**
	 * @param userDAO the userDAO to set
	 */
	@Autowired
	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}
}
