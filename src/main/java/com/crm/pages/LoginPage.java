package com.crm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.base.TestBase;

public class LoginPage extends TestBase {
	
	//Page Factory 
	@FindBy(xpath="//input[@name='username']")
	WebElement username;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement loginBtn;
	
	//Initialization
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	// Actions
	public String validateLoginPageTitle()
	{
		return driver.getTitle();
	}
	
	public CRMDashBoardPage Login(String uname,String pass)
	{
		username.sendKeys(uname);
		password.sendKeys(pass);
		loginBtn.click();
		
		return new CRMDashBoardPage();
	}
}
