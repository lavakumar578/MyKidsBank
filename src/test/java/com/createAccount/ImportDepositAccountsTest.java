package com.createAccount;

import org.testng.annotations.Test;

import com.mykidsbank.ObjectRepository.HomePage;
import com.mykidsbank.ObjectRepository.ImportAccountHoldersPage;
import com.mykidsbank.genericUtlity.BaseClass;
import com.mykidsbank.genericUtlity.ILocation;
import com.mykidsbank.genericUtlity.PropertiesUtility;
import com.mykidsbank.genericUtlity.XlsxUtility;

public class ImportDepositAccountsTest extends BaseClass{
	
	@Test(priority = 3)
	public void importDepositAccountsTest() {
	ImportAccountHoldersPage importAccountHoldersPage=new ImportAccountHoldersPage(driver);
	homePage.importDepositAccounts();
	importAccountHoldersPage.importAccountHolders(PropertiesUtility.getDataFromProperty("accountspath"));
	importAccountHoldersPage.submit();
	homePage.updateChanges();
	
	}
}
