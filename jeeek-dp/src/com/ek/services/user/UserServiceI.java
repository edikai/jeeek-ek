package com.ek.services.user;

import com.ek.services.commons.EkService;

import java.sql.SQLException;


/**
 * @包名   ek.entry.user.server
 * @文件名 UserServerI.java
 * @作者   qin_hqing
 * @创建日期 2014-10-20
 * @版本 V 1.0
 */
public interface UserServiceI extends EkService{
	
	boolean checkLogName(String logName) throws SQLException;
}
