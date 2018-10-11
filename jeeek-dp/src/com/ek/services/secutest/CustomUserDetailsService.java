package com.ek.services.secutest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.GrantedAuthorityImpl;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;

import com.ek.dao.user.UserDAO2;
import com.ek.entry.user.User;

/**
 * @包名   com.ek.services.secutest
 * @文件名 CustomUserDetailsService.java
 * @作者   qin_hqing
 * @创建日期 2015-1-14
 * @版本 V 1.0
 */
@SuppressWarnings("deprecation")
public class CustomUserDetailsService implements UserDetailsService{

	protected static Logger logger = Logger.getLogger(CustomUserDetailsService.class);
	
	private UserDAO2 dao2 = new UserDAO2();
	public UserDetails loadUserByUsername(String userName) {
		UserDetails user = null;
		// 搜索数据库以匹配用户登录名.  
		// 我们可以通过dao使用JDBC来访问数据库  
		User dbUser = dao2.getDataBase(userName); 
		user = new org.springframework.security.core.userdetails.User(
					dbUser.getUserName(), dbUser.getPassWord().toLowerCase(), 
					true, true, true, true, 
					getAuthorities(dbUser.getAccess())); 
		
		return user;
	}
	/**
	 * @param access
	 * @return
	 * TODO
	 */
	private Collection<GrantedAuthority> getAuthorities(Integer access) {
		List<GrantedAuthority> authList = new ArrayList<GrantedAuthority>(2);
		// 所有的用户默认拥有ROLE_USER权限  
		logger.debug("Grant ROLE_USER to this user");  
		authList.add(new GrantedAuthorityImpl("ROLE_USER")); 
		
		// 如果参数access为1.则拥有ROLE_ADMIN权限  
		if (access.compareTo(1) == 0) {  
			logger.debug("Grant ROLE_ADMIN to this user");  
			authList.add(new GrantedAuthorityImpl("ROLE_ADMIN"));  
		}  
		return authList;
	}
}
