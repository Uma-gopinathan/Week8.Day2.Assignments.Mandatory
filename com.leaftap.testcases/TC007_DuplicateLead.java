package com.leaftaps.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.leaftaps.pages.LoginPage;

public class TC007_DuplicateLead extends ProjectSpecificMethods{
	@BeforeTest
	public void setValues() {
		testcaseName = "Duplicate Lead";
		testDescription ="Create a new Lead with mandatory fields and crete another lead by duplicaing it";
		authors="Uma";
		category ="Regression";
		excelFileName="DuplicateLead";
	}
	@Test(dataProvider = "fetchData")
	public void runDuplicateLead(String username, String password,String fName,String lName,String company,String fNameLocal,String emailID,String deptName,String desc,String company2,String fName2) {
		new LoginPage()
		.enterUsername(username)
		.enterPassword(password)
		.clickLogin()
		.clickCrmsfaLink()
		.clickLeadsTab()
		.clickCreateLeadLink()
		.enterFirstName(fName)
		.enterFirstNameLocal(fNameLocal)
		.enterLastName(lName)
		.enterCompanyName(company)
		.EnterEmailID(emailID)
		.EnterDepartmentName(deptName)
		.EnterDescription(desc)
		.clickCreateLeadButton()
		.clickDuplicateLeadLink()
		.enterCompanyName(company2)
		.enterFirstName(fName2)
		.clickCreateLeadButtonInDuplicateLeadPage()
		.verifyLeadDuplicated(fName2);
	}
}
