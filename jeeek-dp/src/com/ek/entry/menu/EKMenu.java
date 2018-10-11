package com.ek.entry.menu;

import java.util.Date;

/**
 * @包名   com.ek.entry.menu
 * @文件名 EKMenu.java
 * @作者   Qin_HQing
 * @创建日期 2015年5月27日
 * @版本 V 1.0
 * @描述
 */
public class EKMenu {
	
	/** 主键*/
	private int menuId;
	
	/** 菜单名称*/
	private String menuName;
	
	/** 父菜单名称*/
	private int parMenuId;
	
	/** 权限表主键*/
	private int permsnId;
	
	/** 备注 */
	private String remark;
	
	/** 有效标识 */
	private String validFlag;
	
	/** 创建人ID */
	private int createUserId;
	
	/** 更新人ID*/
	private int updateUserId;
	
	/** 创建时间 */
	private Date createTime;
	
	/** 最后一次更新时间 */
	private Date updateTime;

	public int getMenuId() {
		return menuId;
	}

	public void setMenuId(int menuId) {
		this.menuId = menuId;
	}

	public String getMenuName() {
		return menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	public int getParMenuId() {
		return parMenuId;
	}

	public void setParMenuId(int parMenuId) {
		this.parMenuId = parMenuId;
	}

	public int getPermsnId() {
		return permsnId;
	}

	public void setPermsnId(int permsnId) {
		this.permsnId = permsnId;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getValidFlag() {
		return validFlag;
	}

	public void setValidFlag(String validFlag) {
		this.validFlag = validFlag;
	}

	public int getCreateUserId() {
		return createUserId;
	}

	public void setCreateUserId(int createUserId) {
		this.createUserId = createUserId;
	}

	public int getUpdateUserId() {
		return updateUserId;
	}

	public void setUpdateUserId(int updateUserId) {
		this.updateUserId = updateUserId;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
}
