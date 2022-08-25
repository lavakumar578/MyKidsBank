package com.automaticTransactions;

import org.testng.annotations.Test;


import com.mykidsbank.ObjectRepository.SetAutomaticWithdrawalPage;
import com.mykidsbank.ObjectRepository.SetAutomationWithdrawalConfirmPage;
import com.mykidsbank.genericUtlity.BaseClass;
import com.mykidsbank.genericUtlity.XlsxUtility;

public class SetAutomationWithdrawalToAllAccountsTest extends BaseClass {
@Test(priority = 10)
public void setAutomationWithdrawalTest() {
	homePage.setAutomationWithdrawal();
	SetAutomaticWithdrawalPage setAutomaticWithdrawalPage=new SetAutomaticWithdrawalPage(driver);
	SetAutomationWithdrawalConfirmPage setAutomationWithdrawalConfirmPage=new SetAutomationWithdrawalConfirmPage(driver);
	setAutomaticWithdrawalPage.setAutomaticWithdraw(XlsxUtility.getDataFromExcelSheet("sheet1", 3, 3),XlsxUtility.getDataFromExcelSheet("sheet1", 3, 4));
	setAutomationWithdrawalConfirmPage.confirmWithdraw();
}
}
