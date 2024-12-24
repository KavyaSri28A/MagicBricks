package com.pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class S7RentAdpack {
    public static void user_click_rentADpack(WebDriver driver, WebDriverWait wait) throws InterruptedException {
    	 // Write code here that turns the phrase above into concrete actions
    	WebElement sell=driver.findElement(By.xpath("//*[@id='commercialIndex']/header/section[2]/div/ul/li[3]/a"));
        wait.until(ExpectedConditions.elementToBeClickable(sell));
        Actions actions0 = new Actions(driver);
        actions0.moveToElement(sell);
     	Thread.sleep(10000);
     	sell.click();
     	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"commercialIndex\"]/header/section[2]/div/ul/li[3]/div/div/div[1]/ul/li[3]/a"))).click();
     	Thread.sleep(10000);
    }
    public static void user_fillsdata(WebDriver driver, WebDriverWait wait,String FirstWindow) {
    	// Write code here that turns the phrase above into concrete actions
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
        
        WebElement name = driver.findElement(By.xpath("//*[@id=\"requestInfoForm\"]/div[1]/div[1]/label"));
        Actions actions13 = new Actions(driver);
        actions13.click(name).sendKeys("Nick").perform();
        
        WebElement num = driver.findElement(By.xpath("//*[@id=\"requestInfoForm\"]/div[2]/div[2]/div[1]/label"));
        Actions actions14 = new Actions(driver);
        actions14.click(num).sendKeys("9618871371").perform();
    }
    
    public static void user_clicks_requestcallback(WebDriver driver) {
    	
   	 WebElement button = driver.findElement(By.xpath("//*[@id=\"callBackSubmit\"]"));
   	    Actions actions14 = new Actions(driver);
   	    actions14.click(button).perform();
   	    
   	    WebElement caution = driver.findElement(By.xpath("//*[@id=\"queryErr\"]"));
   	    String get=caution.getText();
   	    System.out.println(get);
    }
}
