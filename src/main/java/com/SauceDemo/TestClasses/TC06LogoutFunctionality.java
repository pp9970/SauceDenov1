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


public class TC06LogoutFunctionality extends TestBaseClass
{
	
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

	
	
	
	
//	WebDriver driver;
//	
//	@BeforeMethod
//	public void setup() throws InterruptedException, IOException
//	{
//	    System.setProperty("webdriver.chrome.driver","D:\\chrome driver 32\\chromedriver_win32\\chromedriver.exe");
//		
//		 driver = new ChromeDriver();
//		System.out.println("Browser open");
//		driver.get("https://www.saucedemo.com/");
//		System.out.println("URL open");
//		
//		Thread.sleep(3000);
//		
//		ScreenshotClass.ScreenshotMethod(driver);
//
//	//	driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//		
//		LoginPagePOMClass lp = new LoginPagePOMClass(driver);
//		
//		
//		lp.sendUsername();
//		System.out.println("username sends");
//
//		lp.sendPassword();
//		System.out.println("password sends");
//
//		lp.clickloginButton();
//		System.out.println("clicked on login button");
//		
//	}
	
		
//	@AfterMethod
//	public void tearDown()
//	{
//		driver.quit();
//		System.out.println("End of program");
//	}

	
	

}
