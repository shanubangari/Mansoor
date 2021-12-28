package com.AutomateTestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.actitime.pomrepository.ActTimeHomePage;
import com.actitime.pomrepository.ActTimeLoginPage;
import com.crm.Jiwaku_Project_Genericutils.FileUtility;
import com.crm.Jiwaku_Project_Genericutils.WebDriverUtility;

public class LoginActiTimeApplnWithMultipleDataTest {
	/**
	 * @author Jyoti H M
	 * Login to Acti Time application with multiple data using Data Provider.
	 */
	//Step2: Object creation of WebDriver, FileUtility & WebDriverUtility with Global.
	WebDriver driver;
	FileUtility flib=new FileUtility();
	WebDriverUtility wlib=new WebDriverUtility();

	//Step3: Provide dataPriverserMethod name as an argument in @Test annotation.

	@Test(dataProvider = "dataProviderMethod")

	public void loginActiTimeApplnWithMultipleDataTest(String un, String pw) throws Throwable {

		//Step3: ChromeDriver Upcast with WebDriver to launching chrome browser. 
		driver=new ChromeDriver();

		//Step4: Maximize the window.
		wlib.maximizeWindow(driver);

		//Step5: Read the data from property file, asper the rule automation data should not be hardcode, 
		//also to achieve code reusability & code optimization.
		String url = flib.getPropertyData("actiUrl");
		driver.get(url);

		//Step6: Create an Object of POM Class and call the business logic to login the application.
		ActTimeLoginPage actLgPg=new ActTimeLoginPage(driver);
		actLgPg.loginToActiTime(un, pw);		
		
		//Step7: Wait until home page load.
		wlib.waitUntilPageLoad(driver);

		//Step8: Create an Object of POM Class and call the business logic to logout from application.
		ActTimeHomePage actHome=new ActTimeHomePage(driver);
		actHome.logoutFromActiTime();
		
		//Step9: Close the browser.
		driver.quit();
	}

	//Step1: Create an method of dataProvider using @DataProvider annotation to login the Acti Time application with multiple data 
	//or Execute the same Test script with set of different values.

	//Q. Why Object[][]? 
	//Ans:- With help of Object[][] we can store any type of data(int, String, decimal, float..etc)

	@DataProvider
	public Object[][] dataProviderMethod() {
		Object[][] obj=new Object[2][2];
		obj[0][0]="admin1";
		obj[0][1]="manager1";

		obj[1][0]="admin";
		obj[1][1]="manager";
	
		return obj;

	}
}
