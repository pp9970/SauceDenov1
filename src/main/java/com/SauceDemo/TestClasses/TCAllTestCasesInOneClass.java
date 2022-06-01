package com.SauceDemo.TestClasses;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.SauceDemo.POMClasses.HomepagePOMClass;
import com.SauceDemo.utilityclass.ScreenshotClass;


public class TCAllTestCasesInOneClass extends TestBaseClass
{
	@Test
	public void logininfunctionality() throws IOException
	{
		ScreenshotClass.ScreenshotMethod(driver);

		
		System.out.println("validating url");

		String ExpectedURL = "https://www.saucedemo.com/inventory.html";
		String ActualURL = driver.getCurrentUrl();
		
	Assert.assertEquals(ActualURL, ExpectedURL);	
	
	}
	@Test
	public void verifySingleProductSelected() throws IOException
	{
		HomepagePOMClass hp = new HomepagePOMClass(driver);
		
		hp.clickCart1();
		
		ScreenshotClass.ScreenshotMethod(driver);

		System.out.println("product is added to cart");
		
		System.out.println("Apply the validation");
		
		String actualResult = hp.gettextfromCart();
		String Expectedresult = "1";
		
	Assert.assertEquals(actualResult, Expectedresult);	
	
	}
	@Test
	public void logoutfunctinality() throws IOException
	{
		ScreenshotClass.ScreenshotMethod(driver);

//        HomepagePOMClass Hp = new HomepagePOMClass(driver);
//		
//		Hp.clickmenubutton();
//		Hp.clickLogout();
		System.out.println("Clicked the logout button");
		
		System.out.println("----Validating the Title------");
				
		String ExpectedTitle = "Swag Labs";
		String ActualTitle = driver.getTitle();
		
		Assert.assertEquals(ActualTitle, ExpectedTitle);
	
		
	}
	@Test
	public void verifyMultiProductAddToCart() throws IOException, InterruptedException
	{
         	HomepagePOMClass hp = new HomepagePOMClass(driver);
			
			hp.clickCart1();
			hp.clickCart2();
			hp.clickCart3();
			
			Thread.sleep(3000);
			
			ScreenshotClass.ScreenshotMethod(driver);

			
			System.out.println(" All product is added to cart");
			
			System.out.println("Apply the validation");
			
			String actualResult = hp.gettextfromCart();
			String Expectedresult = "3";
			
			Assert.assertEquals(actualResult, Expectedresult);
	}


}
