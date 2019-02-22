package com.nevergoes.log;

import com.nevergoes.assertions.MyAsserts;

public class MyLogTest {

	public static void main(String[] args) {
		System.out.println("Running test: " + MyLogTest.class.getSimpleName());
		System.setProperty("level", "debug");
		MyAsserts.isTrue(MyLog.debug("debug") == 1, "La traza de debug ha fallado para mensajes debug.");
		System.setProperty("level", "info");
		MyAsserts.isTrue(MyLog.debug("debug") == 1, "La traza de debug ha fallado para mensajes debug.");
		MyAsserts.isTrue(MyLog.info("info") == 1, "La traza de info ha fallado para mensajes info.");
		System.setProperty("level", "error");
		MyAsserts.isTrue(MyLog.debug("debug") == 1, "La traza de debug ha fallado para mensajes debug.");
		MyAsserts.isTrue(MyLog.info("info") == 1, "La traza de info ha fallado para mensajes info.");
		MyAsserts.isTrue(MyLog.error("error") == 1, "La traza de error ha fallado para mensajes error.");
	}

}
