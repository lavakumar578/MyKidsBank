package com.mykidsbank.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MakeAWithdrawalFromOneOrMoreAccountsPage {

	@FindBy(xpath="//input[@name=\"desc\"]")
	private WebElement enterDescription;
	
	@FindBy(xpath="//input[@name=\"amount\"]")
	private WebElement enterAmount;
	
	@FindBy(xpath="//table[@class=\"no_select_class\"]/tbody/tr/td[contains(text(),\"niraj\")]")
	private WebElement nAccount;
	
	@FindBy(xpath="//span[text()=\"Select account holder(s) :\"]/..//span[@class=\"white_submit_button_class\"]")
	private WebElement selectAllBtn;
	@FindBy(xpath="//span[text()=\"Submit\"]")
	private WebElement submitBtn;
	public MakeAWithdrawalFromOneOrMoreAccountsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void makeAWithdrawalToAllAccounts(String description,String amount) {
		this.enterDescription.sendKeys(description);
		this.enterAmount.sendKeys(amount);
		this.selectAllBtn.click();
		this.submitBtn.click();
	}
	public void makeAWithDraw(String description,String amount)
	{
		this.enterDescription.sendKeys(description);
		this.enterAmount.sendKeys(amount);
		this.nAccount.click();
	}
}
