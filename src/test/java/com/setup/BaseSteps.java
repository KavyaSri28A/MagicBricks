package com.setup;

import java.io.FileNotFoundException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.parameters.ExcelReader;

public class BaseSteps {
	private static WebDriver driver;
//	private static Properties property;
	private static void initializeWebDriver() throws FileNotFoundException {
		driver=new ChromeDriver();
		String url=ExcelReader.geturl();
		driver.get(url);
		
	}
	
	public static WebDriver setupBrowser() throws FileNotFoundException {
		if(driver==null) {
			initializeWebDriver();
		}
		return driver;
	}
}