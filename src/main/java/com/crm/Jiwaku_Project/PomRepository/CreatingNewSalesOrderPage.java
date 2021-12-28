package com.crm.Jiwaku_Project.PomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.Jiwaku_Project_Genericutils.ExcelUtility;
import com.crm.Jiwaku_Project_Genericutils.JavaUtility;
import com.crm.Jiwaku_Project_Genericutils.WebDriverUtility;

public class CreatingNewSalesOrderPage {

	public  CreatingNewSalesOrderPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	ExcelUtility elib=new ExcelUtility();
	WebDriverUtility wlib=new WebDriverUtility();
	@FindBy(name = "subject")
	private WebElement Subject;
	
	@FindBy(xpath = "//input[@id='single_accountid']/following-sibling::img[@src='themes/softed/images/select.gif']")
	private WebElement OrgNameIcon;
	
	@FindBy(xpath = "//img[@title='Products']")
	private WebElement ItemName;
	
	@FindBy(name = "button")
	private WebElement SaveBtn;
	
	@FindBy(xpath = "//textarea[@class='detailedViewTextBox' and @name='bill_street']")
	private WebElement BillingAddress;

	@FindBy(xpath = "//input[@onclick='return copyAddressRight(EditView)']")
	private WebElement CopyBillingAddress;
	
	@FindBy(xpath = "//input[@class='detailedViewTextBoxOn' and @name='qty1']")
	private WebElement Qty;
	
	public void createSalesOrder(String subject) {
		Subject.sendKeys(subject);
	}

	public WebElement getSubject() {
		return Subject;
	}

	public WebElement getOrgNameIcon() {
		return OrgNameIcon;
	}

	public WebElement getItemName() {
		return ItemName;
	}

	public WebElement getSaveBtn() {
		return SaveBtn;
	}
	
	public WebElement getCopyBillingAddress() {
		return CopyBillingAddress;
	}
	
	public WebElement getQty() {
		return Qty;
	}
	
	
	public void createSalesOrder(WebDriver driver) throws Throwable {
		String Sub = elib.getExcelData("Jiwaku_Project", 1, 1);
		Subject.sendKeys(Sub+JavaUtility.getRandomData());
		OrgNameIcon.click();
		wlib.switchToWindow(driver, "Accounts&action");
		Organization org=new Organization(driver);
		org.getOrgSearchBox().sendKeys("wipro");
		org.getSearchBtn().click();
		org.getWipro().click();
		wlib.waitUntilPageLoad(driver);
		wlib.acceptAlert(driver);
					
	}
	
	public void selectItem(WebDriver driver) throws Throwable {
		wlib.waitUntilPageLoad(driver);
		wlib.switchToWindow(driver, "SalesOrder&action");
		Thread.sleep(5000);
		ItemName.click();
		Thread.sleep(9000);
		wlib.switchToWindow(driver, "Products&action");
		ProductsPage prdpg=new ProductsPage(driver);
		//String itmName = elib.getExcelData("Jiwaku_Project", 1, 2);
		prdpg.getProSearchBox().sendKeys("LENEVO");
		prdpg.getProSearchBtn().click();
		wlib.waitUntilPageLoad(driver);
		prdpg.getLENEVO().click();
		Thread.sleep(5000);
		wlib.switchToWindow(driver, "SalesOrder&action");
		SaveBtn.click();
		wlib.acceptAlert(driver);
			}
	
	public void provideMandatoryFields(WebDriver driver) throws Throwable {
		String address = elib.getExcelData("Jiwaku_Project", 1, 3);
		wlib.waitUntilPageLoad(driver);
		BillingAddress.sendKeys(address);
		CopyBillingAddress.click();
		SaveBtn.click();
		wlib.acceptAlert(driver);
	}
	
	public void provideQty(WebDriver driver) throws Throwable {
		wlib.waitUntilPageLoad(driver);
		String qtyNo = elib.getExcelData("Jiwaku_Project", 1, 3);
		Qty.sendKeys(qtyNo);
		SaveBtn.click();	
	}
}
