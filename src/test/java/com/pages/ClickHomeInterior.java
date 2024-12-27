package com.pages;

import java.io.File;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ClickHomeInterior {
	static JavascriptExecutor js;
	public static void clickHomeInt(WebDriver driver,WebDriverWait wait) throws InterruptedException {
	 WebElement homeInteriors =driver.findElement(By.xpath("//a[@class='mb-header__sub__tabs__link js-menu-link' and text()='Home Interiors']"));
     wait.until(ExpectedConditions.elementToBeClickable(homeInteriors));

     Actions actions = new Actions(driver);//

     actions.moveToElement(homeInteriors);
     Thread.sleep(1000);
     homeInteriors.click();

}
	
	public static void ClickInteriorDesignService(WebDriver driver,WebDriverWait wait) throws InterruptedException {
		 WebElement interiorDesignServices = wait.until(ExpectedConditions.visibilityOfElementLocated(
		            By.xpath("//a[text()='Home Interior Design Services']")));
		        Thread.sleep(100);
		        interiorDesignServices.click();
	}
	
	public static void screenShotMethod(String fname, WebDriver driver) throws IOException {
	    File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

	    // Specify the absolute path for the destination folder directly
	    String destinationPath = "C:\\Users\\KS89\\git\\repository2\\MagicBricks\\ScreenShots\\" + fname + ".png";
	    File destinationFile = new File(destinationPath);

	    // Copy the screenshot to the specified location
	    FileUtils.copyFile(screenshotFile, destinationFile);
	    System.out.println("Screenshot saved: " + destinationFile.getAbsolutePath());
	}
	
	public static void bookYourSpot(WebDriver driver,WebDriverWait wait,String currentWindowHandle) throws InterruptedException {
		currentWindowHandle = driver.getWindowHandle();
    	js = (JavascriptExecutor) driver;
    	String mainWindow = driver.getWindowHandle();

        // Switch to the new window
        Set<String> windowHandles = driver.getWindowHandles();
        for (String window : windowHandles) {
            if (!window.equals(mainWindow)) {
                driver.switchTo().window(window);
               
            }
	}
     // Wait for the "Our Top Interior Designers" heading
        WebElement topInteriorDesignersHeading = wait.until(ExpectedConditions.presenceOfElementLocated(
                By.xpath("//*[@id=\"root\"]/div[2]/div[5]/div[3]/div/div/div/div/p")));
        
        // Scroll into view
        js.executeScript("arguments[0].scrollIntoView({ behavior: 'smooth', block: 'center' });", topInteriorDesignersHeading);

        // Wait for the "Contact Now" button and click it
        WebElement contactNowButton = driver.findElement (By.xpath("//div[@class='imFest-dtl__action__btn' and text()='Book your Spot Now']"));
            Thread.sleep(1000);   
        contactNowButton.click();
        //driver.switchTo().window(mainWindow);
		
        
}
	
	public static void popUpDetails(WebDriver driver,WebDriverWait wait, Properties prop) throws InterruptedException {
		WebElement month = driver.findElement (By.xpath("//label[@class='mb-form-ui__select__label' and text()='Within 1 Month']"));
		Thread.sleep(100);   
		month.click();
		
		WebElement continueButton = driver.findElement (By.xpath("//div[@class='int-contact-popup__action__btn' and text()='Continue']"));
		Thread.sleep(100);   
		continueButton.click();
		WebElement nameField = driver.findElement(By.xpath("//input[@class='mb-form-ui__input' and @id='user-name']"));
   
        nameField.sendKeys(prop.get("name").toString());
        
        WebElement NUmberField = driver.findElement(By.xpath("//input[@class='mb-form-ui__input' and @id='phone']"));
       
        NUmberField.sendKeys(prop.get("number").toString());
        
        WebElement emailField = driver.findElement(By.xpath("//input[@class='mb-form-ui__input' and @id='email']"));
      
        emailField.sendKeys(prop.get("email").toString());


      Thread.sleep(10000);
      
      
		WebElement popup=driver.findElement(By.xpath("//div[@class='mb-contact-form_title' and text()='Please share your contact details where we can reach out to you']"));
		
                                                                                                                                                           

		String actualText = popup.getText().replaceAll("\\s+", " ").trim();
      System.out.println("Actual Popup Text: " + actualText);

      // Expected text, normalized
      String expectedText = "Please share your contact details where we can reach out to you".replaceAll("\\s+", " ").trim();

      // Print expected text for debugging
      System.out.println("Expected Popup Text: " + expectedText);

      // Compare actual text with expected text
      Assert.assertTrue("Popup text does not match expected content!", actualText.contains(expectedText));
  	driver.quit();
  
		
		
	}
	
}




