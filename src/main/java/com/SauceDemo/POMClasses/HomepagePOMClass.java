package com.SauceDemo.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomepagePOMClass 
{
	private WebDriver driver;
	
	@FindBy(xpath="(//button[text()='Add to cart'])[1]")
	private WebElement Cartbutton1;
	public void clickCart1()
	{
		Cartbutton1.click();
	}
	
	
	@FindBy(xpath="(//button[text()='Add to cart'])[2]")
	private WebElement Cartbutton2;
	public void clickCart2()
	{
		Cartbutton2.click();
	}
	
	
	@FindBy(xpath="(//button[text()='Add to cart'])[3]")
	private WebElement Cartbutton3;
	public void clickCart3()
	{
		Cartbutton3.click();
	}
	
	
	@FindBy(xpath="(//button[text()='Add to cart'])[4]")
	private WebElement Cartbutton4;
	public void clickCart4()
	{
		Cartbutton4.click();
	} 
	
	
	@FindBy(xpath="(//button[text()='Add to cart'])[5]")
	private WebElement Cartbutton5;
	public void clickCart5()
	{
		Cartbutton5.click();
	} 
	
	
	@FindBy(xpath="(//button[text()='Add to cart'])[6]")
	private WebElement Cartbutton6;
		public void clickCart6()
	{
		Cartbutton6.click();
	}
		
		@FindBy(xpath="//span[@class='select_container']")
		private WebElement Filter;
		public void clickFilter()
		{
			Filter.click();
		} 

		
		@FindBy(xpath="//a[@class='shopping_cart_link']")
		private WebElement Cart;
		public void clickcart()
		{
			Cart.click();
		} 
		
		public String gettextfromCart()
		{
			String totalProduct = Cart.getText();
			return totalProduct;
		}
		
		@FindBy(xpath="//button[text()='Open Menu']")
		private WebElement menubutton;
		public void clickmenubutton()
		{
			menubutton.click();
		} 

		
		@FindBy(xpath="//a[text()='All Items']")
		private WebElement Allitem;
		public void clickAllitem()
		{
			Allitem.click();
		} 


		@FindBy(xpath="//a[text()='About']")
		private WebElement About;
		public void clickAbout()
		{
			About.click();
		} 

		
		@FindBy(xpath="//a[@id='logout_sidebar_link']")
		private WebElement Logout;
		public void clickLogout()
		{
			Logout.click();
		} 

		
		@FindBy(xpath="//a[text()='Reset App State']")
		private WebElement ResetAppset;
		public void clickResetAppset()
		{
			ResetAppset.click();
		} 
		
		
		public HomepagePOMClass(WebDriver driver)
		{
			this.driver = driver;
			
			PageFactory.initElements(driver, this);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
