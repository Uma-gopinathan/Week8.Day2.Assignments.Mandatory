package com.leaftaps.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class ContactsPage extends ProjectSpecificMethods{
	public MergeContactsPage clickMergeContactsLinkFromContactsPage() throws InterruptedException {
		click(locateElement(Locators.XPATH, "//a[text()='Merge Contacts']"));
		reportStep("Merge Contacts link is clicked successfully from Contacts Page","pass");
		return new MergeContactsPage();
	} 
}