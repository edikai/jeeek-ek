package com.ek.services.menu;

import java.sql.SQLException;
import java.util.List;

import com.ek.entry.menu.EKMenu;
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

	public abstract List<EKMenu> getUserMenuList(List<String> permList) throws SQLException;
}
