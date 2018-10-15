package com.ek.services.menu;

import java.sql.SQLException;
import java.util.List;

import com.ek.entry.menu.EKMenu;
import com.ek.entry.menu.TreeEKMenu;
import com.ek.services.commons.EkService;

/**
 * @包名   com.ek.services.menu
 * @文件名 MenuServiceI.java
 * @作者   Qin_HQing
 * @创建日期 2015年5月27日
 * @版本 V 1.0
 * @描述
 */
public abstract class MenuServiceI implements EkService{

	/**
	* 用于递归获取用户菜单
	* @param
	* @Return:
	* @Author: Qin_HQing
	* @Date: 2018/10/15 16:36
	* @Description:
	**/
	public abstract List<TreeEKMenu> getUserMenuList(List<String> permList) throws SQLException;
}
