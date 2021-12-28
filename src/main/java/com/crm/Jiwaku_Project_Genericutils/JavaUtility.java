package com.crm.Jiwaku_Project_Genericutils;

import java.util.Date;
import java.util.Random;

public class JavaUtility {
	/**
	 * @author Jyoti H M
	 * generic method to read random data
	 * @return
	 */
	public static String getRandomData()
	{
		Random random= new Random();
		int r = random.nextInt(1000);
		return ""+r;
	}
	
	/**
	 * @author Jyoti H M
	 * Generic method for Current Date
	 */
	public static String getCurrentDate()
	{
		Date date=new Date();
		String currentdate = date.toString().replace(":", "_").replace(" ", "_");
		return currentdate;
	}
	
	
}
