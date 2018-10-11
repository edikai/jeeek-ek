package com.ek.conn.transaction;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ek.conn.factory.ConnectionFactory;

/**
 * @包名   com.ek.conn.transaction
 * @文件名 TransactionManager.java
 * @作者   Qin_HQing
 * @创建日期 2015年5月28日
 * @版本 V 1.0
 * @描述
 */
public class TransactionManager {
	
	private static Logger logger = Logger.getLogger(TransactionManager.class);
	
	private ApplicationContext ac = new ClassPathXmlApplicationContext("springMVC.xml");
	private ConnectionFactory cf = (ConnectionFactory) ac.getBean("connectionFactory");
	private Connection conn ;
	
	public static void beginTransaction() {
		try {
			TransactionManager tm = new TransactionManager();
			tm.getConn().setAutoCommit(false);
		} catch (SQLException e) {
			logger.error(e);
			e.printStackTrace();
		}
	}
	
	public static void commitTransaction() {
		try {
			TransactionManager tm = new TransactionManager();
			tm.getConn().commit();
		} catch (SQLException e) {
			logger.error(e);
			e.printStackTrace();
		}
	}
	
	public static void rollbackTransaction() {
		try {
			TransactionManager tm = new TransactionManager();
			tm.getConn().rollback();
			tm.getConn().setAutoCommit(true);
		} catch (SQLException e) {
			logger.error(e);
			e.printStackTrace();
		}
	}
	
	public ApplicationContext getAc() {
		return ac;
	}
	public ConnectionFactory getCf() {
		return cf;
	}
	public Connection getConn() {
		return conn;
	}

	public TransactionManager() throws SQLException {
		super();
		this.conn = this.cf.getConnection("");
	}
	
}
