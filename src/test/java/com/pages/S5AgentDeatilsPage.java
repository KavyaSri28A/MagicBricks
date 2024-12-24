package com.pages;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class S5AgentDeatilsPage {
   public static void user_fillsdeatils(WebDriver driver, WebDriverWait wait,String FirstWindow,String name,String mail,String num) {

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
	   wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"contactBtn9423225\"]"))).click();//To click on the Contact Agent Button
	  
			
	   WebElement name1 = driver.findElement(By.xpath("//*[@id=\"username9423225\"]"));
	   Actions actions11 = new Actions(driver);
	   actions11.click(name1).sendKeys(name).perform();
	   
	   WebElement mail1 = driver.findElement(By.xpath("//*[@id=\"userEmail9423225\"]"));
	   Actions actions12 = new Actions(driver);
	   actions12.click(mail1).sendKeys(mail).perform();
	   
	   WebElement num1 = driver.findElement(By.xpath("//*[@id=\"userMobile9423225\"]"));
	   Actions actions13 = new Actions(driver);
	   actions13.click(num1).sendKeys(num).perform();
	   
	}
   
   public static void user_submit(WebDriver driver) {
	   WebElement sub = driver.findElement(By.xpath("//*[@id=\"contactObjButton\"]"));
	   Actions actions14 = new Actions(driver);
	   actions14.click(sub).perform();
	   
	   WebElement ele=driver.findElement(By.xpath("//*[@id=\"smsWrapper\"]/div[1]/div[1]"));
	   String actual=ele.getText();
	   System.out.println(actual);
	   String Expected="Verify your number";
	   Assert.assertEquals(Expected, actual);
	   driver.quit();
   }
}
