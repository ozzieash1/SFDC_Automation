package sfdc.automation.pages;

import java.io.IOException;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import sfdc.automation.utils.SeleniumUtil;

public class ProductsPage {

	SeleniumUtil seleniumUtil = SeleniumUtil.getSeleniumUtil();

	String xPath_NewButton = ".//input[@title='New']";
	String xPath_NewButtonProducts = "//INPUT[@value=' New ']";
	String xPath_Password = ".//input[contains(@name,'pw')]";
	String xPath_UserNavButton = ".//span[@id='userNavLabel']";
	//String xPath_AssetsTab = ".//ul/li/a[contains(@title,'Assets Tab')]";
	String xPath_ProductsTab = ".//ul/li/a[contains(@title,'Products Tab')]";
	//String xPath_AssetsName = ".//INPUT[@id='Name']";
	String xPath_ProductsName = ".//INPUT[@id='Name']";
	
	String xPath_NewButtonAssets = ".//INPUT[@value=' New ']";
	//String xPath_AssetsSaveBtn = ".(//INPUT[@value=' Save '])[2]";
	
	//String xPath_ProductsSaveBtn = ".(//INPUT[@value=' Save '])[2]";
	//String xPath_ProductsSaveBtn = ".(//INPUT[@value=' Save '])[1]";
	String xPath_ProductsSaveBtn = ".//input[@title='Save']";

	
	public void clickOnProductsTab() {
		seleniumUtil.clickElementByXpath(".//ul/li/a[contains(@title,'Products Tab')]");
		//seleniumUtil.clickElementByXpath(xPath_ProductsTab);

	}

	public void clickOnNewButton() {
		seleniumUtil.clickElementByXpath(xPath_NewButtonProducts);

	}

	public void clickOnProductsName() {
		seleniumUtil.clickElementByXpath(xPath_ProductsName);
	}

	public void enterProductsName(String prodName) {
		seleniumUtil.sendKeysByXPath(xPath_ProductsName, prodName);
	}	
	
	/*public void clickOnSave() {
	seleniumUtil.clickElementByXpath(xPath_LeadSaveBtn);
	
}*/
	
	public void clickOnProductsSave() {
		seleniumUtil.clickElementByXpath(xPath_ProductsSaveBtn);

	}

	




}
