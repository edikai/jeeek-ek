package com.ek.services.menu;

import java.sql.SQLException;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;





import com.ek.dao.menu.MenuDAO;
import com.ek.entry.menu.EKMenu;

/**
 * @包名   com.ek.services.menu
 * @文件名 MenuService.java
 * @作者   Qin_HQing
 * @创建日期 2015年5月27日
 * @版本 V 1.0
 * @描述
 */
@Component
public class MenuService extends MenuServiceI {

	private Logger log = Logger.getLogger(this.getClass());
	private MenuDAO menuDAO;
	
	@Autowired
	public void setMenuDAO(MenuDAO menuDAO) {
		this.menuDAO = menuDAO;
	}

	@Override
	public Object getObject(int objId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<?> getList(String[] colName, String[] colValue)
			throws SQLException {
		StringBuffer sbSQL = new StringBuffer("")
			.append("SELECT * FROM EK_MENU WHERE VALIDFLAG = '1' ");
		if (null != colName && null != colValue && colName.length > 0 && colValue.length > 0) {
			for (int i = 0; i < colName.length; i++) {
				sbSQL.append("AND ").append(colName[i]).append("='").append(colValue[i]).append("' ");
			}
			
		}
		log.info(sbSQL.toString());
		List<EKMenu> list = this.menuDAO.getMenuListBySQL(sbSQL.toString());
		return list;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Object> getList() throws SQLException{
		List<Object> list = (List<Object>) this.getList(null, null);
		
		return list;
	}

	@SuppressWarnings("unchecked")
	@Override
	public boolean add(Object object) throws SQLException {
		boolean rbl = false;
		EKMenu menu = (EKMenu) object;
		String[] colName = {"MENUNAME"};
		String[] colValue = {menu.getMenuName() };
		List<EKMenu> list = (List<EKMenu>) this.getList(colName, colValue);
		if (null == list || list.isEmpty()) {
			rbl = this.menuDAO.add(menu);
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
	public List<EKMenu> getUserMenuList(List<String> permList) throws SQLException {
		String mids = permList.toString().substring(1, permList.toString().length()-1);
		StringBuffer sbSQL = new StringBuffer("")
			.append("SELECT MENUID FROM EK_MENU M WHERE M.VALIDFLAG = '1' AND  PERMSNID IN (")
			.append(mids)
			.append(") ");
		List<String> midList = this.menuDAO.getMenuIds(sbSQL.toString(), "MENUID");
		String tempIds = midList.toString().substring(1, midList.toString().length()-1);
		while (true) {
			StringBuilder sb = new StringBuilder()
				.append("SELECT DISTINCT PARMENUID FROM EK_MENU M WHERE M.VALIDFLAG = '1' AND MENUID IN (")
				.append(tempIds)
				.append(")");
			List<String> ids = this.menuDAO.getMenuIds(sb.toString(), "PARMENUID");
			tempIds = ids.toString().substring(1, ids.toString().length()-1);
			midList.addAll(ids);
			if (ids.size() == 1 && ids.get(0).equals("1")) {
				break;
			}
		}
		StringBuilder sql = new StringBuilder()
			.append("SELECT * FROM EK_MENU WHERE VALIDFLAG = '1' AND MENUID IN(")
			.append(midList.toString().substring(1, midList.toString().length()-1))
			.append(")");
		log.info(sql.toString());
		List<EKMenu> mList = this.menuDAO.getMenuListBySQL(sql.toString());
		
		return mList;
	}
	
	/**
	 * 根据父菜单ID获取其下的子菜单
	 * @param menuId
	 * @return
	 * @throws SQLException
	 */
	public List<EKMenu> getMenuListBySub(String menuId) throws SQLException {
		StringBuilder sbSQL = new StringBuilder("")
			.append("SELECT * FROM EK_MENU M WHERE M.PARMENUID = ")
			.append(menuId).append(" AND M.VALIDFLAG = '1' ");
		this.log.info("****"+sbSQL.toString());
		List<EKMenu> list = this.menuDAO.getMenuListBySQL(sbSQL.toString());
		return list;
	}

}
