package com.ek.services.permission;

import java.sql.SQLException;
import java.util.List;

import com.ek.services.commons.EkService;

/**
 * @包名   com.ek.services.permission
 * @文件名 PermissionServiceI.java
 * @作者   Qin_HQing
 * @创建日期 2015年5月27日
 * @版本 V 1.0
 * @描述
 */
public abstract class PermissionServiceI implements EkService{

	public abstract List<String> getPermIDList(int logId)  throws SQLException;

}
