package com.crm.Jiwaku_Project_Genericutils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {
/**
 * generic method to read data from property file
 * @author Jyoti H m
 * @param key
 * @return 
 * @throws Throwable 
 * 
 */
	public String getPropertyData(String key) throws Throwable {
		
		FileInputStream fis=new FileInputStream(IPathConstant.PROPERTY_FILEPATH);
		Properties p=new Properties();
		p.load(fis);
		String v=p.getProperty(key);
		return v;
	}
	
	
	
}
