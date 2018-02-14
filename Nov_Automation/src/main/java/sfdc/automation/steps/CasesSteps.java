package sfdc.automation.steps;

import org.openqa.selenium.WebElement;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import sfdc.automation.impl.Cases;
import sfdc.automation.impl.CasesImpl;
import sfdc.automation.impl.Lead;
import sfdc.automation.impl.LeadImpl;
import sfdc.automation.impl.LogInImpl;

public class CasesSteps {

	Cases casesImpl = new CasesImpl();

	@And("^user click on Cases tab$")
	public void clickOnCasesTab() throws Throwable {
		casesImpl.clickOnCasesTab();
		//leadImpl.clickOnLeadsTab();
	}

	@And("^user clicks on cases new button$")
	public void clickOnCasesNewButton() throws Throwable {
		casesImpl.clickOnCasesNewButton();
		//leadImpl.clickOnLeadsTab();
	}
	
	
	
	
	
	
	@When("^user clicks on Status$")
	public void user_clicks_on_Status() throws Throwable {
		casesImpl.clickOnStatus();
	}

	@When("^user clicks on Origin$")
	public void user_clicks_on_Origin() throws Throwable {
		casesImpl.clickOnorigin();
	}



	@When("^user selects \"([^\"]*)\" for dropdown$")
	public void user_selects_new_for_dropdown(String dropdown) throws Throwable {
		casesImpl.setDropDown(dropdown);
	    //throw new PendingException();
	}
	
	
	
	@When("^user selects \"([^\"]*)\" from Status$")
	public void user_selects_from_Status(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
	}

	@When("^user selects \"([^\"]*)\" from Case Origin$")
	public void user_selects_from_Case_Origin(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}


	/*@And("^user clicks on new button$")
	public void clickOnNewButton() throws Throwable {
		
		CasesImpl.clickOnNewButton();
		
	}*/

	/*@And("^user enters \"([^\"]*)\" as last name$")
	public void enterLeadName(String lastName) throws Throwable {
	
		leadImpl.enterLeadName(lastName);
	}

	@And("^user enters \"([^\"]*)\" as company$")
	public void entersCompanyName() throws Throwable {
		
		leadImpl.entersCompanyName();
	}


	@And("^user clicks on Save button$")
	public void clicksOnSave() throws Throwable {
		
		leadImpl.clickOnSave();
	}

	*/





}

// @Autowired