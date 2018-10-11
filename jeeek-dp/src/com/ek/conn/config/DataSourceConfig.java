package com.ek.conn.config;

import org.springframework.stereotype.Component;

/**
 * @包名   ek.conn
 * @文件名 DataSourceConfig.java
 * @作者   qin_hqing
 * @创建日期 2014-10-20
 * @版本 V 1.0
 */
@Component
public class DataSourceConfig {
	
	private String url ;
	private String driver ;
	private String userName ;
	private String passWord ;
	
	/**
	 * 
	 */
	public DataSourceConfig() {
		super();
		this.url = "";
		this.driver = "";
		this.userName = "";
		this.passWord = "";
	}
	/**
	 * @param url
	 * @param driver
	 * @param userName
	 * @param passWord
	 */
	public DataSourceConfig(String url, String driver, String userName,
			String passWord) {
		super();
		this.url = url;
		this.driver = driver;
		this.userName = userName;
		this.passWord = passWord;
	}
	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}
	/**
	 * @param url the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}
	/**
	 * @return the driver
	 */
	public String getDriver() {
		return driver;
	}
	/**
	 * @param driver the driver to set
	 */
	public void setDriver(String driver) {
		this.driver = driver;
	}
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
	
}
