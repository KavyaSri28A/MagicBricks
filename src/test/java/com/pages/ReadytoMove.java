package com.pages;

import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ReadytoMove {
	
	
	public static void buyoption(WebDriver driver) throws InterruptedException
	{
		WebElement buyOption = driver.findElement(By.id("buyheading"));
	       Thread.sleep(1000);  
	       buyOption.click();
	
	}
	public static void  readytomove(WebDriver driver) throws InterruptedException
	{
		Thread.sleep(1000);
	    // Write code here that turns the phrase above into concrete actions
		WebElement readyToMove = driver.findElement(By.linkText("Ready to Move"));
        Thread.sleep(3000);
        readyToMove.click();
	}
	public static void postbyowner(WebDriver driver,WebDriverWait Wait)throws InterruptedException
	{
			String MainWindow=driver.getWindowHandle();
		   	 Set<String> s1=driver.getWindowHandles();		
		        for(String i:s1) {
		        	if(!i.equals(MainWindow)) {
		        		driver.switchTo().window(i);
		        	}
		        }
		        Thread.sleep(10000);
		        WebElement postedBy = driver.findElement(By.xpath("//div[text()='Posted By'  and @class='title-ellipsis']"));
		        Thread.sleep(10000);
		        postedBy.click();
		        WebElement owner=driver.findElement(By.xpath("//label[text()='Owners' and @for='inputListings_inputListings_I']"));
		        Thread.sleep(1000);
		        owner.click();
		        
	}
	
	public static void localitysarjapur(WebDriver driver) throws InterruptedException
	{
	    WebElement localityOption = driver.findElement(By.xpath("//div[text()='Top Localities']"));
	    localityOption.click();
	    Thread.sleep(1000);
	    WebElement Locality = driver.findElement(By.xpath("//label[text()='Sarjapur Road']"));
	    Thread.sleep(1000);
	    Locality.click();
	    WebElement done1=driver.findElement(By.xpath("//*[@id=\"body\"]/div[1]/div/div[2]/div[1]/div/div[2]/div[3]"));
	    Thread.sleep(5);
	    done1.click();
		
	}
	public static void resultoffilters(WebDriver driver)
	{
		WebElement Propertservicepage=driver.findElement(By.xpath("//div[text()='Ready to Move Flats in Bangalore']"));
    	String actual=Propertservicepage.getText();
    	System.out.println(actual);
    	String expected="Ready to Move Flats in Bangalore";
      Assert.assertEquals(actual, expected);
     driver.quit();
    }
 
   
    public void close_browser11(WebDriver driver) {
        if (driver != null) {
           driver.quit();
        }
        
    }

	}
		
