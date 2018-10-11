package ek.junit.common;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;

import com.ek.bo.commons.FileOperUtil;



/**
 * @包名   ek.junit.file
 * @文件名 FileUtilsTest.java
 * @作者   qin_hqing
 * @创建日期 2014-12-25
 * @版本 V 1.0
 */
public class FileUtilsTest {
	
	@Test
	public void TestGetDataFromExcelToList(){
		String dirsName = "D:\\Servers\\apache-tomcat-6.0.20\\webapps\\jeeek-dp\\upload\\income\\income_1\\1421030548843.xls";
		FileOperUtil bo = new FileOperUtil();
		try {
			bo.getDataFromExcelToList(dirsName);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	@Test
	public void TestDirsDelete(){
		String dirsName = "D:\\Servers\\apache-tomcat-6.0.20\\webapps\\jeeek-dp\\upload\\income\\income_1";
		FileOperUtil bo = new FileOperUtil();
		boolean bl = bo.dirsDelete(new File(dirsName));
		Assert.assertTrue(bl);
	}
}
