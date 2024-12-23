package com.pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PlaceOrderButton {
	static JavascriptExecutor js;
	public static void user_clicks_sell(WebDriver driver, WebDriverWait wait) throws InterruptedException{
		WebElement sell=driver.findElement(By.xpath("//*[@id='commercialIndex']/header/section[2]/div/ul/li[3]/a"));
	       wait.until(ExpectedConditions.elementToBeClickable(sell));
	       Actions actions0 = new Actions(driver);
	       actions0.moveToElement(sell);
	    	Thread.sleep(1000);
	    	sell.click();
	}
	public static void user_clicks_property(WebDriver driver,WebDriverWait wait,String FirstWindow) {
     wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Property Valuation']"))).click();
    	 
    	 FirstWindow=driver.getWindowHandle();
    	 Set<String> s1=driver.getWindowHandles();		
         Iterator<String> i1=s1.iterator();
         while(i1.hasNext())			
         {		
             String ChildWindow=i1.next();		
             		
             if(!FirstWindow.equalsIgnoreCase(ChildWindow))			
             {    
            	 driver.switchTo().window(ChildWindow);
             
 		js = (JavascriptExecutor) driver;
 		
 		WebElement  clickOn= driver.findElement(By.xpath("//*[@id=\"pkgpriceSec\"]/a[1]"));
 		js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath("//*[@id=\"propValpkg\"]/div/div[2]")));
 	      
  
 		clickOn.click();
 		}
    	    
         }
	}
}
