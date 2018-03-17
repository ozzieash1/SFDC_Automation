package sfdc.automation.pages;

import java.io.IOException;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import sfdc.automation.utils.SeleniumUtil;

public class AccountsPage {

	SeleniumUtil seleniumUtil = SeleniumUtil.getSeleniumUtil();

	String xPath_NewButton = ".//input[@title='New']";
	String iD_NewButton = ".//input[@title='New']";
	String xPath_Password = ".//input[contains(@name,'pw')]";
	String xPath_CompanyName = ".//input[@id='lea3']";
	String xPath_UserNavButton = ".//span[@id='userNavLabel']";
	String xPath_AccountsSaveBtn = ".//input[@title='Save']";
	String xPath_AccountName = ".//INPUT[@id='acc2']";
	String xPath_typeSelected = ".//SELECT[@id='acc6']";
	String xPath_dropdown = ".//SELECT[@id='acc6']";
	String xPath_industrySelected = "//SELECT[@id='acc7']";
	String xPath_rating = "//SELECT[@id='acc9']";
	String xPath_ownership = "//SELECT[@id='acc14']";
	String xPath_customerPriority = "//SELECT[@id='00N4100000PpGoe']";
	String xPath_AccountPageTextHome = "//H2[@class='pageDescription'][text()=' Home']";
	//H2[@class='pageDescription'][text()=' Home']
	
	String xPath_AccountCreateNewView = "//A[@href='/ui/list/FilterEditPage?ftype=a&retURL=%2F001&cancelURL=%2F001%2Fo'][text()='Create New View']";
	//A[@href='/ui/list/FilterEditPage?ftype=a&retURL=%2F001&cancelURL=%2F001%2Fo'][text()='Create New View']
	String xPath_ViewnameInputField = "//INPUT[@id='fname']";
	String xPath_CreateNewViewsaveBtn = "(//INPUT[@value=' Save '])[1]";
	
	
	String xPath_Text_RecentAccount = "(//H3[text()='Recent Accounts'])[1]";
	String xPath_Text_Reports="//*[@id='toolsContent']/tbody/tr/td[1]/div/div/h3";
	//String xPath_Text_Reports = "//H3[@class='lbHeader'][text()='Reports']";
	String xPath_Link_GoToReports = "//A[@href='/00O/o?entityType=00O'][text()='Go to Reports']";
	String xPath_Reports_Dashboards = "//STRONG[text()='Grand Totals (30 records)']";
	String xPath_RReport1 = "//SPAN[text()='RReport1']";
	String xPath_RReport_Status = "//DIV[@id='status']";
	String xPath_Capital_One = "//A[@href='/0014100001QPtPC'][text()='Capital ONE']";
	String xPath_Grand_Total_Accts = "//STRONG[text()='Grand Totals (30 records)']";
	
	
	public void clickOnAccountsTab() {
		seleniumUtil.clickElementByXpath(".//ul/li/a[contains(@title,'Accounts Tab')]");

	}

	public void clickOnNewButton() {
		seleniumUtil.clickElementByXpath(xPath_NewButton);

	}

	public void enterAccountName(String accountName) {
		seleniumUtil.sendKeysByXPath(xPath_AccountName, accountName);

	}

	public void clickOnSave() {
		seleniumUtil.clickElementByXpath("xPath_LeadSaveBtn");

	}

	public void validateContact(String accountName) {
		// .//div[text()='Kurmi']

		seleniumUtil.IsElementDisplayed(".//div[text()='" + accountName + "']");

	}

	public void selectFromTypeDropdown(String typeSelected) {

		seleniumUtil.handleDropDownItems(xPath_typeSelected, typeSelected);
	}

	public void selectFromIndustryDropdown(String industrySelected) {
		seleniumUtil.handleDropDownItems(xPath_industrySelected,industrySelected );

	}

	public void selectFromRatingDropdown(String ratingSelected) {
		seleniumUtil.handleDropDownItems(xPath_rating,ratingSelected );
	}

	public void selectFromOwnershipDropdown(String ownershipSelected) {
		seleniumUtil.handleDropDownItems(xPath_ownership,ownershipSelected );
	}

	public void selectFromCustomerPriorityDropdown(String customerPrioritySelected) {
		seleniumUtil.handleDropDownItems(xPath_customerPriority,customerPrioritySelected );
	}

	public void testJavaScriptCalls() {
		seleniumUtil.handleJavaScriptCode();
	}

public void testAccountPagetext(String text){
	seleniumUtil.testAccountPageText(xPath_AccountPageTextHome);
}

public void clicksOnCreateNewView() {
	seleniumUtil.clickElementByXpath(xPath_AccountCreateNewView);
	
}

public void entersNewViewName(String newViewName) {
	seleniumUtil.sendKeysByXPath(xPath_ViewnameInputField, "View");
	// TODO Auto-generated method stub
	
}

public void clicksOnSaveOnCreateNewView() {
	seleniumUtil.clickElementByXpath(xPath_CreateNewViewsaveBtn);
	// TODO Auto-generated method stub
	
}

public void selectsnewlyCreatedView() {
	seleniumUtil.handleDropDownItemss();
	// TODO Auto-generated method stub
	
}

public void clicksOnViewName() {
	seleniumUtil.clickElementByXpath(xPath_ViewnameInputField);
	
}

public void getsLinksDisplayed() {
	seleniumUtil.getsLinksDisplayed();
	// TODO Auto-generated method stub
	
}

public void testsElementStyleCSS() {
	seleniumUtil.testsElementStyleCSS();
	
}

}
