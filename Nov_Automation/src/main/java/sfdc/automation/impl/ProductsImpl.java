package sfdc.automation.impl;

import org.openqa.selenium.WebElement;

import sfdc.automation.pages.CasesPage;
import sfdc.automation.pages.LeadPage;
import sfdc.automation.pages.LogInPage;
import sfdc.automation.pages.ProductsPage;

public class ProductsImpl implements Products {

	ProductsPage productsPage = new ProductsPage();
	
	
	public void clickOnProductsTab() {
		productsPage.clickOnProductsTab();
		// TODO Auto-generated method stub

	}


	@Override
	public void clickOnNewButton() {
		productsPage.clickOnNewButton();

	}

	

	@Override
	public void enterProductsName(String prodName) {
		productsPage.enterProductsName(prodName);
}
	@Override
	public void clickOnProductsSave() {
		productsPage.clickOnProductsSave();
	}

	/*@Override
	public void clickOnSave() {
		leadPage.clickOnSave();
		
	}*/
	
	
	
	
	
	@Override
	public void enterProductsName() {
		// TODO Auto-generated method stub
		
	}


	/*@Override
	public void enterProductsName() {
		// TODO Auto-generated method stub
		
	}*/

	
	
	


}
