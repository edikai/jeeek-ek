package com.ek.services.commons;

import java.sql.SQLException;
import java.util.List;

/**
 * @包名   com.ek.services.commons
 * @文件名 EkService.java
 * @作者   Qin_HQing
 * @创建日期 2015年5月22日
 * @版本 V 1.0
 * @描述
 */
public interface EkService {

	/**
	 * @description 根据ID获取对象信息
	 * @param objId
	 * @return User
	 */
	public Object getObject(int objId) throws SQLException;
	
	/**
	 * @description 根据指定信息获取对象信息
	 * @param colName
	 * @param colValue
	 * @return User
	 */
	public List<?> getList(String[] colName, String[] colValue) throws SQLException;
	
	/**
	 * @description 获取所有对象的信息列表
	 * @return List<User>
	 */
	public List<?> getList() throws SQLException;
	
	/**
	 * @description 新增对象信息
	 * @param object
	 * @return boolean
	 * @throws SQLException 
	 */
	public boolean add(Object object) throws SQLException;
	
	/**
	 * @description 删除对象信息
	 * @param object
	 * @return boolean
	 */
	public boolean remove(Object object);
	
	/**
	 * @description 根据对象Id删除对象信息
	 * @param objId
	 * @return boolean
	 */
	public boolean remove(int objId);
	
	/**
	 * @description 更新对象信息
	 * @param object
	 * @return boolean
	 */
	public boolean update(Object object);
	
}
