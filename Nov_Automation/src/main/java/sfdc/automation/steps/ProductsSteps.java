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

public class ProductsSteps {

	ProductsImpl productsImpl = new ProductsImpl();

	@When("^user click on Products tab$")
	public void user_click_on_Products_tab() throws Throwable {

		productsImpl.clickOnProductsTab();

	}

	@When("^user clicks on new Productbutton$")
	public void user_clicks_on_new_Productbutton() throws Throwable {
		productsImpl.clickOnNewButton();
		// throw new PendingException();
	}

	@When("^user enters \"([^\"]*)\" as Product Name$")
	public void user_enters_as_Product_Name(String prodName) throws Throwable {
		productsImpl.enterProductsName(prodName);
		// throw new PendingException();
	}


	@When("^user clicks on Products Save button$")
	public void user_clicks_on_Products_Save_button() throws Throwable {
		productsImpl.clickOnProductsSave();
		// throw new PendingException();
	}

	
	

	/*@And("^user clicks on Save button$")
	public void clicksOnSave() throws Throwable {
		
		leadImpl.clickOnSave();
	}
*/


}
