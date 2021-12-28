package com.actitime.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActTimeLoginPage {
	public ActTimeLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(name = "username")
	private WebElement untbx;
	
	@FindBy(name = "pwd")
	private WebElement pwdtbx;
	
	@FindBy(xpath = "//div[.='Login ']")
	private WebElement lgbtn;

	public WebElement getUntbx() {
		return untbx;
	}

	public WebElement getPwdtbx() {
		return pwdtbx;
	}

	public WebElement getLgbtn() {
		return lgbtn;
	}
	
	public void loginToActiTime(String username, String password) {
		untbx.sendKeys(username);
		pwdtbx.sendKeys(password);
		lgbtn.click();
	}
		
}
