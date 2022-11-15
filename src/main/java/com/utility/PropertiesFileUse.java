package com.utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class PropertiesFileUse {

	
 public static String propertiesData (String value) throws IOException {
		
		Properties prop = new Properties();
	     
 FileInputStream  fis = new FileInputStream(System.getProperty("user.dir") + "/src/main/java/com/testData/pepperstone.properties");
	     
		 prop.load(fis);
		     
		return prop.getProperty(value);
 
	     
	  
	     
	     
	}
}
