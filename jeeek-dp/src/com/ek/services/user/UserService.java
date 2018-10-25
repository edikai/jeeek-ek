package com.ek.services.user;

import java.sql.SQLException;
import java.util.List;

import com.ek.bo.commons.StaticConst;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ek.dao.user.UserDAO;
import com.ek.entry.user.EkUser;
import com.ek.entry.user.User;


/**
 * @包名   ek.entry.user.impl
 * @文件名 UserService.java
 * @作者   qin_hqing
 * @创建日期 2014-10-20
 * @版本 V 1.0
 */
@Component
public class UserService implements UserServiceI {

	private UserDAO userDAO ;
	public boolean add(EkUser user) throws SQLException {
		user.setPassWord(StaticConst.EK_PWD_DEFAULT);
		return this.userDAO.add(user);
	}

	@Override
	public User getObject(int objId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<?> getList(String[] colName, String[] colValue) throws SQLException {
		StringBuffer sbSQL = new StringBuffer("")
			.append("SELECT * FROM EK_USER WHERE 1=1 ");
		if (null != colName && colName.length > 0) {
			for (int i = 0; i < colName.length; i++) {
				sbSQL.append("AND ").append(colName[i]).append("='").append(colValue[i]).append("' ");
			}
		}
		List<EkUser> list = this.userDAO.getUserListBySQL(sbSQL.toString());
		return list;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<?> getList() throws SQLException {
		String[] colName = {"VALIDFLAG"};
		String[] colValue = {"1"};
		List<Object> list = (List<Object>) this.getList(colName, colValue);
		return list;
	}

	@Override
	public boolean add(Object object) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove(Object object) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Object object) {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public boolean remove(int objId) {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public boolean checkLogName(String logName) throws SQLException{
		String[] colName = {"LOGNAME"};
		String[] colValue = {logName};
		List<Object> list = (List<Object>) this.getList(colName, colValue);
		if (null != list && !list.isEmpty()){
			return true;
		}
		return false;
	}
	
	@Autowired
	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}
	
}
