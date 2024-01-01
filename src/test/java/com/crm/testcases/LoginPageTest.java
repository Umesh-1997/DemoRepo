package com.crm.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.base.TestBase;
import com.crm.pages.LoginPage;

public class LoginPageTest extends TestBase{
	
	LoginPage login;
	public LoginPageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setup()
	{
		initialization();
		login = new LoginPage();
	}
	
	@Test
	public void LoginPageTitleTest()
	{
		String BrowserTitle = login.validateLoginPageTitle();
		Assert.assertEquals(BrowserTitle,"ORANGEHRM" , "Title Not Matched as per testcase");
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}
