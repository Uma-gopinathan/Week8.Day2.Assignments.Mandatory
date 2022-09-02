package com.leaftaps.pages;

import org.openqa.selenium.JavascriptExecutor;
import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class CreateLeadPage extends ProjectSpecificMethods{
	
	public CreateLeadPage enterCompanyName(String data) {				//Enter company name
		clearAndType(locateElement(Locators.ID, "createLeadForm_companyName"), data);
		reportStep(data+" company name is entered successfully","pass");
		return this;
	}
	public CreateLeadPage enterFirstName(String data) {					//Enter first name
		clearAndType(locateElement(Locators.ID, "createLeadForm_firstName"), data);
		reportStep(data+" first name is entered successfully","pass");
		return this;
	}
	
	public CreateLeadPage enterLastName(String data) {						//Enter last name
		clearAndType(locateElement(Locators.ID, "createLeadForm_lastName"), data);
		reportStep(data+" last name is entered successfully","pass");
		return this;
	}
	
	public CreateLeadPage enterFirstNameLocal(String data) {				//Enter first name local
		clearAndType(locateElement(Locators.ID, "createLeadForm_firstNameLocal"), data);
		reportStep(data+" first name-local is entered successfully","pass");
		return this;
	}
	public CreateLeadPage EnterDepartmentName(String data) {				//Enter department name
		clearAndType(locateElement(Locators.ID, "createLeadForm_departmentName"), data);
		reportStep(data+" department name is entered successfully","pass");
		return this;
	}
	public CreateLeadPage EnterDescription(String data) {				//Enter description
		clearAndType(locateElement(Locators.ID, "createLeadForm_description"), data);
		reportStep(data+" description is entered successfully","pass");
		return this;
	}
	public CreateLeadPage EnterEmailID(String data) {				//Enter email id
		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		String arg="arguments[0].value='"+data+"'";
		jse.executeScript(arg,locateElement(Locators.NAME, "primaryEmail"));
		reportStep(data+" email id is entered successfully","pass");
		return this;
	}
	public CreateLeadPage selectProvince(String data) {				//Select state or province
		selectDropDownUsingText(locateElement(Locators.ID, "createLeadForm_generalStateProvinceGeoId"), data);
		reportStep(data+" state or province is entered successfully","pass");
		return this;
	}	
	public ViewLeadPage clickCreateLeadButton() {
		click(locateElement(Locators.NAME, "submitButton"));
		reportStep("Create Lead button is clicked successfully", "pass");
		return new ViewLeadPage();
	}

}
