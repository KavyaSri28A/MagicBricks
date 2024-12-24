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

public class S6SalesEnquiry {
    public static void userclick_sales_enquiry(WebDriver driver, WebDriverWait wait) throws InterruptedException {
    	  // Write code here that turns the phrase above into concrete actions
    	WebElement sell=driver.findElement(By.xpath("//*[@id='commercialIndex']/header/section[2]/div/ul/li[3]/a"));
        wait.until(ExpectedConditions.elementToBeClickable(sell));
        Actions actions0 = new Actions(driver);
        actions0.moveToElement(sell);
     	Thread.sleep(10000);
     	sell.click();
     	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"commercialIndex\"]/header/section[2]/div/ul/li[3]/div/div/div[2]/ul/li[5]/a"))).click();
     	Thread.sleep(10000);
    }
    public static void select_letter(WebDriver driver, WebDriverWait wait,String FirstWindow) {
    	 FirstWindow=driver.getWindowHandle();
    	 Set<String> s1=driver.getWindowHandles();		
         Iterator<String> i1=s1.iterator();
         while(i1.hasNext())			
         {		
             String ChildWindow=i1.next();		
             		
             if(!FirstWindow.equalsIgnoreCase(ChildWindow))			
             {    
            	 driver.switchTo().window(ChildWindow);
            	

             }
             }       
       wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"allOfficeContact\"]/div/div/div[1]/a[11]"))).click();//To click on specific letter
       JavascriptExecutor js = (JavascriptExecutor) driver;
   
       js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath("//*[@id=\"allOfficeContact\"]/div/h2")));
      

    }
}
