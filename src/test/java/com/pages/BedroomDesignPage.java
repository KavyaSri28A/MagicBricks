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

public class BedroomDesignPage {
	static JavascriptExecutor js;
	
	public static void bedroomDesign(WebDriver driver,WebDriverWait wait) throws InterruptedException {
		 WebElement homeInteriors =driver.findElement(By.xpath("//a[@class='mb-header__sub__tabs__link js-menu-link' and text()='Home Interiors']"));
	        wait.until(ExpectedConditions.elementToBeClickable(homeInteriors));

	        Actions actions = new Actions(driver);
	        actions.moveToElement(homeInteriors);
	        Thread.sleep(1000);
	        homeInteriors.click();
	        Thread.sleep(1000);

	        WebElement bedroomdesign = wait.until(ExpectedConditions.visibilityOfElementLocated(
	                By.xpath("//a[@target='_blank' and text()='Bedroom Design Ideas']")));

	            Thread.sleep(100);
	            bedroomdesign.click();
	            Thread.sleep(10000);
	}
	
	
	public static void styleLuxury(WebDriver driver,WebDriverWait wait) throws InterruptedException {
		String MainWindow1=driver.getWindowHandle();
	  	 Set<String> s11=driver.getWindowHandles();		
	       for(String i:s11) {
	       	if(!i.equals(MainWindow1)) {
	       		driver.switchTo().window(i);
	       	}
	       }
		Thread.sleep(1000);
	   	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Style']"))).click(); //style
	    Thread.sleep(1000);
		WebElement luxury= driver.findElement(By.xpath("//label[@class='mb-form-ui__select__label' and text()='Luxury']"));
	    Thread.sleep(1000);
		luxury.click();
		WebElement close= driver.findElement(By.xpath("//div[@class='bottom-sticky-filter__close']"));
	    Thread.sleep(1000);
		close.click();
	}
	
	public static void estimatePrice(WebDriver driver,WebDriverWait wait) throws InterruptedException {
		
		js = (JavascriptExecutor) driver;
		
		WebElement scroll = wait.until(ExpectedConditions.presenceOfElementLocated(
	            By.xpath("//div[@class='disrp__card__heading' and text()='Luxury Bedroom 4']")));
	    
	    // Scroll into view
	    js.executeScript("arguments[0].scrollIntoView({ behavior: 'smooth', block: 'center' });", scroll);

	    // Wait for the "estimate price" button and click it
	    
	    WebElement drop= driver.findElement(By.xpath("//*[@id=\"id_dirsp\"]/div[3]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]"));
		Thread.sleep(1000);
	    drop.click();
		Thread.sleep(1000);
	   WebElement text= driver.findElement(By.xpath("//*[@id=\"id_dirsp\"]/div[3]/div[1]/div[1]/div[3]/div[2]/div[3]/div"));
		Thread.sleep(1000);
	    text.click();
		Thread.sleep(1000);
	}
	
	public static void fillPopUp(WebDriver driver,WebDriverWait wait,String FirstWindow ) throws InterruptedException {
	
		//switching to third window
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
			    
			    //
			    
			    WebElement text= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div[2]/div[1]/div[1]"));

			  		String actualText = text.getText().trim();
			          System.out.println("Actual Popup Text: " + actualText);

			          // Expected text, normalized
			          String expectedText ="Where can the Designer connect with you?".trim();

			          // Print expected text for debugging
			          System.out.println("Expected Popup Text: " + expectedText);

			          // Compare actual text with expected text
			          Assert.assertTrue("Popup text does not match expected content!", actualText.contains(expectedText));

	driver.quit();
	}
}
