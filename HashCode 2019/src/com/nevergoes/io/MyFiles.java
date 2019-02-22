package com.nevergoes.io;

import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class MyFiles {

	public static List<String> read(String fileName) {
		
		try {
			final URL fileResource = MyFiles.class.getClassLoader().getResource(fileName);
			
			if (fileResource == null) {
				System.err.print("File " + "\"" + fileName + "\"" + " not found!");
				return null;
			}
			
			return Files.readAllLines(Paths.get(fileResource.toURI()));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
}
