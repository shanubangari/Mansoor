package com.crm.Jiwaku_Project.PomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.Jiwaku_Project_Genericutils.WebDriverUtility;

public class ContactInformation {
	WebDriverUtility wlib=new WebDriverUtility();
	public ContactInformation(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath ="//span[text()='[ CON5 ] Jyoti943  -  Contact Information']" )
	private WebElement contactInfo;

	public WebElement getContactInfo() {
		return contactInfo;
	}
	
	@FindBy(xpath ="//a[text()='More Information']" )
	private WebElement MoreInformation;
	
	public WebElement getMoreInformation() {
		return MoreInformation;
	}
	
	public void moveToMoreInformation(WebDriver driver) {
		wlib.mouseHover(driver, MoreInformation);
		
	}
	
}
