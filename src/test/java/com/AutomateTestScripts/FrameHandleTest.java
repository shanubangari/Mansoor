package com.AutomateTestScripts;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FrameHandleTest {
	WebDriver driver;
@Test
public void frameHandleTest() {
	driver=new ChromeDriver();
	driver.get("file:///C:/Users/PC/Desktop/Page1.html");
	driver.switchTo().frame(0);
	driver.findElement(By.id("t2")).sendKeys("jyoti");
}
}
