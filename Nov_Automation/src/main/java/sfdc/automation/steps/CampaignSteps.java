package sfdc.automation.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import sfdc.automation.impl.Accounts;
import sfdc.automation.impl.AccountsImpl;
import sfdc.automation.impl.Campaign;
import sfdc.automation.impl.CampaignImpl;
import sfdc.automation.impl.Cases;
import sfdc.automation.impl.CasesImpl;

public class CampaignSteps {

	Campaign campaignImpl = new CampaignImpl();

	@And("^user click on Campaign tab$")
	public void clickOnCampaignTab() throws Throwable {
	
		campaignImpl.clickOnCampaignTab();
	}

	
	@And("^user validates newly created Campaign \"([^\"]*)\"$")
	public void validateContact(String campaignName) throws Throwable {
	
		campaignImpl.validateCampaign(campaignName);
	}
	@And("^user enters \"([^\"]*)\" as Campaign name$")
	public void enterCampaignName(String campaignName) throws Throwable {
	
		campaignImpl.entercampaignName(campaignName);
	
	
	}

}
