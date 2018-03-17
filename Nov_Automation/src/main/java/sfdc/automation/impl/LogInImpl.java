package sfdc.automation.impl;

import sfdc.automation.pages.LogInPage;

public class LogInImpl implements LogIn {

	LogInPage loginPage = new LogInPage();

	@Override
	public void navigateToUrl(String url) {

		loginPage.navigateToUrl(url);
	}

	@Override
	public void logInSalesForce(String userName, String passWord) {

		// CucumberU will work on it later on. Idea is to add a screenshot of
		// the pages navigated to before and after
		loginPage.logInSalesForce(userName, passWord);

	}

	public void clickOnLogInButton() {
		loginPage.clickLogInButton();

	}

	@Override
	public void userOpensBrowser() {

	}

	public void logOut() {
		loginPage.logOut();

	}

}
