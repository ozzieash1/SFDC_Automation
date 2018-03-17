package sfdc.automation.impl;

import sfdc.automation.pages.WindowsPage;
import sfdc.automation.pages.ContactsPage;
import sfdc.automation.pages.LeadPage;
import sfdc.automation.pages.LogInPage;
import sfdc.automation.pages.SearchPage;
import sfdc.automation.utils.SeleniumUtil;

public class SearchImpl implements Search {

	SearchPage searchPage = new SearchPage();

	public void viewsInputBoxSearch() {
		searchPage.viewsInputBoxSearch();
		
	}

	public void clicksOnSearch(String search) {
		searchPage.ClickOnSearchButton(search);
		
	}

	public void entersTextInSearch(String searchText) {
		searchPage.entersTextInSearch(searchText);
		
	}

	public void viewstextEntered(String enteredText) {
		searchPage.viewstextEntered(enteredText);
	}

	public void viewsSearch(String button) {
		searchPage.viewsSearch( button);
		
	}

	@Override
	public void viewsSearch() {
		// TODO Auto-generated method stub
		
	}



	public void clicksOnSearch(String inputbutton, String txt) {
		searchPage.clicksOnSearch(inputbutton, txt);
		
	}

	public void clicksOnSearchbtn(String btn) {
		searchPage.clicksOnSearchbtn(btn);
		
	}

	
	}




