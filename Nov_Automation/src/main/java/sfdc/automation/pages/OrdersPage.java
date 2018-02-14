package sfdc.automation.pages;

import java.io.IOException;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import sfdc.automation.utils.SeleniumUtil;

public class OrdersPage {

	SeleniumUtil seleniumUtil = SeleniumUtil.getSeleniumUtil();

	String xPath_NewButton = ".//input[@title='New']";
	String xPath_Password = ".//input[contains(@name,'pw')]";
	String xPath_UserNavButton = ".//span[@id='userNavLabel']";
	String xPath_AssetsTab = ".//ul/li/a[contains(@title,'Assets Tab')]";
	String xPath_AssetsName = ".//INPUT[@id='Name']";
	String xPath_NewButtonAssets = ".//INPUT[@value=' New ']";
	String xPath_AssetsSaveBtn = ".(//INPUT[@value=' Save '])[2]";

	public void clickOnAssetsTab() {
		seleniumUtil.clickElementByXpath(".//ul/li/a[contains(@title,'Assets Tab')]");
		seleniumUtil.clickElementByXpath(xPath_AssetsTab);

	}

	public void clickOnNewButton() {
		seleniumUtil.clickElementByXpath(xPath_NewButtonAssets);

	}

	public void clickOnAssetsName() {
		seleniumUtil.clickElementByXpath(xPath_AssetsName);
	}

	public void clickOnSave() {
		seleniumUtil.clickElementByXpath(xPath_AssetsSaveBtn);

	}

}
