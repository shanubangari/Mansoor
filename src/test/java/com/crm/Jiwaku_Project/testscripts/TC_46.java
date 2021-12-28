package com.crm.Jiwaku_Project.testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.crm.Jiwaku_Project.PomRepository.ContactInformation;
import com.crm.Jiwaku_Project.PomRepository.ContactMoreInformation;
import com.crm.Jiwaku_Project.PomRepository.Contacts;
import com.crm.Jiwaku_Project.PomRepository.CreatingNewQuote;
import com.crm.Jiwaku_Project.PomRepository.HomePage;
import com.crm.Jiwaku_Project.PomRepository.LoginPage;
import com.crm.Jiwaku_Project_Genericutils.ExcelUtility;
import com.crm.Jiwaku_Project_Genericutils.FileUtility;
import com.crm.Jiwaku_Project_Genericutils.WebDriverUtility;

public class TC_46 {
	FileUtility flib=new FileUtility();
	ExcelUtility elib=new ExcelUtility();
	WebDriverUtility wlib=new WebDriverUtility();
	
	@Test
	public void createQuoteUnderMoreInformationWithOutMandatoryFieldsTest() throws Throwable {
		WebDriver driver=new ChromeDriver();
		//SoftAssert softAsst=new SoftAssert();
		//Step 1: Object creation to fetch the data from FileUtility. 
		HomePage hmPg=new HomePage(driver);

		String url = flib.getPropertyData("url");
		String un=flib.getPropertyData("username");
		String pw=flib.getPropertyData("password");
		driver.get(url);
		//Step2: Login to application.
		LoginPage lgnPg=new LoginPage(driver);
		lgnPg.LoginToApp(un, pw);
		
		//Step3: Click on Contacts module in Home page.
		HomePage hmPage=new HomePage(driver);
		hmPage.clickOnContacts();
		
		//Step4: Navigate to Contacts page, click on Create Contact option('+'). 
		Contacts con=new Contacts(driver);
		con.selectResourceJHM();
		
		//Step5: 
		ContactInformation conInfrm=new ContactInformation(driver);
		conInfrm.moveToMoreInformation(driver);
		
		ContactMoreInformation conMoreInfo=new ContactMoreInformation(driver);
		conMoreInfo.getQuotes().click();
		wlib.waitUntilPageLoad(driver);
		conMoreInfo.getaddQuotes().click();
		
		CreatingNewQuote addQuoute=new CreatingNewQuote(driver);
		addQuoute.getsaveBtn().click();
		wlib.acceptAlert(driver);
		wlib.waitUntilPageLoad(driver);
		hmPage.LogoutFromApp(driver);
		
		
		driver.quit();
	}

}
