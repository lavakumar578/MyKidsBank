package com.mykidsbank.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyKidsBankPage {

	@FindBy(xpath = "//button[text()=\"Bank Login\"]")
	private WebElement bankerLoginBtn;
	
	@FindBy(xpath="//input[@type=\"text\"]")
	private WebElement bankerLoginTxt;
	
	@FindBy(xpath="//button[text()=\"Bank sign in\"]")
	private WebElement bankerSignInBtn;
	public MyKidsBankPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void bankerLogin(String bankerLogin){
		this.bankerLoginBtn.click();
		this.bankerLoginTxt.sendKeys(bankerLogin);
		this.bankerSignInBtn.click();
		
	}
}
