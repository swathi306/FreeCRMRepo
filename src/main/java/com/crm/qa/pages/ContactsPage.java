package com.crm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import comcrm.qa.base.TestBase;

public class ContactsPage extends TestBase {
	
	public ContactsPage() {
		PageFactory.initElements(driver, this);
	
	}
	@FindBy(xpath="//td[contains(text(),'Contacts')]")
	@CacheLookup
	WebElement contactslabel;
	
	@FindBy(xpath="//select[@name='title']")
	WebElement titledrpdwn;
	
	@FindBy(id="first_name")
	WebElement firstname;
	
	@FindBy(id="surname")
	WebElement lastname;
	

	@FindBy(name="client_lookup")
	WebElement company;
	
	@FindBy(xpath="//input[@value='Save']")
	WebElement savebtn;
	
	public  boolean verifyContactsLabelDispalyed() {
		return contactslabel.isDisplayed();
		
	}
	
	public void verifyCreateNewContac(String title,String fname,String lname,String cmp) {
		Select sel=new Select(titledrpdwn);
		sel.selectByVisibleText(title);
		firstname.sendKeys(fname);
		lastname.sendKeys(lname);
		company.sendKeys(cmp);
		savebtn.click();
	}
	
	
}
