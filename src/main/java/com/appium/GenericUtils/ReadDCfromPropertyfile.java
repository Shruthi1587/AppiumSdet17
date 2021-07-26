package com.appium.GenericUtils;

import java.io.FileInputStream;
import java.util.Properties;



public class ReadDCfromPropertyfile {
	/*
	 * This method reads data from dataCapablities.properties file
	 * @param key
	 * @author shruthi
	 * 
	 */
	
	
	public String readDataFromPropertyFile(String key) throws Throwable
	{
		FileInputStream file = new FileInputStream("./AppiumSDET17/Data/dataCapabilities.properties");
		Properties prop = new Properties();
		prop.load(file);
		String value=prop.getProperty(key);
		return value;
			
	}

}
