package com.crm.Jiwaku_Project.PomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage {

	public ProductsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@class='txtBox' and @name='search_text']")
	private WebElement proSearchBox;
	
	@FindBy(xpath = "//input[@class='crmbutton small create' and @name='search']")
	private WebElement proSearchBtn;
	
	@FindBy(xpath = "//a[text()='LENEVO' and @id='popup_product_28']")
	private WebElement LENEVO;

	public WebElement getProSearchBox() {
		return proSearchBox;
	}

	public WebElement getProSearchBtn() {
		return proSearchBtn;
	}

	public WebElement getLENEVO() {
		return LENEVO;
	}
	
}
