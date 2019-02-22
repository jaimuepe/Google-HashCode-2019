package com.nevergoes.log;

public class MyLog {
	
	private static String property = System.getProperty("debug");
	
	public static void debug(String msg) {
		if(property.equals("debug")) {
			System.out.println("[DEBUG] " + msg);
		}
	}
	
	public static void info(String msg) {
		if(property.equals("debug") || property.equals("info")) {
			System.out.println("[INFO] " + msg);
		}
	}
	
	public static void error(String msg) {
		if(property.equals("error") || property.equals("info") || property.equals("debug")) {
			System.out.println("[ERROR] " + msg);
		}
	}
}
