package com.leaftaps.pages;
import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class MergeLeadsPage extends ProjectSpecificMethods{
	public FindLeadsLookUpPage clickFromLeadLookUpBtn() {			//Click from lead lookup button
		//Click the from lookup leads image		
		click(locateElement(Locators.XPATH, "(//img[@src='/images/fieldlookup.gif'])[1]"));
		switchToWindow(1);
		reportStep("Clicked the 'from lead' lookup button","pass");		
		return new FindLeadsLookUpPage();
	}
	public FindLeadsLookUpPage clickToLeadLookUpBtn() {				//Click To Lead Look Up button
		//Click the to lookup leads image
		click(locateElement(Locators.XPATH, "(//img[@src='/images/fieldlookup.gif'])[2]"));
		switchToWindow(1);
		reportStep("Clicked the 'to lead' lookup button","pass");
		return new FindLeadsLookUpPage();
	}
	public MergeLeadsPage verifyFromLeadIDIsPopulated() {			//Verify lead id is populated in from field
		verifyExactAttribute(locateElement(Locators.ID,"ComboBox_partyIdFrom"), "value", strLeadID);
		return this;
	}
	public MergeLeadsPage verifyToLeadIDIsPopulated() {				//Verify lead id is populated in to field
		verifyExactAttribute(locateElement(Locators.ID,"ComboBox_partyIdTo"), "value", strLeadID);
		return this;
	}
	public ViewLeadPage clickMergeBtnInMergeLeadsPage() {		
		click(locateElement(Locators.XPATH, "//a[@class='buttonDangerous']"));
		reportStep("Clicked the Merge Leads button in the Merge Leads page","info");
		switchToAlert();
		acceptAlert();
		return new ViewLeadPage();
	}
}