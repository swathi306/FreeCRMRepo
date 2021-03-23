package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import comcrm.qa.base.TestBase;

public class HomePage extends TestBase {
	
	
	
	
	
	@FindBy(xpath="//a[text()='Contacts']")
	WebElement contactslink;
	
	@FindBy(xpath="//a[text()='Deals']")
	WebElement dealslink;
	@FindBy(xpath="//a[text()='Cases']")
	WebElement caseslink;
	
	@FindBy(xpath="//a[text()='New Contact']")
	WebElement newcontact;
	
	public String verifyTitleHomePage() {
		return driver.getTitle();
	}
	
	public ContactsPage clickOnContactsLink() {
		contactslink.click();
		return new ContactsPage();
	}
	
	public DealsPage clickOnDealsLink() {
		dealslink.click();
		return new DealsPage();
	}
	public CasesPage clickonCasesLink() {
		caseslink.click();
		return new CasesPage();
	}
	
	public void clickOnNewContact()
	{
	 Actions act=new Actions(driver);
	 act.moveToElement(contactslink).build().perform();

	 newcontact.click();
	 
	}
	public HomePage() {
		PageFactory.initElements(driver, this);
	}

}
