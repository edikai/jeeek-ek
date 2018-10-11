package com.ek.services.commons;

import java.io.File;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.multipart.MultipartFile;

/**
 * @包名   ek.services.commons
 * @文件名 FileUtilsI.java
 * @作者   qin_hqing
 * @创建日期 2014-12-24
 * @版本 V 1.0
 */
public interface FileUtilsI {

	/**
	 * 文件上传
	 * @author qin_hqing
	 * @param request
	 * @param file
	 * @param modelName 模块名称(可传多个参数，按顺序分级) -- 不同模块上传文件放在不同目录下
	 * @throws Exception 
	 */
	public void fileUpload(HttpServletRequest request, MultipartFile file, String...modelName) 
			throws Exception;
	
	/**
	 * 删除指定目录下的所有目录及文件
	 * @author qin_hqing
	 * @param dirsName 目录
	 */
	public boolean dirsDelete(File file);
}
