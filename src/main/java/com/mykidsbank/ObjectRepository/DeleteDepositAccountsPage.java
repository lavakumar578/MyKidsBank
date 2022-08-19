package com.mykidsbank.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mykidsbank.genericUtlity.BaseClass;
import com.mykidsbank.genericUtlity.DriverUtility;
import com.mykidsbank.genericUtlity.XlsxUtility;

public class DeleteDepositAccountsPage extends BaseClass {

	@FindBy(xpath="//span[contains(text(),\"select\")]")
	private WebElement selectAllBtn;
	
	@FindBy(xpath="//span[text()=\"Submit\"]")
	private WebElement submitBtn;
	public DeleteDepositAccountsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void deleteAllSelectedAccounts() {
		this.selectAllBtn.click();
		this.submitBtn.click();
	}
}
