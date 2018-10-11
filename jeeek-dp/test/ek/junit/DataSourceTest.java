package ek.junit;

import java.sql.SQLException;

import com.ek.conn.config.DataSourceConfig;
import com.ek.conn.factory.DataSource;
import com.ek.conn.factory.DataSourceFactory;

import junit.framework.TestCase;

/**
 * @包名   ek.junit
 * @文件名 DataSourceTest.java
 * @作者   qin_hqing
 * @创建日期 2014-10-20
 * @版本 V 1.0
 */
public class DataSourceTest extends TestCase {

	/**
	 * Test method for {@link com.ek.conn.factory.DataSourceFactory#getDataSource()}.
	 * @throws SQLException 
	 */
	public void testGetDataSource() throws SQLException {
		DataSourceFactory dsf = DataSourceFactory.getInstances();
		DataSource dataSource = dsf.getDataSource();
		assertEquals(true, dataSource.getConnection() != null);
	}

	/**
	 * Test method for {@link com.ek.conn.factory.DataSourceFactory#getDataSource(java.lang.String)}.
	 * @throws SQLException 
	 */
	public void testGetDataSourceString() throws SQLException {
		DataSourceFactory dsf = DataSourceFactory.getInstances();
		DataSource dataSource = dsf.getDataSource("datasource_2");
		assertEquals(true, dataSource.getConnection() != null);
	}

	/**
	 * Test method for {@link com.ek.conn.factory.AbstractDataSource#getDataSourceConfig()}.
	 */
	public void testGetDataSourceConfig() {
		
		DataSourceFactory dsf = DataSourceFactory.getInstances();
		
		DataSourceConfig dsc = dsf.getDataSourceConfig();
		
		assertEquals("com.mysql.jdbc.Driver", dsc.getDriver());
	}

}
