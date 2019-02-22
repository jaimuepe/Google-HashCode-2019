package com.nevergoes;

import com.nevergoes.io.MyFilesTest;
import com.nevergoes.math.MyMathTest;

public class FullTest {

	public static void main(String[] args) {
		
		MyFilesTest.main(args);
		MyMathTest.main(args);
		
		System.out.println("All tests executed");
	}
}
