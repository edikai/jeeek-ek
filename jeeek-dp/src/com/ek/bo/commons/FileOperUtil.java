package com.ek.bo.commons;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

/**
 * @包名   ek.bo.commons
 * @文件名 FileOperBO.java
 * @作者   qin_hqing
 * @创建日期 2014-12-24
 * @版本 V 1.0
 */
@Component
public class FileOperUtil {

	public List<String> getDataFromExcelToList(String filePath) 
			throws FileNotFoundException, IOException{
		
		List<String> list = new ArrayList<String>();
		
		//HSSFWorkbook wookbook = new HSSFWorkbook(new FileInputStream("E://test.xls"));
		XSSFWorkbook wookbook = new XSSFWorkbook(new FileInputStream(filePath));
		// 在Excel文档中，第一张工作表的缺省索引是0
		// 其语句为：HSSFSheet sheet = workbook.getSheetAt(0);­
		XSSFSheet sheet = wookbook.getSheet("Sheet1");
		//获取到Excel文件中的所有行数­
		int rows = sheet.getPhysicalNumberOfRows();
		
		for (int i = 0; i < rows; i++) {
			// 读取左上端单元格­
			XSSFRow row = sheet.getRow(i);
			// 行不为空­
			if (row != null) {
				//获取到Excel文件中的所有的列­
				int cells = row.getPhysicalNumberOfCells();
				String value = "";
				//遍历列­
				for (int j = 0; j < cells; j++) {
					//获取到列的值­
					XSSFCell cell = row.getCell(j);
					if (cell != null) {
						//cell.get
						switch (cell.getCellType()) {
							case XSSFCell.CELL_TYPE_FORMULA: //2
							break;
							case XSSFCell.CELL_TYPE_NUMERIC: //0
//								if (j == 4 || j == 6 || (i == 1 && j == 1)) {//数字 防止科学计数
//									DecimalFormat df = new DecimalFormat("0");
//									value += df.format(cell.getNumericCellValue()); 
//								}else if (j == 0) { //日期格式
//									SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");  
//									double b = cell.getNumericCellValue();  
//									Date date = org.apache.poi.ss.usermodel.DateUtil  
//										.getJavaDate(b);  
//									value += sdf.format(date);  
//								}else {
//									value += cell.getNumericCellValue();
//								}
								value += cell.getNumericCellValue();
							break;
							case XSSFCell.CELL_TYPE_STRING: //1
								value += cell.getStringCellValue();
							break;
							default:
								value += "0";
							break;
						}
						if (j != cells - 1) {
							value += "ぃ";
						}
					}
				}
				logger.debug(value);
				logger.info(value);
				list.add(value);
			}
		}
		return list;
	} 
	/**
	 * 删除指定目录下所有目录及文件
	 * @author qin_hqing
	 * @param dirsName
	 */
	public boolean dirsDelete(File file) {
		boolean delResult = true;
		
		// To decide the file is exist or not.
		if (file.exists()) {
			// To decide the file is directory or not.
			if(file.isDirectory()) {
				// if is empty folders, then delete this folders.
				if (file.list().length == 0) {
					delResult = delResult && file.delete(); 
				}else { // if is a not empty folders, then recursive this folders.
					File[] files = file.listFiles();
					for (int i = 0; i < files.length; i++) {
						delResult = delResult && this.dirsDelete(files[i]);
					}
					//when fecursive success delete the empty folders.
					delResult = delResult && file.delete();
				}
			}else {
				//if is a file ,then direct delete 
				delResult = delResult && file.delete();
			}
			logger.debug("[ The delete file name is "+file.getName()+" . ]");
		}
		
		return delResult;
	}
	
	/**
	 * 文件上传到服务器
	 * @author qin_hqing
	 * @param request
	 * @param file
	 * @param modelName 模块名称(可传多个参数，按顺序分级) -- 不同模块上传文件放在不同目录下
	 * @throws Exception 
	 */
	public void uploadFileToServer(HttpServletRequest request, MultipartFile file, String...modelName) 
			throws Exception{
		
		String fileName = file.getOriginalFilename();//获取上传的文件名
		String suffix = fileName.substring(fileName.lastIndexOf("."));//获取上传的文件后缀
		
		StringBuffer sbDirs = new StringBuffer(40).append("/upload/");
		for (int i = 0; i < modelName.length; i++) {
			sbDirs.append(modelName[i])
				.append("/");
		}
		//根据实际路径创建目录
		String localRealPath = request.getSession().getServletContext().getRealPath(sbDirs.toString());
		logger.info(request.getRequestURI());
		File saveFile = new File(localRealPath);
		if (!saveFile.exists()) {
			saveFile.mkdirs();
		}
		String localName = new StringBuffer()
				.append(localRealPath)
				.append("/")
				.append(System.currentTimeMillis())
				.append(suffix)
				.toString();//本地文件名
		File localFile = new File(localName);
		
		logger.info("[file Name:] "+localFile.getPath()); 
		file.transferTo(localFile);
	}
	
	private Logger logger = Logger.getLogger(this.getClass());

}
