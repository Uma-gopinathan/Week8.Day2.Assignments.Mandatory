package com.leaftaps.testcases;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.framework.testng.api.base.ProjectSpecificMethods;
import com.leaftaps.pages.LoginPage;

public class TC005_MergeLeads extends ProjectSpecificMethods{
	@BeforeTest
	public void setValues() {
		testcaseName = "Merge Lead";
		testDescription ="Merge two leads(lookup using firstname) in Leaftaps";
		authors="Uma";
		category ="Regression";
		excelFileName="MergeLead";
	}

	@Test(dataProvider = "fetchData")
	public void runMergeLead(String username,String password,String firstName) throws InterruptedException {
		new LoginPage()
		.enterUsername(username).
		enterPassword(password).
		clickLogin().
		clickCrmsfaLink().
		clickLeadsTab().
		clickMergeLeadsLink().
		clickFromLeadLookUpBtn().
		enterFirstNameInFindLeadsLookupPage(firstName).
		clickFindLeadsBtnFromLeadsLookUpPage().
		clickLeadIDLinkFromLeadsLookupPage(1).
		verifyFromLeadIDIsPopulated().
		clickToLeadLookUpBtn().
		enterFirstNameInFindLeadsLookupPage(firstName).
		clickFindLeadsBtnFromLeadsLookUpPage().
		clickLeadIDLinkFromLeadsLookupPage(2).
		verifyToLeadIDIsPopulated().
		clickMergeBtnInMergeLeadsPage().
		verifyFirstName(firstName);
		//verifyLeadIsCreated();
	}
}
