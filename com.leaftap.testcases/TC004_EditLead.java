package com.leaftaps.testcases;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.framework.testng.api.base.ProjectSpecificMethods;
import com.leaftaps.pages.LoginPage;

public class TC004_EditLead extends ProjectSpecificMethods{
	@BeforeTest
	public void setValues() {
		testcaseName = "Edit Lead";
		testDescription ="Edit existing leads(search using first name) in Leaftaps";
		authors="Uma";
		category ="Regression";
		excelFileName="EditLead";
	}

	@Test(dataProvider = "fetchData")
	public void editLeadPage(String username,String password,String firstName,String newCompanyName) throws InterruptedException {
		new LoginPage()
		.enterUsername(username)
		.enterPassword(password)
		.clickLogin()
		.clickCrmsfaLink()
		.clickLeadsTab()
		.clickFindLeadsLink()
		.enterFirstNameInFindLeadsPage(firstName)
		.clickFindLeadsBtnInFindLeadsPage()
		.clickLeadIDLinkFromSearchResults()
		.clickEditButtonInViewLeadsPage()
		.enterCompanyName(newCompanyName)
		.clickUpdateBtnInEditLeadPage()
		.verifyEditedLead(newCompanyName);
	}
}