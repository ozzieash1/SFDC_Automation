package sfdc.automation.impl;

public interface Lead {

	void clickOnLeadsTab();

	void clickOnNewButton();

	void enterLeadName(String lastName);

	void entersCompanyName(String companyName);

	void clickOnSave();
	void clickOnStatus() ;

	void selectFromLeadSourceDropdown(String leadSource);
	//void selectFromIndustryDropdown(String industry);

	void selectFromLeadIndustryDropdown(String leadIndustry);
	
	//sending to github
}
