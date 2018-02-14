package sfdc.automation.impl;

import sfdc.automation.pages.WindowsPage;
import sfdc.automation.pages.ContactsPage;
import sfdc.automation.pages.LeadPage;
import sfdc.automation.pages.LogInPage;
import sfdc.automation.utils.SeleniumUtil;

public class WindowsImpl implements Windows {

	WindowsPage windowsPage = new WindowsPage();

	public void clickOnHelpButton() {
		windowsPage.clickOnHelpButton();

	}

	public void takesScreenshot() {
		// TODO Auto-generated method stub
		windowsPage.takesScreenshot();
	}

	public void validatesHomeWindowJavaScriptCode() {
		windowsPage.validatesHomeWindowJavaScriptCode();

	}

}
