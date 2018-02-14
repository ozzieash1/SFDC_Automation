package sfdc.automation.impl;

import sfdc.automation.pages.AccountsPage;
import sfdc.automation.pages.ContactsPage;
import sfdc.automation.pages.LeadPage;
import sfdc.automation.pages.LogInPage;
import sfdc.automation.utils.SeleniumUtil;

public class AccountsImpl implements Accounts {

	AccountsPage accountsPage = new AccountsPage();

	@Override
	public void clickOnAccountsTab() {
		accountsPage.clickOnAccountsTab();

	}

	@Override
	public void clickOnNewButton() {
		accountsPage.clickOnNewButton();

	}

	@Override
	public void clickOnSave() {
		accountsPage.clickOnSave();

	}

	/*
	 * @Override public void validateContact(String accountName) {
	 * accountsPage.validateContact(accountName);
	 * 
	 * }
	 */

	@Override
	public void enterAccountName(String accountName) {
		accountsPage.enterAccountName(accountName);

	}

	@Override
	public void validateAccount(String accountName) {
		// TODO Auto-generated method stub

	}

	@Override
	public void enterAccountName() {
		// TODO Auto-generated method stub

	}

	@Override
	public void enterAccountsName() {
		// TODO Auto-generated method stub

	}

	@Override
	public void validateContact(String accountName) {
		// TODO Auto-generated method stub

	}

	@Override
	public void selectFromTypeDropdown(String typeSelected) {
		// TODO Auto-generated method stub
		accountsPage.selectFromTypeDropdown(typeSelected);
	}

	@Override
	public void selectFromIndustryDropdown(String industrySelected) {
		accountsPage.selectFromIndustryDropdown(industrySelected);
		
	}

	@Override
	public void selectFromRatingDropdown(String ratingSelected) {
		accountsPage.selectFromRatingDropdown(ratingSelected);
		
	}

	@Override
	public void selectFromOwnershipDropdown(String ownershipSelected) {
	accountsPage.selectFromOwnershipDropdown(ownershipSelected);
		
	}

	@Override
	public void selectFromCustomerPriorityDropdown(String customerPrioritySelected) {
	accountsPage.selectFromCustomerPriorityDropdown(customerPrioritySelected);
		
	}

	@Override
	public void testJavaScriptCalls() {
		accountsPage.testJavaScriptCalls();
		
	}

	@Override
	public void testAccountPagetext(String text) {
		accountsPage.testAccountPagetext(text);
		
	}

}
