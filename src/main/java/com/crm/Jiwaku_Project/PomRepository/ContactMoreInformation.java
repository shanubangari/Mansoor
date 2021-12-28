package com.crm.Jiwaku_Project.PomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactMoreInformation {
	
	public ContactMoreInformation(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[text()='Quotes' and @class='drop_down']")
	private WebElement Quotes;
	
	public WebElement getQuotes() {
		return Quotes;
	}

	@FindBy(xpath = "//input[@class='crmbutton small create']")
	private WebElement addQuotes;
	
	@FindBy(xpath = "//a[text()='Sales Order' and @class='drop_down']")
	private WebElement SalesOrder;
	
	@FindBy(xpath = "//input[@class='crmbutton small create']")
	private WebElement addSalesOrder;
	
	public WebElement getaddQuotes() {
		return addQuotes;
	}
	
	public WebElement getSalesOrder() {
		return SalesOrder;
	}
	
	public WebElement getaddSalesOrder() {
		return addSalesOrder;
	}
	
}
