package com.AutomateTestScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.crm.Jiwaku_Project.PomRepository.Contacts;
import com.crm.Jiwaku_Project.PomRepository.HomePage;
import com.crm.Jiwaku_Project.PomRepository.LoginPage;
import com.crm.Jiwaku_Project_Genericutils.ExcelUtility;
import com.crm.Jiwaku_Project_Genericutils.FileUtility;
import com.crm.Jiwaku_Project_Genericutils.WebDriverUtility;

public class Class {
	FileUtility flib=new FileUtility();
	ExcelUtility elib=new ExcelUtility();
	WebDriverUtility wlib=new WebDriverUtility();
	@Test
	public void classtest() throws Throwable {
		WebDriver driver=new ChromeDriver();
		HomePage hmPg=new HomePage(driver);

		String url = flib.getPropertyData("url");
		String un=flib.getPropertyData("username");
		String pw=flib.getPropertyData("password");
		driver.get(url);


		LoginPage lgnpg=new LoginPage(driver);
		lgnpg.LoginToApp(un, pw);

		hmPg.clickOnContacts();
		Contacts con=new Contacts(driver);
		con.getCreateContactIcon();

	}
}
