package com.ek.entry.user;

import java.io.Serializable;
import java.util.Date;

/**
 * @包名   ek.entry.user.po
 * @文件名 User.java
 * @作者   qin_hqing
 * @创建日期 2014-10-20
 * @版本 V 1.0
 */
public class User implements Serializable{
	private static final long serialVersionUID = 1L;
	private int id;
	private String userName;	//用户名
	private String passWord;	//密码
	private String address;
	private String mobilePhone;
	private Date entryTime;		//录入时间
	private Date updateTime;	//更新时间
	private String entryUserId;	//录入人ID
	private String validFlag;	//有效标识
	private Integer access;
	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**
	 * @return the passWord
	 */
	public String getPassWord() {
		return passWord;
	}
	/**
	 * @param passWord the passWord to set
	 */
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMobilePhone() {
		return mobilePhone;
	}
	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	/**
	 * @return the entryTime
	 */
	public Date getEntryTime() {
		return entryTime;
	}
	/**
	 * @param entryTime the entryTime to set
	 */
	public void setEntryTime(Date entryTime) {
		this.entryTime = entryTime;
	}
	/**
	 * @return the updateTime
	 */
	public Date getUpdateTime() {
		return updateTime;
	}
	/**
	 * @param updateTime the updateTime to set
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	/**
	 * @return the entryUserId
	 */
	public String getEntryUserId() {
		return entryUserId;
	}
	/**
	 * @param entryUserId the entryUserId to set
	 */
	public void setEntryUserId(String entryUserId) {
		this.entryUserId = entryUserId;
	}
	/**
	 * @return the validFlag
	 */
	public String getValidFlag() {
		return validFlag;
	}
	/**
	 * @param validFlag the validFlag to set
	 */
	public void setValidFlag(String validFlag) {
		this.validFlag = validFlag;
	}
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	public User() {
		super();
		
		this.entryTime = new Date();
		this.updateTime = new Date();
		this.validFlag = "1";
	}
	/**
	 * @return the access
	 */
	public Integer getAccess() {
		return access;
	}
	/**
	 * @param access the access to set
	 */
	public void setAccess(Integer access) {
		this.access = access;
	}
	
}
