package com.setup;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.parameters.ExcelReader;

public class BaseSteps {
	 WebDriver driver;
//	private static Properties property;
	private void initializeWebDriver() throws IOException{
		driver=new ChromeDriver();
		String url=ExcelReader.geturl();
		driver.get(url);
		
	}
	
	public WebDriver setupBrowser() throws IOException {
		if(driver==null) {
			initializeWebDriver();
		}
		return driver;
	}
}