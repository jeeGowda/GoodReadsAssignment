package com.goodreads.genericutility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class FileUtility {
	public String readDataFromProperty(String key) throws Throwable {
		FileInputStream fis = new FileInputStream("./src/test/resources/goodreads.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String value = prop.getProperty(key);
		return value;
	}
}
