package com.automaticTransactions;

import org.testng.annotations.Test;

import com.mykidsbank.ObjectRepository.DepositConfirmPage;
import com.mykidsbank.ObjectRepository.SetAutomaticDepositPage;
import com.mykidsbank.genericUtlity.BaseClass;
import com.mykidsbank.genericUtlity.XlsxUtility;

public class SetAutomaticDepositToAllAccountsTest extends BaseClass {
@Test(priority = 9)
public void setAutomaticDepositToAllAccountsTest() {
	homePage.setAutomaticDeposit();
	SetAutomaticDepositPage setAutomaticDepositPage=new SetAutomaticDepositPage(driver);
	DepositConfirmPage depositConfirmPage=new DepositConfirmPage(driver);
	setAutomaticDepositPage.setAutomaticDeposit(XlsxUtility.getDataFromExcelSheet("sheet1", 3, 1),XlsxUtility.getDataFromExcelSheet("sheet1", 3, 2));
	depositConfirmPage.confirmDeposit();
	
}
}
