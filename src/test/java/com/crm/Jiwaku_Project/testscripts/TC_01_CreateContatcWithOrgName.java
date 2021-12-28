package com.crm.Jiwaku_Project.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.crm.Jiwaku_Project.PomRepository.ContactInformation;
import com.crm.Jiwaku_Project.PomRepository.Contacts;
import com.crm.Jiwaku_Project.PomRepository.CreatingNewContactPage;
import com.crm.Jiwaku_Project.PomRepository.HomePage;
import com.crm.Jiwaku_Project.PomRepository.LoginPage;
import com.crm.Jiwaku_Project.PomRepository.Organization;
import com.crm.Jiwaku_Project_Genericutils.ExcelUtility;
import com.crm.Jiwaku_Project_Genericutils.FileUtility;
import com.crm.Jiwaku_Project_Genericutils.WebDriverUtility;

public class TC_01_CreateContatcWithOrgName {

	FileUtility flib=new FileUtility();
	ExcelUtility elib=new ExcelUtility();
	WebDriverUtility wlib=new WebDriverUtility();

	@Test
	public void tC_01_CreateContatcWithOrgNameTest() throws Throwable {
		WebDriver driver=new ChromeDriver();
		//SoftAssert softAsst=new SoftAssert();
		//Step 1: Object creation to fetch the data from FileUtility. 
		HomePage hmPg=new HomePage(driver);

		String url = flib.getPropertyData("url");
		String un=flib.getPropertyData("username");
		String pw=flib.getPropertyData("password");
		driver.get(url);

		//Step 2:Login to application with username, password & click on Login button.
		LoginPage lgnpg=new LoginPage(driver);
		lgnpg.LoginToApp(un, pw);

		//Step 3: Click on Contacts module its navigate to Contacts List page.
		hmPg.clickOnContacts();

		//Step 4: Click on Create Contact option('+' icon to creating new contact), its navigate to Creating New Contact page.
		Contacts con=new Contacts(driver);
		con.createContact();

		//Step 5: Creating New Contact with mandatory fields.
		CreatingNewContactPage conCreate=new CreatingNewContactPage(driver);
		//conCreate.createNewContactwithOrg(driver);		

	/* //Step 6: Verify the Name of the Contact using text using SoftAssert stmt.
		wlib.waitUntilPageLoad(driver);
		String expectedText="Jyoti";
		ContactInformation conInfor=new ContactInformation(driver);
		String actualText = conInfor.getContactInfo().getText();
		System.out.println(actualText);
		softAsst.assertSame(actualText, expectedText); */
		

		//Step 7: Logout from application.
		hmPg.LogoutFromApp(driver);

		//Step 8: Close the browser.
		driver.close();
		//softAsst.assertAll();
	}
}
