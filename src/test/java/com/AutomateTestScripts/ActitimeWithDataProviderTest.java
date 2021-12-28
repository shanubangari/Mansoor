package com.AutomateTestScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.actitime.pomrepository.ActTimeHomePage;
import com.actitime.pomrepository.ActTimeLoginPage;
import com.crm.Jiwaku_Project_Genericutils.FileUtility;
import com.crm.Jiwaku_Project_Genericutils.WebDriverUtility;

public class ActitimeWithDataProviderTest {
	WebDriver driver;
	FileUtility flib=new FileUtility();
	WebDriverUtility wlib=new WebDriverUtility();
	
@Test
public void actitimeWithDataProviderTest() throws Throwable {
	driver=new ChromeDriver();
	wlib.maximizeWindow(driver);
	String url = flib.getPropertyData("actiUrl");
	String un = flib.getPropertyData("actiUsername");
	String pw = flib.getPropertyData("actiPassword");
	driver.get(url);
	ActTimeLoginPage actLgPg=new ActTimeLoginPage(driver);
	actLgPg.loginToActiTime(un, pw);
	wlib.waitUntilPageLoad(driver);
	ActTimeHomePage actHm=new ActTimeHomePage(driver);
	actHm.logoutFromActiTime();
	
	driver.close();
	
	
}
}
