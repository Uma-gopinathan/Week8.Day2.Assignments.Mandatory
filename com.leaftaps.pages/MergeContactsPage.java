package com.leaftaps.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class MergeContactsPage extends ProjectSpecificMethods{
	public ContactsLookUpPage clickFromContactLookupBtnInMergeContactsPage() {		//Click the From contact lookup button
		click(locateElement(Locators.XPATH, "(//img[@src='/images/fieldlookup.gif'])[1]"));
		//reportStep("Clicked the from contact lookup button","pass");
		return new ContactsLookUpPage();
	}
	public MergeContactsPage verifyFromContactAfterSelection() {				//verify if the from contact is populated
		String fromContact=getElementText(locateElement(Locators.NAME,"ComboBox_partyIdFrom"));
		reportStep(fromContact+"  :'From' Contact selected in the Contact Lookup page is displayed in the Merge Contact 'from' field","pass");
		return this;
	}
	public ContactsLookUpPage clickToContactLookupBtnInMergeContactsPage() {		//Click the To contact lookup button
		click(locateElement(Locators.XPATH, "(//img[@src='/images/fieldlookup.gif'])[2]"));
		//reportStep("Clicked the to contact lookup button","pass");
		return new ContactsLookUpPage();
	}
	public MergeContactsPage verifyToContactAfterSelection() {					//Verify if the to contact is populated
		String toContact=getElementText(locateElement(Locators.NAME,"ComboBox_partyIdTo"));
		reportStep(toContact+"  :'To' Contact selected in the Contact Lookup page is displayed in the Merge Contact 'to' field","pass");
		return this;
	}
	public ViewContactsPage clickMergeBtnInMergeContactsPage() {
		click(locateElement(Locators.XPATH, "//a[text()='Merge']"));
		reportStep("Clicked the Merge button in the Contacts page","info");
		//Handle the alert
		switchToAlert();
		acceptAlert();
		return new ViewContactsPage();
	}
}