package com.crm.Jiwaku_Project.PomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatingNewQuote {

	public CreatingNewQuote(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@class='crmbutton small save']")
	private WebElement saveBtn;
	
	public WebElement getsaveBtn() {
		return saveBtn;
	}
}
