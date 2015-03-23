package com.cpattanaik.common;

import java.util.Arrays;

public class Util {
	public static String getFilledStr(int length, char ch){
		char[] array = new char[length];
		Arrays.fill(array, ch);
		return new String(array);
	}

}
