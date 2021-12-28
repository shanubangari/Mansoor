package com.crm.Jiwaku_Project.PomRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.Jiwaku_Project_Genericutils.ExcelUtility;
import com.crm.Jiwaku_Project_Genericutils.JavaUtility;
import com.crm.Jiwaku_Project_Genericutils.WebDriverUtility;

public class CreatingNewContactPage {

	WebDriverUtility wlib=new WebDriverUtility();
	ExcelUtility elib=new ExcelUtility();

	public CreatingNewContactPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//input[@class='detailedViewTextBox' and @name='lastname']")
	private WebElement lastame;

	@FindBy(xpath = "//input[@name='account_name']/following-sibling::img")
	private WebElement OrgIcon;

	@FindBy(xpath = "//select[@name='leadsource']")
	private WebElement LeadSource;
	
	@FindBy(xpath = "//input[@class='crmbutton small save']")
	private WebElement saveBtn;

	public WebElement getSaveBtn() {
		return saveBtn;
	}


	public WebElement getLastame() {
		return lastame;
	}

	public WebElement getOrgIcon() {
		return OrgIcon;
	}

	public WebElement getLeadSource() {
		return LeadSource;
	}

	public WebElement getEmailOptOut() {
		return EmailOptOut;
	}
	@FindBy(xpath = "//input[@name='emailoptout']")
	private WebElement EmailOptOut;

	@FindBy(xpath = "//input[@class='crmbutton small save']")
	private WebElement save;

	public WebElement getSave() {
		return save;
	}
	@FindBy(xpath = "//a[@href='javascript:window.close();' and text()='TYSS125']")
	private WebElement OrgName;

	public WebElement getOrgName() {
		return OrgName;
	}

	public void selectOrgWipro(WebDriver driver) throws Throwable {
		
		
		String lstname = elib.getExcelData("Sheet1", 1, 1);
		
		CreatingNewContactPage conCreate=new CreatingNewContactPage(driver);
		conCreate.getLastame().sendKeys(lstname+JavaUtility.getRandomData());
		getOrgIcon().click();
		wlib.waitUntilPageLoad(driver);
		wlib.switchToWindow(driver, "Accounts&action");
		wlib.waitUntilPageLoad(driver);
		Organization org=new Organization(driver);
		org.getOrgSearchBox().sendKeys("TY");
		org.getSearchBtn().click();
		driver.findElement(By.xpath("//a[text()='TYSS125']")).click();
		wlib.switchToWindow(driver, "Contacts&action");
		saveBtn.click();
		
	}



}
