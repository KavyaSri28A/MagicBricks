package com.pages;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class S2RecommededADpack {
   public static void user_click_AD_package(WebDriver driver, WebDriverWait wait) throws InterruptedException {
	 WebElement Popup=driver.findElement(By.xpath("//*[@id=\"userOnboardingWidget\"]/div/div[1]"));
	    wait.until(ExpectedConditions.elementToBeClickable(Popup));
	    Thread.sleep(100);
	    Popup.click();
	    
		WebElement sell=driver.findElement(By.xpath("//*[@id='commercialIndex']/header/section[2]/div/ul/li[3]/a"));
	    wait.until(ExpectedConditions.elementToBeClickable(sell));
	    Actions actions0 = new Actions(driver);
	    actions0.moveToElement(sell);
	 	Thread.sleep(100);
	 	sell.click();
	 	//For clicking on AD Package
	    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"commercialIndex\"]/header/section[2]/div/ul/li[3]/div/div/div[2]/ul/li[2]/a"))).click();
	 	
	}

   public static void user_select_Rent(WebDriver driver, WebDriverWait wait,String SecondWindow,String FirstWindow) {
		SecondWindow=driver.getWindowHandle();
		 Set<String> windowHandles=driver.getWindowHandles();
		 for(String i:windowHandles) {
			 if(!i.equals(FirstWindow) && !i.equals(SecondWindow)) {
				 driver.switchTo().window(i);
			 }
		 }
		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"wrapper\"]/div[2]/div[1]/div/div[2]/form/div/div[1]/div/div[2]/ul/li[2]/label"))).click();
	     
   }
   public static void user_select_PG_Flatmate(WebDriverWait wait) throws InterruptedException {
	   Thread.sleep(100);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"pgliId\"]/label"))).click();
		Thread.sleep(20000);
   }
   
   public static void user_click_recommededADpack(WebDriver driver) {
	   System.out.println("Recommended Pack is:");
		WebElement Recommended =driver.findElement(By.xpath("/html/body/section/div[2]/div[1]/div[2]/div[1]/div[4]/div[2]/div[1]"));
		String actual=Recommended.getText();
		System.out.println(actual);
		//String Expected1 ="Gold";
		
	    driver.quit();
   

	 
 }
}

