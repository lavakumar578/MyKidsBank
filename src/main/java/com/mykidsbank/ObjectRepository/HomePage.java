package com.mykidsbank.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	@FindBy(xpath="//span[text()=\"LOG OFF\"]")
	private WebElement signoutBtn;
	@FindBy(xpath="//span[contains(text(),\"Create a new deposit account\")]")
	private WebElement createDepositAccountLink;
	@FindBy(xpath="//span[contains(text(),\"Import deposit accounts\")]")
	private WebElement importDepositAccountsLink;
	@FindBy(xpath="//span[contains(text(),\"Delete one or more accounts\")]")
	private WebElement deleteDepositAccountsLink;
	@FindBy(xpath="//span[text()=\"Update\"]")
	private WebElement updateBtn;
	@FindBy(xpath="//span[contains(text(),\"Make a deposit into one or more accounts\")]")
	private WebElement makeDepositIntoAccount;
	@FindBy(xpath="//span[contains(text(),\"Make a withdrawal from one or more accounts\")]")
	private WebElement makeWithdrawalIntoAccount;
	@FindBy(xpath="//span[contains(text(),\"Set automatic interest for one or more accounts\")]")
	private WebElement setAutomaticInterest;
	@FindBy(xpath="//span[contains(text(),\"Set automatic deposit amount for one or more accounts\")]")
	private WebElement setAutomaticDeposit;
	@FindBy(xpath="//span[contains(text(),\"Set automatic withdrawal amount for one or more accounts\")]")
	private WebElement setAutomaticWithdrawal;
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void signout() {
		this.signoutBtn.click();
	}
	public void createDepositAccount() {
		this.createDepositAccountLink.click();
	}
	public void importDepositAccounts() {
		this.importDepositAccountsLink.click();
	}
	public void deleteDepositAccounts() {
		this.deleteDepositAccountsLink.click();
	}
	public void updateChanges() {
		this.updateBtn.click();
	}
	public void makeADepositIntoAccount() {
		this.makeDepositIntoAccount.click();
	}
	public void makeAWithdrawalIntoAccount() {
		this.makeWithdrawalIntoAccount.click();
	}
	public void setAutomaticInterest() {
		this.setAutomaticInterest.click();
	}
	public void setAutomaticDeposit() {
		this.setAutomaticDeposit.click();
	}
	public void setAutomationWithdrawal() {
		this.setAutomaticWithdrawal.click();
	}
}
