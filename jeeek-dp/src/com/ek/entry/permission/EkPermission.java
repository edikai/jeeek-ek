package com.ek.entry.permission;
/**
 * @包名   com.ek.entry.permission
 * @文件名 EkPermission.java
 * @作者   Qin_HQing
 * @创建日期 2015年5月22日
 * @版本 V 1.0
 * @描述
 */
public class EkPermission {

	/** 权限ID */
	public int permsnId;
	
	/** 权限名称 */
	public java.lang.String permsnName;
	
	/** 资源ID */
	public int resourceId;
	
	/** 操作ID */
	public int operateId;
	
	/** 备注 */
	public java.lang.String remark;
	
	/** 1-有效；0-无效。默认1*/
	public java.lang.String validFlag;
	
	/** 创建人*/
	public int createUserId;
	
	/** 最后一次更新的用户*/
	public int updateUserId;
	
	/** 创建时间*/
	public java.util.Date createTime;
	
	/** 最后一次更新时间 */
	public java.util.Date updateTime;

	public int getPermsnId() {
		return permsnId;
	}

	public void setPermsnId(int permsnId) {
		this.permsnId = permsnId;
	}

	public java.lang.String getPermsnName() {
		return permsnName;
	}

	public void setPermsnName(java.lang.String permsnName) {
		this.permsnName = permsnName;
	}

	public int getResourceId() {
		return resourceId;
	}

	public void setResourceId(int resourceId) {
		this.resourceId = resourceId;
	}

	public int getOperateId() {
		return operateId;
	}

	public void setOperateId(int operateId) {
		this.operateId = operateId;
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
