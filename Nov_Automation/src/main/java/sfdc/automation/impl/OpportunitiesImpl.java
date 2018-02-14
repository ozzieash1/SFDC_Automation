package sfdc.automation.impl;

import org.openqa.selenium.WebElement;

import sfdc.automation.pages.CasesPage;
import sfdc.automation.pages.LeadPage;
import sfdc.automation.pages.LogInPage;
import sfdc.automation.pages.OpportunitiesPage;
import sfdc.automation.pages.ProductsPage;

public class OpportunitiesImpl implements Opportunities {

	OpportunitiesPage opportunitiesPage = new OpportunitiesPage();
	
	
	public void clickOnOpportunitiesTab() {
		opportunitiesPage.clickOnOpportunitiesTab();	
		
		// TODO Auto-generated method stub

	}


	@Override
	public void clickOnNewButton() {
		opportunitiesPage.clickOnNewButton();

	}



	
	



	@Override
	public void clickOnOpportunityNameButton() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void enterOpportunityName(String opportunityName) {
		// TODO Auto-generated method stub
		
	}



}
