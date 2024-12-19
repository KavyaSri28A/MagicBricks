package com.setup;

import java.io.FileNotFoundException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.parameters.ExcelReader;

public class BaseSteps {
	private static WebDriver driver;
	private static void initializewebDriver() throws FileNotFoundException {
		driver=new ChromeDriver();
		String url=ExcelReader.geturl();
		driver.get(url);
		ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
		
	}
	public WebDriver setupbrowser() throws FileNotFoundException {
		if(driver==null) {
			initializewebDriver();
		}
		return driver;
		
	}
	public static WebDriver setupBrowser() {
		// TODO Auto-generated method stub
		return null;
	}

}
