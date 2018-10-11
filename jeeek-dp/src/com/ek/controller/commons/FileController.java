package com.ek.controller.commons;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

import com.ek.services.commons.FileUtils;
import com.ek.services.commons.FileUtilsI;


/**
 * @包名   ek.controller.commons
 * @文件名 FileController.java
 * @作者   qin_hqing
 * @创建日期 2014-12-24
 * @版本 V 1.0
 */
@Component
@RequestMapping("/fileController")
public class FileController {

	@RequestMapping("/upload.html")
	public ModelAndView uploadFileToServer(HttpServletRequest request, HttpServletResponse response){
		ModelAndView mav = null;
		try {
			MultipartHttpServletRequest mhsr = (MultipartHttpServletRequest) request;
			MultipartFile file = mhsr.getFile("fileToUpload");
			
			if (!file.isEmpty()) {
				this.fileUtils.fileUpload(request, file, "income", "income_1");
			}
			
			JSONObject jo = new JSONObject();
			jo.put("result", "0");
			response.getWriter().write(jo.toString());
			response.getWriter().flush();
			response.getWriter().close();
		} catch (Exception e) {
			logger.error(e);
			e.printStackTrace();
		}
		return mav;
	}
	private Logger logger = Logger.getLogger(this.getClass());
	private FileUtilsI fileUtils;
	/**
	 * @param fileUtils the fileUtils to set
	 */
	@Autowired
	public void setFileUtils(FileUtils fileUtils) {
		this.fileUtils = fileUtils;
	}
}
