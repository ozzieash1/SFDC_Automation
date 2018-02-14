package sfdc.automation.pages;

import java.io.IOException;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.When;
import sfdc.automation.utils.SeleniumUtil;

public class CasesPage {

	SeleniumUtil seleniumUtil = SeleniumUtil.getSeleniumUtil();
	// Home Chatter Leads Contacts accounts etc are coming up as tablist
	public WebDriver webDriver = null;
	String xPath_NewButtonCase =  ".//INPUT[@value=' New ']";
	String xPath_NewButton = ".//input[@title='New']";
	String xPath_Password = ".//input[contains(@name,'pw')]";
	
	String xPath_CaseTab = ".//ul/li/a[contains(@title,'Cases Tab')]";
	String xPath_LeadLastName = ".//input[@id='name_lastcon2']";
	String xPath_CompanyName = ".//input[@id='lea3']";
	String xPath_UserNavButton = ".//span[@id='userNavLabel']";
	String xPath_LeadSaveBtn = ".//input[@title='Save']";
	String xPath_CaseDropdownStatus = ".//SELECT[@id='cas7']";
	String xPath_CaseDropDownOrigin = ".//SELECT[@id='cas11']";
	
	String xPath_CasesSaveBtn= ".(//INPUT[@value=' Save '])[1]";
	
	
	//WebElement cas7;
	//String status;
public CasesPage(WebDriver driver){
	PageFactory.initElements(driver, this);
}
	
	
	public void clickOnCasesTab() {
		//seleniumUtil.clickElementByXpath(".//ul/li/a[contains(@title,'Cases Tab')]");
		seleniumUtil.clickElementByXpath("xPath_CaseTab");
	}
	
/*	
	public void setDropDown(String dropdown) {
		//Select Drop_Down = new Select(webDriver.findElement(By.xpath(".//SELECT[@id='cas7']")));
		//Select Drop_Down = new Select(webDriver.findElement(By.id("cas7")));
		//Drop_Down.selectByVisibleText("New");
	
	seleniumUtil.handleDropDownItems(dropdown);
	Select sel = new Select(webDriver.findElement(By.xpath(".//SELECT[@id='cas7']")));
	sel.selectByIndex(1);
	//seleniumUtil.clickElementByXpath(xPath_CaseDropDown);
	
	}
*/
	
	public void clickOnNewButton() {
		seleniumUtil.clickElementByXpath(xPath_NewButtonCase);
		
	}

	public void clickOnStatus() {
		seleniumUtil.clickElementByXpath(xPath_CaseDropdownStatus);
		
	}

	public void clickOnOrigin() {
		seleniumUtil.clickElementByXpath(xPath_CaseDropDownOrigin);
		
	}
	/*
	public void entersCompanyName() {
		seleniumUtil.clickElementByXpath(xPath_CompanyName);
		
	}
*/
	public void clickOnSave() {
		//seleniumUtil.clickElementByXpath(xPath_LeadSaveBtn);
		seleniumUtil.clickElementByXpath(xPath_CasesSaveBtn);
	}

	

	
	

/*public void setDropDown(WebElement dropdown, String cardtype){
		
		Select card_type = new Select(driver.findElement(By.id("card_type")));
		card_type.selectByVisibleText("Visa");
		// assertEquals("Visa", CardType.getFirstSelectedOption().click());
}
*/


}
