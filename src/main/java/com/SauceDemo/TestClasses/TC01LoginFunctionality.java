package com.SauceDemo.TestClasses;

import java.io.IOException;
import java.time.Duration;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import com.SauceDemo.utilityclass.ScreenshotClass;



public class TC01LoginFunctionality extends TestBaseClass 
{
	@Test
	public void logininfunctionality() throws IOException
	{
		ScreenshotClass.ScreenshotMethod(driver);

//		log.info("Vlidating url");
		
		String ExpectedURL = "https://www.saucedemo.com/inventory.html";
		String ActualURL = driver.getCurrentUrl();
		
		
	//	Assert.assertTrue(true);
	//	Assert.assertEquals(ExpectedURL, ActualURL);
	Assert.assertEquals(ActualURL, ExpectedURL);	
	
	}
	
	
}
