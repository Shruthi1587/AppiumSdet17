package com.appium.GenericUtils;

import java.io.FileInputStream;
import java.util.Properties;



public class ReadDCfromPropertyfile {
	
	
	public String readDataFromPropertyFile(String key) throws Throwable
	{
		FileInputStream file = new FileInputStream("/AppiumSDET17/Data/dataCapabilities.properties");
		Properties prop = new Properties();
		prop.load(file);
		String value=prop.getProperty(key);
		return value;
			
	}

}
