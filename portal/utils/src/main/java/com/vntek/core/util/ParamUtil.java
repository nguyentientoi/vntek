/**
 * 
 */
package com.vntek.core.util;

import javax.servlet.http.HttpServletRequest;

/**
 * @author ToiNT
 * @since Oct 1, 2015, 10:57:00 PM
 */
public class ParamUtil {
	public static String getString(HttpServletRequest request, String param) {
		return GetterUtil.getString(request.getParameter(param));
	}

	public static int getInt(HttpServletRequest request, String param) {
		return GetterUtil.getInt(request.getParameter(param));
	}

	public static float getFloat(HttpServletRequest request, String param) {
		return GetterUtil.getFloat(request.getParameter(param));
	}

	public static double getDouble(HttpServletRequest request, String param) {
		return GetterUtil.getDouble(request.getParameter(param));
	}

	public static long getLong(HttpServletRequest request, String param) {
		return GetterUtil.getLong(request.getParameter(param));
	}
}
