package com.ek.services.commons;

import java.io.File;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import com.ek.bo.commons.FileOperUtil;


/**
 * @包名   ek.services.commons
 * @文件名 FileUtils.java
 * @作者   qin_hqing
 * @创建日期 2014-12-24
 * @版本 V 1.0
 */
@Component
public class FileUtils implements FileUtilsI {

	public void fileUpload(HttpServletRequest request, MultipartFile file, String...modelName) 
			throws Exception {
		this.fileOperBO.uploadFileToServer(request, file, modelName);
	}

	public boolean dirsDelete(File file) {
		return this.fileOperBO.dirsDelete(file);
	}
	/***************************************************************/
	private FileOperUtil fileOperBO;

	/**
	 * @param fileOperBO the fileOperBO to set
	 */
	@Autowired
	public void setFileOperBO(FileOperUtil fileOperBO) {
		this.fileOperBO = fileOperBO;
	}

}
