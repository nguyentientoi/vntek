/**
 * 
 */
package com.vntek.core.util;

import java.util.Date;

/**
 * @author ToiNT
 * @since Oct 1, 2015, 10:56:43 PM
 */
public class GetterUtil {
	public static final String[] BOOLEANS = { "true", "t", "y", "on", "1" };

	public static final boolean DEFAULT_BOOLEAN = false;

	public static final boolean[] DEFAULT_BOOLEAN_VALUES = new boolean[0];

	public static final byte DEFAULT_BYTE = 0;

	public static final byte[] DEFAULT_BYTE_VALUES = new byte[0];

	public static final Date[] DEFAULT_DATE_VALUES = new Date[0];

	public static final double DEFAULT_DOUBLE = 0.0;

	public static final double[] DEFAULT_DOUBLE_VALUES = new double[0];

	public static final float DEFAULT_FLOAT = 0;

	public static final float[] DEFAULT_FLOAT_VALUES = new float[0];

	public static final int DEFAULT_INTEGER = 0;

	public static final int[] DEFAULT_INTEGER_VALUES = new int[0];

	public static final long DEFAULT_LONG = 0;

	public static final long[] DEFAULT_LONG_VALUES = new long[0];

	public static final Number DEFAULT_NUMBER = 0;

	public static final Number[] DEFAULT_NUMBER_VALUES = new Number[0];

	public static final Number DEFAULT_OBJECT = null;

	public static final short DEFAULT_SHORT = 0;

	public static final short[] DEFAULT_SHORT_VALUES = new short[0];

	public static final String DEFAULT_STRING = StringPool.BLANK;

	public static final String[] DEFAULT_STRING_VALUES = new String[0];

	public static String getString(String value) {
		if (value != null)
			return value.trim();
		return DEFAULT_STRING;
	}

	public static long getLong(String value) {
		try {
			return Long.parseLong(value.trim());
		} catch (NumberFormatException ex) {
			return DEFAULT_LONG;
		}
	}

	public static double getDouble(String value) {
		try {
			return Double.parseDouble(value.trim());
		} catch (NumberFormatException ex) {
			return DEFAULT_DOUBLE;
		}
	}

	public static float getFloat(String value) {
		try {
			return Float.parseFloat(value.trim());
		} catch (NumberFormatException ex) {
			return DEFAULT_FLOAT;
		}
	}

	public static int getInt(String value) {
		try {
			return Integer.parseInt(value.trim());
		} catch (NumberFormatException ex) {
			return DEFAULT_INTEGER;
		}
	}

	public static boolean getBoolean(String value) {
		try {
			return Boolean.parseBoolean(value.trim());
		} catch (NumberFormatException ex) {
			return DEFAULT_BOOLEAN;
		}
	}
}
