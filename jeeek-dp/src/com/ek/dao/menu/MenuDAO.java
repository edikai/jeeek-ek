package com.ek.dao.menu;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.ek.entry.menu.EkMenu;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ek.bo.commons.DateUtil;
import com.ek.bo.commons.StaticConst;
import com.ek.conn.factory.ConnectionFactory;
import com.ek.entry.menu.EkMenu;

/**
 * @包名   com.ek.dao.resource
 * @文件名 ResourceDAO.java
 * @作者   Qin_HQing
 * @创建日期 2015年5月27日
 * @版本 V 1.0
 * @描述
 */
@Component
public class MenuDAO {

	private Logger log = Logger.getLogger(MenuDAO.class);
	
	private Connection conn = null;
	private ConnectionFactory connectionFactory;
	
	@Autowired
	public void setConnFaction(ConnectionFactory connectionFactory) {
		this.connectionFactory = connectionFactory;
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
	public List<EkMenu> getMenuListBySQL(String strSQL) throws SQLException {
		List<EkMenu> list = new ArrayList<EkMenu>();
		conn = connectionFactory.getConnection("");
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery(strSQL);
		while (rs.next()) {
			EkMenu menu = new EkMenu();
			//menu.setCreateTime(rs.getDate("CREATETIME"));
			menu.setCreateUserId(rs.getInt("CREATEUSERID"));
			menu.setRemark(rs.getString("REMARK"));
			menu.setMenuId(rs.getInt("MENUID"));
			menu.setMenuName(rs.getString("MENUNAME"));
			menu.setParMenuId(rs.getInt("PARMENUID"));
			menu.setPermsnId(rs.getInt("PERMSNID"));
			//menu.setUpdateTime(rs.getDate("UPDATETIME"));
			menu.setUpdateUserId(rs.getInt("UPDATEUSERID"));
			
			list.add(menu);
		}
		return list;
	}

	/**
	 * 
	*@param menu
	*@return
	*@throws SQLException
	*@author qin_hqing
	*@date 2015年5月27日 下午3:19:14
	*@comment
	 */
	public boolean add(EkMenu menu) throws SQLException {
		boolean rbl = false;
		conn = this.connectionFactory.getConnection("");
		StringBuffer sbSQL = new StringBuffer("")
			.append("INSERT INTO EK_MENU (MENUNAME, PARMENUID, PERMSNID, REMARK, VALIDFLAG, CREATEUSERID, UPDATEUSERID, CREATETIME, UPDATETIME) ")
			.append("VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)");
		PreparedStatement ps = conn.prepareStatement(sbSQL.toString());
		ps.setString(1, menu.getMenuName());
		ps.setInt(2, menu.getParMenuId());
		ps.setInt(3, menu.getPermsnId());
		ps.setString(4, menu.getRemark());
		ps.setString(5, StaticConst.EK_VALIDFLAG_VALID);
		ps.setInt(6, menu.getCreateUserId());
		ps.setInt(7, menu.getUpdateUserId());
		ps.setObject(8, DateUtil.getCurrDateTimeStr());
		ps.setObject(9, DateUtil.getCurrDateTimeStr());
		
		int rst = ps.executeUpdate();
		if (rst != 0) {
			rbl = true;
		}
		return rbl;
	}

	public List<String> getMenuIds(String sql, String colName) throws SQLException {
		List<String> list = new ArrayList<String>();
		conn = this.connectionFactory.getConnection("");
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery(sql);
		log.debug("[getMenuIds sql] : "+sql);
		while (rs.next()) {
			list.add(rs.getString(colName));
		}
		return list;
	}
	
	public String getMenuUrl(Integer pId) throws SQLException {
		String url = null;
		StringBuilder sbSQL = new StringBuilder();
		sbSQL.append("SELECT RESOURCEURL FROM EK_RESOURCE R LEFT JOIN EK_PERMISSION P ON R.ResourceId = P.RESOURCEID ")
				.append("WHERE P.PERMSNID = ? ");
		PreparedStatement pst = conn.prepareStatement(sbSQL.toString());
		pst.setInt(1, pId);
		ResultSet rs = pst.executeQuery();
		while (rs.next()){
			url = rs.getString("RESOURCEURL");
		}
		
		return url;
	}
}
