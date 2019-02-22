package com.nevergoes.io;

import java.util.List;

import com.nevergoes.assertions.MyAsserts;

public class MyFilesTest {

	public static void main(String[] args) {

		System.out.println("Running test: " + MyFilesTest.class.getSimpleName());

		List<String> lines = MyFiles.read("testsFile.txt");
		MyAsserts.isTrue(lines.size() == 3, "Fileread test failed!");
	}
}
