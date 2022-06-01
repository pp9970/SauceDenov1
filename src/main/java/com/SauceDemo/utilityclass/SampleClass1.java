package com.SauceDemo.utilityclass;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.SauceDemo.POMClasses.HomepagePOMClass;
import com.SauceDemo.POMClasses.LoginPagePOMClass;
import com.SauceDemo.TestClasses.TestBaseClass;

@Listeners(com.SauceDemo.utilityclass.Listener.class)

public class SampleClass1 
{
	WebDriver driver;
	
	//@BeforeMethod
	@Test
	public void setup1() 
	{    
     	System.setProperty("webdriver.chrome.driver","D:\\chrome driver 32\\chromedriver_win32\\chromedriver.exe");
		
		 driver = new ChromeDriver();

		driver.get("https://www.saucedemo.com/");
		
		Assert.assertTrue(false);
		
//		LoginPagePOMClass lp = new LoginPagePOMClass(driver);
//		
//		lp.sendUsername();
//
//		lp.sendPassword();
//
//		lp.clickloginButton();
	}	

//	@AfterMethod
//	public void tearDown1()
//	{
//		 HomepagePOMClass Hp = new HomepagePOMClass(driver);
//			
//			Hp.clickmenubutton();
//			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
//			Hp.clickLogout();
//
//		   driver.quit();
//	}
//
//    @Test()
//	public void logininfunctionality() throws IOException
//	{
//	//	ScreenshotClass.ScreenshotMethod(driver);
//
//		String ExpectedURL = "https://www.saucedemo.com/inventory.html";
//		String ActualURL = driver.getCurrentUrl();
//		
//	Assert.assertEquals(ActualURL, ExpectedURL);	
//	
//	}
//	@Test(timeOut=3000)
//	public void verifySingleProductSelected() throws IOException, InterruptedException
//	{
//		Thread.sleep(7000);
//		HomepagePOMClass hp = new HomepagePOMClass(driver);
//		
//		hp.clickCart1();
//		
//		ScreenshotClass.ScreenshotMethod(driver);		
//		String actualResult = hp.gettextfromCart();
//		String Expectedresult = "1";
//		
//	Assert.assertEquals(actualResult, Expectedresult);	
//	
//	}
//	@Test()
//	public void logoutfunctinality() throws IOException
//	{
//	//	ScreenshotClass.ScreenshotMethod(driver);
//
////        HomepagePOMClass Hp = new HomepagePOMClass(driver);
////		
////		Hp.clickmenubutton();
////		Hp.clickLogout();
//					
//		String ExpectedTitle = "Swag Labs";
//		String ActualTitle = driver.getTitle();
//		
//		Assert.assertEquals(ActualTitle, ExpectedTitle);
//	}
//	@Test()
//	public void verifyMultiProductAddToCart() throws IOException, InterruptedException
//	{
//         	HomepagePOMClass hp = new HomepagePOMClass(driver);
//			
//			hp.clickCart1();
//			hp.clickCart2();
//			hp.clickCart3();
//			
//			Thread.sleep(3000);
//			
//			ScreenshotClass.ScreenshotMethod(driver);
//			
//			String actualResult = hp.gettextfromCart();
//			String Expectedresult = "111";
//			
//			Assert.assertEquals(actualResult, Expectedresult);
//	}
//

	
	
	
	
}