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

public class AccountsSteps {

	Accounts accountsImpl = new AccountsImpl();

	@And("^user click on Accounts tab$")
	public void clickOnAccountsTab() throws Throwable {

		accountsImpl.clickOnAccountsTab();
	}

	@And("^user test JavaScript Calls$")
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

	}

}

// @Autowired
