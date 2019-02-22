package com.nevergoes.test;

public class MyAsserts {

	public static void isTrue(boolean condition, String errorMsg) {
		if (!condition) {
			throw new AssertionError(errorMsg);
		}
	}
}
