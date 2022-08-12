package com.depositToAccount;

import org.testng.annotations.Test;

import com.mykidsbank.ObjectRepository.DepositConfirmPage;
import com.mykidsbank.ObjectRepository.MakeADepositIntoOneOrMoreAccountsPage;
import com.mykidsbank.genericUtlity.BaseClass;
import com.mykidsbank.genericUtlity.XlsxUtility;

public class MakeADepositTest extends BaseClass {
@Test(priority = 5)
public void makeADepsoitToSpecificAccount() {
	homePage.makeADepositIntoAccount();
	MakeADepositIntoOneOrMoreAccountsPage makeADepositIntoOneOrMoreAccountsPage=new MakeADepositIntoOneOrMoreAccountsPage(driver);
	DepositConfirmPage depositConfirmPage=new DepositConfirmPage(driver);
	makeADepositIntoOneOrMoreAccountsPage.makeADeposit(XlsxUtility.getDataFromExcelSheet("sheet1", 1, 6)+randomNum, XlsxUtility.getDataFromExcelSheet("sheet1", 1, 7));
	depositConfirmPage.confirmDeposit();
}
}
