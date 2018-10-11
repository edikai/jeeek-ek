package com.ek.client.interceptor;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;

import org.apache.ws.security.WSPasswordCallback;
import org.apache.ws.security.WSSecurityException;

/** 
 * @author Qin_HQing
 * @version 创建时间：2015年5月15日 上午11:36:20 
 * 类说明 
 */
public class ExampleServiceClientInterceptor implements CallbackHandler{

	private Map<String, String> passwords = new HashMap<String, String>();
	
	public ExampleServiceClientInterceptor() {
		passwords.put("admin", "password");
	}
	public void handle(Callback[] callbacks) throws IOException,
			UnsupportedCallbackException {
		
		for (int i = 0; i < callbacks.length; i++) {
			WSPasswordCallback pc = (WSPasswordCallback) callbacks[i];
			String identifier = pc.getIdentifier();
			int usage = pc.getUsage();
			
			if (usage == WSPasswordCallback.USERNAME_TOKEN) {// 密钥方式USERNAME_TOKEN
				System.out.println(passwords.containsKey(identifier)+"="+passwords.get(identifier)+"-"+identifier);
				if (!passwords.containsKey(identifier)) {
					try {
						throw new WSSecurityException("User not match - "+identifier);
					} catch (WSSecurityException e) {
						e.printStackTrace();
					}
				}
				pc.setPassword(passwords.get(identifier));// //▲【这里非常重要】▲
			}else if (usage == WSPasswordCallback.SIGNATURE) {// 密钥方式SIGNATURE
				if (!passwords.containsKey(identifier)) {
					try {
						throw new WSSecurityException("User not match - "+identifier);
					} catch (WSSecurityException e) {
						e.printStackTrace();
					}
				}
				pc.setPassword(passwords.get(identifier));// //▲【这里非常重要】▲
			}
		}
	}

}
