package sfdc.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import sfdc.automation.utils.SeleniumUtil;

public class CampaignPage {
	SeleniumUtil seleniumUtil = SeleniumUtil.getSeleniumUtil();
	// Home Chatter Leads Contacts accounts etc are coming up as tablist
	public WebDriver webDriver = null;
	String xPath_NewButton = ".//input[@title='New']";
	String xPath_Password = ".//input[contains(@name,'pw')]";
	
	String xPath_CampaignTab = ".//ul/li/a[contains(@title,'Campaigns Tab')]";
	String xPath_CampaignName = ".//INPUT[@id='cpn1']";
	String xPath_CampaignSaveBtn = ".(//INPUT[@value=' Save '])[1]";

	
	
	public CampaignPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void CampaignPage1(WebDriver driver) {
		// TODO Auto-generated constructor stub
	}

	public void clickOnCampaignTab() {
		//seleniumUtil.clickElementByXpath(".//ul/li/a[contains(@title,'Campaigns Tab')]");
		seleniumUtil.clickElementByXpath(xPath_CampaignTab);
	}

	public void clickOnNewButton() {
		seleniumUtil.clickElementByXpath(xPath_NewButton);

	}

	public void entercampaignName(String campaignName) {
		seleniumUtil.sendKeysByXPath(xPath_CampaignName, campaignName);
	}


	public void clickOnSave() {
		seleniumUtil.clickElementByXpath(xPath_CampaignSaveBtn);

	}

}
