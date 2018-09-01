package com.example.util;

public class StringUtil {

	public static boolean isNullOrEmpty(String input){
		
		return (input==null || "".equals(input.trim())) ? true : false;
	}

	public static boolean isNullOrEmpty(long input) {
		// TODO Auto-generated method stub
		return (input==0  ? true : false);
	}
}
