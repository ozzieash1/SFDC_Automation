package sfdc.automation.steps;
import cucumber.api.java.en.When;
import sfdc.automation.impl.LeadImpl;
import sfdc.automation.impl.LogInImpl;
import sfdc.automation.impl.OpportunitiesImpl;


public class OpportunitiesSteps {

	OpportunitiesImpl opportunitiesImpl = new OpportunitiesImpl();

	@When("^user click on Opportunities tab$")
	public void user_click_on_Opportunities_tab() throws Throwable {

		opportunitiesImpl.clickOnOpportunitiesTab();

	}
	@When("^user clicks on new Opportunitiesbutton$")
	public void user_clicks_on_new_Opportunitiesbutton() throws Throwable {
		opportunitiesImpl.clickOnNewButton();
	    //throw new PendingException();
	}

	/*@When("^user enters \"([^\"]*)\" as Opportunity Name$")
	public void user_enters_as_Opportunity_Name(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^user clicks on Opportunities Save button$")
	public void user_clicks_on_Opportunities_Save_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}*/
}



