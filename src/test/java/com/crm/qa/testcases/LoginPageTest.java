package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

import comcrm.qa.base.TestBase;

public class LoginPageTest extends TestBase {
	LoginPage lp;
	HomePage hp;
	
	public LoginPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		intialization();
		 lp=new LoginPage();	
	}
	
	@Test(priority=1)
	public void verifyTitleTest() {
          String title = lp.verifyPageTitle();
          Assert.assertEquals(title, "CRMPRO1  - CRM software for customer relationship management, sales, and support.");
	}
	
	@Test(priority=2)
	public void verifyCRMPROLogoTest() {
		Assert.assertTrue(lp.verifyCRMPROLogo());
	}
	
	@Test(priority=3)
	public void loginTest() {
		 hp=lp.login();
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
}
