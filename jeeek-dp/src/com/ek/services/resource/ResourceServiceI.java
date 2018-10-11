package com.ek.services.resource;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import com.ek.services.commons.EkService;

/**
 * @包名   com.ek.services.resource
 * @文件名 ResourceI.java
 * @作者   Qin_HQing
 * @创建日期 2015年5月27日
 * @版本 V 1.0
 * @描述
 */
public abstract class ResourceServiceI implements EkService{

	public abstract List<Map<String, String>>  getResourceByPermId(List<String> permList) throws SQLException;

}
