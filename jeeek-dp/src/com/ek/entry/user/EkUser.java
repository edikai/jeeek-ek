package com.ek.entry.user;
/**
 * @包名   com.ek.entry.user
 * @文件名 EkUser.java
 * @作者   Qin_HQing
 * @创建日期 2015年5月22日
 * @版本 V 1.0
 * @描述
 */
public class EkUser {

	 /** 主键*/
	public int userId;
	
	/** 用户名*/
	public java.lang.String logName;
	
	/** 用户密码*/
	public java.lang.String passWord;
	
	/** 现实中的用户名*/
	public java.lang.String userName;
	
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
	
	/** 最后一次更新时间*/
	public java.util.Date updateTime;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public java.lang.String getLogName() {
		return logName;
	}

	public void setLogName(java.lang.String logName) {
		this.logName = logName;
	}

	public java.lang.String getPassWord() {
		return passWord;
	}

	public void setPassWord(java.lang.String passWord) {
		this.passWord = passWord;
	}

	public java.lang.String getUserName() {
		return userName;
	}

	public void setUserName(java.lang.String userName) {
		this.userName = userName;
	}

	public java.lang.String getRemark() {
		return remark;
	}

	public void setRemark(java.lang.String rRemark) {
		this.remark = rRemark;
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
