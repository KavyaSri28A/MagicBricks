package com.pages;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.datatable.DataTable;

public class TipsandGuides {
	
	public static void buyoption2(WebDriver driver) throws InterruptedException
	{
		WebElement buyOption = driver.findElement(By.id("buyheading"));
        Thread.sleep(1000);  // Wait until Buy option is clickable
         buyOption.click();

	}
	
	public static void TipsandGuides(WebDriver driver) throws InterruptedException
	{
		WebElement tipsandguide = driver.findElement(By.linkText("Tips and Guides"));
    	Thread.sleep(1000);
    	tipsandguide.click();
	}
	public static void selectslocality(WebDriver driver) throws InterruptedException
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
	     WebElement local=driver.findElement(By.xpath("//label[text()='Localities']"));
	     Thread.sleep(1000);
	     local.click();
	     
	}
	
	public static void locality1andlocality2(WebDriver driver,DataTable dataTable) throws InterruptedException
	{
		List<Map<String,String>> places=dataTable.asMaps(String.class, String.class);
		for(Map<String,String> data:places) {
			WebElement comapare1=driver.findElement(By.xpath("//input[@class='mainInput compareLocInput' and @placeholder='Enter Locality 1']"));
	    	Thread.sleep(1000);
	    	comapare1.click();
	    	Thread.sleep(1000);
	    	comapare1.sendKeys(data.get("Locality1"));
	    	comapare1.sendKeys(Keys.ENTER);
	    	WebElement compare2=driver.findElement(By.xpath("//input[@class='mainInput compareLocInput' and @placeholder='Enter Locality 2']"));
	    	Thread.sleep(1000);
	    	compare2.click();
	    	Thread.sleep(1000);
	    	compare2.sendKeys(data.get("Locality2"));
	    	compare2.sendKeys(Keys.ENTER);
	    
	
		}
    	WebElement compbutton=driver.findElement(By.xpath("//input[ @onclick=\"compareLocationOrProjects('lrf1idName','lrf1id','lrf2idName','lrf2id','Y','home', 'locOne', 'locTwo', 'Y');\"]"));
    	Thread.sleep(1000);
    	compbutton.click();
    	Thread.sleep(1000);
    	String MainWindow=driver.getWindowHandle();
	   	 Set<String> s1=driver.getWindowHandles();		
	        for(String i:s1) {
	        	if(!i.equals(MainWindow)) {
	        		driver.switchTo().window(i);
	        	}
	        }
    	JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 1000);"); 
    	
	}
	public static void localitiescomapred(WebDriver driver)
	{
		WebElement localitiescomp=driver.findElement(By.xpath("//h1[ @class='comHeading']"));
    	String actual=localitiescomp.getText();
    	System.out.println(actual);
    	String expected="Compare Localities";
        Assert.assertEquals(actual, expected);
        driver.quit();
    }
 
   
    public void close_browser12(WebDriver driver) {
        if (driver != null) {
           driver.quit();
        }
	}
	

}
