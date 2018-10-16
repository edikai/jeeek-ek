package com.ek.services.permission;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ek.dao.mapping.UserPermDAO;
import com.ek.dao.permission.PermissionDAO;
import com.ek.entry.permission.EkPermission;

/**
 * @包名 com.ek.services.permission
 * @文件名 PermissionService.java
 * @作者 Qin_HQing
 * @创建日期 2015年5月27日
 * @版本 V 1.0
 * @描述
 */
@Component("permService")
public class PermissionService implements PermissionServiceI {

	Logger logger = Logger.getLogger(this.getClass());
	private PermissionDAO permDAO;
	private UserPermDAO userPermDAO;

	@Override
	public Object getObject(int objId) throws SQLException {
		return this.permDAO.getPerm(objId);
	}

	@Override
	public List<?> getList(String[] colName, String[] colValue)
			throws SQLException {
		StringBuffer sbSQL = new StringBuffer("")
				.append("SELECT * FROM EK_PERMISSION WHERE VALIDFLAG = '1' ");
		if (colName != null && colName.length > 0) {
			for (int i = 0; i < colName.length; i++) {
				sbSQL.append("AND ").append(colName[i]).append("='")
						.append(colValue[i]).append("' ");
			}
		}
		List<EkPermission> list = this.permDAO.getPermListBySQL(sbSQL
				.toString());
		return list;
	}

	@Override
	public List<?> getList() throws SQLException {
		return this.getList(null, null);
	}

	@SuppressWarnings("unchecked")
	@Override
	public boolean add(Object object) throws SQLException {
		boolean rbl = false;
		EkPermission perm = (EkPermission) object;
		String[] colName = { "PERMSNNAME" };
		String[] colValue = { perm.getPermsnName() };
		List<EkPermission> list = (List<EkPermission>) this.getList(colName,
				colValue);
		if (null == list || list.isEmpty()) {
			rbl = this.permDAO.add(perm);
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

	/**
	 * 
	*@param tableName
	*@param userId
	*@return
	*@throws SQLException
	*@author qin_hqing
	*@date 2015年5月28日 下午2:24:45
	*@comment
	 */
	public List<EkPermission> getPermFromMapping(String tableName, String userId) throws SQLException {
		StringBuffer sbSQL = new StringBuffer("")
			.append("SELECT M.PERMSNID, P.PERMSNNAME FROM ").append(tableName).append(" M, EK_PERMISSION P ")
			.append("WHERE M.VALIDFLAG = '1' AND P.PERMSNID = M.PERMSNID AND P.VALIDFLAG = '1' AND M.USERID = ").append(userId);
		String[] purpColName = {"PERMSNID", "PERMSNNAME"};
		logger.info(sbSQL.toString());
		List<Map<String, Object>> lm = this.userPermDAO.getUserPermMapping(purpColName, sbSQL.toString());
		List<EkPermission> list = new ArrayList<EkPermission>();
		for (int i = 0; i < lm.size(); i++) {
			Map<String, Object> map = lm.get(i);
			EkPermission perm = new EkPermission();
			perm.setPermsnId(Integer.parseInt(map.get("PERMSNID").toString()));
			perm.setPermsnName(map.get("PERMSNNAME").toString());
			
			list.add(perm);
		}
		return list;
	}

	@Override
	public List<String> getPermIDList(int logUserId) throws SQLException {
		return this.permDAO.getPermIDList(logUserId);
	}
	
	public boolean revokePermFromUser(String userId, String[] pids, int logUserId) throws SQLException {
		return this.permDAO.revokePermFromUser(userId, pids, logUserId);
	}
	
	public boolean grantPerm2User(String userId, String[] pids, int logUserId) throws SQLException {
		return this.permDAO.grantPerm2User(userId, pids, logUserId);
	}
	
	@Autowired
	public void setUserPermDAO(UserPermDAO userPermDAO) {
		this.userPermDAO = userPermDAO;
	}
	@Autowired
	public void setPermDAO(PermissionDAO permDAO) {
		this.permDAO = permDAO;
	}

}
