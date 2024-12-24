package com.setup;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.parameters.ExcelReader;

public class BaseSteps {
	private static WebDriver driver;
	//private static void initialize
	private static void initializeWebDriver() throws IOException {
		driver= new ChromeDriver();
		String url=ExcelReader.geturl();
		driver.get(url);
		
	}
	public static WebDriver setupBrowser() throws IOException {
		if(driver==null)
		{
			initializeWebDriver();
		}
		return driver;
	}
	
	
}
