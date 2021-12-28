package com.AutomateTestScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import com.crm.Jiwaku_Project.PomRepository.LoginPage;
import com.crm.Jiwaku_Project_Genericutils.ExcelUtility;
import com.crm.Jiwaku_Project_Genericutils.FileUtility;

public class DataProvider {
	WebDriver driver;
	FileUtility flib=new FileUtility();
	
	
@Test(dataProvider = "diffData")
public void dataProviderTest() throws Throwable {
	driver=new ChromeDriver();
	driver.get("http://localhost:8888");
	String un = flib.getPropertyData("username");
	String pw = flib.getPropertyData("password");
	LoginPage lgpg=new LoginPage(driver);
	lgpg.LoginToApp(un, pw);
	
	
}

@org.testng.annotations.DataProvider
public Object[][] diffData() {
	Object[][] obj=new Object[2][3];
	obj[0][0]="admin1";
	obj[0][1]="admin1";
	
	obj[1][0]="admin2";
	obj[1][1]="admin2";
	
	obj[2][0]="admin3";
	obj[2][2]="admin3";
	return obj;
	
} 

}
