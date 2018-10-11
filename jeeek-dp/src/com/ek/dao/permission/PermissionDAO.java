package com.ek.dao.permission;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ek.bo.commons.DateUtil;
import com.ek.bo.commons.StaticConst;
import com.ek.conn.factory.ConnectionFactory;
import com.ek.entry.permission.EkPermission;

/**
 * @包名   com.ek.dao.permission
 * @文件名 PermissionDAO.java
 * @作者   Qin_HQing
 * @创建日期 2015年5月27日
 * @版本 V 1.0
 * @描述
 */
@Component("permDAO")
public class PermissionDAO {

	private Connection conn = null;
	private ConnectionFactory connectionFactory;
	Logger logger = Logger.getLogger(this.getClass());
	
	@Autowired
	public void setConnectionFactory(ConnectionFactory connectionFactory) {
		this.connectionFactory = connectionFactory;
	}

	/**
	 * 
	*@param strSQL
	*@return
	*@throws SQLException
	*@author qin_hqing
	*@date 2015年5月27日 下午4:34:19
	*@comment
	 */
	public List<EkPermission> getPermListBySQL(String strSQL) throws SQLException {
		List<EkPermission> list = new ArrayList<EkPermission>();
		conn = this.connectionFactory.getConnection("");
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery(strSQL);
		while (rs.next()) {
			EkPermission perm = new EkPermission();
			perm.setCreateTime(rs.getTimestamp("CREATETIME"));
			perm.setCreateUserId(rs.getInt("CREATEUSERID"));
			perm.setPermsnId(rs.getInt("PERMSNID"));
			perm.setPermsnName(rs.getString("PERMSNNAME"));
			perm.setRemark(rs.getString("REMARK"));
			perm.setUpdateTime(rs.getTimestamp("UPDATETIME"));
			perm.setUpdateUserId(rs.getInt("UPDATEUSERID"));
			perm.setOperateId(rs.getInt("OPERATEID"));
			perm.setResourceId(rs.getInt("RESOURCEID"));
			
			list.add(perm);
		}
		return list;
	}

	/**
	 * 
	*@param perm
	*@return
	*@throws SQLException
	*@author qin_hqing
	*@date 2015年5月27日 下午4:34:15
	*@comment
	 */
	public boolean add(EkPermission perm) throws SQLException {
		boolean rbl = false;
		StringBuilder sbSQL = new StringBuilder("")
			.append("INSERT INTO EK_PERMISSION (PERMSNNAME, RESOURCEID, OPERATEID, REMARK, VALIDFLAG, CREATEUSERID, UPDATEUSERID, CREATETIME, UPDATETIME) ")
			.append("VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)");
		conn = connectionFactory.getConnection("");
		PreparedStatement ps = conn.prepareStatement(sbSQL.toString());
		ps.setString(1, perm.getPermsnName());
		ps.setInt(2, perm.getResourceId());
		ps.setInt(3, perm.getOperateId());
		ps.setString(4, perm.getRemark());
		ps.setString(5, StaticConst.EK_VALIDFLAG_VALID);
		ps.setInt(6, perm.getCreateUserId());
		ps.setInt(7, perm.getUpdateUserId());
		ps.setObject(8, DateUtil.getCurrDateTimeStr());
		ps.setObject(9, DateUtil.getCurrDateTimeStr());
		
		int rs = ps.executeUpdate();
		if (rs > 0) {
			rbl = true;
		}
		return rbl;
	}

	public boolean grantPerm2User(String userId, String[] pids, int logUserId) throws SQLException {
		boolean rbl = false;
		StringBuilder sbSQL = new StringBuilder("")
			.append("INSERT INTO EK_USER_PERMISSION_MAPPING (USERID, PERMSNID, VALIDFLAG, CREATEUSERID, UPDATEUSERID, CREATETIME, UPDATETIME) ")
			.append("VALUES(?, ?, ?, ?, ?, ?, ?) ");
		conn = connectionFactory.getConnection("");
		PreparedStatement ps = conn.prepareStatement(sbSQL.toString());
		ps.setInt(1, Integer.parseInt(userId));
		ps.setString(3, StaticConst.EK_VALIDFLAG_VALID);
		ps.setInt(4, logUserId);
		ps.setInt(5, logUserId);
		ps.setString(6, DateUtil.getCurrDateTimeStr());
		ps.setString(7, DateUtil.getCurrDateTimeStr());
		for (int i = 0; i < pids.length; i++) {
			ps.setInt(2, Integer.parseInt(pids[i]));
			
			ps.addBatch();
		}
		
		int[] ri = ps.executeBatch();
		for (int j = 0; j < ri.length; j++) {
			logger.info(ri[j]);
		}
		if (ri.length == pids.length) {
			rbl = true;
		}
		
		return rbl;
	}

	public boolean revokePermFromUser(String userId, String[] pids,
			int logUserId) throws SQLException {
		boolean rbl = false;
		StringBuilder sbSQL = new StringBuilder()
			.append("UPDATE EK_USER_PERMISSION_MAPPING M SET M.VALIDFLAG = '0', M.UPDATEUSERID =")
			.append(logUserId).append(", M.UPDATETIME = DATE_FORMAT('").append(DateUtil.getCurrDateTimeStr())
			.append("', '%Y-%m-%d %T') ")
			.append("WHERE M.PERMSNID = ? AND USERID = ? ");
		logger.info(sbSQL.toString());
		conn = connectionFactory.getConnection("");
		PreparedStatement ps = conn.prepareStatement(sbSQL.toString());
		ps.setInt(2, Integer.parseInt(userId));
		for (int i = 0; i < pids.length; i++) {
			ps.setInt(1, Integer.parseInt(pids[i]));
			
			ps.addBatch();
		}
		int[] ri = ps.executeBatch();
		if (ri.length == pids.length) {
			rbl = true;
		}
		return rbl;
	}

	/**
	 * 用于菜单
	*@param logId
	*@return
	*@throws SQLException
	*@author qin_hqing
	*@date 2015年6月5日 上午10:12:38
	*@comment
	 */
	public List<String> getPermIDList(int logId) throws SQLException {
		List<String> list = new ArrayList<String>();
		StringBuilder sbSQL = new StringBuilder()
			//用户权限表
			.append("SELECT PERMSNID FROM EK_USER_PERMISSION_MAPPING M ")
			.append("WHERE M.VALIDFLAG = '1' AND M.USERID = ")
			.append(logId)
			.append(" UNION ALL ") //用户权限组表
			.append("SELECT PERMSNID FROM EK_PERMISSION_GROUP_MAPPING PGM ")
			.append("WHERE PGM.VALIDFLAG = '1' AND PGM.PERMSNGROUPID IN ")
			.append("(SELECT PERMSNGROUPID FROM EK_USER_PERMISSION_GROUP_MAPPING UPGM ")
			.append("WHERE UPGM.USERID = ")
			.append(logId).append(" AND UPGM.VALIDFLAG = '1') ")
			.append("UNION ALL ") //用户组权限表
			.append("SELECT PERMSNID FROM EK_USER_GROUP_PERMISSION_MAPPING UGPM ")
			.append("WHERE UGPM.VALIDFLAG = '1' AND UGPM.USERGROUPID IN ")
			.append("(SELECT USERGROUPID FROM EK_USER_GROUP_MAPPING  UGM ")
			.append("WHERE UGM.USERID = ").append(logId).append(" AND UGM.VALIDFLAG = '1') ")
			.append("UNION ALL ") //用户组权限组表
			.append("SELECT PERMSNID FROM EK_PERMISSION_GROUP_MAPPING PGM ")
			.append("WHERE PGM.VALIDFLAG = '1' AND PGM.PERMSNGROUPID IN ")
			.append("(SELECT PERMSNGROUPID FROM EK_USER_GROUP_PERMISSION_GROUP_MAPPING UGPGM ")
			.append("WHERE UGPGM.VALIDFLAG = '1' AND UGPGM.USERGROUPID IN ")
			.append("(SELECT USERGROUPID FROM EK_USER_GROUP_MAPPING UGM ")
			.append("WHERE UGM.USERID = ").append(logId).append(" AND UGM.VALIDFLAG = '1' )) ")
			.append("UNION ALL ") //用户角色权限表
			.append("SELECT PERMSNID FROM EK_ROLE_PERMISSION_MAPPING RPM ")
			.append("WHERE RPM.VALIDFLAG = '1' AND RPM.ROLEID IN ")
			.append("(SELECT ROLEID FROM EK_USER_ROLE_MAPPING URM ")
			.append("WHERE URM.USERID = ").append(logId).append(" AND URM.VALIDFLAG = '1') ")
			.append("UNION ALL ")//用户角色权限组表
			.append("SELECT PERMSNID FROM EK_PERMISSION_GROUP_MAPPING PGM ")
			.append("WHERE PGM.VALIDFLAG = '1' AND PGM.PERMSNGROUPID IN (")
			.append("SELECT PERMSNGROUPID FROM EK_ROLE_PERMISSION_GROUP_MAPPING RPGM ")
			.append("WHERE RPGM.VALIDFLAG = '1' AND ROLEID IN ")
			.append("(SELECT ROLEID FROM  EK_USER_ROLE_MAPPING URM ")
			.append("WHERE URM.USERID = ").append(logId).append(" AND URM.VALIDFLAG = '1')) ")
			.append("UNION ALL ")//用户角色组权限表
			.append("SELECT PERMSNID FROM EK_ROLE_GROUP_PERMISSION_MAPPING RGPM ")
			.append("WHERE RGPM.VALIDFLAG = '1' AND RGPM.ROLEGROUPID IN ")
			.append("(SELECT ROLEGROUPID FROM EK_USER_ROLE_GROUP_MAPPING URGM ")
			.append("WHERE URGM.USERID = ").append(logId).append(" AND URGM.VALIDFLAG = '1')")
			.append("UNION ALL ")//用户角色组权限组表
			.append("SELECT PERMSNID FROM EK_PERMISSION_GROUP_MAPPING PGM ")
			.append("WHERE PGM.VALIDFLAG = '1' AND PGM.PERMSNGROUPID IN ")
			.append("(SELECT PERMSNGROUPID FROM EK_ROLE_GROUP_PERMISSION_GROUP_MAPPING URPGM ")
			.append("WHERE URPGM.VALIDFLAG = '1' AND URPGM.ROLEGROUPID IN ")
			.append("(SELECT ROLEGROUPID FROM EK_USER_ROLE_GROUP_MAPPING URGM ")
			.append("WHERE URGM.USERID = 4 AND URGM.VALIDFLAG = '1')) ");
		logger.info(sbSQL.toString());
		conn = connectionFactory.getConnection("");
		PreparedStatement ps = conn.prepareStatement(sbSQL.toString());
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			list.add(rs.getString("PERMSNID"));
		}
		return list;
	}

	
}
