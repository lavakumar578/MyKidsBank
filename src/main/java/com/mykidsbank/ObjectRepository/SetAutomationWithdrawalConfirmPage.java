package com.mykidsbank.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SetAutomationWithdrawalConfirmPage {
	@FindBy(xpath="//span[text()=\"Submit\"]")
	private WebElement submitBtn;
	
	public SetAutomationWithdrawalConfirmPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void confirmWithdraw() {
		this.submitBtn.click();
	}
}
