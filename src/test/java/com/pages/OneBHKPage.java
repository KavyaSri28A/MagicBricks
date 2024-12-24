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

public class OneBHKPage {
	public static void clicksOneBHKDesign(WebDriver driver,WebDriverWait wait) throws InterruptedException {
		WebElement homeInteriors =driver.findElement(By.xpath("//a[@class='mb-header__sub__tabs__link js-menu-link' and text()='Home Interiors']"));
        wait.until(ExpectedConditions.elementToBeClickable(homeInteriors));

        Actions actions = new Actions(driver);//

        actions.moveToElement(homeInteriors);
        Thread.sleep(1000);
        homeInteriors.click();
        WebElement one_bhk = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//a[@target='_blank' and text()='1BHK Interior Design']")));
            Thread.sleep(1000);
            one_bhk.click();
	}
	public static void getEstimate(WebDriver driver,WebDriverWait wait, String currentWindowHandle ) throws InterruptedException {
		 currentWindowHandle = driver.getWindowHandle();
			String mainWindow = driver.getWindowHandle();
			JavascriptExecutor js = (JavascriptExecutor) driver;

		    // Switch to the new window
		    Set<String> windowHandles = driver.getWindowHandles();
		    for (String window : windowHandles) {
		        if (!window.equals(mainWindow)) {
		            driver.switchTo().window(window);

		        }
		    }

		    WebElement costestimate = wait.until(ExpectedConditions.presenceOfElementLocated(
		            By.xpath("//*[@id=\"intsrpbhkPages\"]/div[4]/div[3]/div/div[3]/div[1]/div[2]/div[2]/div[2]/span[2]")));
		    
		    // Scroll into view
		    js.executeScript("arguments[0].scrollIntoView({ behavior: 'smooth', block: 'center' });", costestimate);

		    // Wait for the "Contact Now" button and click it
		    WebElement Button = driver.findElement (By.xpath("//*[@id=\"intsrpbhkPages\"]/div[4]/div[3]/div/div[3]/div[1]/div[4]/span"));
		        Thread.sleep(1000);   
		        Button.click();
	}
	
	public static void clickCity(WebDriver driver,WebDriverWait wait) throws InterruptedException {
		 WebElement city= driver.findElement(By.xpath("//*[@id=\"int-contact-popup\"]/div/div[2]/div[2]/div/ul/li[1]/label"));
	        Thread.sleep(10000);   

		 city.click();
	}
	
	public static void clickContinue(WebDriver driver,WebDriverWait wait) throws InterruptedException {
		WebElement continues= driver.findElement(By.xpath("//*[@id=\"int-contact-popup\"]/div/div[2]/div[3]/div"));
	    continues.click();
	    Thread.sleep(1000);
        
		WebElement text= driver.findElement(By.xpath("//*[@id=\"int-contact-popup\"]/div/div[2]/div[1]"));
	    text.click();

	  		String actualText = text.getText().trim();
	          System.out.println("Actual Popup Text: " + actualText);

	          // Expected text, normalized
	          String expectedText ="Please share your contact details where we can reach out to you".trim();

	          // Print expected text for debugging
	          System.out.println("Expected Popup Text: " + expectedText);

	          // Compare actual text with expected text
	          Assert.assertTrue("Popup text does not match expected content!", actualText.contains(expectedText));
	      	//Assert.assertEquals(actual, Expected);
	          //secondURL=driver.getCurrentUrl();
	      	driver.quit();
	}
}
