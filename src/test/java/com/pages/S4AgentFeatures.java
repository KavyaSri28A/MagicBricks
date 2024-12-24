package com.pages;

import java.util.Iterator;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class S4AgentFeatures {
  public static void user_clicks_find_agent(WebDriver driver, WebDriverWait wait) throws InterruptedException {
	  // Write code here that turns the phrase above into concrete actions
		WebElement sell=driver.findElement(By.xpath("//*[@id='commercialIndex']/header/section[2]/div/ul/li[3]/a"));
	    wait.until(ExpectedConditions.elementToBeClickable(sell));
	    Actions actions0 = new Actions(driver);
	    actions0.moveToElement(sell);
	 	Thread.sleep(10000);
	 	sell.click();
	 	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"commercialIndex\"]/header/section[2]/div/ul/li[3]/div/div/div[3]/ul/li[2]/a"))).click();
	 	Thread.sleep(10000);
	  
  }
  public static void user_click_details(WebDriver driver, WebDriverWait wait,String FirstWindow) {
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
	  	wait.until(ExpectedConditions.elementToBeClickable(By.id("cityList"))).click();//To click the drop down
	  	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"cityList\"]/option[21]"))).click();//To select the city (varanasi)
	  	wait.until(ExpectedConditions.elementToBeClickable(By.id("localityList"))).click();//to select the locality dropdown
	  	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"localityList\"]/option[4]"))).click();//To select the locality(paharia)

	  
  }
  public static void deatils_agent(WebDriver driver, WebDriverWait wait,String FirstWindow,String SecondWindow) {
	  // Write code here that turns the phrase above into concrete actions
		SecondWindow=driver.getWindowHandle();
		 Set<String> windowHandles=driver.getWindowHandles();
		 for(String i:windowHandles) {
			 if(!i.equals(FirstWindow) && !i.equals(SecondWindow)) {
				 driver.switchTo().window(i);
			 }
		 }
		 WebElement Details=driver.findElement(By.xpath("//*[@id=\"agentinfoId\"]/div/div[2]/div[1]"));
		 String actual=Details.getText();
		 System.out.println(actual);
		 String Expected="Pramod Malviya";
		 Assert.assertEquals(actual, Expected);

  }
}
