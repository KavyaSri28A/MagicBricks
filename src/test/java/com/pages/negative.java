package com.pages;

import java.io.IOException;
import java.util.Properties;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.parameters.FileReader;

public class negative {
	
	
	public static void buyoption5(WebDriver driver) throws InterruptedException
	{
		WebElement buyOption = driver.findElement(By.id("buyheading"));
        Thread.sleep(1000);  // Wait until Buy option is clickable
         buyOption.click();
	}
	
	public static void tipsandguides1(WebDriver driver) throws InterruptedException
	{
		WebElement tipsandguide1 = driver.findElement(By.linkText("Tips and Guides"));
    	Thread.sleep(1000);
    	tipsandguide1.click();
	}
	public static void enterlocalities(WebDriver driver) throws InterruptedException
	{
		String MainWindow=driver.getWindowHandle();
	   	 Set<String> s1=driver.getWindowHandles();		
	        for(String i:s1) {
	        	if(!i.equals(MainWindow)) {
	        		driver.switchTo().window(i);
	        	}
	        }
   	Thread.sleep(1000);
   	 JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("window.scrollBy(0, 500);"); 
	        Thread.sleep(1000);
	WebElement comapare1=driver.findElement(By.xpath("//input[@class='mainInput compareLocInput' and @placeholder='Enter Locality 1']"));
	Thread.sleep(1000);
	comapare1.click();
	Thread.sleep(1000);
	comapare1.sendKeys("Medavakkam, Chennai");
	comapare1.sendKeys(Keys.ENTER);
	WebElement compare2=driver.findElement(By.xpath("//input[@class='mainInput compareLocInput' and @placeholder='Enter Locality 2']"));
	Thread.sleep(1000);
	compare2.click();
	compare2.sendKeys("Medavakkam, Chennai");
	compare2.sendKeys(Keys.ENTER);
	WebElement compbutton=driver.findElement(By.xpath("//input[ @onclick=\"compareLocationOrProjects('lrf1idName','lrf1id','lrf2idName','lrf2id','Y','home', 'locOne', 'locTwo', 'Y');\"]"));
	Thread.sleep(1000);
	compbutton.click();
   }
	
	
	
	

public static void enteradiffrentlocalityname(WebDriver driver,Properties prop) throws InterruptedException, IOException
{
	WebElement expectedtext=driver.findElement(By.xpath("//p[text()='Please enter a different locality name']"));
	String actual=expectedtext.getText();
	prop=FileReader.reader();
	String expected=(String) prop.get("expectednegativetext");
	Assert.assertEquals(expected, actual);
	driver.quit();
}
	
}
