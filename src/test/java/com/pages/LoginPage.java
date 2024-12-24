package com.pages;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	public static void loginFirstPage(Actions mouse,WebDriver driver,WebDriverWait wait) throws InterruptedException {
		mouse=new Actions(driver);
		WebElement login_dropdown=driver.findElement(By.xpath("//*[@id=\"commercialIndex\"]/header/section[1]/div/div[2]/div[2]/a"));
		wait.until(ExpectedConditions.elementToBeClickable(login_dropdown));
		Thread.sleep(5000);
		login_dropdown.click();
		WebElement login_button=driver.findElement(By.xpath("//*[@id=\"commercialIndex\"]/header/section[1]/div/div[2]/div[2]/div/div[2]/a"));
		System.out.println("clicked logindropdown");
		wait.until(ExpectedConditions.elementToBeClickable(login_button));
		Thread.sleep(5000);
		mouse.moveToElement(login_button).perform();
		login_button.click();
	}
	public static void enterDetails(WebDriver driver,String mobile,WebDriverWait wait) throws InterruptedException {
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
	    Thread.sleep(5000);
	    phoneNumber.sendKeys(mobile);
	    Thread.sleep(15000);
	    WebElement nextButton=driver.findElement(By.id("btnStep1"));
	    nextButton.click();
	    Thread.sleep(5000);
	    WebElement continueButton=driver.findElement(By.xpath("//*[@id=\"verifyOtpDiv\"]/div[2]/div[3]/button"));
	    continueButton.click();
	}
}
