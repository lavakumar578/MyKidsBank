package com.mykidsbank;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.mykidsbank.ObjectRepository.CreateDepositAccountPage;
import com.mykidsbank.ObjectRepository.HomePage;
import com.mykidsbank.genericUtlity.BaseClass;
import com.mykidsbank.genericUtlity.DriverUtility;
import com.mykidsbank.genericUtlity.XlsxUtility;

public class CreateNewDepositAccountTest extends BaseClass{
@Test(priority = 3)
public void createNewDepositAccount() {
	DriverUtility driverUtility=new DriverUtility(driver);
	homePage.createDepositAccount();
	
	CreateDepositAccountPage createDepositAccountPage=new CreateDepositAccountPage(driver);
	int random=javaLangUtility.getRandomNumber(1000);
	createDepositAccountPage.createDepositAccountDetails(XlsxUtility.getDataFromExcelSheet("sheet1", 1, 1)+random, XlsxUtility.getDataFromExcelSheet("sheet1", 1, 2)+random, XlsxUtility.getDataFromExcelSheet("sheet1", 1, 3));
	driverUtility.validateBasedOnText(driver, XlsxUtility.getDataFromExcelSheet("sheet1", 1, 1)+random, driver.findElements(By.xpath("//table[@id=\"table_account_list\"]/tbody/tr/td[1]")), XlsxUtility.getDataFromExcelSheet("sheet1", 1, 4));


}
}
