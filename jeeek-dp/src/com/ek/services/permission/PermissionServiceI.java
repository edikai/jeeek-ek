package com.ek.services.permission;

import java.sql.SQLException;
import java.util.List;

import com.ek.entry.permission.EkPermission;
import com.ek.services.commons.EkService;

/**
 * @包名   com.ek.services.permission
 * @文件名 PermissionServiceI.java
 * @作者   Qin_HQing
 * @创建日期 2015年5月27日
 * @版本 V 1.0
 * @描述
 */
public interface PermissionServiceI extends EkService{

	/**
	* 根据登陆用户ID获取其对应的权限
	* @param
	* @Return:
	* @Author: Qin_HQing
	* @Date: 2018/10/16 9:46
	* @Description:
	**/
	List<String> getPermIDList(int logId)  throws SQLException;
	
}
