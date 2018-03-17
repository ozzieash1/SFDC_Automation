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
import sfdc.automation.impl.WindowsImpl;

public class WindowsSteps {

	WindowsImpl windowsImpl = new WindowsImpl();

	@And("^user tests Help pop-up window by title$")
	public void testsHelpPopupWindowByTitle() throws Throwable {
		windowsImpl.clickOnHelpButton();
	}

	@And("^user takes Screenshot of page navigated$")
	public void takesScreenshot() throws Throwable {
		windowsImpl.takesScreenshot();
	}

	@And("^user validates Home Page JavaScript Code$")
	public void validatesHomeWindowJavaScriptCode() throws Throwable {
		windowsImpl.validatesHomeWindowJavaScriptCode();
	}

	@And("^user tests pop-up window by content$")
	public void testPopupWindowByContent()throws Throwable{
		windowsImpl.clickOnlighteningMigrationButton();
	}


	@And("^user clicks on Search button$")
	public void ClickOnSearchButton()throws Throwable{
		windowsImpl.ClickOnSearchButton();
	}

	
	


	//handleSearchByTitle


}
