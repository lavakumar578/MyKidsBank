package com.withdrawFromAccount;

import org.testng.annotations.Test;

import com.mykidsbank.ObjectRepository.MakeADepositIntoOneOrMoreAccountsPage;
import com.mykidsbank.ObjectRepository.MakeAWithdrawalFromOneOrMoreAccountsPage;
import com.mykidsbank.ObjectRepository.WithdrawalConfirmPage;
import com.mykidsbank.genericUtlity.BaseClass;
import com.mykidsbank.genericUtlity.XlsxUtility;

public class MakeAWithdrawFromAllAccountsTest extends BaseClass {
@Test(priority = 6)
public void makeAWithdrawFromAllAccountsTest() {
	homePage.makeAWithdrawalIntoAccount();
	MakeAWithdrawalFromOneOrMoreAccountsPage makeAWithdrawalFromOneOrMoreAccountsPage=new MakeAWithdrawalFromOneOrMoreAccountsPage(driver);
	WithdrawalConfirmPage withdrawalConfirmPage=new WithdrawalConfirmPage(driver);
	makeAWithdrawalFromOneOrMoreAccountsPage.makeAWithdrawalToAllAccounts(XlsxUtility.getDataFromExcelSheet("sheet1", 1, 8)+randomNum, XlsxUtility.getDataFromExcelSheet("sheet1", 1, 9));
	withdrawalConfirmPage.confirmDeposit();
}
}
