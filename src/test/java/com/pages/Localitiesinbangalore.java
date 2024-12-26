package com.pages;

import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Localitiesinbangalore {
	
	
	public static void buyoption1(WebDriver driver) throws InterruptedException
	{
		WebElement buyOption = driver.findElement(By.id("buyheading"));
	       Thread.sleep(1000);  
	       buyOption.click();

   }
	public static void localitiesinbangalore(WebDriver driver) throws InterruptedException
	{
		WebElement locality=driver.findElement(By.linkText("Localities in Bangalore"));
    	Thread.sleep(1000);
    	locality.click();
    	
		
	}
	public static void filterpricepersqft(WebDriver driver) throws InterruptedException
	{
	
		String MainWindow=driver.getWindowHandle();
	   	 Set<String> s1=driver.getWindowHandles();		
	        for(String i:s1) {
	        	if(!i.equals(MainWindow)) {
	        		driver.switchTo().window(i);
	        	}
	        }
	        Thread.sleep(10000);
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("window.scrollBy(0, 500);"); 
	       
	      WebElement filter=driver.findElement(By.xpath("//div[@id='budgetSort']"));
	     Thread.sleep(1000);
	     filter.click();
	     Thread.sleep(1000);
	     
	     WebElement min=driver.findElement(By.xpath("//span[@id='budgetPerSqftMin']"));
	     Thread.sleep(1000);
	     min.click();
	     WebElement value1=driver.findElement(By.xpath("//li[@value='5000']"));
	     Thread.sleep(1000);
	     value1.click();
	     WebElement max=driver.findElement(By.xpath("//span[@id='budgetPerSqftMax']"));
	     Thread.sleep(1000);
	     max.click();
	     WebElement value2=driver.findElement(By.xpath("//li[@value='35000' and text()='₹ 35,000'  and @ onclick=\"setMaxVal('35000');\"]"));
	     Thread.sleep(1000);
	     value2.click();
	  
	    WebElement done=driver.findElement(By.xpath("//a[text()='Done']"));
	    Thread.sleep(1000);
	    done.click();
	    
		    
	}
	public static void localitiefiltered1(WebDriver driver)
	{
		WebElement Propertservicepage=driver.findElement(By.xpath("//span[@id=\"locCountSpan\"]"));
    	String actual=Propertservicepage.getText();
    	System.out.println(actual);
    	String expected="4751";
        Assert.assertEquals(actual, expected);
        driver.quit();
      
    }
 
   
    public void close_browser1(WebDriver driver) {
        if (driver != null) {
           driver.quit();
        
    }
    }
   
	
}

	
