package com.leaftaps.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class ViewLeadPage extends ProjectSpecificMethods {

	public ViewLeadPage verifyFirstName(String data) {		//Existing method
		verifyExactText(locateElement(Locators.ID,"viewLead_firstName_sp"), data);
		reportStep(data+" is matching with first name", "pass");
		return this;
	}
	public ViewLeadPage verifyLeadDuplicated(String data) {		//Existing method
		verifyExactText(locateElement(Locators.ID,"viewLead_firstName_sp"), data);
		reportStep(data+" :is matching with first name.Lead has been duplicated.", "pass");
		return this;
	}
	public MyLeadsPage clickDeleteLinkViewLeadsPage() {		//Click Delete Link 
		//Delete lead
		click(locateElement(Locators.LINK_TEXT, "Delete"));		
		reportStep("Delete link is clicked from the View Leads page", "pass");
		return new MyLeadsPage();
	}
	public EditLeadPage clickEditButtonInViewLeadsPage() {		//Click the Edit lead link
		click(locateElement(Locators.LINK_TEXT, "Edit"));		
		reportStep("Edit link is clicked from the View Leads page", "pass");
		return new EditLeadPage();
	}
	public ViewLeadPage verifyEditedLead(String newCompanyName) {		
		boolean textMatch=verifyExactText(locateElement(Locators.XPATH, "//span[@id='viewLead_companyName_sp']"), newCompanyName);
		if(textMatch==true){  //updated company is displayed
			reportStep("Changed company name is updated in the lead","Pass");
		}
		return this;
	}
	public DuplicateLeadPage clickDuplicateLeadLink() {
		click(locateElement(Locators.LINK_TEXT, "Duplicate Lead"));
		reportStep("Duplicate lead link is clicked from the View Leads page", "pass");
		return new DuplicateLeadPage();
	}
}
