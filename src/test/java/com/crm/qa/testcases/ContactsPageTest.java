package com.crm.qa.testcases;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;

import comcrm.qa.base.TestBase;

public class ContactsPageTest extends TestBase{
	LoginPage lp;
	HomePage hp;
	TestUtil ut;
	 ContactsPage cp;
	 String sheetName="Contacts";
	
	public ContactsPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		intialization();
		 lp=new LoginPage();
		 ut=new TestUtil();
		cp=new ContactsPage();
		hp= lp.login();
		ut.switchFrame();
		//cp=hp.clickOnContactsLink();
	}
/*	
@Test(priority=1)
public void VerifyContactsLabelIsDispalyedTest() {
	
	Assert.assertTrue(cp.verifyContactsLabelDispalyed());
}
*/
	@DataProvider
	public Object[][] getCRMTestData() {
	Object data[][]=	TestUtil.getTestData(sheetName);
	return data;
		
	}
@Test(dataProvider="getCRMTestData")
public void validateCreateNewContact(String title,String firstname
,String lastname
,String  company
){
	hp.clickOnNewContact();
	//cp.verifyCreateNewContac("Ms.", "chaitanya", "ram", "microsoft");
	cp.verifyCreateNewContac(title, firstname, lastname, company);
}

@AfterMethod
public void tearDown() {
	driver.quit();
}

}
