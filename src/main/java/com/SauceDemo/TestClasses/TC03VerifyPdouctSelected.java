package com.SauceDemo.TestClasses;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.SauceDemo.POMClasses.HomepagePOMClass;
import com.SauceDemo.POMClasses.LoginPagePOMClass;
import com.SauceDemo.utilityclass.ScreenshotClass;


public class TC03VerifyPdouctSelected extends TestBaseClass
{
	
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

	
	
//	WebDriver driver;
//	@BeforeMethod
//	public void setup() throws IOException
//	{
//		System.setProperty("webdriver.chrome.driver","D:\\chrome driver 32\\chromedriver_win32\\chromedriver.exe");
//		
//		 driver = new ChromeDriver();
//		System.out.println("Browser open");
//		driver.get("https://www.saucedemo.com/");
//		System.out.println("URL open");
//		
//		ScreenshotClass.ScreenshotMethod(driver);
//
//	//	driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//		
//		LoginPagePOMClass lp = new LoginPagePOMClass(driver);
//		
//		lp.sendUsername();
//		System.out.println("username sends");
//
//		lp.sendPassword();
//		System.out.println("password sends");
//
//		lp.clickloginButton();
//		System.out.println("clicked on login button");
//	}
	
		
//	@AfterMethod()
//	public void tearDown()
//	{
//		driver.quit();
//		System.out.println("End of program");
//	}

}
