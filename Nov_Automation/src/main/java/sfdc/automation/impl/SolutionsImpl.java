package sfdc.automation.impl;

import org.openqa.selenium.WebElement;

import sfdc.automation.pages.CasesPage;
import sfdc.automation.pages.LeadPage;
import sfdc.automation.pages.LogInPage;
import sfdc.automation.pages.OpportunitiesPage;
import sfdc.automation.pages.ProductsPage;
import sfdc.automation.pages.SolutionsPage;

public class SolutionsImpl implements Solutions {

	SolutionsPage solutionsPage = new SolutionsPage();

	public void clickOnSolutionsTab() {

		solutionsPage.clickOnSolutionsTab();

	}

	@Override
	public void clickOnNewButton() {

		solutionsPage.clickOnNewButton();
	}

	@Override
	public void enterSolutionsTitle(String SolutionsTitle) {
		solutionsPage.enterSolutionsTitle(SolutionsTitle);

	}

	@Override
	public void clickOnSolutionsSave() {
		solutionsPage.clickOnSolutionsSave();

	}

}
