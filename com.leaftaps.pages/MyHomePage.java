package com.leaftaps.pages;
import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;
//import com.leaftaps.pages.ContactsPage;

public class MyHomePage extends ProjectSpecificMethods{
	
	public MyLeadsPage clickLeadsTab() {
		click(locateElement(Locators.LINK_TEXT, "Leads"));
		reportStep("Clicked the Leads tab", "pass");
		return new MyLeadsPage();
	}
	public ContactsPage clickContactsTab() {
		click(locateElement(Locators.LINK_TEXT, "Contacts"));
		reportStep("Clicked the Contacts tab", "pass");
		return new ContactsPage();
	}
}
