package sfdc.automation.impl;

import sfdc.automation.pages.LeadPage;
import sfdc.automation.pages.LogInPage;

public class LeadImpl implements Lead  {

	LeadPage leadPage = new LeadPage();

	@Override
	public void clickOnLeadsTab() {
		leadPage.clickOnLeadsTab();
		
	}

	@Override
	public void clickOnNewButton() {
		leadPage.clickOnNewButton();
		
	}

	@Override
	public void enterLeadName(String lastName) {
		leadPage.enterLeadName(lastName);
		
	}

	@Override
	public void entersCompanyName(String companyName) {
		leadPage.entersCompanyName(companyName);
		
	}

	public void clickOnStatus() {
		leadPage.clickOnStatus();
		
	}
	
	
	
	@Override
	public void clickOnSave() {
		leadPage.clickOnSave();
		
	}

	@Override
	public void selectFromLeadSourceDropdown(String leadSource) {
		leadPage.selectFromLeadSourceDropdown(leadSource);
		
	}
	

	@Override
	public void selectFromLeadIndustryDropdown(String leadIndustry) {
	
		leadPage.selectFromLeadIndustryDropdown(leadIndustry);
	}

}
