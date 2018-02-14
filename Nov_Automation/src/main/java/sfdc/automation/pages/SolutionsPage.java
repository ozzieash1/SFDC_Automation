package sfdc.automation.pages;

import java.io.IOException;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import sfdc.automation.utils.SeleniumUtil;

public class SolutionsPage {

	SeleniumUtil seleniumUtil = SeleniumUtil.getSeleniumUtil();

	String xPath_SolutionsTab = ".//ul/li/a[contains(@title,'Solutions Tab')]";
	String xPath_NewButtonSolutions1 = ".//INPUT[@id='createSolutionsBtn']";

	String xPath_NewButtonSolutions = "//INPUT[@value=' New ']";
	String xPath_SolutionsTitle = ".//INPUT[@id='SolutionName']";
	String xPath_SolutionsSaveBtn = ".//input[@title='Save']";
	
	//String xPath_SolutionsSaveBtn
	//(//INPUT[@value=' Save '])[1] -  This Xpath which shows up for save button doesn't work for objects, using one which worked in the past
	

	public void clickOnSolutionsTab() {
		seleniumUtil.clickElementByXpath(".//ul/li/a[contains(@title,'Solutions Tab')]");

	}

	public void clickOnNewButton() {
		seleniumUtil.clickElementByXpath(xPath_NewButtonSolutions);

	}

	public void clickOnSolutionsTitle() {
		seleniumUtil.clickElementByXpath(xPath_SolutionsTitle);
	}

	public void enterSolutionsTitle(String SolutionTitle) {
		seleniumUtil.sendKeysByXPath(xPath_SolutionsTitle, SolutionTitle);
	}

	public void clickOnSolutionsSave() {
		seleniumUtil.clickElementByXpath(xPath_SolutionsSaveBtn);

	}

}
