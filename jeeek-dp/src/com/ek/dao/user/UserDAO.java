package com.ek.dao.user;

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

import com.ek.bo.commons.CryptUtil;
import com.ek.bo.commons.DateUtil;
import com.ek.bo.commons.StaticConst;
import com.ek.conn.factory.ConnectionFactory;
import com.ek.entry.user.EkUser;


/**
 * @包名   ek.entry.user.dao
 * @文件名 UserDAO.java
 * @作者   qin_hqing
 * @创建日期 2014-10-20
 * @版本 V 1.0
 */
@Component
public class UserDAO {
	
	private CryptUtil cryptUtil = new CryptUtil();
	private Connection con = null;
	
	Logger logger = Logger.getLogger(this.getClass());
	public ConnectionFactory connectionFactory ;
	
	/**
	 * 添加用户
	*@param user
	*@return
	*@throws SQLException
	*@author qin_hqing
	*@date 2015年5月26日 上午11:04:03
	*@comment
	 */
	public boolean add(EkUser user) throws SQLException{
		boolean rbl = false;
		if (!isUserExist(user.getLogName())) {
			con = this.connectionFactory.getConnection("");
			StringBuffer sb = new StringBuffer();
			cryptUtil.setStr2MD5(user.getPassWord());
			String passWord = cryptUtil.get_MD5Str();
			sb.append("INSERT INTO EK_USER (LOGNAME, PASSWORD, USERNAME, REMARK, VALIDFLAG, CREATEUSERID, CREATETIME, UPDATEUSERID, UPDATETIME)")
			.append("VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)");
			PreparedStatement ps = con.prepareStatement(sb.toString());
			ps.setString(1, user.getLogName());
			ps.setString(2, passWord);
			ps.setString(3, user.getUserName());
			ps.setObject(4, user.getRemark());
			ps.setObject(4, DateUtil.getCurrDateTimeStr());
			ps.setString(5, StaticConst.EK_VALIDFLAG_VALID);
			ps.setInt(6, user.getCreateUserId());
			ps.setObject(7, DateUtil.getCurrDateTimeStr());
			ps.setInt(8, user.getCreateUserId());
			ps.setObject(9, DateUtil.getCurrDateTimeStr());
			
			logger.info(sb.toString()+" ,1:"+user.getLogName()+" ,2:"+user.getPassWord()+" ,3:"
					+user.getUserName()+" ,4:"+user.getRemark()+" ,5:"+user.getUpdateTime()+" ,6:"+user.getValidFlag()
					+" ,7:"+user.getCreateTime()+" ,8:"+user.getUpdateUserId()+" ,9:"+user.getUpdateTime());
			int rows = ps.executeUpdate();
			if (rows != 0) {
				rbl = true;
			}
		}
		return rbl;
	}
	
	/**
	 * 验证注册用户名是否可用
	*@param logName 登录名
	*@return 
	*@throws SQLException
	*@author qin_hqing
	*@date 2015年5月26日 上午11:01:01
	*@comment
	 */
	public boolean isUserExist(String logName) throws SQLException{
		boolean rbl = false;
		
		con = this.connectionFactory.getConnection("");
		StringBuffer sbSQL = new StringBuffer("");
		sbSQL.append("SELECT USERID FROM EK_USER WHERE LOGNAME = ?");
		PreparedStatement ps = con.prepareStatement(sbSQL.toString());
		ps.setString(1, logName);
		ResultSet rs = ps.executeQuery();
		if (rs.next()) {
			rbl = true;
		}
		
		return rbl;
	}
	/**
	 * 验证登录用户
	*@param user
	*@return
	*@throws SQLException
	*@author qin_hqing
	*@date 2015年5月26日 上午10:55:49
	*@comment
	 */
	public EkUser checkUser(EkUser user) throws SQLException{
		con = this.connectionFactory.getConnection("");
		StringBuffer sb = new StringBuffer();
		EkUser loginUser = null; 
		sb.append("SELECT USERID, LOGNAME, VALIDFLAG FROM EK_USER WHERE LOGNAME = ? AND PASSWORD = ?");

		//cryptUtil.setStr2MD5(user.getPassWord());
		//String passWord = cryptUtil.get_MD5Str();
		PreparedStatement ps = con.prepareStatement(sb.toString());
		ps.setString(1, user.getLogName());
		ps.setString(2, user.getPassWord());
		
		logger.info(sb.toString()+" ,1:"+user.getLogName()+",2:"+user.getPassWord());
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			loginUser = new EkUser();
			loginUser.setUserId(rs.getInt("USERID"));
			loginUser.setLogName(rs.getString("LOGNAME"));
			loginUser.setValidFlag(rs.getString("VALIDFLAG"));
		}
		
		return loginUser;
	}

	@Autowired
	public void setConnectionFactory(ConnectionFactory connectionFactory) {
		this.connectionFactory = connectionFactory;
	}

	public List<EkUser> getUserListBySQL(String strSQL) throws SQLException {
		List<EkUser> list = new ArrayList<EkUser>();
		con = connectionFactory.getConnection("");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(strSQL);
		while (rs.next()) {
			EkUser user = new EkUser();
			//user.setCreateTime(rs.getDate("CREATETIME"));
			user.setCreateUserId(rs.getInt("CREATEUSERID"));
			user.setLogName(rs.getString("LOGNAME"));
			user.setRemark(rs.getString("REMARK"));
			//user.setUpdateTime(rs.getDate("UPDATETIME"));
			user.setUpdateUserId(rs.getInt("UPDATEUSERID"));
			user.setUserId(rs.getInt("USERID"));
			user.setUserName(rs.getString("USERNAME"));
			
			list.add(user);
		}
		return list;
	}
	
}
