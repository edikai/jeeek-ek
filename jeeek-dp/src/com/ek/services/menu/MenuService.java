package com.ek.services.menu;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ek.entry.menu.TreeEkMenu;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;





import com.ek.dao.menu.MenuDAO;
import com.ek.entry.menu.EkMenu;

/**
 * @包名   com.ek.services.menu
 * @文件名 MenuService.java
 * @作者   Qin_HQing
 * @创建日期 2015年5月27日
 * @版本 V 1.0
 * @描述
 */
@Component
public class MenuService implements MenuServiceI {

	private Logger log = Logger.getLogger(this.getClass());
	private MenuDAO menuDAO;
	
	@Autowired
	public void setMenuDAO(MenuDAO menuDAO) {
		this.menuDAO = menuDAO;
	}

	@Override
	public Object getObject(int objId) throws SQLException{
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
		List<EkMenu> list = this.menuDAO.getMenuListBySQL(sbSQL.toString());
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
		EkMenu menu = (EkMenu) object;
		String[] colName = {"MENUNAME"};
		String[] colValue = {menu.getMenuName() };
		List<EkMenu> list = (List<EkMenu>) this.getList(colName, colValue);
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
	public List<TreeEkMenu> getUserMenuList(List<String> permList) throws SQLException {
		String pids = permList.toString().substring(1, permList.toString().length()-1);
		
		return this.getTreeEKMenu(0, pids);
	}
	
	@Override
	public String getMenuUrl(Integer pId) throws SQLException {
		return this.menuDAO.getMenuUrl(pId);
	}
	
	/**
	 * 根据父菜单ID获取其下的子菜单
	 * @param menuId
	 * @return
	 * @throws SQLException
	 */
	public List<EkMenu> getMenuListBySub(String menuId) throws SQLException {
		StringBuilder sbSQL = new StringBuilder("")
			.append("SELECT * FROM EK_MENU M WHERE M.PARMENUID = ")
			.append(menuId).append(" AND M.VALIDFLAG = '1' ");
		this.log.info("****"+sbSQL.toString());
		List<EkMenu> list = this.menuDAO.getMenuListBySQL(sbSQL.toString());
		return list;
	}
	
	private List<TreeEkMenu> getTreeEKMenu(int parMenuId, String permIds) throws SQLException {
		List<TreeEkMenu> treeMenus = new ArrayList<>();
		
		StringBuilder tempSql = new StringBuilder();
		tempSql.append("SELECT * FROM EK_MENU WHERE VALIDFLAG = '1' AND PERMSNID IN(")
			.append(permIds)
			.append(") AND PARMENUID = ").append(parMenuId)
		;
		
		List<EkMenu> mList = this.menuDAO.getMenuListBySQL(tempSql.toString());
		for (EkMenu menu : mList){
			TreeEkMenu treeEKMenu = new TreeEkMenu();
			treeEKMenu.setText(menu.getMenuName());
			List<TreeEkMenu> list = getTreeEKMenu(menu.getMenuId(), permIds);
			if (null != list && !list.isEmpty())
				treeEKMenu.setNodes(list);
			treeEKMenu.setPermsnId(menu.getPermsnId());
			
			treeMenus.add(treeEKMenu);
		}
		
		return treeMenus;
	}

}
