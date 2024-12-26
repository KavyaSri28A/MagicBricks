package com.pages;

import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Findanagent {
	public static void buyoption3(WebDriver driver) throws InterruptedException
	{
		 WebElement buyOption = driver.findElement(By.id("buyheading"));
	       Thread.sleep(1000);  
	        buyOption.click();
	}
	
	public static void findanagent(WebDriver driver) throws InterruptedException 
	{
		WebElement findanagent = driver.findElement(By.linkText("Find an Agent"));
        Thread.sleep(1000);  
         findanagent.click();
		
	}
	
	public static void cityandlocalitiesfilter(WebDriver driver) throws InterruptedException {
		String MainWindow=driver.getWindowHandle();
	   	 Set<String> s1=driver.getWindowHandles();		
	        for(String i:s1) {
	        	if(!i.equals(MainWindow)) {
	        		driver.switchTo().window(i);
	        	}
	        }
	        WebElement city=driver.findElement(By.xpath("//select[@id='cityList']"));
	        Thread.sleep(1000);
	        city.click();
	        Thread.sleep(10);
	        city.sendKeys("Hyderbad");
	        city.sendKeys(Keys.ENTER);
	        Thread.sleep(5);
	        WebElement localitylist=driver.findElement(By.xpath("//select[@id='localityList']"));
	        Thread.sleep(1000);
	        localitylist.click();
	        Thread.sleep(100);
	        localitylist.sendKeys("Gachibowli");
	        localitylist.sendKeys(Keys.ENTER);
	        
		
	}
	public static void agentsfiltered(WebDriver driver) throws InterruptedException 
	{
		WebElement Propertservicepage=driver.findElement(By.xpath("//*[@id=\"agentTitle\"]"));
    	String actual=Propertservicepage.getText();
    	System.out.println(actual);
    	String expected="Agents in Gachibowli Who Can Help You";
        Assert.assertEquals(actual, expected);
        driver.quit();
    }
 
   
    public void close_browser111(WebDriver driver) {
        if (driver != null) {
           driver.quit();
        
            }
            }
    
	}
	


