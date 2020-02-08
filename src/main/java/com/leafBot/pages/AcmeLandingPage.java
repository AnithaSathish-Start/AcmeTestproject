package com.leafBot.pages;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class AcmeLandingPage extends ProjectSpecificMethods {


	public AcmeLandingPage(RemoteWebDriver driver, ExtentTest node, ExtentTest test){
		this.driver = driver;
		this.node = node;
		this.test = test;
		PageFactory.initElements(driver, this);		
	}
	
	String title= "ACME System 1 - Dashboard";
	public AcmeLandingPage VerifyTitle() {	
		verifyTitle(title);		
		return this;
		
	}	
	

}
