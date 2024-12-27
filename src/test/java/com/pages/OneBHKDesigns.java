package com.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OneBHKDesigns {
	
	public static void getCity(WebDriver driver,WebDriverWait wait) throws InterruptedException {
		// Code to select the city dropdown

		WebElement city= driver.findElement(By.xpath("//*[text()=\"Select City\"]"));
	    Thread.sleep(1000);
		city.click();
		
		// Code to select the city range

		WebElement city_o= driver.findElement(By.xpath("//label[@class='mb-form-ui__select__label' and text()='Bangalore']"));
		Thread.sleep(1000);
		city_o.click();
		Thread.sleep(1000);
	    
	}
	
	public static void selectCost(WebDriver driver,WebDriverWait wait) throws InterruptedException {
		// Code to select the cost dropdown
		WebElement cost= driver.findElement(By.xpath("//*[text()='Price Range']"));
	    Thread.sleep(1000);
		cost.click();
		// Code to select the cost range
		WebElement cost_o= driver.findElement(By.xpath("//label[@class='mb-form-ui__select__label' and text()='5-10 Lacs']"));
	    Thread.sleep(1000);
	    cost_o.click();
	    Thread.sleep(10000);
	}
	
	public static void showDesigns(WebDriver driver,WebDriverWait wait) throws InterruptedException {

		WebElement text= driver.findElement(By.xpath("//h1[@class='intsrp--pageTitle']"));
	    text.click();

	  		String actualText = text.getText().trim();
	          System.out.println("Actual Popup Text: " + actualText);

	          // Expected text, normalized
	          String expectedText ="Home Interior Design Services".trim();

	          // Print expected text for debugging
	          System.out.println("Expected Popup Text: " + expectedText);

	          // Compare actual text with expected text
	          Assert.assertTrue("Popup text does not match expected content!", actualText.contains(expectedText));
	      	//Assert.assertEquals(actual, Expected);
	          //secondURL=driver.getCurrentUrl();
	      	
	   driver.quit();
		
}
}
