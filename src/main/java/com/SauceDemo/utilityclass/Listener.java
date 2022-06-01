package com.SauceDemo.utilityclass;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener
{

WebDriver driver;
	
    public void onTestStart(ITestResult result)
    {
    	System.out.println("Sanity test is started");
    }

	public void onTestSuccess(ITestResult result)
	{
		System.out.println("Test case is sucessfully passed");
	}
	
	public void onTestFailure(ITestResult result)
	{
		   System.out.println("Test case is failed and hence taking the screenshot");
		  	
//		   try {
//			ScreenshotClass.ScreenshotMethod(driver);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		   
		   TakesScreenshot ts = (TakesScreenshot)driver;
		   File sourceFile =	ts.getScreenshotAs(OutputType.FILE);	
		   File destFile = new File("./screenshot/SauceDemoLogin2205.jpg");		  
	}	
	
	public void onTestSkipped(ITestResult result)
	{
		System.out.println("test case is skipped");
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result)
	{
		System.out.println("test case is failed within percentage");
	}
	public void onStart(ITestResult result)
	{
		System.out.println("test case execution is started");
	}
	public void onFinish(ITestResult result)
	{
		System.out.println("test case execution is finished");
	}

	
	
}
