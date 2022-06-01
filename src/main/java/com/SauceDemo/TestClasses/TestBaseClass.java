package com.SauceDemo.TestClasses;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.SauceDemo.POMClasses.HomepagePOMClass;
import com.SauceDemo.POMClasses.LoginPagePOMClass;
import com.SauceDemo.utilityclass.ScreenshotClass;

public class TestBaseClass 
{
WebDriver driver ;
Logger log = Logger.getLogger("SauceDemoV1");


@BeforeMethod
@Parameters("browserName")

	public void setup1(String browserName) throws IOException
	{
	if(browserName.equals("chrome"))
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		 driver = new ChromeDriver();
	}
	else
	{
	System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
	
	 driver = new EdgeDriver();
	}
		
		PropertyConfigurator.configure("log4j.properties");
		log.info("Browser open");
		
		driver.get("https://www.saucedemo.com/");

		log.info("URL open");
		driver.manage().window().maximize();
			
		LoginPagePOMClass lp = new LoginPagePOMClass(driver);
		
		lp.sendUsername();
		log.info("username sends");


		lp.sendPassword();
		log.info("password sends");

		lp.clickloginButton();
		log.info("clicked on login button");

	}	

	@AfterMethod
	public void tearDown1()
	{
		 HomepagePOMClass Hp = new HomepagePOMClass(driver);

		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			Hp.clickmenubutton();
			Hp.clickLogout();
			
			driver.quit();
			System.out.println("End of program");
     }
	
}
