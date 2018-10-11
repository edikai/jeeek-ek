package com.ek.conn.factory;

import java.sql.Connection;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @包名   ek.conn.factory
 * @文件名 ConnectionFactory.java
 * @作者   qin_hqing
 * @创建日期 2014-10-20
 * @版本 V 1.0
 */
@Component
public class ConnectionFactory {
	
	private DataSourceFactory dataSourceFactory;
	private Connection connection;
	/**
	 * @description 根据指定数据源名称获取Connection 如果为空字符串则使用默认数据源
	 * @param fileName
	 * @return
	 * @throws SQLException
	 */
	public Connection getConnection(String fileName) throws SQLException{
		if (null == connection) {
			if (null == fileName || fileName.length() == 0) {
				connection = initConnection();
			}else{
				connection = initConnection(fileName);
			}
		}
		
		return connection;
	}
	
	private Connection initConnection() throws SQLException{
		return this.dataSourceFactory.getDataSource().getConnection();
	}
	
	private Connection initConnection(String fileName) throws SQLException{
		return this.dataSourceFactory.getDataSource(fileName).getConnection();
	}
	
	@Autowired
	public void setDataSourceFactory(DataSourceFactory dataSourceFactory) {
		this.dataSourceFactory = dataSourceFactory;
	}
	
}
