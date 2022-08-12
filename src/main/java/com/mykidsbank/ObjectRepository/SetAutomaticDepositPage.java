package com.mykidsbank.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SetAutomaticDepositPage {
	@FindBy(xpath="//span[@title=\"Click to specify no ending date.\"]")
	private WebElement noEndDate;
	@FindBy(xpath="//tbody/descendant::input[@value=\"2\"]")
	private WebElement selectEndOfEachMonth;
	@FindBy(xpath="//input[@title=\"Enter amount to deposit\"]")
	private WebElement enterAmount;
	@FindBy(xpath="//span[contains(text(),\"select\")]")
	private WebElement selectAllBtn;
	@FindBy(xpath="//input[@name=\"trans_auto_description\"]")
	private WebElement enterDescription;
	@FindBy(xpath="//span[text()=\"Submit\"]")
	private WebElement submitBtn;
	public SetAutomaticDepositPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void setAutomaticDeposit(String amount,String description) {
		this.noEndDate.click();
		this.selectEndOfEachMonth.click();
		this.enterAmount.sendKeys(amount);
		this.enterDescription.sendKeys(description);
		this.selectAllBtn.click();
		this.submitBtn.click();
		
	}
}
