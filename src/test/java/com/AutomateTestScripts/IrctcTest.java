package com.AutomateTestScripts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class IrctcTest {
@Test
public void test() {
	ChromeOptions opt=new ChromeOptions();
	opt.addArguments("--disable-notifications");
	WebDriver driver=new ChromeDriver(opt);
	driver.get("https://www.irctc.co.in/");
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//button[@type='submit' and @class='btn btn-primary']")).click();
	driver.findElement(By.xpath("//input[@class='ng-tns-c58-8 ui-inputtext ui-widget ui-state-default ui-corner-all ui-autocomplete-input ng-star-inserted']")).sendKeys("HYD");
	driver.findElement(By.xpath("//span[.='HYDERABAD DECAN - HYB' and @class='ng-star-inserted']")).click();
	driver.findElement(By.xpath("//input[@class='ng-tns-c58-9 ui-inputtext ui-widget ui-state-default ui-corner-all ui-autocomplete-input ng-star-inserted']")).sendKeys("BENG");
	driver.findElement(By.xpath("//span[text()='KSR BENGALURU - SBC']")).click();
	//WebElement element = driver.findElement(By.xpath("//ul[@class='ui-dropdown-items ui-dropdown-list ui-widget-content ui-widget ui-corner-all ui-helper-reset ng-tns-c66-12']"));
	driver.findElement(By.xpath("//span[@class='ng-tns-c66-12 ui-dropdown-label ui-inputtext ui-corner-all ng-star-inserted']")).click();
	driver.findElement(By.xpath("//span[.='TATKAL']")).click();
	//driver.findElement(By.xpath("//input[@class='css-checkbox ng-untouched ng-pristine ng-valid' and @id='passBooking']")).click();
	WebElement date = driver.findElement(By.xpath("//input[@class='ng-tns-c59-10 ui-inputtext ui-widget ui-state-default ui-corner-all ng-star-inserted']"));
	date.click();
	date.sendKeys("20/12/2021");
	
	driver.findElement(By.linkText("Search")).click();
	
	
	
	driver.close();
	
	
	
}
}
