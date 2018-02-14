package sfdc.automation.pages;

import java.io.IOException;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import sfdc.automation.utils.SeleniumUtil;

public class OpportunitiesPage {

	SeleniumUtil seleniumUtil = SeleniumUtil.getSeleniumUtil();

	//String xPath_NewButton = ".//input[@title='New']";
	String xPath_NewButtonOpportunities = "//INPUT[@value=' New ']";
	String xPath_Password = ".//input[contains(@name,'pw')]";
	String xPath_UserNavButton = ".//span[@id='userNavLabel']";
	//String xPath_AssetsTab = ".//ul/li/a[contains(@title,'Assets Tab')]";
	String xPath_OpportunitiesTab = ".//ul/li/a[contains(@title,'Opportunities Tab')]";
	//String xPath_AssetsName = ".//INPUT[@id='Name']";
	String xPath_OpportunityName = ".//INPUT[@id='opp3']";
	
	String xPath_NewButtonAssets = ".//INPUT[@value=' New ']";
	//String xPath_AssetsSaveBtn = ".(//INPUT[@value=' Save '])[2]";
	
	//String xPath_ProductsSaveBtn = ".(//INPUT[@value=' Save '])[2]";
	//String xPath_ProductsSaveBtn = ".(//INPUT[@value=' Save '])[1]";
	//String xPath_ProductsSaveBtn = ".//input[@title='Save']";

	
	public void clickOnOpportunitiesTab() {
		seleniumUtil.clickElementByXpath(".//ul/li/a[contains(@title,'Opportunities Tab')]");
		//seleniumUtil.clickElementByXpath(xPath_ProductsTab);

	}

	public void clickOnNewButton() {
		seleniumUtil.clickElementByXpath(xPath_NewButtonOpportunities);

	}

	public void clickOnOpportunityName() {
		seleniumUtil.clickElementByXpath(xPath_OpportunityName);
	}

	public void enterOpportunityName(String opportunityName) {
		seleniumUtil.sendKeysByXPath(xPath_OpportunityName, opportunityName);
	}	
	
	/*public void clickOnSave() {
	seleniumUtil.clickElementByXpath(xPath_LeadSaveBtn);
	
}*/
	
	//public void clickOnProductsSave() {
	//	seleniumUtil.clickElementByXpath(xPath_ProductsSaveBtn); }

	

	




}
