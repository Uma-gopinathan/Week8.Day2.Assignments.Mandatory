package com.leaftaps.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class ContactsLookUpPage extends ProjectSpecificMethods{
	public MergeContactsPage clickContactIDLink(int linkNum) {
		switchToWindow(1);									//moving control to 2nd window	- Contact Lookups Page
		reportStep("Clicked the Contact lookup button","pass");
		String XPath="(//td[contains(@class,'x-grid3-cell-first')]/div/a)["+linkNum+"]";
		click(locateElement(Locators.XPATH, XPath));		//click the first contact id link - window closes automatically
		switchToWindow(0); 									//Switching back to 1st window - 
		return new MergeContactsPage();		
	}
}