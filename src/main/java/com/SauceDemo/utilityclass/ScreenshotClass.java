package com.SauceDemo.utilityclass;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotClass 
{
	
	public static void ScreenshotMethod(WebDriver driver) throws IOException 
	{
        Date d = new Date();
		
		
		DateFormat d1 = new SimpleDateFormat("dd-MM-yy & hh-mm-ss");
		String date = d1.format(d);
		System.out.println(date);

		 String Title = driver.getTitle();
	   
	   TakesScreenshot ts = (TakesScreenshot)driver;
	  File source = ts.getScreenshotAs(OutputType.FILE);
	  File desti = new File("./Screenshot/"+ date +" " +Title +" .jpg");
	  FileHandler.copy(source, desti);
	  
	}


}
