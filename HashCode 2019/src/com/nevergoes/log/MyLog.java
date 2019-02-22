package com.nevergoes.log;

public class MyLog {
	
	private static String property = System.getProperty("level");
	
	public static int debug(String msg) {
		if(property.equals("debug")) {
			System.out.println("[DEBUG] " + msg);
			return 1;
		}
		return 0;
	}
	
	public static int info(String msg) {
		if(property.equals("debug") || property.equals("info")) {
			System.out.println("[INFO] " + msg);
			return 1;
		}
		return 0;
	}
	
	public static int error(String msg) {
		
			System.err.println("[ERROR] " + msg);
			return 1;
	}
}
