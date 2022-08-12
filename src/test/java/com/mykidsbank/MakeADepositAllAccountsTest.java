package com.mykidsbank;

import org.testng.annotations.Test;

import com.mykidsbank.ObjectRepository.DepositConfirmPage;
import com.mykidsbank.ObjectRepository.HomePage;
import com.mykidsbank.ObjectRepository.MakeADepositIntoOneOrMoreAccountsPage;
import com.mykidsbank.genericUtlity.BaseClass;
import com.mykidsbank.genericUtlity.XlsxUtility;

public class MakeADepositAllAccountsTest extends BaseClass{
@Test(priority = 4)
public void makeADepositIntoAllAccount() {
	homePage.makeADepositIntoAccount();
	MakeADepositIntoOneOrMoreAccountsPage makeADepositIntoOneOrMoreAccountsPage=new MakeADepositIntoOneOrMoreAccountsPage(driver);
	DepositConfirmPage depositConfirmPage=new DepositConfirmPage(driver);
	makeADepositIntoOneOrMoreAccountsPage.makeADepositToAllAccounts(XlsxUtility.getDataFromExcelSheet("sheet1", 1, 6)+randomNum, XlsxUtility.getDataFromExcelSheet("sheet1", 1, 7));
	depositConfirmPage.confirmDeposit();
}
}
