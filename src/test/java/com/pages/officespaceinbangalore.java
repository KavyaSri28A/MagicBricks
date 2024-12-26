package com.pages;

import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class officespaceinbangalore {
	
	public static void buyoption4(WebDriver driver) throws InterruptedException
	{
   	 WebElement buyOption = driver.findElement(By.id("buyheading"));
     Thread.sleep(1000);  // Wait until Buy option is clickable
      buyOption.click();
	}
	
	
	public static void officespaceinbangalore1(WebDriver driver) throws InterruptedException
	{
		WebElement officespace = driver.findElement(By.linkText("Office Space in Bangalore"));
    	Thread.sleep(1000);
    	officespace.click();
    	
       
	}
	String SecondWindow;
	String FirstWindow;
	public static void sortbyprice(WebDriver driver) throws InterruptedException
	
	{
		String MainWindow=driver.getWindowHandle();
    	String currentwindow;
	   	 Set<String> s1=driver.getWindowHandles();		
	        for(String i:s1) {
	        	if(!i.equals(MainWindow)) {
	        		driver.switchTo().window(i);
	        		currentwindow=i;
	        	}
	        }
   	Thread.sleep(10000);

   	WebElement newproject=driver.findElement(By.xpath("//a[text()='New Projects']"));

   	newproject.click();
   	
   	
   Thread.sleep(10000);
  
       WebElement sortby=driver.findElement(By.xpath("//span[text()='sort by']"));
       Thread.sleep(1000);
       sortby.click();
       WebElement pricelh=driver.findElement(By.xpath("//li[text()='Price - Low to High']"));
       Thread.sleep(5000);
       pricelh.click();
       
	}


public static void officespacefiltered(WebDriver driver) throws InterruptedException
{
	WebElement Propertservicepage=driver.findElement(By.xpath("//h1[text()='New Projects in Bangalore']"));
	String actual=Propertservicepage.getText();
	System.out.println(actual);
	String expected="New Projects in Bangalore";
    Assert.assertEquals(actual, expected);
    driver.quit();
}


public void close_browser(WebDriver driver) {
    if (driver != null) {
       driver.quit();
    
        }
        }
}

