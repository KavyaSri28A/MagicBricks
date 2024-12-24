package com.pages;

import java.util.Iterator;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class S1PlaceOrderButton {
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
	public static void user_clicks_BuyNow_button(WebDriver driver,WebDriverWait wait) throws InterruptedException {
		driver.switchTo().activeElement();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"generic-page-popup\"]/section")));
        
        WebElement nameField = driver.findElement(By.xpath("//*[@id=\"propVal-login-form\"]/div[2]"));
        Actions actions = new Actions(driver);
        actions.click(nameField).sendKeys("Vicky").perform();
        
        WebElement NUmberField = driver.findElement(By.xpath("//*[@id=\"propVal-login-form\"]/div[3]/div[2]"));
        Actions actions1 = new Actions(driver);
        actions1.click(NUmberField).sendKeys("8904416924").perform();
        
        WebElement emailField = driver.findElement(By.xpath("//*[@id=\"propVal-login-form\"]/div[4]"));
        Actions actions2 = new Actions(driver);
        actions2.click(emailField).sendKeys("vicky23@gamil.com").perform();
        
        WebElement Submit = driver.findElement(By.xpath("//*[@id=\"propVal-login-form\"]/div[5]/div/a"));
                                                       
        Actions actions3 = new Actions(driver);
        actions3.moveToElement(Submit).click().perform(); // Move to the submit button and click it
        Thread.sleep(10000);
       driver.switchTo().frame("otp-screen");
        Thread.sleep(10000);
		WebElement Verfy = driver.findElement(By.xpath("//*[@id='verifyOtpDiv']/div[2]/div[3]/button"));
		                                               
		Thread.sleep(10000);
		
		Verfy.click();
		
	//Clicking on BuyNow Button
		driver.switchTo().defaultContent();
 WebElement BuyNow = driver.findElement(By.xpath("//*[@id=\"pkgpriceSec\"]/a[2]"));
 BuyNow.click();
// 
	}

	
	public static void user_clicks_PlaceOrder(WebDriver driver) {
		WebElement Propertservicepage=driver.findElement(By.xpath("//*[@id=\"item-240781\"]/div[1]/div[2]/div[1]"));
    	String actual=Propertservicepage.getText();
    	System.out.println(actual);
    	String expected="Basic Property Valuation";
       // wait.until(ExpectedConditions.urlContains("property-services"));
        Assert.assertEquals(actual, expected);
        driver.quit();
    }

  
}
