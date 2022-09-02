package com.leaftaps.pages;

import com.framework.testng.api.base.ProjectSpecificMethods;

public class ViewContactsPage extends ProjectSpecificMethods{
	public ViewContactsPage veifyMergedContacts() {
		verifyTitle("View Contact | opentaps CRM");
		return this;
	}
}
