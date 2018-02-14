package sfdc.automation.impl;

import org.openqa.selenium.WebElement;

import sfdc.automation.pages.CasesPage;
import sfdc.automation.pages.GroupsPage;
import sfdc.automation.pages.LeadPage;
import sfdc.automation.pages.LogInPage;
import sfdc.automation.pages.ProductsPage;

public class GroupsImpl implements Groups {

	GroupsPage groupsPage = new GroupsPage();
	
	public void clickOnGroupsTab(){
		groupsPage.clickOnGroupsTab();
		// TODO Auto-generated method stub

	}

	public void clickOnNewButton(){
		groupsPage.clickOnNewButton();
	}
	
	
	
	public void clickOnGroupsName(){
		groupsPage.clickOnGroupsName();
	}

	
	
	public void enterGroupsName(String groupName){
		groupsPage.enterGroupsName(groupName);
	}
	
	
	/*@Override
	public void clickOnProductsTab() {
		// TODO Auto-generated method stub
		
	}
*/
/*
	@Override
	public void enterProductsName() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void clickOnProductsSave() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void enterProductsName(String prodName) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void clickOnNewButton() {
		// TODO Auto-generated method stub
		
	}*/

/*
	@Override
	public void clickOnNewButton() {
		productsPage.clickOnNewButton();

	}

	

	@Override
	public void enterProductsName(String prodName) {
		productsPage.enterProductsName(prodName);

		// TODO Auto-generated method stub

	}
	@Override
	public void clickOnProductsSave() {
		productsPage.clickOnProductsSave();
	}

	@Override
	public void clickOnSave() {
		leadPage.clickOnSave();
		
	}
	
	
	
	
	
	@Override
	public void enterProductsName() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void enterProductsName() {
		// TODO Auto-generated method stub
		
	}

	
	
	
*/

}
