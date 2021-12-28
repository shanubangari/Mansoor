package com.crm.Jiwaku_Project.PomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Contacts {
	public Contacts(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath = "//img[@alt='Create Contact...']")
	private WebElement CreateContactIcon;
	
	@FindBy(xpath = "//a[text()='Jyoti H M']")
	private WebElement resourceJHM;

	public WebElement getCreateContactIcon() {
		return CreateContactIcon;
		
	}

	public void createContact() {
		CreateContactIcon.click();	
	}
	
	public void selectResourceJHM() {
		resourceJHM.click();	
	}

	public WebElement getResourceJHM() {
		return resourceJHM;
	}
	
}
