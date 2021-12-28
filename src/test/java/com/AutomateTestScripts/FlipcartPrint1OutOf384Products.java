package com.AutomateTestScripts;

import java.awt.event.KeyEvent;
import java.util.LinkedHashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import net.bytebuddy.asm.Advice.Enter;

public class FlipcartPrint1OutOf384Products {
	WebDriver driver;
	@Test
	public void flipcartPrint1OutOf384ProductsTest() throws InterruptedException {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.name("q")).sendKeys("iphones");
		driver.findElement(By.xpath("//*[name()='svg']")).click();
		Thread.sleep(3000);
		List<WebElement> title = driver.findElements(By.xpath("//div[contains(text(),'iPhone')]"));
		int count=title.size();
		for(int i=0; i<count; i++) {
			String text = title.get(i).getText();
			System.out.println(text);
		}
		
		
		//driver.close();
	}

}
