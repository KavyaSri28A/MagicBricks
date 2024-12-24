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

public class S3EstimatedWorth {

	public static void user_click_propworth(WebDriver driver, WebDriverWait wait) throws InterruptedException {
	 // Write code here that turns the phrase above into concrete actions
		WebElement sell=driver.findElement(By.xpath("//*[@id='commercialIndex']/header/section[2]/div/ul/li[3]/a"));
	    wait.until(ExpectedConditions.elementToBeClickable(sell));
	    Actions actions0 = new Actions(driver);
	    actions0.moveToElement(sell);
	 	Thread.sleep(10000);
	 	sell.click();
	 	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"commercialIndex\"]/header/section[2]/div/ul/li[3]/div/div/div[3]/ul/li[4]/a"))).click();
	 	Thread.sleep(10000);
	 	
}
   public static void user_enter_details(WebDriver driver, WebDriverWait wait,String SecondWindow,String FirstWindow) throws InterruptedException {
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
	     WebElement propertname = driver.findElement(By.xpath("//*[@id=\"propworth\"]/div[2]/div[1]/div[3]/div/div/div/div[1]/input"));
	     Actions actions5 = new Actions(driver);
	     actions5.click(propertname).sendKeys("jaya bheri silicon valley, Kothaguda, Hyderabad").perform();
	     
	     WebElement submitprop=driver.findElement(By.xpath("//*[@id=\"propworth\"]/div[2]/div[1]/div[3]/span[2]"));
	     Actions action6=new Actions(driver);
	     action6.moveToElement(submitprop).click().perform();
	     Thread.sleep(10000);
   }
   
   public static void user_click_propworth_esitimatepage(WebDriver driver, WebDriverWait wait) throws InterruptedException {	   // Write code here that turns the phrase above into concrete actions
		 WebElement propertname = driver.findElement(By.xpath("//*[@id=\"propworth\"]/div[3]/div/div[1]/div[2]/div/div/div[2]/div/div[2]/div/div/div[1]/input"));
	     Actions actions7 = new Actions(driver);
	     actions7.click(propertname).sendKeys("jaya bheri silicon valley, Kothaguda, Hyderabad").perform();
	     Thread.sleep(10000);;
	     
	 	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"propworth\"]/div[3]/div/div[1]/div[2]/div/div/div[2]/div/div[2]/div/div/div[2]/div/div[2]"))).click();
	 	Thread.sleep(10000);
	 	
		 WebElement properttype = driver.findElement(By.xpath("//*[@id=\"propworth\"]/div[3]/div/div[1]/div[2]/div/div/div[3]/div/div[2]/div[2]/label"));
	     Actions actions8 = new Actions(driver);
	     actions8.click(properttype).perform();
	     Thread.sleep(10000);
	     
	     WebElement BHK = driver.findElement(By.xpath("//*[@id=\"propworth\"]/div[3]/div/div[1]/div[2]/div/div/div[4]/div/div[2]/div[2]/label"));
	     Actions actions9 = new Actions(driver);
	     actions9.click(BHK).perform();
	     Thread.sleep(10000);
	     JavascriptExecutor js = (JavascriptExecutor) driver;
	
		js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath("//*[@id=\"propworth\"]/div[3]/div/div[1]/div[2]/div/div/div[5]/div/div[1]")));
	    Thread.sleep(10000); 

			WebElement  coveredArea= driver.findElement(By.xpath("//*[@id=\"propworth\"]/div[3]/div/div[1]/div[2]/div/div/div[5]/div/div[2]/div/input"));

	     Actions action10 = new Actions(driver);
	     action10.moveToElement(coveredArea).click(coveredArea).sendKeys("2000").build().perform();
	     
	     Thread.sleep(5000);
	     
	     wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"propworth\"]/div[3]/div/div[1]/div[2]/div/div/div[11]/div"))).click();


   }
   public static void contains_text(WebDriver driver) {
	   // Write code here that turns the phrase above into concrete actions
		WebElement lastPage =driver.findElement(By.xpath("//*[@id=\"signUp\"]/div[1]"));
		String actual=lastPage.getText();
		System.out.println(actual);
		String Expected ="Enter your details to see the estimated price";
	    Assert.assertEquals(actual, Expected);
		driver.quit();
   }
   
   }
   

