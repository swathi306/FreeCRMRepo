package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.pages.HomePage;

import comcrm.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	@FindBy(xpath="//a[@class='navbar-brand']/img")
	WebElement crmprologo;
	
	
	@FindBy(xpath="//input[@name= 'username']")
	WebElement username;
	
	@FindBy(xpath="//input[@name= 'password']")
	WebElement password;
	
	@FindBy(xpath="//input[@value='Login']")
	WebElement loginbtn;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyPageTitle() {
		
		return driver.getTitle();
	}
	
	
	public boolean verifyCRMPROLogo() {
		return crmprologo.isDisplayed();
	}
	
	public HomePage login() {
		username.sendKeys(prop.getProperty("username"));
		password.sendKeys(prop.getProperty("password"));
		loginbtn.click();
		return new HomePage();
	}

}
