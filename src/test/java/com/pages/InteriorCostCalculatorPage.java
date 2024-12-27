package com.pages;

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

import io.cucumber.datatable.DataTable;

public class InteriorCostCalculatorPage {
	static Actions actions;
	
	public static void getCostCalculatorPage(WebDriver driver,WebDriverWait wait) throws InterruptedException {
		WebElement homeInteriors =driver.findElement(By.xpath("//*[@id=\"commercialIndex\"]/header/section[2]/div/ul/li[5]/a"));
        wait.until(ExpectedConditions.elementToBeClickable(homeInteriors));

        actions = new Actions(driver);//

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
	   }
	
		public static void clickNext(WebDriver driver) throws InterruptedException {
		WebElement next= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/button"));
		   Thread.sleep(1000);
			next.click();
			   Thread.sleep(1000);
}
	
	
	public static void getUserDetails(WebDriver driver,WebDriverWait wait,DataTable dataTable) throws InterruptedException {
		 // entering the details of the user
		
		List<Map<String,String>> details=dataTable.asMaps(String.class, String.class);
		for(Map<String,String> data:details) {
				WebElement nameField = driver.findElement(By.xpath("//*[@id=\"user-name\"]"));
			   WebElement NUmberField = driver.findElement(By.xpath("//*[@id=\"phone\"]"));
			   WebElement emailField = driver.findElement(By.xpath("//*[@id=\"email\"]"));
		        actions.click(nameField).sendKeys(data.get("name"));
		        actions.click(NUmberField).sendKeys(data.get("phoneNumber"));
		        actions.click(emailField).sendKeys(data.get("email"));
		}

		   WebElement text= driver.findElement(By.xpath("//div[@class='mb-contact-form_title']"));

		  		String actualText = text.getText().trim();
		          System.out.println("Actual Popup Text: " + actualText);

		          // Expected text, normalized
		          String expectedText ="Price Estimate is almost ready!".trim();

		          // Print expected text for debugging
		          System.out.println("Expected Popup Text: " + expectedText);

		          // Compare actual text with expected text
		          Assert.assertTrue("Popup text does not match expected content!", actualText.contains(expectedText));
		      	//Assert.assertEquals(actual, Expected);
		          driver.quit();

}
}