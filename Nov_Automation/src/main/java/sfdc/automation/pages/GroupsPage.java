package sfdc.automation.pages;

import java.io.IOException;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import sfdc.automation.utils.SeleniumUtil;

public class GroupsPage {

	SeleniumUtil seleniumUtil = SeleniumUtil.getSeleniumUtil();

	
	String xPath_GroupsTab = ".//ul/li/a[contains(@title,'Groups Tab')]";
	String xPath_NewButtonGroups = ".//INPUT[@id='createGroupBtn']";
	String xPath_GroupsName = ".//INPUT[@id='chatterFormGroupName']";
	String xPath_GroupsSaveBtn =".(//INPUT[@class='btn saveBtn confirm-group-scope'])[1]";
	
	
	
	/*String xPath_NewButton = ".//input[@title='New']";
	
	String xPath_Password = ".//input[contains(@name,'pw')]";
	String xPath_UserNavButton = ".//span[@id='userNavLabel']";
	//String xPath_AssetsTab = ".//ul/li/a[contains(@title,'Assets Tab')]";
	
	//String xPath_AssetsName = ".//INPUT[@id='Name']";
	
	
	//String xPath_NewButtonGroups = ".//INPUT[@id='createGroupBtn']";
	//String xPath_AssetsSaveBtn = ".(//INPUT[@value=' Save '])[2]";
	
	//String xPath_ProductsSaveBtn = ".(//INPUT[@value=' Save '])[2]";
	*/
	
	public void clickOnGroupsTab() {
		seleniumUtil.clickElementByXpath(".//ul/li/a[contains(@title,'Groups Tab')]");
		//seleniumUtil.clickElementByXpath(xPath_ProductsTab);

	}

	public void clickOnNewButton() {
		seleniumUtil.clickElementByXpath(xPath_NewButtonGroups);

	}

	public void clickOnGroupsName() {
		seleniumUtil.clickElementByXpath(xPath_GroupsName);
	}

	public void enterGroupsName(String groupName) {
		seleniumUtil.sendKeysByXPath(xPath_GroupsName, groupName);
	}	
	
/*	public void clickOnAssetsName() {
		seleniumUtil.clickElementByXpath(xPath_AssetsName);
	}*/
	
	
	public void clickOnProductsSave() {
		seleniumUtil.clickElementByXpath(xPath_GroupsSaveBtn);

	}

}
