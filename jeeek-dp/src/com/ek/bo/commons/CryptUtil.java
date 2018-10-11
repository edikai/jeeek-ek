package com.ek.bo.commons;

import java.security.Key;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;

import org.apache.log4j.Logger;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

/**
 * @包名   com.ek.bo.commons
 * @文件名 CryptUtil.java
 * @作者   qin_hqing
 * @创建日期 2015-1-13
 * @版本 V 1.0
 */
public class CryptUtil {
	
	/**
	* 1、
	*   使用DES加密与解密,可对byte[],String类型进行加密与解密  
	*   密文可使用String,byte[]存储.   
	*   方法:  
	*   void getKey(String   strKey)从strKey的字条生成一个Key     
	*   String getEncString(String strMing)对strMing进行加密,返回String密文  
	*   String getDesString(String strMi)对strMin进行解密,返回String明文  
	*   byte[] getEncCode(byte[] byteS)byte[]型的加密  
	*   byte[] getDesCode(byte[] byteD)byte[]型的解密
	*   
	* 2、MD5加密  不可解密
*/
	Logger logger = Logger.getLogger(this.getClass());
	
	/**
	 * MD5加密 生成32位md5码
	 * @param str
	 * TODO
	 */
	public void setStr2MD5(String str){
		str2MD5(str);
	}

	/**
	 * @param str
	 * TODO
	 */
	private void str2MD5(String str) {
		MessageDigest md5 = null;
		byte[] md5Bytes = null;
		StringBuffer hexValue = null;
		
		char[] charArray = str.toCharArray();
		byte[] byteArray = new byte[charArray.length];
		try {
			md5 = MessageDigest.getInstance("MD5");
			
			for (int i = 0; i < charArray.length; i++) {
				byteArray[i] = (byte) charArray[i];
			}
			md5Bytes = md5.digest(byteArray);
			hexValue = new StringBuffer();
			for (int i = 0; i < md5Bytes.length; i++) {
				int val = ((int)md5Bytes[i]) & 0xff;
				if (val < 16) {
					hexValue.append("0");
				}
				hexValue.append(Integer.toHexString(val));
			}
			
			this._MD5Str = hexValue.toString().toUpperCase();
		} catch (Exception e) {
			logger.error(e);
			e.printStackTrace();
		}finally{
			charArray = null;
			byteArray = null;
			md5 = null;
			md5Bytes = null;
			hexValue = null;
		}
	}
	
	/**
	 * 根据初始化密钥生成KEY
	 * @author qin_hqing
	 * @param strKey
	 * TODO
	 */
	public void setKey(String strKey){
		try {
			KeyGenerator _generator = KeyGenerator.getInstance("DES");
			_generator.init(new SecureRandom(strKey.getBytes()));
			this.key = _generator.generateKey();
			_generator = null; //释放资源
		} catch (NoSuchAlgorithmException e) {
			logger.error(e);
			e.printStackTrace();
		}
	}
	
	/**
	 * 加密 String明文输入,String密文输出
	 * @author qin_hqing
	 * @param strMing
	 * TODO
	 */
	public void setEncString(String strMing){
		BASE64Encoder base64Enc = new BASE64Encoder();
		try {
			this.byteMing = strMing.getBytes("UTF-8");
			this.byteMi = this.getEncCode(this.byteMing);
			this.strMi = base64Enc.encode(this.byteMi);
		} catch (Exception e) {
			logger.error(e);
			e.printStackTrace();
		}finally{
			this.byteMi = null;
			this.byteMing = null;
		}
	}

	/**
	 * 加密 以byte[]明文输入,byte[]密文输出
	 * @author qin_hqing
	 * @param byteMing2
	 * @return
	 * TODO
	 */
	private byte[] getEncCode(byte[] byteS) {
		byte[] byteFina = null;
		Cipher cipher = null;
		try {
			cipher = Cipher.getInstance("DES");
			cipher.init(Cipher.ENCRYPT_MODE, this.key);
			byteFina = cipher.doFinal(byteS);
		} catch (Exception e) {
			logger.error(e);
			e.printStackTrace();
		}finally{
			cipher = null;
		}
		return byteFina;
	}

	/**
	 * 解密:以String密文输入,String明文输出
	 * @author qin_hqing
	 * @param strMi
	 * TODO
	 */
	public void setDesString(String strMi){
		BASE64Decoder base64Dnc = new BASE64Decoder();
		try {
			this.byteMi = base64Dnc.decodeBuffer(strMi);
			this.byteMing = this.getDecCode(this.byteMi);
			this.strMing = new String(this.byteMing);
		} catch (Exception e) {
			logger.error(e);
			e.printStackTrace();
		}finally{
			this.byteMi = null;
			this.byteMing = null;
		}
	}
	
	/**
	 * 解密以byte[]密文输入,以byte[]明文输出 
	 * @author qin_hqing
	 * @param byteMi2
	 * @return
	 * TODO
	 */
	private byte[] getDecCode(byte[] byteD) {
		Cipher cipher = null;
		byte[] byteFina = null;
		try {
			cipher = Cipher.getInstance("DES");
			cipher.init(Cipher.DECRYPT_MODE, this.key);
			byteFina = cipher.doFinal(byteD);
		} catch (Exception e) {
			logger.error(e);
			e.printStackTrace();
		}finally{
			cipher = null;
		}
		return byteFina;
	}

	private Key key ;
	private byte[] byteMi = null;
	private byte[] byteMing = null;
	private String strMi = "";
	private String strMing = "";
	
	private String _MD5Str = "";
	
	/**
	 * 返回加密后的byte[]
	 * @return the byteMi
	 */
	public byte[] getByteMi() {
		return byteMi;
	}

	/**
	 * 返回加密后的字符串
	 * @return the strMi
	 */
	public String getStrMi() {
		return strMi;
	}

	/**
	 * 返回解密后的byte[]
	 * @return the byteMing
	 */
	public byte[] getByteMing() {
		return byteMing;
	}

	/**
	 * 返回解密后的字符串
	 * @return the strMing
	 */
	public String getStrMing() {
		return strMing;
	}
	/**
	 * @return the _MD5Str
	 */
	public String get_MD5Str() {
		return _MD5Str;
	}

}
