package com.ek.bo.commons;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

import org.apache.log4j.Logger;

/**
 * @包名   com.ek.bo.commons
 * @文件名 DateUtil.java
 * @作者   Qin_HQing
 * @创建日期 2015年5月25日
 * @版本 V 1.0
 * @描述 时间工具类
 */
public class DateUtil {
	
	private static Logger logger = Logger.getLogger(DateUtil.class);
	private static Calendar cld = Calendar.getInstance(TimeZone.getDefault(), Locale.getDefault());
	private static int year = cld.get(Calendar.YEAR);
	private static int month = cld.get(Calendar.MONTH)+1;
	private static int day = cld.get(Calendar.DAY_OF_MONTH);
	private static int hour = cld.get(Calendar.HOUR_OF_DAY);
	private static int minute = cld.get(Calendar.MINUTE);
	private static int second = cld.get(Calendar.SECOND);
	
	/**
	 * 获取时间差
	 * @param startDate
	 * @param endDate
	 * @return
	 */
	public static long[] getDateTimeInterval(Object startDate, Object endDate) {
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
		//前的时间   
		Date sd = null;
		Date ed = null;
		long[] i = new long[4];
		try {
			
			if (startDate instanceof String) {
				sd = df.parse(startDate.toString());
			}else {
				sd = (Date) startDate;
			}
			if (endDate instanceof String) {
				ed = df.parse(endDate.toString());
			}else {
				ed = (Date) endDate;
			}
			//后的时间  
			  
			//两时间差,精确到毫秒   
			long diff = sd.getTime() - ed.getTime();  
			long day = diff / 86400000;                         //以天数为单位取整  
			long hour= diff % 86400000 / 3600000;               //以小时为单位取整  
			long min = diff % 86400000 % 3600000 / 60000;       //以分钟为单位取整  
			long seconds = diff % 86400000 % 3600000 % 60000 / 1000;   //以秒为单位取整  
			//天时分秒  
			i[0] = day;
			i[1] = hour;
			i[2] = min;
			i[3] = seconds;
			
		} catch (ParseException e) {  
			e.printStackTrace();  
		}  
		return i;
	}
	/**
	 * 获取当前日期时间  格式1990-01-01 12:00:00 
	*@return
	*@author qin_hqing
	*@date 2015年5月25日 下午4:09:51
	*@comment
	 */
	public static String getCurrDateTimeStr(){
		
		StringBuffer sb = new StringBuffer("")
			.append(year).append("-")
			.append(month>=10?month:"0"+month).append("-")
			.append(day>=10?day:"0"+day)
			.append(" ")
			.append(hour>=10?hour:"0"+hour).append(":")
			.append(minute>=10?minute:"0"+minute).append(":")
			.append(second>=10?second:"0"+second);
		
		return sb.toString();
	}
	
	/**
	 * 根据指定的分割字符串获取当前日期
	*@param dDlmtStr 日期分割符
	*@param tDlmtStr 时间分隔符
	*@param incldZero 当月/日/时/分/秒<10时，是否在前面添加0. true=添加
	*@return
	*@author qin_hqing
	*@date 2015年5月25日 下午4:31:54
	*@comment
	 */
	public static String getCurrDateTimeStr(String dDlmtStr, String tDlmtStr, boolean incldZero){
		String m = "";
		String d = "";
		String h = "";
		String mi = "";
		String s = "";
		if (incldZero) {
			d = day>=10?day+"":"0"+day;
			m = month>=10?month+"":"0"+month;
			h = hour>=10?hour+"":"0"+hour;
			mi = minute>=10?minute+"":"0"+minute;
			s = second>=10?second+"":"0"+second;
		}else {
			d = day+"";
			m = month+"";
			h = hour+"";
			mi = minute+"";
			s = second+"";
		}
		
		StringBuffer sb = new StringBuffer("")
			.append(year).append(dDlmtStr)
			.append(m).append(dDlmtStr)
			.append(d)
			.append(" ")
			.append(h).append(tDlmtStr)
			.append(mi).append(tDlmtStr)
			.append(s);
		
		return sb.toString();
	}
	
	/**
	 * 获取当前日期 格式 1990-05-10
	 *@return
	 *@author qin_hqing
	 *@date 2015年5月25日 下午4:09:51
	 *@comment
	 */
	public static String getCurrDateStr(){
		
		StringBuffer sb = new StringBuffer("")
		.append(year).append("-")
		.append(month>=10?month:"0"+month).append("-")
		.append(day>=10?day:"0"+day);
		
		return sb.toString();
	}
	
	/**
	 * 获取当前日期 按照指定的格式格式 1990/05/10
	 *@param dlmtStr 分割字符串
	 *@param incldZero 当月/日<10时，是否在前面添加0. true=添加
	 *@return
	 *@author qin_hqing
	 *@date 2015年5月25日 下午4:09:51
	 *@comment
	 */
	public static String getCurrDateStr(String dlmtStr, boolean incldZero){
		String m = "";
		String d = "";
		if (incldZero) {
			d = day>=10?day+"":"0"+day;
			m = month>=10?month+"":"0"+month;
		}else {
			d = day+"";
			m = month+"";
		}
		
		StringBuffer sb = new StringBuffer("")
		.append(year).append(dlmtStr)
		.append(m).append(dlmtStr)
		.append(d);
		
		return sb.toString();
	}
	
	/**
	 * 
	*@return
	*@author qin_hqing
	*@date 2015年5月25日 下午4:09:54
	*@comment
	 */
	public static Date getCurrDate() {
		return cld.getTime();
	}
	
	public static void main(String[] args) {
		logger.info(DateUtil.getDateTimeInterval("2015-06-09 12:12:00", "2015-06-09 15:12:00"));
	}
}
