package com.AutomateTestScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class MethodOverLoading {
	WebDriver driver;
	WebElement element;
	Actions action=new Actions(driver);
	@Test 
	public void achieveMethodOverloadTest() {
		rightClick();
		rightClick(element);
	}
	
	
	public void rightClick() {
		action.contextClick();
	}


	public void rightClick(WebElement element) {
		action.contextClick(element);
	}
	
	


}


