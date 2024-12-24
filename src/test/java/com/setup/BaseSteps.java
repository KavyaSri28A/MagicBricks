package com.setup;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.parameters.ExcelReader;

public class BaseSteps {
	private static WebDriver driver;
//	private static Properties property;
	private static void initializeWebDriver() throws IOException {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		String url=ExcelReader.geturl();
		driver.get(url);
		//System.out.println("Current URL is: " + driver.getCurrentUrl());
		
	}
	
	public static WebDriver setupBrowser() throws IOException {
		if(driver==null) {
			initializeWebDriver();
		}
		return driver;
	}
	
}