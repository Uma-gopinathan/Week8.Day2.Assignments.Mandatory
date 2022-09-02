package com.leaftaps.testcases;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.framework.testng.api.base.ProjectSpecificMethods;
import com.leaftaps.pages.LoginPage;

public class TC006_MergeContacts extends ProjectSpecificMethods {
	@BeforeTest
	public void setValues() {
		testcaseName = "Merge Contact";
		testDescription ="Merge two contacts in Leaftaps";
		authors="Uma";
		category ="Smoke";
		excelFileName="MergeContacts";
	}

	@Test(dataProvider = "fetchData")
	public void runMergeContacts(String username,String password) throws InterruptedException {
		new LoginPage()
		.enterUsername(username).
		enterPassword(password).
		clickLogin().
		clickCrmsfaLink().
		clickContactsTab().
		clickMergeContactsLinkFromContactsPage().
		clickFromContactLookupBtnInMergeContactsPage().
		clickContactIDLink(1).verifyFromContactAfterSelection().
		clickToContactLookupBtnInMergeContactsPage().
		clickContactIDLink(2).verifyToContactAfterSelection().
		clickMergeBtnInMergeContactsPage().
		veifyMergedContacts();
	}
}
