/**
 * @program: ek
 * @Date: 2018/10/16 10:16
 * @Author: Qin_HQing
 * @Version: V1.0
 * @Description:
 **/
package com.ek.entry.commons;

public class JSONMsg {
	
	private String code;
	private String msg;
	private Object data;
	
	public String getCode() {
		return code;
	}
	
	public void setCode(String code) {
		this.code = code;
	}
	
	public String getMsg() {
		return msg;
	}
	
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	public Object getData() {
		return data;
	}
	
	public void setData(Object data) {
		this.data = data;
	}
}
