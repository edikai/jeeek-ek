package ek.junit.common;

import org.junit.Test;

import com.ek.bo.commons.CryptUtil;

/**
 * @包名   ek.junit.common
 * @文件名 TestEncrypt.java
 * @作者   qin_hqing
 * @创建日期 2015-1-12
 * @版本 V 1.0
 */
public class TestEncrypt {
	
	@Test
	public void TestCryptUtil(){
		CryptUtil cryptUtil = new CryptUtil();
		cryptUtil.setStr2MD5("123");
		String md5 = cryptUtil.get_MD5Str();
		//cryptUtil.setStr2MD5(md5);
		System.out.println("[MD5 加密之后 ]"+cryptUtil.get_MD5Str());
	}
	@Test
	public void TestSetDecString() {
		CryptUtil encrypt = new CryptUtil();
		encrypt.setKey("123");
		encrypt.setDesString("PhHmK1fOujs=");
		System.out.println("<<<>>>>>"+encrypt.getStrMing());
	}
	@Test
	public void TestSetEncString(){
		CryptUtil encrypt = new CryptUtil();
		encrypt.setKey("123");
		encrypt.setEncString("123");
		System.out.println("<<<>>>>>"+encrypt.getStrMi());
	}
	/*
	 * 
	 */
}
