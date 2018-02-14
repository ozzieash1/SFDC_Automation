package sfdc.automation.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import sfdc.automation.impl.Lead;
import sfdc.automation.impl.LeadImpl;
import sfdc.automation.impl.LogInImpl;

public class LeadsSteps {

	Lead leadImpl = new LeadImpl();

	@And("^user click on Leads tab$")
	public void clickOnLeadsTab() throws Throwable {

		leadImpl.clickOnLeadsTab();
	}

	@And("^user clicks on new button$")
	public void clickOnNewButton() throws Throwable {

		leadImpl.clickOnNewButton();
	}

	@And("^user enters \"([^\"]*)\" as last name$")
	public void enterLeadName(String lastName) throws Throwable {

		leadImpl.enterLeadName(lastName);
	}

	@And("^user enters \"([^\"]*)\" as company$")
	public void entersCompanyName(String companyName) throws Throwable {

		leadImpl.entersCompanyName(companyName);
	}

	@When("^user clicks on status$")
	public void user_clicks_on_status() throws Throwable {
		leadImpl.clickOnStatus();
		// Write code here that turns the phrase above into concrete actions
		// throw new PendingException();
	}

	@And("^user clicks on Save button$")
	public void clicksOnSave() throws Throwable {

		leadImpl.clickOnSave();
	}

	//user selects option "Web" from lead source dropdown
	/*@And("^user selects option \"([^\"]*)\"  from lead source dropdown$")
	public void user_selects_option_from_lead_source_dropdown(String leadSource) throws Throwable  {

		leadImpl.selectFromLeadSourceDropdown(leadSource);
	}*/

	@When("^user selects option \"([^\"]*)\" from lead source dropdown$")
	public void user_selects_option_from_lead_source_dropdown(String leadSource) throws Throwable {
	   leadImpl.selectFromLeadSourceDropdown(leadSource);
	}
	
	//user selects option "Energy" 
	
	@When("^user selects option \"([^\"]*)\" from LeadIndustry dropdown$")
	public void user_selects_option_from_leadindustry_dropdown(String leadIndustry) throws Throwable {
	   leadImpl.selectFromLeadIndustryDropdown(leadIndustry);
	}


}

// @Autowired