package com.pages;

import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ErrorPageCostCalculator {
	
	public static void bhkDetails(WebDriver driver,WebDriverWait wait) throws InterruptedException {

		WebElement homeInteriors =driver.findElement(By.xpath("//*[@id=\"commercialIndex\"]/header/section[2]/div/ul/li[5]/a"));
	      wait.until(ExpectedConditions.elementToBeClickable(homeInteriors));

	      Actions actions = new Actions(driver);//

	      actions.moveToElement(homeInteriors);
	      Thread.sleep(1000);
	      homeInteriors.click();
	      
	      WebElement calculator = wait.until(ExpectedConditions.visibilityOfElementLocated(
	              By.xpath("//*[@id=\"commercialIndex\"]/header/section[2]/div/ul/li[5]/div/div/div[3]/ul/li[3]/a")));
	          Thread.sleep(100);
	          calculator.click();
	          Thread.sleep(10000);
}
	
	
	public static void estimateButton(WebDriver driver,WebDriverWait wait, String currentWindowHandle) throws InterruptedException {
		
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
			   
			   WebElement estimate = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/button"));
				Thread.sleep(100);   
				estimate.click();
				   Thread.sleep(1000);

}
	
	public static void getErrorData(WebDriver driver,WebDriverWait wait) throws InterruptedException {

		WebElement text= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[1]/div[2]/div[1]/div"));
	    text.click();

	  		String actualText = text.getText().trim();
	          System.out.println("Actual Popup Text: " + actualText);

	          // Expected text, normalized
	          String expectedText ="Please enter name.".trim();

	          // Print expected text for debugging
	          System.out.println("Expected Popup Text: " + expectedText);

	          // Compare actual text with expected text
	          Assert.assertTrue("Popup text does not match expected content!", actualText.contains(expectedText));
	      	//Assert.assertEquals(actual, Expected);
driver.quit();
}
}