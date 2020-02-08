package com.leafBot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class AcmePage extends ProjectSpecificMethods {


	public AcmePage(RemoteWebDriver driver, ExtentTest node, ExtentTest test){
		this.driver = driver;
		this.node = node;
		this.test = test;
		PageFactory.initElements(driver, this);		
	}
	


	@FindBy(how=How.ID,using="email")
	private WebElement eleEmail;

	public AcmePage enterEmail(String email){
		clearAndType(eleEmail, email);
		return this;
}
	
	@FindBy(how=How.ID,using="password")
	private WebElement elepwd;
	public AcmePage enterPassword(String pwd){
		clearAndType(elepwd, pwd);
		return this;
	}
	
	@FindBy(how=How.ID,using="buttonLogin")
	private WebElement eleLogin;
	public AcmePage clickLogin(){
		click(eleLogin);
		return this;
	}
	
	
	
	
}
