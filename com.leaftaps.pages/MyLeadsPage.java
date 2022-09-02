package com.leaftaps.pages;
import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;
//import com.leaftaps.pages.MergeLeadsPage;
//import com.leaftaps.pages.FindLeadsPage;
//import com.leaftaps.pages.CreateLeadPage;

public class MyLeadsPage extends ProjectSpecificMethods{
	
	public CreateLeadPage clickCreateLeadLink() {
		click(locateElement(Locators.LINK_TEXT, "Create Lead"));		//Click the create lead link
		reportStep("Create Lead link is clicked", "pass");
		return new CreateLeadPage();
	}
	public FindLeadsPage clickFindLeadsLink()  {
		click(locateElement(Locators.LINK_TEXT, "Find Leads"));		//click the find leads link
		reportStep("Find Leads link is clicked", "pass");
		return new FindLeadsPage();
	}
	public MergeLeadsPage clickMergeLeadsLink() throws InterruptedException {
		click(locateElement(Locators.LINK_TEXT, "Merge Leads"));
		reportStep("Merge Leads link is clicked", "pass");
		return new MergeLeadsPage();
	}

}
