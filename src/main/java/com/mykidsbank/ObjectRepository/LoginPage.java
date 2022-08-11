package com.mykidsbank.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(xpath="//input[@name=\"username\"]")
	private WebElement userNameTxt;
	
	@FindBy(xpath="//input[@type=\"password\"]")
	private WebElement passwordTxt;
	
	@FindBy(xpath="//span[text()=\"Submit\"]")
	private WebElement submitBtn;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void login(String username,String password) {
		this.userNameTxt.sendKeys(username);
		this.passwordTxt.sendKeys(password);
		this.submitBtn.click();
	}
}
