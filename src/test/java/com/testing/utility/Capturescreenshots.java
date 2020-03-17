package com.testing.utility;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.reporters.Files;

public class Capturescreenshots {
	
	public static void takescreenshots(WebDriver driver, String screenshotname)
	{
	try {
		TakesScreenshot ts=(TakesScreenshot)driver;
	   File src=ts.getScreenshotAs(OutputType.FILE);
	   FileHandler.copy(src,new File("./screenshots//"+screenshotname+".png"));
	}catch(Exception e) {
		System.out.println("exception while taking screenshots"+e.getMessage());
	}
}
}
