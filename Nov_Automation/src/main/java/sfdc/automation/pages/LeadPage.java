package sfdc.automation.pages;

import java.io.IOException;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import sfdc.automation.utils.SeleniumUtil;

public class LeadPage {

	SeleniumUtil seleniumUtil = SeleniumUtil.getSeleniumUtil();
	// Home Chatter Leads Contacts accounts etc are coming up as tablist
	
	String xPath_NewButton = ".//input[@title='New']";
	String xPath_Password = ".//input[contains(@name,'pw')]";
	//String xPath_LeadLastName = ".//input[@id='name_lastcon2']";
	String xPath_LeadLastName =".//INPUT[@id='name_lastlea2']";
	String xPath_CompanyName = ".//input[@id='lea3']";  
	String xPath_UserNavButton = ".//span[@id='userNavLabel']";
	String xPath_LeadSaveBtn = ".//input[@title='Save']";
	String xPath_Status = ".//SELECT[@id='lea13']";
	String xPath_leadSource = "//SELECT[@id='lea5']";
	String xPath_leadindustry = "//SELECT[@id='lea6']";
	

	public void clickOnLeadsTab() {
		seleniumUtil.clickElementByXpath(".//ul/li/a[contains(@title,'Leads Tab')]");
		
	}

	public void clickOnNewButton() {
		seleniumUtil.clickElementByXpath(xPath_NewButton);
		
	}

	public void enterLeadName(String lastName) {
		seleniumUtil.sendKeysByXPath(xPath_LeadLastName, lastName);
		
	}

	public void entersCompanyName(String companyName) {
		seleniumUtil.sendKeysByXPath(xPath_CompanyName, companyName);
		
	}

	public void clickOnSave() {
		seleniumUtil.clickElementByXpath(xPath_LeadSaveBtn);
		
	}


	public void clickOnStatus() {
		seleniumUtil.clickElementByXpath(xPath_Status);
		
	}

	public void selectFromLeadSourceDropdown(String leadSource) {

		seleniumUtil.handleDropDownItems(xPath_leadSource,leadSource );
	}
	
	public void selectFromLeadIndustryDropdown(String leadIndustry) {

		seleniumUtil.handleDropDownItems(xPath_leadindustry,leadIndustry );
	}


	//selectFromLeadIndustryDropdown


}
