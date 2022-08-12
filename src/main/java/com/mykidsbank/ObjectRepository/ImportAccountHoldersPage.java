package com.mykidsbank.ObjectRepository;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ImportAccountHoldersPage {
	@FindBy(xpath="//input[@type=\"file\"]")
	private WebElement chooseFileBtn;
	
	@FindBy(xpath="//span[text()=\"Submit\"]")
	private WebElement submitBtn;
	
	@FindBy(xpath="//span[text()=\"Submit\"]")
	private WebElement finalSubmitBtn;
	public ImportAccountHoldersPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void importAccountHolders(String accountsFilePath)
	{
		this.chooseFileBtn.sendKeys(accountsFilePath);
		this.finalSubmitBtn.click();
	}
	public void submit() {
		this.submitBtn.click();
	}
}
