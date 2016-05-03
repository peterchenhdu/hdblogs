/*
 * File Name: DateUtil.java
 * Copyright: Copyright 2016-2016 hdu All Rights Reserved.

 * Description: 
 * Author: Pi Chen
 * Create Date: 2016年5月3日

 * Modifier: Pi Chen
 * Modify Date: 2016年5月3日
 * Bugzilla Id: 
 * Modify Content: 
 */
package cn.edu.hdu.hdblogs.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 * @author Pi Chen
 * @version HDBlogs V1.0.0, 2016年5月3日
 * @see
 * @since HDBlogs V1.0.0
 */

public class DateUtil {

	private static Logger logger = LoggerFactory.getLogger(DateUtil.class);
	public static final String DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";

	public static String Date2String(Date date) {
		DateFormat df = new SimpleDateFormat(DATE_FORMAT);
		return df.format(date);
	}

	public static Date String2Date(String dateStr) {
		SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT);
		Date date = null;
		try {
			date = sdf.parse(dateStr);
		} catch (ParseException e) {
			logger.error(dateStr + " invalid date format in String2Date method.");
			e.printStackTrace();
		}
		return date;
	}
	
	
	
	//简单起见，月和年的计算都是近似值，可能会有微小的偏差
	public static String getInterval(Date dateStart, Date dateEnd){
		long start = dateStart.getTime();
		long end = dateEnd.getTime();
		long interval = end - start;
		int intervalDays = (int) (interval/(1000*60*60*24));
		if(intervalDays <= 31){
			return intervalDays + "天";
		}else if(intervalDays < 366){
			return intervalDays/30 + "月";
		}else{
			return intervalDays/365 + "年";
		}
	}
	
	public static void main(String[] args) {
		
	}
}
