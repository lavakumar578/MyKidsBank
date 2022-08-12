package com.createAccount;

import org.testng.annotations.Test;

import com.mykidsbank.ObjectRepository.HomePage;
import com.mykidsbank.ObjectRepository.ImportAccountHoldersPage;
import com.mykidsbank.genericUtlity.BaseClass;
import com.mykidsbank.genericUtlity.ILocation;
import com.mykidsbank.genericUtlity.XlsxUtility;

public class ImportDepositAccountsTest extends BaseClass{
	
	@Test(priority = 3)
	public void importDepositAccounts() {
	ImportAccountHoldersPage importAccountHoldersPage=new ImportAccountHoldersPage(driver);
	homePage.importDepositAccounts();
	importAccountHoldersPage.importAccountHolders(XlsxUtility.getDataFromExcelSheet("sheet1", 1, 5));
	importAccountHoldersPage.submit();
	homePage.updateChanges();
	
	}
}
