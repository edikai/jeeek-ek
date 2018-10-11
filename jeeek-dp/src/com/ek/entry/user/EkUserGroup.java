package com.ek.entry.user;
/**
 * @包名   com.ek.entry.user
 * @文件名 EkUserGroup.java
 * @作者   Qin_HQing
 * @创建日期 2015年5月22日
 * @版本 V 1.0
 * @描述
 */
public class EkUserGroup {

	/**用户组ID*/
	public int userGroupId;
	
	/**用户组名称*/
	public java.lang.String userGroupName;
	
	/**父用户组ID - 暂时未用*/
	public int parUserGroupId;
	
	/**备注*/
	public java.lang.String remark;
	
	/** 1-有效；0-无效。默认1*/
	public java.lang.String validFlag;
	
	/**创建人*/
	public int createUserId;
	
	/** 最后一次更新的用户*/
	public int updateUserId;
	
	/** 创建时间*/
	public java.util.Date createTime;
	
	/** 最后一次更新时间*/
	public java.util.Date updateTime;

	public int getUserGroupId() {
		return userGroupId;
	}

	public void setUserGroupId(int userGroupId) {
		this.userGroupId = userGroupId;
	}

	public java.lang.String getUserGroupName() {
		return userGroupName;
	}

	public void setUserGroupName(java.lang.String userGroupName) {
		this.userGroupName = userGroupName;
	}

	public int getParUserGroupId() {
		return parUserGroupId;
	}

	public void setParUserGroupId(int parUserGroupId) {
		this.parUserGroupId = parUserGroupId;
	}

	public java.lang.String getRemark() {
		return remark;
	}

	public void setRemark(java.lang.String remark) {
		this.remark = remark;
	}

	public java.lang.String getValidFlag() {
		return validFlag;
	}

	public void setValidFlag(java.lang.String validFlag) {
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

	public java.util.Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(java.util.Date createTime) {
		this.createTime = createTime;
	}

	public java.util.Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(java.util.Date updateTime) {
		this.updateTime = updateTime;
	}
}
