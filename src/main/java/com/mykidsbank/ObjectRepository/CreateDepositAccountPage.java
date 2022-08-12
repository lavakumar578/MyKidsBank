package com.mykidsbank.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateDepositAccountPage {
	@FindBy(xpath="//input[@name=\"fullname\"]")
	private WebElement displayName;
	@FindBy(xpath="//td[text()=\"Login username:\"]/../td/input[@name=\"username\"]")
	private WebElement loginName;
	@FindBy(xpath="//input[@name=\"password1\"]")
	private WebElement loginPassword;
	@FindBy(xpath="//table[@id=\"table_account_list\"]/descendant::tr/td[text()]")
	private WebElement validateDepositAccount;
	@FindBy(xpath="//span[text()=\"Submit\"]")
	private WebElement submitbtn;
	public CreateDepositAccountPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void createDepositAccountDetails(String displayName,String loginName,String loginPassword ) {
		this.displayName.sendKeys(displayName);
		this.loginName.sendKeys(loginName);
		this.loginPassword.sendKeys(loginPassword);
		this.submitbtn.click();
	}

	
}
