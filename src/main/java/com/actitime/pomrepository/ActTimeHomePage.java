package com.actitime.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActTimeHomePage {

	public ActTimeHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[.='Logout']")
	private WebElement Logout;
	
	public WebElement getLogout() {
		return Logout;
	}
	
	public void logoutFromActiTime() {
		Logout.click();
	}
	
}
