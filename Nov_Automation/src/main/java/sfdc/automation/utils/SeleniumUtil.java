package sfdc.automation.utils;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.swing.text.Document;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

import junit.framework.Assert;

public class SeleniumUtil {

	/*
	 * I will create a null object of WebDriver Interface since WebDriver is an
	 * Interface And we can't instantiate an object of an Interface. So, we will
	 * instantiate it whenever required by implementation of WebDriver Interface
	 * that is ChromeDriver/whichever as we see on around line #47 webDriver =
	 * new ChromeDriver(); webDriver = new FirefoxDriver();
	 */

	public WebDriver webDriver = null;
	/*
	 * I don't need more than one object of WebDriver. Because, if I have more
	 * than one Driver They will keep opening new browser/windows. And
	 * SeleniumUtil Class is responsible for creating the object of WebDriver,
	 * so we do not need more than one object of SeleniumUtil at Application
	 * Level. To achieve this we will be using Singleton Java Pattern. In this
	 * pattern I will make SeleniumUtil Constructor as private so that no one
	 * can create its object and I will create a static method in SeleniumUtil
	 * to get the object of SeleniumUtil Class. And in this method, I will
	 * check whether I already have object of SeleniumUtil class or not. If it
	 * already exists, then I will return the object else if I am 
	 * initializing it for the first time I will create a new object and return
	 * it. So,if anyone wants to create the object of the class SeleniumUtil,
	 * he/she can use the static method I created
	 * 
	 */
	private static SeleniumUtil seleniumUtil;

	public static SeleniumUtil getSeleniumUtil() {
		if (seleniumUtil == null) {
			seleniumUtil = new SeleniumUtil("chrome");
			// seleniumUtil = new SeleniumUtil("firefox");
			return seleniumUtil;
		} else {
			return seleniumUtil;
		}
	}

	/**
	 * @param browser
	 */
	private SeleniumUtil(String browser) {
		// This is to check whether wedDriver is initiated or Not.
		// So, it it is first time means WebDriver is null, then only, we will
		// go inside
		// and initialize the driver
		if (webDriver == null) {

			System.setProperty("webdriver.gecko.driver", "C:/WS/geckodriver.exe");
			System.setProperty("webdriver.chrome.driver", "C:/WS_NOV/chromedriver.exe");
			if (browser.equalsIgnoreCase("firefox")) {
				webDriver = new FirefoxDriver();
			} else if (browser.equalsIgnoreCase("chrome")) {
				webDriver = new ChromeDriver();

				webDriver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

			} else if (browser.equalsIgnoreCase("IE")) {

			} else {
				webDriver = new FirefoxDriver();
			}
			webDriver.manage().window().maximize();

		}
	}

	public void navigateTo(String url) {
		webDriver.get(url);
	}

	public void waitFluent() {

		WebDriverWait wait = new WebDriverWait(webDriver, 10);
		wait.ignoring(NoSuchElementException.class);
		/*
		 * Wait<webDriver> wait = new FluentWait<webDriver>(webDriver)
		 * .withTimeout(30, SECONDS) .pollingEvery(5, SECONDS)
		 * .ignoring(NoSuchElementException.class);
		 */
	}

	@Deprecated
	public void logInSalesForce(String userName, String passWord) {

		// webDriver.findElement(By.id("username")).sendKeys("ulfat.a.ashraf1@gmail.com");
		// webDriver.findElement(By.id("password")).sendKeys("ss85926056");
		// webDriver.findElement(By.name("Login")).click();

		System.out.println("Entering User salesForce LogIn" + userName + passWord);

	}

	// Highlight the name of the method (sendKeysByXPath) then press Alt + Shift
	// + J ; this will add a Java doc comment

	/**
	 * This method will use two parameters xPath of a web element and the value
	 * entered by the user
	 * @param xPath
	 * @param value
	 */
	public void sendKeysByXPath(String xPath, String value) {
		WebElement elementToEnterValue = webDriver.findElement(By.xpath(xPath));
		elementToEnterValue.sendKeys(value);
	}
		// Get web element of input field from given xpath
		// To enter a value in a input field on a web page, first by the use of
		// findelementmethod in WebDriver Class, we will get the element of the
		// the input field
		

		// Now we will enter a given value into the selected web element by
		// using sendKeys Method of WebElement Class
		
		// elementToEnterValue.

		// WebElement is an Interface; sendKeys method returns Void, we don't
		// need to assign any object to it.

	

	public void clickElementByXpath(String xPath) {
		WebElement elementToBeClicked = webDriver.findElement(By.xpath(xPath));
		elementToBeClicked.click();
	}

	public void testElementText(String xpath) {
		WebElement message = webDriver.findElement(By.xpath(xpath));
		String messageText = message.getText();
		assertEquals("Reports & Dashboard", messageText);

	}

	public void testReportstatusElementText(String xpath) {
		WebElement message = webDriver.findElement(By.xpath(xpath));
		String messageText = message.getText();
		assertEquals("complete", messageText);

	}

	// public void handleDropDownItems(String dropdown)
	/**
	 * @param dropdown
	 * @param value
	 */
	public void handleDropDownItems(String dropdown, String value) {
		// Select sel = new
		// Select(webDriver.findElement(By.xpath(".//SELECT[@id='cas7']")));
		Select select = new Select(webDriver.findElement(By.xpath(dropdown)));
		// select.selectByIndex(6);
		select.selectByValue(value);
		// select.deselectByVisibleText("");
		assertFalse(select.isMultiple());
		assertEquals(1, select.getAllSelectedOptions().size());
		// Select Drop_Down = new Select(webDriver.findElement(By.xpath("")));
		// Drop_Down.selectByVisibleText("New");
		// assertEquals("Visa", CardType.getFirstSelectedOption().click());

	}

	/**
	 * This method will take Input Parameter as a tab name. And will create an
	 * xPath from the given input parameter And it will try to find the element
	 * for this xpath and will return true if the element does exist or will
	 * return false if tag is not on the screen
	 * 
	 * @param tabName
	 * @return
	 */
	public boolean isTabDisplayed(String tabName) {
		String tabXpath = ".//ul/li/a[contains(@title,'" + tabName + " Tab')]";

		WebElement tabElement = webDriver.findElement(By.xpath(tabXpath));

		if (tabElement == null) {
			return false;
		} else {
			return true;
		}

	}

	public void takeScreenShot() throws IOException {
		File file = ((TakesScreenshot) webDriver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("c:\\screenshot.png"));
	}

	public void clickOnUserNavButton(String xPath_UserNavButton) {
		// TODO Auto-generated method stub

	}

	public void clickOnLogOutButton(String xPath_LogOutButton) {
		// TODO Auto-generated method stub

	}

	public void handleJavaScriptCode() {
		// how to execute javaScript in selenium
		JavascriptExecutor js = (JavascriptExecutor) webDriver;
		String title = (String) js.executeScript("return document.title");
		assertEquals("Accounts: Home ~ Salesforce - Developer Edition", title);
		long links = (Long) js.executeScript("var links = document.getElementsByTagName('A'); return links.length");
		// assertEquals(107, links);
		js.executeScript("return window.length");

	}

	public void handleHomeWindowJavaScriptCode() {
		// how to execute javaScript in selenium
		JavascriptExecutor js = (JavascriptExecutor) webDriver;
		String title = (String) js.executeScript("return document.title");
		assertEquals("Home Page ~ Salesforce - Developer Edition", title);
		long links = (Long) js.executeScript("var links = document.getElementsByTagName('A'); return links.length");
		assertEquals(924, links);
		js.executeScript("return window.length");

	}

	// Help | Training | Salesforce

	public void IsElementDisplayed(String xPath) {
		WebElement tabElement = webDriver.findElement(By.xpath(xPath));

		if (tabElement == null) {
			Assert.fail("unable to find element");
		}

	}

	// How do i verify Alert present in the UI
	public void isAlertPresent(String alert) {
		webDriver.switchTo().alert();
	}

	public boolean isAlertPresent2(String alert) {
		try {
			webDriver.switchTo().alert();
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public void isAlertAccepted(String alertacceptance) {
		webDriver.switchTo().alert().accept();

	}

	public void isAlertDismissed(String alertDismissed) {
		webDriver.switchTo().alert().dismiss();

	}

	// How do i get the text of the alert
	public void getAlertTest(String alertText) {
		Alert text = webDriver.switchTo().alert();
		System.out.println(text.getText());
	}

	// To switch/select to iFrame- three ways frames can be selected 1. based on
	// index (int), 2.object (String) and 3.Web Element.
	public void switcgToFrame(String frame) {
		webDriver.switchTo().frame(0); // zeroth index
		webDriver.switchTo().frame("frame");// based on name/object
		webDriver.switchTo().frame(webDriver.findElement(By.xpath("")));
		// based on web element

	}

	// Window handles in selenium-three methods available

	// Help (New Window)
	public void handleNewWindowByTitle() {
		String parentWindowId = webDriver.getWindowHandle();
		// window where i am performing the action
		WebElement Help = webDriver.findElement(By.xpath(
				"//A[@href='javascript:openPopupFocusEscapePounds(%27https://login.salesforce.com/services/auth/sso/00D30000000XsfGEAS/HTAuthProvider?startURL=%252Fapex%252Fhtdoor%253Flanguage%253Den_US%2526release%253D212.7.8%2526instance%253DNA35&site=https%3A%2F%2Fhelp.salesforce.com%27, %27Help%27, 1024, 768, %27width=1024,height=768,resizable=yes,toolbar=yes,status=yes,scrollbars=yes,menubar=yes,directories=no,location=yes,dependant=no%27, false, false);'][text()='Help']"));
		Help.click();

		Set<String> allWindows = webDriver.getWindowHandles();
		if (!allWindows.isEmpty()) {
			for (String windowId : allWindows) {
				try {
					if (webDriver.switchTo().window(windowId).getTitle().equals("Help (New Window)")) {
						webDriver.close();
						break;
					}
				} catch (NoSuchWindowException e) {
					e.printStackTrace();
				}
			}

		}

		webDriver.switchTo().window(parentWindowId);
		assertFalse(webDriver.getTitle().equals("Help (New Window)"));
	}

	public void handleWindowByTitle() {
		String parentWindowId = webDriver.getWindowHandle();
		// window where i am performing the action
		WebElement searchButton = webDriver.findElement(By.xpath("//INPUT[@id='phSearchButton']"));
		searchButton.click();
		Set<String> allWindows = webDriver.getWindowHandles();
		if (!allWindows.isEmpty()) {
			for (String windowId : allWindows) {
				try {
					if (webDriver.switchTo().window(windowId).getTitle().equals("Search...")) {
						webDriver.close();
						break;
					}
				} catch (NoSuchWindowException e) {
					e.printStackTrace();
				}
			}

		}

		webDriver.switchTo().window(parentWindowId);
		assertTrue(webDriver.getTitle().equals("Search..."));
	}

	public void handlewindow() {

		String currentWindowId = webDriver.getWindowHandle();
		WebElement searchButton = webDriver.findElement(By.xpath("//INPUT[@id='phSearchButton']"));
		searchButton.click();
		Set<String> allWindows = webDriver.getWindowHandles();
		if (!allWindows.isEmpty()) {
			for (String windowId : allWindows) {
				webDriver.switchTo().window(windowId);

				if (webDriver.getPageSource().contains("xxx")) {
					try {
						WebElement closeButton = webDriver.findElement(By.xpath("//IMG[@title='Close']"));
						closeButton.click();
						break;
					} catch (NoSuchWindowException e) {
						e.printStackTrace();
					}
				} // 312
			} // pair from line 311
			webDriver.switchTo().window(currentWindowId);
			assertTrue(webDriver.getTitle().equals("xxx"));

			// Set<String> allWindows = webDriver.getWindowHandles();
			// will give me all the windows in the UI. It returns a set windows
			// in
			// the UI
			// It returns a set of Strings and not. List allows duplicates. Set
			// does
			// not.

			Iterator<String> allWindow = allWindows.iterator();
			String ParentWindow = allWindow.next();
			// webDriver.switchTo().window(parentWindow);
			String childWindow = allWindow.next();
			webDriver.switchTo().window(childWindow);
			// how do i get back to parent/default window/page-simply switch to
			// default content
			webDriver.switchTo().defaultContent();

			System.out.println("...............................");
		}
	}

	// what are the various Wait conditions in selenium - implicit wait apply to
	// the entire page DOM and explicit wait
	public void waitConditionInSelenium() {
		webDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(webDriver, 30);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("")));

		System.out.println("...............................");
	}

	// how do I handle mouse over
	public void handleMouseOver() {

		Actions act = new Actions(webDriver);
		act.moveToElement(webDriver.findElement(By.xpath(""))).build().perform();
		System.out.println("...............................");
	}

	// how to handle drop down items

	public void handleDropDownItemss() {
		Select sel = new Select(webDriver.findElement(By.xpath("")));
		sel.selectByIndex(1);
		// sel.selectByValue("");
		// sel.selectByVisibleText("Test");
		// how do i get all data from the drop down
		sel.getOptions();
		List<WebElement> op = sel.getOptions();
		System.out.println("...............................");
	}

	// how do i handle drag & drop?

	public void handledragDrop() {
		Actions act = new Actions(webDriver);
		act.dragAndDrop(webDriver.findElement(By.xpath("")), webDriver.findElement(By.xpath("")));
		System.out.println("...............................");
	}

	// throws Exception
	public void testTakesScreenshot() {
		try {
			File scrFile = ((TakesScreenshot) webDriver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile, new File("c:\\SeleniumTest\\Screenshots\\login  " + ".png"));
			System.out.println("...............................");
		} catch (Exception e) {
			e.printStackTrace();
		}

		/*
		 * File scrFile = ((TakesScreenshot)
		 * webDriver).getScreenshotAs(OutputType.FILE);
		 * org.apache.commons.io.FileUtils.copyFile(scrFile, new File(
		 * "c:\\SeleniumTest\\Screenshots\\login  " + ".png"));
		 * System.out.println("...............................");
		 */

	}

	// how do i get screenshot in selenium
	// directly, I can't get screenshot off selenium webdriver
	// i need to cast my webDriver with Takescreenshot class
	public void getScreenshot() throws Exception {
		File scrFile = ((TakesScreenshot) webDriver).getScreenshotAs(OutputType.FILE);
		org.apache.commons.io.FileUtils.copyFile(scrFile, new File("c:\\SeleniumTest\\Screenshots\\login  " + ".png"));
		System.out.println("...............................");

	}

	// How do i get coordinators of window like x & y
	public void handleWindowCordinates() {
		webDriver.manage().window().getPosition().getX();
		webDriver.manage().window().getPosition().getY();
		Point point = webDriver.manage().window().getPosition();
		point.getX();
		point.getY();
		System.out.println("...............................");
	}

	// How do i navigate back ward & forward

	public void navigateBackwarsForward() {
		webDriver.navigate().forward();
		webDriver.navigate().back();
	}

	// how do u get the url and title and count similar objectsof the page
	public void getCurrentURL() {
		webDriver.getCurrentUrl();
		String curUrl = webDriver.getCurrentUrl();
		webDriver.getTitle();
		// int size = webDriver.findElement(By.xpath("")).getSize();

		webDriver.findElement(By.xpath("@id[@name'Test']/following-sibling::td[2]"));
		webDriver.findElement(By.xpath("@id[@name'Test']/Preceding-sibling::td[2]"));
		webDriver.findElement(By.xpath("@id[@name'Test']/child::td[2]"));
		// How do i Get fifth element in the UI
		webDriver.findElements(By.xpath("")).get(5);
		// following methods are used to handle checkbox
		webDriver.findElement(By.xpath("")).isDisplayed();
		webDriver.findElement(By.xpath("")).isSelected();
		webDriver.findElement(By.xpath("")).isEnabled();

		webDriver.manage().window().maximize();
		// Double slash is relative path, single slash is absolute path

		// how do i get attribute value

		webDriver.findElement(By.xpath("")).getAttribute("name");

		webDriver.findElement(By.xpath(" ")).sendKeys(Keys.ENTER);

	}

}// End of class SeleniumUtil
