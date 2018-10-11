package com.ek.dao.user;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import com.ek.entry.user.User;


/**
 * @包名   ek.entry.user.dao
 * @文件名 UserDAO.java
 * @作者   qin_hqing
 * @创建日期 2014-10-20
 * @版本 V 1.0
 */
@Component
public class UserDAO2 {
	
	Logger logger = Logger.getLogger(this.getClass());
	
	public User getDataBase(String userName){
		List<User> users = internalDataBase();
		for (User user : users) {
			if (user.getUserName().equals(userName)) {
				logger.info("User found");
				return user;
			}
		}
		logger.error("User does not exist!");
		throw new RuntimeException("User does not exist!");
	}
	private List<User> internalDataBase(){
		List<User> users = new ArrayList<User>();
		User user = null;
		user = new User();
		user.setUserName("admin");
		user.setPassWord("202CB962AC59075B964B07152D234B70");//123
		user.setAccess(1);
		
		users.add(user);
		
		user = new User();
		user.setUserName("user");
		user.setPassWord("202CB962AC59075B964B07152D234B70");
		user.setAccess(2);  
		users.add(user);
		
		return users;
	}
}
