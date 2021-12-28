package com.crm.Jiwaku_Project.PomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Organization {

	public Organization(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@name='search_text']")
	private WebElement orgSearchBox;

	@FindBy(name = "search")
	private WebElement searchBtn;

	@FindBy(id = "TYSS125")
	private WebElement OrgName;
	 
	@FindBy(linkText = "Wipro")
	private WebElement Wipro;

	public WebElement getOrgSearchBox() {
		return orgSearchBox;
	}

	public WebElement getSearchBtn() {
		return searchBtn;
	}

	public WebElement getOrgName() {
		return OrgName;
	}


	public WebElement getWipro() {
		return Wipro;
	}

}
