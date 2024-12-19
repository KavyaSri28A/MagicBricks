package com.setup;

import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExtraFunctions {
	static WebDriverWait wait;
	static Actions mouse;
	public static WebDriver loginFunction(WebDriver driver ) throws FileNotFoundException, InterruptedException {
   // Write code here that turns the phrase above into concrete actions
	    wait=new WebDriverWait(driver, Duration.ofSeconds(60));
	    Thread.sleep(10000);
     // Write code here that turns the phrase above into concrete actions
		mouse=new Actions(driver);
		WebElement login_dropdown=driver.findElement(By.xpath("//*[@id=\"commercialIndex\"]/header/section[1]/div/div[2]/div[2]/a"));
		wait.until(ExpectedConditions.elementToBeClickable(login_dropdown));
		Thread.sleep(10000);
		login_dropdown.click();
		WebElement login_button=driver.findElement(By.xpath("//*[@id=\"commercialIndex\"]/header/section[1]/div/div[2]/div[2]/div/div[2]/a"));
		System.out.println("clicked logindropdown");
		wait.until(ExpectedConditions.elementToBeClickable(login_button));
		Thread.sleep(10000);
		mouse.moveToElement(login_button).perform();
		login_button.click();    
	    String firstwindow=driver.getWindowHandle();
	    Set<String> windowhandles=driver.getWindowHandles();
	    for(String i:windowhandles) {
	    	if(! i.equals(firstwindow)) {
	    		driver.switchTo().window(i);
	    	}
	    }
	    WebElement Labelclick=driver.findElement(By.id("emailOrMobileLable"));
	    WebElement phoneNumber=driver.findElement(By.name("emailOrMobile"));
		wait.until(ExpectedConditions.elementToBeClickable(Labelclick));
		Labelclick.click();
	    //9618871371
	    Thread.sleep(10000);
		phoneNumber.sendKeys("9677661922");
	    Thread.sleep(10000);
	    WebElement nextButton=driver.findElement(By.id("btnStep1"));
	    nextButton.click();
	    Thread.sleep(20000);
	    WebElement continueButton=driver.findElement(By.xpath("//*[@id=\"verifyOtpDiv\"]/div[2]/div[3]/button"));
	    continueButton.click();
//	    driver.switchTo().window(firstwindow);
		return driver;
	    
	}
}
