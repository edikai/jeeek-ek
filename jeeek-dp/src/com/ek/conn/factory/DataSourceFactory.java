package com.ek.conn.factory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @包名   ek.conn.factory
 * @文件名 DataSourceFactory.java
 * @作者   qin_hqing
 * @创建日期 2014-10-20
 * @版本 V 1.0
 */
@Component
public class DataSourceFactory extends AbstractDataSource{

	private static DataSourceFactory dataSourceFactory;
	private DataSource dataSource ;
	
	public static DataSourceFactory getInstances() {
		if (null == dataSourceFactory) {
			ApplicationContext act = new ClassPathXmlApplicationContext("spring-datasource-config.xml");
			dataSourceFactory = (DataSourceFactory) act.getBean("dataSourceFactory");
		}
		return dataSourceFactory;
	}

	public DataSource getDataSource() {
		this.dataSource = (DataSource) this.getApplicationContext().getBean("datasource");
		return dataSource;
	}

	public DataSource getDataSource(String fileName) {
		this.dataSource = (DataSource) this.getApplicationContext().getBean(fileName);
		return dataSource;
	}
	
	/**
	 * @param dataSource the dataSource to set
	 */
	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	/**
	 * @return the dataSourceFactory
	 */
	public static DataSourceFactory getDataSourceFactory() {
		return dataSourceFactory;
	}

	/**
	 * @param dataSourceFactory the dataSourceFactory to set
	 */
	@Autowired
	public static void setDataSourceFactory(DataSourceFactory dataSourceFactory) {
		DataSourceFactory.dataSourceFactory = dataSourceFactory;
	}
}
