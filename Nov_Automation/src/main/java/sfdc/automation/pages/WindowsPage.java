package sfdc.automation.pages;

import java.io.IOException;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import sfdc.automation.utils.SeleniumUtil;

public class WindowsPage {

	SeleniumUtil seleniumUtil = SeleniumUtil.getSeleniumUtil();

	public void clickOnHelpButton() {
		seleniumUtil.handleNewWindowByTitle();

	}

	public void takesScreenshot() {
		seleniumUtil.testTakesScreenshot();

	}

	public void validatesHomeWindowJavaScriptCode() {
		seleniumUtil.handleHomeWindowJavaScriptCode();

	}

}
