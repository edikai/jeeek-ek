package ek.junit.common;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * @包名   ek.junit.file
 * @文件名 ImptTest.java
 * @作者   qin_hqing
 * @创建日期 2015-1-9
 * @版本 V 1.0
 */
public class ImptTest {
	
	public static void main(String[] args) {
		double num = 1.11123E+14;
		System.out.println("[处理前]num= "+num);
		
		NumberFormat formatter = NumberFormat.getNumberInstance();
		formatter.setMaximumFractionDigits(0);
		String str = formatter.format(num);
		System.out.println("[处理后]str= "+str);
		
		String[] str2 = str.split(",");
		StringBuffer buffer = new StringBuffer();
		for(int i=0;i<str2.length;i++){
			buffer.append(str2[i]);
		}
		String result = buffer.toString();
		System.out.println("result= "+result);
	}
	
	/**
	 * 按照指定格式 导入EXCEL表格到数据库 -- 获取表格数据
	 * @author qin_hqing
	 * @param filePath
	 * @throws IOException
	 * @throws FileNotFoundException
	 */
	private List<Map<String, Object>> getDateFromExcel(String filePath) throws IOException,
			FileNotFoundException {
		List<Map<String, Object>> list = new ArrayList<Map<String,Object>>();
		// 创建对Excel工作簿文件的引用­
		//HSSFWorkbook wookbook = new HSSFWorkbook(new FileInputStream("E://test.xls"));
		XSSFWorkbook wookbook = new XSSFWorkbook(new FileInputStream(filePath));
		// 在Excel文档中，第一张工作表的缺省索引是0
		// 其语句为：HSSFSheet sheet = workbook.getSheetAt(0);­
		XSSFSheet sheet = wookbook.getSheet("Sheet1");
		//获取到Excel文件中的所有行数­
		int rows = sheet.getPhysicalNumberOfRows();
		//遍历行­
		for (int i = 0; i < rows; i++) {
			// 读取左上端单元格­
			XSSFRow row = sheet.getRow(i);
			// 行不为空­
			if (row != null) {
				Map<String, Object> map = new HashMap<String, Object>();
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
								if (j == 4 || j == 6 || (i == 1 && j == 1)) {//数字 防止科学计数
									DecimalFormat df = new DecimalFormat("0");
									value += df.format(cell.getNumericCellValue()); 
								}else if (j == 0) { //日期格式
									SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");  
									double b = cell.getNumericCellValue();  
									Date date = org.apache.poi.ss.usermodel.DateUtil  
										.getJavaDate(b);  
									value += sdf.format(date);  
								}else {
									value += cell.getNumericCellValue();
								}
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
				// 将数据插入到mysql数据库中­
				String[] val = value.split("ぃ");
				System.out.println(value);
				
				if (i == 0) {
					map.put("zhmc", val[1]);
				}else if (i == 1) {
					map.put("dkzh", val[1]);
				}else if (i == 2) {
					map.put("zy", val[1]);
				}else if (i == 3) {
					map.put("bz", val[1]);
				}else {
					map.put("dktime", val[0]);
					map.put("hkje", val[1]);
					map.put("sxf", val[2]);
					map.put("khmc", val[3]);
					map.put("khzh", val[4]);
					map.put("bz", val[5]);
					map.put("dkzh", val[6]);
					map.put("hl", val[7]);
					map.put("bzdm", val[8]);
					map.put("yhhklsh", val[9]);
				}
				if (i != 4) {
					list.add(map);
				}
			}
		}
		return list;
	}
}
