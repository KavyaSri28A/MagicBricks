package com.setup;

import java.io.IOException;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.parameters.ExcelReader;

public class BaseSteps {
	 WebDriver driver;
     ChromeOptions chromeOptions;
//	private static Properties property;
	private void initializeWebDriver() throws IOException {
		chromeOptions = new ChromeOptions();
	    chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
	    driver = new ChromeDriver(chromeOptions);
		
		driver.manage().window().maximize();
		String url=ExcelReader.getData(1, 0, 0);
		driver.get(url);
	}
	
	public WebDriver setupBrowser() throws IOException {
		if(driver==null) {
			initializeWebDriver();
		}
		return driver; 
	}
}

