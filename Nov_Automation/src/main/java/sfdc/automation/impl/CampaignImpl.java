package sfdc.automation.impl;

import org.openqa.selenium.WebElement;

import sfdc.automation.pages.CampaignPage;
import sfdc.automation.pages.CasesPage;


public class CampaignImpl implements Campaign {

	CampaignPage campaignPage = new CampaignPage(null);

	@Override
	public void clickOnCampaignTab() {
		// leadPage.clickOnLeadsTab();
		campaignPage.clickOnCampaignTab();

	}

	@Override
	public void clickOnNewButton() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterCampaignName() {
		// TODO Auto-generated method stub
		
	}

	

	@Override
	public void clickOnSave() {
		// TODO Auto-generated method stub
		
	}

	

	public void setDropDown(WebElement dropdown){
		
	}


	@Override
	public void clickOnAccountsTab() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterAccountName() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void validateCampaign(String campaignName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void entercampaignName(String campaignName) {
		// TODO Auto-generated method stub
		
	}

	

	
	
	
	
}
