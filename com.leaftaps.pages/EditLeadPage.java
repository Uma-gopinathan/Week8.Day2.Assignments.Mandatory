package com.leaftaps.pages;
import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class EditLeadPage extends ProjectSpecificMethods{
	public EditLeadPage enterCompanyName(String strNewCompany) {
		clearAndType(locateElement(Locators.XPATH,"//span[text()='Company Name']/following::input[@name='companyName']"), strNewCompany);//enter company name
		reportStep(strNewCompany+" :company name is entered successfully","pass");
		return this;
	}
	
	public ViewLeadPage clickUpdateBtnInEditLeadPage() {
		click(locateElement(Locators.XPATH, "//input[@value='Update']"));
		reportStep("Clicked the Update button after editing the lead","pass");
		return new ViewLeadPage();
	}
}