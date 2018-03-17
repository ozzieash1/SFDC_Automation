package sfdc.automation.impl;

public interface Accounts {

	void clickOnAccountsTab();

	void clickOnNewButton();

	void enterAccountName();

	void clickOnSave();

	void validateAccount(String accountName);

	void validateContact(String accountName);

	void enterAccountsName();

	void enterAccountName(String accountName);

	void selectFromTypeDropdown(String typeSelected);

	void selectFromIndustryDropdown(String industrySelected);

	void selectFromRatingDropdown(String ratingSelected);

	void selectFromOwnershipDropdown(String ownershipSelected);

	void selectFromCustomerPriorityDropdown(String customerPrioritySelected);

	void testJavaScriptCalls();

	void testAccountPagetext(String text);
	
	void clicksOnCreateNewView();
	
	void clicksOnSaveOnCreateNewView();
	
	void selectsnewlyCreatedView();
	
	void clicksOnViewName();
	public void getsLinksDisplayed();
	public void testsElementStyleCSS();
	
	
}
