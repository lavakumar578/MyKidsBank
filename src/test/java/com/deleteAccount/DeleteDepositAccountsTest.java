package com.deleteAccount;

import org.testng.annotations.Test;

import com.mykidsbank.ObjectRepository.ConfirmDeleteOneOrMoreAccountsPage;
import com.mykidsbank.ObjectRepository.DeleteDepositAccountsPage;
import com.mykidsbank.genericUtlity.BaseClass;

public class DeleteDepositAccountsTest extends BaseClass {
	@Test(priority = 1)
	public void deleteDepositAccounts() {
		homePage.deleteDepositAccounts();
		DeleteDepositAccountsPage deleteDepositAccountsPage=new DeleteDepositAccountsPage(driver);
		ConfirmDeleteOneOrMoreAccountsPage confirmDeleteOneOrMoreAccountsPage=new ConfirmDeleteOneOrMoreAccountsPage(driver);
		deleteDepositAccountsPage.deleteAllSelectedAccounts();
		confirmDeleteOneOrMoreAccountsPage.confirmDelete();
	}
}
