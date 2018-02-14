package sfdc.automation.impl;

import org.openqa.selenium.WebElement;

public interface Cases {

	void clickOnCasesTab();

	void clickOnNewButton();

	void enterLeadName(String lastName);

	void entersCompanyName();

	void clickOnSave();
	//public void clickOnDropdownArrow();
	
	void setDropDown(String dropdown);

	void clickOnStatus();

	void clickOnorigin();

	void clickOnCasesNewButton();


}
