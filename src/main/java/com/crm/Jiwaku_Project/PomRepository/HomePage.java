package com.crm.Jiwaku_Project.PomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.Jiwaku_Project_Genericutils.WebDriverUtility;

public class HomePage {
	WebDriverUtility wlib=new WebDriverUtility();
public HomePage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

@FindBy(linkText = "Contacts")
private WebElement Contacts;

public WebElement getContacts() {
	return Contacts;
}
public WebElement getAdminstrator() {
	return adminstrator;
}
public void clickOnContacts() {
	Contacts.click();
}

@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")
private WebElement adminstrator;

@FindBy(xpath = "//a[text()='Sign Out']")
private WebElement SignOut;

public WebElement getSignOut() {
	return SignOut;
}

public void LogoutFromApp(WebDriver driver) {
	wlib.mouseHover(driver, adminstrator);
	SignOut.click();
}


}
