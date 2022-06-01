package com.SauceDemo.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YourInfoPOMClass 
{
    private WebDriver driver;
	
	@FindBy(xpath="//input[@id='first-name']")
	private WebElement firstname;
	public void sendfirstname()
	{
		firstname.sendKeys("P");
	}

	
	@FindBy(xpath="//input[@id='last-name']")
	private WebElement lastname;
	public void sendlastname()
	{
		lastname.sendKeys("B");
	}

	
	@FindBy(xpath="//input[@id='postal-code']")
	private WebElement Postalcode;
	public void sendPostalcode()
	{
		Postalcode.sendKeys("1");
	}
	

	public YourInfoPOMClass(WebDriver driver)
	{
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}

	
	
	
	
	
	
	
	
	
	

}
