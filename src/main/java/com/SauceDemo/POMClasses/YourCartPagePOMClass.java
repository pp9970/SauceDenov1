package com.SauceDemo.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YourCartPagePOMClass 
{
	private WebDriver driver;
	
	@FindBy(xpath="//button[text()='Remove']")
	private WebElement Removebutton;
	public void  clickremove()
	{
		Removebutton.click();
	}
	
	
	@FindBy(xpath="//button[text()='Checkout']")
	private WebElement checkoutbutton;
	public void  clickcheckout()
	{
		checkoutbutton.click();
	}
	
	@FindBy(xpath="//button[@id='continue-shopping']")
	private WebElement Continueshoping;
	public void  clickContinueshoping()
	{
		Continueshoping.click();
	}
	

	public YourCartPagePOMClass(WebDriver driver)
	{
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	
	
	
	
	
	
	

}
