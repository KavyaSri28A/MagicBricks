package com.setup;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.parameters.ExcelReader;

public class BaseSteps {
	private static WebDriver driver;
	//private static void initialize
	private static void initializeWebDriver() throws IOException {
		ChromeOptions options = new ChromeOptions();
	    options.addArguments("--disable-notifications");
	    options.addArguments("--start-maximized");
		driver= new ChromeDriver(options);
		
		String url=ExcelReader.geturl();
		driver.get(url);
		String url1=ExcelReader.getSecondUrl();
		driver.get(url1);
		
	}
	public static WebDriver setupBrowser() throws IOException {
		if(driver==null)
		{
			initializeWebDriver();
		}
		return driver;
	}
	
	
}
