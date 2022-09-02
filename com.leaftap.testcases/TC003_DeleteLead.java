package com.leaftaps.testcases;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.leaftaps.pages.LoginPage;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class TC003_DeleteLead extends ProjectSpecificMethods{
	@BeforeTest
	public void setValues() {
		testcaseName = "Delete Lead";
		testDescription ="Delete Lead from find leads search results(search using phon numner) and verify if it is deleted";
		authors="Uma";
		category ="Sanity";
		excelFileName="DeleteLead";
	}
	@Test(dataProvider = "fetchData")
	public void deleteLead(String username,String password,String countryCode,String areaCode,String phoneNum) throws InterruptedException {
		new LoginPage()
		.enterUsername(username)
		.enterPassword(password)
		.clickLogin()
		.clickCrmsfaLink()
		.clickLeadsTab()
		.clickFindLeadsLink()
		.clickPhoneTab()
		.enterCountryCode(countryCode)
		.enterAreaCode(areaCode)
		.enterPhoneNumber(phoneNum)
		.clickFindLeadsBtnInFindLeadsPage()
		.clickLeadIDLinkFromSearchResults()
		.clickDeleteLinkViewLeadsPage()
		.clickFindLeadsLink()
		.enterLeadIDInFindLeadsPageForDeletedLead()
		.clickFindLeadsBtnInFindLeadsPage()
		.verifyNoRecordsMessage();

	}
}
