package com.leaftaps.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class DuplicateLeadPage extends ProjectSpecificMethods {
	public DuplicateLeadPage enterCompanyName(String data) {			//Enter company Name
		clearAndType(locateElement(Locators.ID, "createLeadForm_companyName"), data);
		reportStep("Entered the company name in the duplicate leads page","pass");
		return this;
	}
	public DuplicateLeadPage enterFirstName(String data) {				//Click the first name
		clearAndType(locateElement(Locators.ID, "createLeadForm_firstName"), data);
		reportStep("Entered the first name in the duplicate leads page","pass");
		return this;
	}	
	public ViewLeadPage clickCreateLeadButtonInDuplicateLeadPage() {			//Click the Submit button		
		click(locateElement(Locators.NAME, "submitButton"));
		reportStep("Create Lead button is clicked successfully", "pass");
		return new ViewLeadPage();
	}
}
