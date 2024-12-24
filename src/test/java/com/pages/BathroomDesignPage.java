package com.pages;

import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BathroomDesignPage {
	static JavascriptExecutor js;
	public static void bathroomDesign(WebDriver driver,WebDriverWait wait ) throws InterruptedException {
		
		WebElement homeInteriors =driver.findElement(By.xpath("//*[@id=\"commercialIndex\"]/header/section[2]/div/ul/li[5]/a"));
        wait.until(ExpectedConditions.elementToBeClickable(homeInteriors));

        Actions actions = new Actions(driver);//

        actions.moveToElement(homeInteriors);
        Thread.sleep(1000);
        homeInteriors.click();
        
        WebElement bathroomdesigns = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//*[@id=\"commercialIndex\"]/header/section[2]/div/ul/li[5]/div/div/div[1]/ul/li[3]/a")));
            Thread.sleep(100);
            bathroomdesigns.click();
            Thread.sleep(10000);

}
	
	public static void styleSimple(WebDriver driver,WebDriverWait wait, String currentWindowHandle) throws InterruptedException {
		
		currentWindowHandle = driver.getWindowHandle();
		String mainWindow = driver.getWindowHandle();


	    // Switch to the second window
	    Set<String> windowHandles = driver.getWindowHandles();
	    for (String window : windowHandles) {
	        if (!window.equals(mainWindow)) {
	            driver.switchTo().window(window);

	        }
	    }

 	//code for clicking style   
    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"id_dirsp\"]/div[1]/div[1]/div/div[2]"))).click();

	Thread.sleep(1000);

	WebElement simple= driver.findElement(By.xpath("//*[@id=\"id_dirsp\"]/div[1]/div[1]/div/div[2]/div[2]/div[2]/div[2]/ul/li[1]/label"));
   Thread.sleep(1000);
	simple.click();
	WebElement close= driver.findElement(By.xpath("//*[@id=\"id_dirsp\"]/div[1]/div[1]/div/div[2]/div[2]/div[1]"));
    Thread.sleep(1000);
	close.click();
	}
	
	public static void estimatePrice(WebDriver driver,WebDriverWait wait) throws InterruptedException {
        js = (JavascriptExecutor) driver;
		
		WebElement scroll = wait.until(ExpectedConditions.presenceOfElementLocated(
	            By.xpath("//*[@id=\"id_dirsp\"]/div[3]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]")));
	    
	    // Scroll into view
	    js.executeScript("arguments[0].scrollIntoView({ behavior: 'smooth', block: 'center' });", scroll);

	    // Wait for the "estimate price" button and click it
	    WebElement button= driver.findElement(By.xpath("//*[@id=\"id_dirsp\"]/div[3]/div[1]/div[1]/div[1]/div[2]/div[3]/div"));
		Thread.sleep(1000);
	    button.click();
		Thread.sleep(1000);
		
	}
	
	public static void fillDetails(WebDriver driver,WebDriverWait wait, String FirstWindow) throws InterruptedException {
		//for going to third tab
				String SecondWindow = driver.getWindowHandle();
				 Set<String> windowHandles=driver.getWindowHandles();
				 for(String i:windowHandles) {
					 if(!i.equals(FirstWindow) && !i.equals(SecondWindow)) {
						 driver.switchTo().window(i);
					 }
				 }
				 Thread.sleep(1000);
					WebElement month= driver.findElement(By.className("mb-form-ui__select__label"));
					Thread.sleep(100);
				    month.click();
				    WebElement city = driver.findElement(By.className("homdec__form__cityfield__input"));
					Thread.sleep(100);
				    city.click();
				    WebElement city_i = driver.findElement(By.className("homdec__form__cityfield__dropdown__list"));
					Thread.sleep(1000);
				    city_i.click(); 
				    WebElement button = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div[2]/div[2]/button"));
					Thread.sleep(1000);
				    button.click();
				    
				    WebElement text= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div[2]/div[1]/div[1]"));

			  		String actualText = text.getText().trim();
			          System.out.println("Actual Popup Text: " + actualText);

			          // Expected text, normalized
			          String expectedText ="Where can the Designer connect with you?".trim();

			          // Print expected text for debugging
			          System.out.println("Expected Popup Text: " + expectedText);

			          // Compare actual text with expected text
			          Assert.assertTrue("Popup text does not match expected content!", actualText.contains(expectedText));

	
	}
}
