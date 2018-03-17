package sfdc.automation.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import sfdc.automation.impl.Accounts;
import sfdc.automation.impl.AccountsImpl;
import sfdc.automation.impl.ContactsImpl;
import sfdc.automation.impl.Lead;
import sfdc.automation.impl.LeadImpl;
import sfdc.automation.impl.LogInImpl;
import sfdc.automation.impl.SearchImpl;
import sfdc.automation.impl.WindowsImpl;

public class SearchSteps {

	SearchImpl searchImpl = new SearchImpl();
	
	@When("^user clicks on search \"([^\"]*)\" and enters \"([^\"]*)\"$")
	public void clicks_On_Search(String Inputbutton, String txt) throws Throwable {
		searchImpl.clicksOnSearch(Inputbutton, txt);
	}
	@And("^user clicks on search \"([^\"]*)\"$")
	public void clicks_On_Search(String btn) throws Throwable {
		searchImpl.clicksOnSearchbtn(btn);
	}

	@When("^user sees visible text \"([^\"]*)\" in input box$")
	public void user_sees_visible_text_in_input_box(String enteredText) throws Throwable {
	    searchImpl.viewstextEntered(enteredText);
	   
	}





}