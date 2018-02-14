package sfdc.automation.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import sfdc.automation.impl.Assets;
import sfdc.automation.impl.AssetsImpl;
import sfdc.automation.impl.Lead;
import sfdc.automation.impl.LeadImpl;
import sfdc.automation.impl.LogInImpl;

public class AssetsSteps {

	AssetsImpl assetImpl = new AssetsImpl();
	

/*	@And("^user click on Leads tab$")
	public void clickOnLeadsTab() throws Throwable {
	
		leadImpl.clickOnLeadsTab();
	}
	*/

	@And("^user clicks on new Assetbutton$")
	public void clickOnNewButtonAsset() throws Throwable {
		
		assetImpl.clickOnNewButtonAsset();
	}

	
	
	
	
	
	@When("^user click on Assets tab$")
	public void user_click_on_Assets_tab() throws Throwable {
		
	assetImpl.clickOnAssetstab();

	}

	@When("^user enters \"([^\"]*)\" as Asset Name$")
	public void user_enters_as_Asset_Name(String arg1) throws Throwable {

	}
	
	
	
	@And("^user clicks on Assets Save button$")
	public void clicksOnAssetsSave() throws Throwable {
		
		assetImpl.clickOnSave();
	}
	
	
	
	
	
	
	
	
	
/*	
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
	    //throw new PendingException();
	}*/
	
	
	
	
	
	
	/*@And("^user clicks on Save button$")
	public void clicksOnSave() throws Throwable {
		
		leadImpl.clickOnSave();
	}

	*/





}

// @Autowired