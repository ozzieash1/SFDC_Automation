package sfdc.automation.pages;

import java.io.IOException;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import sfdc.automation.utils.SeleniumUtil;

public class SearchPage {

	
	
	SeleniumUtil seleniumUtil = SeleniumUtil.getSeleniumUtil();
	
	String xPath_searchButton = "//INPUT[@id='phSearchButton']";
	String xPath_searchInputBox = "//INPUT[@id='phSearchInput']";
	String id_searchButton = "phSearchButton";
	String xPath_searchText = "//INPUT[@id='phSearchInput']";
	String xPath_enteredtext = "//INPUT[@id='secondSearchText']";
	
	
	public void clickOnHelpButton() {
		seleniumUtil.handleNewWindowByTitle();

	}

	public void takesScreenshot() {
		seleniumUtil.testTakesScreenshot();

	}

	public void validatesHomeWindowJavaScriptCode() {
		seleniumUtil.handleHomeWindowJavaScriptCode();

	}

	

	public void ClickOnlighteningMigrationButton() {
		seleniumUtil.testWindowPopupUsingContents();
		
	}

	public void ClickOnSearchButton(String search) {
		seleniumUtil.clickElementByXpath(xPath_searchButton);
	}

	public void viewsInputBoxSearch() {
		seleniumUtil.IsElementDisplayed("//INPUT[@id='phSearchButton']");
		
	}

	public void viewsSearch() {
		seleniumUtil.IsElementDisplayed("id_searchButton");
		
		
	}

	public void entersTextInSearch(String searchText) {
		seleniumUtil.sendKeysByXPath(xPath_searchInputBox, "capitalone");
		// TODO Auto-generated method stub
		
	}

	public void viewstextEntered(String enteredText) {
		seleniumUtil.IsElementTextPresent(xPath_enteredtext);
		
	}

	public void viewsSearch(String button) {
		seleniumUtil.IsElementDisplayed(xPath_searchButton);
		// TODO Auto-generated method stub
		
	}

	public void clicksOnSearch(String inputbutton, String txt) {
		seleniumUtil.clicksOnSearch(xPath_searchInputBox, "capitalone");
		
	}

	public void clicksOnSearchbtn(String btn) {
		seleniumUtil.clickElementByXpath(xPath_searchButton);
		
	}

	
}
