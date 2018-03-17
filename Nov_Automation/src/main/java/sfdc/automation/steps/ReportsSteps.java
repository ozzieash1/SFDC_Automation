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
import sfdc.automation.impl.ReportsImpl;

public class ReportsSteps {

	ReportsImpl reportsImpl = new ReportsImpl();
	
	
	@When("^user click on Reports tab$")
	public void user_click_on_Reports_tab() throws Throwable {
		reportsImpl.clickOnReportsTab();
	
	
	}

	@When("^user sees Reports Page text \"([^\"]*)\"$")
	public void user_sees_Reports_Page_text(String RptPageText) throws Throwable {
		reportsImpl.seesReportsPageText(RptPageText);
	}

	@When("^user clicks on RReport$")
	public void user_clicks_on_RReport() throws Throwable {
		reportsImpl.clickOnRReport();
	}

	@Then("^user views Report status complete$")
	public void user_views_Report_status_complete() throws Throwable {
		reportsImpl.viewsReportStatusComplete();
	}

	@Then("^user views \"([^\"]*)\" in Report$")
	public void user_views_Wells_Fargo_Account_Name_in_Report(String arg1) throws Throwable {
		reportsImpl.viewsNewAcctNameInRpt(arg1);
	}

	@Then("^user views Grand Total \"([^\"]*)\" records$")
	public void user_views_Grand_Total_records(String numberOfAccts) throws Throwable {
		reportsImpl.viewsGrandTotalRecords(numberOfAccts);
	}


	
//-------------------------
	/*@And("^user click on Accounts tab$")
	public void clickOnAccountsTab() throws Throwable {

		accountsImpl.clickOnAccountsTab();
	}*/

/*	@And("^user test JavaScript Calls$")
	public void testJavaScriptCalls() throws Throwable {

		accountsImpl.testJavaScriptCalls();
	}
	
	@And("^user test Account Page text \"([^\"]*)\"$")
	public void testAccountPagetext(String text) throws Throwable {

		accountsImpl.testAccountPagetext(text);
	}
	
	@And("^user validates newly created account \"([^\"]*)\"$")
	public void validateContact(String accountName) throws Throwable {

		accountsImpl.validateContact(accountName);
	}

	@And("^user enters \"([^\"]*)\" as Account name$")
	public void enterAccountName(String accountName) throws Throwable {

		accountsImpl.enterAccountName(accountName);

	}

	@When("^user selects option \"([^\"]*)\" from type dropdown$")
	public void user_selects_option_from_type_dropdown(String typeSelected) throws Throwable {
		accountsImpl.selectFromTypeDropdown(typeSelected);
	}

	@When("^user selects option \"([^\"]*)\" from industry dropdown$")
	public void user_selects_option_from_industry_dropdown(String industrySelected) throws Throwable {
		accountsImpl.selectFromIndustryDropdown(industrySelected);

	}

	@When("^user selects option \"([^\"]*)\" from rating dropdown$")
	public void user_selects_option_from_rating_dropdown(String ratingSelected) throws Throwable {
		accountsImpl.selectFromRatingDropdown(ratingSelected);

	}

	@When("^user selects option \"([^\"]*)\" from ownership dropdown$")
	public void user_selects_option_from_ownership_dropdown(String ownershipSelected) throws Throwable {
		accountsImpl.selectFromOwnershipDropdown(ownershipSelected);
	}

	@When("^user selects option \"([^\"]*)\" from customer priority dropdown$")
	public void user_selects_option_from_customer_priority_dropdown(String customerPrioritySelected) throws Throwable {
		accountsImpl.selectFromCustomerPriorityDropdown(customerPrioritySelected);

	}*/

}

// @Autowired
