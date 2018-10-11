package com.ek.dao.resource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ek.bo.commons.StaticConst;
import com.ek.conn.factory.ConnectionFactory;
import com.ek.entry.permission.EkResource;

/**
 * @包名   com.ek.dao.resource
 * @文件名 ResourceDAO.java
 * @作者   Qin_HQing
 * @创建日期 2015年5月27日
 * @版本 V 1.0
 * @描述
 */
@Component
public class ResourceDAO {

	private Connection conn = null;
	private ConnectionFactory connectionFactory;
	
	@Autowired
	public void setConnFaction(ConnectionFactory connectionFactory) {
		this.connectionFactory = connectionFactory;
	}
	
	/**
	 * 
	*@param resource
	*@return
	*@throws SQLException
	*@author qin_hqing
	*@date 2015年5月27日 下午2:10:57
	*@comment
	 */
	public boolean add(EkResource resource) throws SQLException {
		boolean rbl = false;
		conn = this.connectionFactory.getConnection("");
		StringBuffer sbSQL = new StringBuffer("")
			.append("INSERT INTO EK_RESOURCE (RESOURCENAME, RESOURCEURL, REMARK, VALIDFLAG, CREATEUSERID, UPDATEUSERID, CREATETIME, UPDATETIME) ")
			.append("VALUES(?, ?, ?, ?, ?, ?, ?, ?)");
		PreparedStatement ps = conn.prepareStatement(sbSQL.toString());
		ps.setString(1, resource.getResourceName());
		ps.setString(2, resource.getResourceURL());
		ps.setString(3, resource.getRemark());
		ps.setString(4, StaticConst.EK_VALIDFLAG_VALID);
		ps.setInt(5, resource.getCreateUserId());
		ps.setInt(6, resource.getUpdateUserId());
		ps.setObject(7, resource.getCreateTime());
		ps.setObject(8, resource.getUpdateTime());
		
		int rst = ps.executeUpdate();
		if (rst != 0) {
			rbl = true;
		}
		
		return rbl;
	}

	/**
	 * 
	*@param strSQL
	*@return
	*@author qin_hqing
	 * @throws SQLException 
	*@date 2015年5月27日 下午2:11:04
	*@comment
	 */
	public List<EkResource> getResourceListBySQL(String strSQL) throws SQLException {
		List<EkResource> list = new ArrayList<EkResource>();
		conn = connectionFactory.getConnection("");
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery(strSQL);
		while (rs.next()) {
			EkResource res = new EkResource();
			res.setCreateTime(rs.getTimestamp("CREATETIME"));
			res.setCreateUserId(rs.getInt("CREATEUSERID"));
			res.setRemark(rs.getString("REMARK"));
			res.setResourceId(rs.getInt("RESOURCEID"));
			res.setResourceName(rs.getString("RESOURCENAME"));
			res.setResourceURL(rs.getString("RESOURCEURL"));
			res.setUpdateTime(rs.getTimestamp("UPDATETIME"));
			res.setUpdateUserId(rs.getInt("UPDATEUSERID"));
			res.setValidFlag(rs.getString("VALIDFLAG"));
			
			list.add(res);
		}
		return list;
	}

	public List<Map<String, String>> getResoIDByPermId(List<String> permList) throws SQLException {
		List<Map<String, String>> list = new ArrayList<Map<String,String>>();
		
		StringBuilder sbSQL = new StringBuilder()
			.append("SELECT RESOURCEURL, PERMSNID FROM EK_PERMISSION P, EK_RESOURCE R ")
			.append("WHERE P.RESOURCEID = R.RESOURCEID AND R.VALIDFLAG = '1' ");
		
		conn = connectionFactory.getConnection("");
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery(sbSQL.toString());
		while (rs.next()) {
			Map<String, String> map = new HashMap<String, String>();
			map.put("permsnId", rs.getString("PERMSNID"));
			map.put("resourceURL", rs.getString("RESOURCEURL"));
			
			list.add(map);
		}
		
		return list;
	}
}
