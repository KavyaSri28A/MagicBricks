package com.pages;

import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InteriorCostCalculatorPage {
	
	public static void getCostCalculatorPage(WebDriver driver,WebDriverWait wait) throws InterruptedException {
		WebElement homeInteriors =driver.findElement(By.xpath("//*[@id=\"commercialIndex\"]/header/section[2]/div/ul/li[5]/a"));
        wait.until(ExpectedConditions.elementToBeClickable(homeInteriors));

        Actions actions = new Actions(driver);//

        actions.moveToElement(homeInteriors);
        Thread.sleep(1000);
        homeInteriors.click();
        
        WebElement calculator = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//*[@id=\"commercialIndex\"]/header/section[2]/div/ul/li[5]/div/div/div[3]/ul/li[4]/a")));
            Thread.sleep(100);
            calculator.click();
            Thread.sleep(10000);
	}
	
	public static void getBHKDetails(WebDriver driver,WebDriverWait wait, String currentWindowHandle ) throws InterruptedException {

		currentWindowHandle = driver.getWindowHandle();
		String mainWindow = driver.getWindowHandle();


	    // Switch to the second window
	    Set<String> windowHandles = driver.getWindowHandles();
	    for (String window : windowHandles) {
	        if (!window.equals(mainWindow)) {
	            driver.switchTo().window(window);

	        }
	    }
	    
	  
	    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[1]/div/div[2]/div[1]/label/div[1]"))).click();

		Thread.sleep(100);

		WebElement one_bhk= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[1]/div/div[2]/div[1]/label/div[2]/div[1]/label/span"));
	   Thread.sleep(1000);
	   one_bhk.click();
		
		WebElement next= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/button"));
		   Thread.sleep(1000);
			next.click();
			   Thread.sleep(1000);
}
	
	
	public static void getUserDetails(WebDriver driver,WebDriverWait wait) throws InterruptedException {
		 // enterring the details of the user
		WebElement nameField = driver.findElement(By.xpath("//*[@id=\"user-name\"]"));
        Actions actions = new Actions(driver);
        actions.click(nameField).sendKeys("krishna").perform();
		   Thread.sleep(1000);

        
        WebElement NUmberField = driver.findElement(By.xpath("//*[@id=\"phone\"]"));
        Actions actions1 = new Actions(driver);
        actions1.click(NUmberField).sendKeys("7994982646").perform();
		   Thread.sleep(1000);

        
        WebElement emailField = driver.findElement(By.xpath("//*[@id=\"email\"]"));
        Actions actions2 = new Actions(driver);
        actions2.click(emailField).sendKeys("kp24@gamil.com").perform();
		   Thread.sleep(1000);

        
        WebElement estimate = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/button"));
		Thread.sleep(100);   
		estimate.click();
		   Thread.sleep(1000);

		   WebElement text= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[1]/div/div[1]"));

		  		String actualText = text.getText().trim();
		          System.out.println("Actual Popup Text: " + actualText);

		          // Expected text, normalized
		          String expectedText ="Verify your number".trim();

		          // Print expected text for debugging
		          System.out.println("Expected Popup Text: " + expectedText);

		          // Compare actual text with expected text
		          Assert.assertTrue("Popup text does not match expected content!", actualText.contains(expectedText));
		      	//Assert.assertEquals(actual, Expected);
		          driver.quit();

}
}