/**
 * @program: ek
 * @Date: 2018/10/15 15:24
 * @Author: Qin_HQing
 * @Version: V1.0
 * @Description:
 **/
package com.ek.controller.commons;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class EKController {
	
	protected void printTEXT(String text, HttpServletResponse response){
		response.setCharacterEncoding("utf-8");
		PrintWriter out = null;
		try {
			out = response.getWriter();
			out.print(text);
			out.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				out.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
