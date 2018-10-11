package com.ek.conn.factory;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.ek.conn.config.DataSourceConfig;


/**
 * @包名   ek.conn.factory
 * @文件名 AbstractDataSource.java
 * @作者   qin_hqing
 * @创建日期 2014-10-20
 * @版本 V 1.0
 */
@Component
public abstract class AbstractDataSource {
	
	public DataSourceConfig getDataSourceConfig(){
		ApplicationContext act = this.getApplicationContext();
		BasicDataSource dataSource = (BasicDataSource) act.getBean("datasource");
		
		String driverClassName = dataSource.getDriverClassName();
		String url = dataSource.getUrl();
		String userName = dataSource.getUsername();
		String passWord = dataSource.getPassword();
		
		this.dataSourceConfig.setDriver(driverClassName);
		this.dataSourceConfig.setUrl(url);
		this.dataSourceConfig.setUserName(userName);
		this.dataSourceConfig.setPassWord(passWord);
		
		return this.dataSourceConfig;
	}
	
	protected final ApplicationContext getApplicationContext(){
		ApplicationContext act = new ClassPathXmlApplicationContext("components-datasources.xml");
		return act;
	}
	
	private DataSourceConfig dataSourceConfig ;

	@Autowired
	public void setDataSourceConfig(DataSourceConfig dataSourceConfig) {
		this.dataSourceConfig = dataSourceConfig;
	}
}
