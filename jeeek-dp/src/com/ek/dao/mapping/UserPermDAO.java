package com.ek.dao.mapping;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ek.conn.factory.ConnectionFactory;

/**
 * @包名   com.ek.dao.mapping
 * @文件名 UserPermDAO.java
 * @作者   Qin_HQing
 * @创建日期 2015年5月28日
 * @版本 V 1.0
 * @描述
 */
@Component
public class UserPermDAO {

	Connection conn = null;
	ConnectionFactory connectionFactory ;
	
	public List<Map<String, Object>> getUserPermMapping(String[] purpColName,
			String strSQL) throws SQLException {
		List<Map<String, Object>> list = new ArrayList<Map<String,Object>>();
		conn = connectionFactory.getConnection("");
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery(strSQL);
		while (rs.next()) {
			Map<String, Object> map = new HashMap<String, Object>();
			for (int i = 0; i < purpColName.length; i++) {
				String str = purpColName[i];
				map.put(str, rs.getObject(str));
			}
			list.add(map);
		}
		return list;
	}
	
	@Autowired
	public void setConnectionFactory(ConnectionFactory connectionFactory) {
		this.connectionFactory = connectionFactory;
	}
}
