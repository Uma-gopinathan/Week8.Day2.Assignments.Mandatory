package com.leaftaps.pages;
import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class FindLeadsPage extends ProjectSpecificMethods{
	public FindLeadsPage clickPhoneTab() {	
		click(locateElement(Locators.LINK_TEXT, "Phone"));					//Click the Phone tab in the find leads page
		reportStep("Clicked the Phone tab from the Find Leads page","pass");
		return this;
	}
	public FindLeadsPage enterFirstNameInFindLeadsPage(String firstName) {		//Enter the first name
		clearAndType(locateElement(Locators.XPATH, "(//label[text()='First name:'])[3]/following::input[@name='firstName']"), firstName);
		reportStep(firstName+" :First name is entered successfully in the Phone tab of the Find Leads Page","pass");
		return this;
	}
	public FindLeadsPage enterCountryCode(String strPhoneCountryCode) {			//Enter the phone country code
		clearAndType(locateElement(Locators.NAME, "phoneCountryCode"), strPhoneCountryCode);
		reportStep(strPhoneCountryCode+" :Phone country code code is entered","pass");
		return this;
	}
	public FindLeadsPage enterPhoneNumber(String strPhoneNumber) {				
		clearAndType(locateElement(Locators.NAME, "phoneNumber"), strPhoneNumber);		//Enter the phone number
		reportStep(strPhoneNumber+" :Phone number is entered","pass");
		return this;
	}
	public FindLeadsPage enterAreaCode(String strPhoneAreaCode) {
		clearAndType(locateElement(Locators.NAME, "phoneAreaCode"), strPhoneAreaCode);		//Enter the phone area code
		reportStep(strPhoneAreaCode+" :Area code is entered","pass");
		return this;
	}
	public FindLeadsPage clickFindLeadsBtnInFindLeadsPage() {
		click(locateElement(Locators.XPATH, "//button[text()='Find Leads']"));					//Click the find leads button
		reportStep("Clicked the Find Leads Button in the Find Leads Page","pass");
		return this;
	}
	public ViewLeadPage clickLeadIDLinkFromSearchResults() {		
		strLeadID2 = getElementText(locateElement(Locators.XPATH, "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)"));
		//clickUsingJs(locateElement(Locators.LINK_TEXT, strLeadID2));
		click(locateElement(Locators.LINK_TEXT, strLeadID2));					
		reportStep(strLeadID2+" :Clicked the lead id from the search results","pass");
		return new ViewLeadPage();
	}
	public FindLeadsPage enterLeadIDInFindLeadsPageForDeletedLead() {		//search by lead id
		clearAndType(locateElement(Locators.NAME, "id"), strLeadID2);	
		reportStep(strLeadID2+" :Enter the lead id in the Find Leads page","pass"); 
		return this;
	}
	
	public FindLeadsPage verifyNoRecordsMessage() {		//Verify lead is deleted     
		boolean textMatch= verifyExactText(locateElement(Locators.XPATH, "//div[@class='x-paging-info']"), "No records to display");//text at the end of the search results table
		//boolean textMatch2= verifyExactText(locateElement(Locators.XPATH, "//div[@class='x-paging-info']"), "displaying");
		if(textMatch==true){  //table displays no records
			reportStep("No records are displayed for the deleted lead","Pass");
		}
		return this;
	}
}