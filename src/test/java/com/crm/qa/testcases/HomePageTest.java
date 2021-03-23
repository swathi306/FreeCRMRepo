package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.crm.qa.pages.CasesPage;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.DealsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;

import comcrm.qa.base.TestBase;

public class HomePageTest extends TestBase {
	LoginPage lp;
	HomePage hp;
	TestUtil ut;
	 ContactsPage cp;
	 CasesPage csp;
	 DealsPage dp;
	public HomePageTest() {
		super();
	}

	
	@BeforeMethod
	public void setUp() {
		intialization();
		 lp=new LoginPage();
		 hp=new HomePage();
		 ut=new TestUtil();
		
		 lp.login();
	}
	@Test(priority=1)
	public void VerifyHomePageTitleTest() {
		String title = hp.verifyTitleHomePage();
		Assert.assertEquals(title, "CRMPRO");
	}
	
	@Test(priority=2)
	public void verifyClickContactsLinkTest() {
		ut.switchFrame();
		 cp = hp.clickOnContactsLink();
	}
	@Test(priority=3)
	public void verifyClickCasesLinkTest() {
		ut.switchFrame();
		csp=hp.clickonCasesLink();
	}
	@Test(priority=4)
	public void verifyClickDealsLinkTest() {
		ut.switchFrame();
		dp=hp.clickOnDealsLink();
	}
	
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
	}
}
