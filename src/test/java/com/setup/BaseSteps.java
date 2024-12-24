package com.setup;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.Before;

//import com.parameters.ExcelReader;

public class BaseSteps {
	public static WebDriver driver;
	@Before
	public static void initializewebDriver() throws IOException {
		driver=new ChromeDriver();
		ChromeOptions options = new ChromeOptions();
        //options.addArguments("--disable-notifications");
        options.addArguments("--disable-popup-blocking");
        
//        File f=new File(System.getProperty("user.dir")+"\\src\\test\\java\\com\\parameters\\home.properties");
//        FileInputStream objfile=new FileInputStream(f);
//        Properties prop=new Properties();
//        prop.load(objfile);
//        String url_page=prop.getProperty("URL");
//        driver.get(url_page);
//        driver.manage().window().maximize();
        //return driver;
		
	}
	public static WebDriver getDriver() {
        if (driver == null) {
            throw new IllegalStateException("Driver is not initialized. Did you forget to set it up?");
        }
        return driver;
    }
}


