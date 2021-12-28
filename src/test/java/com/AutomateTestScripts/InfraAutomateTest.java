package com.AutomateTestScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import junit.framework.Assert;

public class InfraAutomateTest {
	/**
	 * @author Jyoti H M
	 */
	@Test
	public void infraAutomateTest() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://infra.market/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String expTitle="Infra.Market";
		String title = driver.getTitle();
		if(title.contains("Infra.Market"))
		{
			System.out.println(title);
		}
		String actTitle="Infra.Market | Re-Building Construction";
		SoftAssert s=new SoftAssert();
		s.assertEquals(title, actTitle);
		s.assertAll();
		
		/*String text = driver.findElement(By.id("main-menu")).getText();
		System.out.println(text);
		driver.close();*/
	}
}
