package com.leaftaps.pages;
import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class FindLeadsLookUpPage extends ProjectSpecificMethods{
	public FindLeadsLookUpPage enterFirstNameInFindLeadsLookupPage(String firstName) {				//Enter the first name
		clearAndType(locateElement(Locators.NAME, "firstName"), firstName);
		reportStep(firstName+" :First name is entered successfully in the lead lookup window","pass");
		return this;
	}
	public FindLeadsLookUpPage clickFindLeadsBtnFromLeadsLookUpPage() throws InterruptedException {			//Click Find Leads Button
		click(locateElement(Locators.XPATH, "//button[text()='Find Leads']"));
		reportStep("Clicked the Find Leads button from the Find Leads lookup page","pass");
		return this;
	}
	public MergeLeadsPage clickLeadIDLinkFromLeadsLookupPage(int linkNum) {
		String XPath = "(//td[contains(@class,'x-grid3-cell-first')]/div/a)["+linkNum+"]";
		strLeadID = getElementText(locateElement(Locators.XPATH, XPath));		//Retrieve the lead 
		reportStep(strLeadID+ " :The lead id from the From Lead Look up page to be clicked","info");
		click(locateElement(Locators.XPATH, XPath));	
		System.out.println(strLeadID+"  :Clicked the lead id from the find leads lookup page");
		//move control to first window
		switchToWindow(0);
		return new MergeLeadsPage();
	}
}