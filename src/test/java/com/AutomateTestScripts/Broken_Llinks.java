package com.AutomateTestScripts;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Broken_Llinks {
	WebDriver driver;
	@Test
	public void Broken_LlinksTest() throws MalformedURLException, IOException {
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		List<WebElement> Links = driver.findElements(By.xpath("//a"));
		for(WebElement ele:Links)
		{
			String url = ele.getAttribute("href");
			HttpURLConnection http=(HttpURLConnection) new URL(url).openConnection();

			http.connect();
			int statusCode = http.getResponseCode();

			if(statusCode>=400) {
				System.out.println("Broken url:"+url+" Satus code:"+statusCode);
			}
			else {
				System.out.println("Valid url:"+url+" Satus code:"+statusCode);
			}

		}

		driver.quit();
	}

}
