package com.leafBot.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leafBot.pages.AcmeLandingPage;
import com.leafBot.pages.AcmePage;
import com.leafBot.pages.LoginPage;
import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class AcmeTest_TestCase001 extends ProjectSpecificMethods{	

	@BeforeTest
	public void setValues() {
		testCaseName = "Login and LoginOut";
		testDescription = "Login testCase using UserName and LogOut";
		nodes = "AcmeTest";
		authors = "Anitha";
		category = "Smoke";
		dataSheetName = "AcmeTC001";
	}

	@Test(dataProvider = "fetchData")
	public void AcmePageLogin(String uName, String pwd) {
		new AcmePage(driver, node, test)
		.enterEmail(uName)
		.enterPassword(pwd)
		.clickLogin();
		new AcmeLandingPage(driver, node, test)
		.VerifyTitle();	
	}
}