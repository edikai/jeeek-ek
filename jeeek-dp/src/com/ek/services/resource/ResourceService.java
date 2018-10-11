package com.ek.services.resource;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ek.dao.resource.ResourceDAO;
import com.ek.entry.permission.EkResource;

/**
 * @包名   com.ek.services.resource
 * @文件名 ResourceService.java
 * @作者   Qin_HQing
 * @创建日期 2015年5月27日
 * @版本 V 1.0
 * @描述
 */
@Component("resouService")
public class ResourceService extends ResourceServiceI{

	private ResourceDAO resourceDAO;
	@Override
	public Object getObject(int objId) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public List<?> getList(String[] colName, String[] colValue) throws SQLException {
		StringBuffer sbSQL = new StringBuffer("")
			.append("SELECT * FROM EK_RESOURCE WHERE 1=1 AND VALIDFLAG = '1' ");
		if (null != colName && colName.length > 0) {
			for (int i = 0; i < colName.length; i++) {
				sbSQL.append("AND ").append(colName[i]).append("='").append(colValue[i]).append("' ");
			}
		}
		
		List<EkResource> rs = this.resourceDAO.getResourceListBySQL(sbSQL.toString());
		return rs;
	}

	@Override
	public List<?> getList() throws SQLException {
		List<?> list = (List<?>) this.getList(null, null);
		return list;
	}

	@SuppressWarnings("unchecked")
	@Override
	public boolean add(Object object) throws SQLException {
		EkResource resource = (EkResource) object;
		boolean rbl = false;
		String[] colName = {"RESOURCENAME", "RESOURCEURL"};
		String[] colValue = {resource.getResourceName(), resource.getResourceURL() };
		List<EkResource> list = (List<EkResource>) this.getList(colName, colValue);
		if (null == list || list.isEmpty()) {
			rbl = this.resourceDAO.add(resource);
		}
		
		return rbl;
	}

	@Override
	public boolean remove(Object object) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove(int objId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Object object) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Map<String, String>>  getResourceByPermId(List<String> permList)
			throws SQLException {
		
		return this.resourceDAO.getResoIDByPermId(permList);
	}
	
	@Autowired
	public void setResourceDAO(ResourceDAO resourceDAO) {
		this.resourceDAO = resourceDAO;
	}

}
