package com.interest;

import org.testng.annotations.Test;

import com.mykidsbank.ObjectRepository.SetAutomaticInterestPage;
import com.mykidsbank.ObjectRepository.SetAutomaticInterestRateConfirmPage;
import com.mykidsbank.genericUtlity.BaseClass;
import com.mykidsbank.genericUtlity.XlsxUtility;

public class SetAutomaticInterestRateTest extends BaseClass {
	@Test(priority = 8)
	public void setAutomaticInterestRate() {
		homePage.setAutomaticInterest();
		SetAutomaticInterestPage setAutomaticInterestPage=new SetAutomaticInterestPage(driver);
		SetAutomaticInterestRateConfirmPage setAutomaticInterestRateConfirmPage=new SetAutomaticInterestRateConfirmPage(driver);
		setAutomaticInterestPage.setAutomaticInterest(XlsxUtility.getDataFromExcelSheet("sheet1", 1, 10));
		setAutomaticInterestRateConfirmPage.confirmDeposit();
	}
}
