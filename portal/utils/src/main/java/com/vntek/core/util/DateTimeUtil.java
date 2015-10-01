/**
 * 
 */
package com.vntek.core.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author ToiNT
 * @since Oct 1, 2015, 10:58:04 PM
 */
public class DateTimeUtil {
	/**
	 * <b>convert date time to string</b>
	 * 
	 * @author ToiNT
	 * @since Sep 30, 2015, 12:38:08 AM
	 * 
	 * @param date
	 * @param pattern
	 * @return
	 */
	public static String toString(Date date, String pattern) {
		try {
			return simpleDateFormat(pattern).format(date);
		} catch (Exception ex) {
			_log.log(Level.SEVERE, ex.getMessage(), ex);
			return StringPool.BLANK;
		}
	}

	/**
	 * <b>Convert string to date</b>
	 * 
	 * @author ToiNT
	 * @since Sep 30, 2015, 12:38:36 AM
	 * 
	 * @param value
	 * @param pattern
	 * @return
	 */
	public static Date toDate(String value, String pattern) {
		try {
			return simpleDateFormat(pattern).parse(value);
		} catch (Exception ex) {
			_log.log(Level.SEVERE, ex.getMessage(), ex);
			return null;
		}
	}

	/**
	 * <b>create object simple date format </b>
	 * 
	 * @author ToiNT
	 * @since Sep 30, 2015, 12:39:00 AM
	 * 
	 * @param pattern
	 * @return
	 */
	public static SimpleDateFormat simpleDateFormat(String pattern) {
		return new SimpleDateFormat(pattern);
	}

	/**
	 * log to server
	 */
	private static final Logger _log = Logger.getLogger(DateTimeUtil.class.getName());
}
