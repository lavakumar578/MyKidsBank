package com.withdrawFromAccount;

import org.testng.annotations.Test;

import com.mykidsbank.ObjectRepository.MakeAWithdrawalFromOneOrMoreAccountsPage;
import com.mykidsbank.ObjectRepository.WithdrawalConfirmPage;
import com.mykidsbank.genericUtlity.BaseClass;
import com.mykidsbank.genericUtlity.XlsxUtility;

public class MakeAWithdrawTest extends BaseClass{
@Test(priority = 7)
public void makeAWithdraw() {
	homePage.makeAWithdrawalIntoAccount();
	MakeAWithdrawalFromOneOrMoreAccountsPage makeAWithdrawalFromOneOrMoreAccountsPage=new MakeAWithdrawalFromOneOrMoreAccountsPage(driver);
	WithdrawalConfirmPage withdrawalConfirmPage=new WithdrawalConfirmPage(driver);
	makeAWithdrawalFromOneOrMoreAccountsPage.makeAWithDraw(XlsxUtility.getDataFromExcelSheet("sheet1", 1, 8)+randomNum, XlsxUtility.getDataFromExcelSheet("sheet1", 1, 9));
	withdrawalConfirmPage.confirmDeposit();
}
}
