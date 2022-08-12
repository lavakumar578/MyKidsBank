package com.mykidsbank.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteDepositAccountsPage {

	@FindBy(xpath="//span[@id=\"check_uncheck_boxes_id\"]")
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
