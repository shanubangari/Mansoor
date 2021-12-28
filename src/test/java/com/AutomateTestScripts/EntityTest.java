package com.AutomateTestScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class EntityTest {
@Test
public void entityTest() throws Throwable {
	WebDriver driver=new ChromeDriver();
	driver.get("https://ee.co.uk/");
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.switchTo().frame(0);
	WebElement manage = driver.findElement(By.xpath("//a[text()='Manage cookie settings' and @class='shp']"));
	manage.click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//a[.='Reject all' and @class='declineAllButtonLower']")).click();
	
	Thread.sleep(5000);
	driver.findElement(By.xpath("//a[.='Close' and @class='close']")).click();
	driver.close(); 
}
}
