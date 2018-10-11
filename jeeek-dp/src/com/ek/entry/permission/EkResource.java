package com.ek.entry.permission;
/**
 * @包名   com.ek.entry.permission
 * @文件名 EkResource.java
 * @作者   Qin_HQing
 * @创建日期 2015年5月22日
 * @版本 V 1.0
 * @描述
 */
public class EkResource {

	/** 资源ID */
	public int resourceId;
	
	/** 资源名称 */
	public java.lang.String resourceName;
	
	/** 该资源的访问URL链接 */
	public java.lang.String resourceURL;
	
	/** 备注 */
	public java.lang.String remark;
	
	/** 1-有效；0-无效。默认 1*/
	public java.lang.String validFlag;
	
	/** 创建人 */
	public int createUserId;
	
	/** 最后一次更新的用户*/
	public int updateUserId;
	
	/** 创建时间*/
	public java.util.Date createTime;
	
	/** 最后一次更新时间*/
	public java.util.Date updateTime;

	public int getResourceId() {
		return resourceId;
	}

	public void setResourceId(int resourceId) {
		this.resourceId = resourceId;
	}

	public java.lang.String getResourceName() {
		return resourceName;
	}

	public void setResourceName(java.lang.String resourceName) {
		this.resourceName = resourceName;
	}

	public java.lang.String getResourceURL() {
		return resourceURL;
	}

	public void setResourceURL(java.lang.String resourceURL) {
		this.resourceURL = resourceURL;
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

	public void setCreateUserId(int ccreateUserId) {
		createUserId = ccreateUserId;
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
