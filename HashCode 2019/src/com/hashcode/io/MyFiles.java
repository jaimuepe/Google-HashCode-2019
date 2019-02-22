package com.hashcode.io;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class MyFiles {

	public static List<String> read(String fileName) {
		
		try {
			return Files.readAllLines(Paths.get(MyFiles.class.getClassLoader().getResource(fileName).toURI()));
		} catch (IOException | URISyntaxException e) {
			e.printStackTrace();
		}
		
		return null;
	}
}
