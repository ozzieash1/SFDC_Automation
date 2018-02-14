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
import sfdc.automation.impl.ProductsImpl;
import sfdc.automation.impl.SolutionsImpl;

public class SolutionsSteps {

	SolutionsImpl solutionsImpl = new SolutionsImpl();

	@When("^user click on Solutions tab$")
	public void user_click_on_Solutions_tab() throws Throwable {

		solutionsImpl.clickOnSolutionsTab();

	}

	@When("^user clicks on new Solutionsbutton$")
	public void user_clicks_on_new_Solutionsbutton() throws Throwable {
		solutionsImpl.clickOnNewButton();

	}

	@When("^user enters \"([^\"]*)\" as Solutions Title$")
	public void user_enters_as_Solution_Title(String SolutionTitle) throws Throwable {
		solutionsImpl.enterSolutionsTitle(SolutionTitle);

	}

	@When("^user clicks on Solutions Save button$")
	public void user_clicks_on_Products_Save_button() throws Throwable {
		solutionsImpl.clickOnSolutionsSave();

	}

}
