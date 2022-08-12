package com.mykidsbank.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SetAutomaticInterestPage{
@FindBy(xpath="//span[@title=\"Click to specify no ending date.\"]")
private WebElement noEndDate;
@FindBy(xpath="//tbody/descendant::input[@value=\"2\"]")
private WebElement selectMonth;
@FindBy(xpath="//input[@title=\"Enter annual interest rate\"]")
private WebElement enterInterestRate;
@FindBy(xpath="//span[@id=\"check_uncheck_boxes_id\"]")
private WebElement selectAllBtn;
@FindBy(xpath="//span[text()=\"Submit\"]")
private WebElement submitBtn;
public SetAutomaticInterestPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public void setAutomaticInterest(String interestRate) {
	this.noEndDate.click();
	this.selectMonth.click();
	this.enterInterestRate.sendKeys(interestRate);
	this.selectAllBtn.click();
	this.submitBtn.click();
	
}
}
