package com.pages;

import java.util.Properties;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HomeLoanEMI {
	static Actions actions;
public static void clickEMI(WebDriver driver, String string,Properties prop) throws InterruptedException {
	actions=new Actions(driver);
	Thread.sleep(5000);
    String mainWindowHandle=driver.getWindowHandle();
    Set<String> windowHandles=driver.getWindowHandles();
    for(String handle:windowHandles) {
    	if(!handle.equals(mainWindowHandle)) {
    		driver.switchTo().window(handle);
    	}
    }
    Thread.sleep(3000);
    WebElement amountField=driver.findElement(By.id("amountRequiredEmiCal"));
    WebElement tenure=driver.findElement(By.xpath("/html/body/div/div[4]/div[1]/div/div[1]/div[1]/form/div[2]/div[1]/div"));
     WebElement tenureDropDown20=driver.findElement(By.xpath("//*[@id=\"loan-tenure_Emi\"]/li[4]"));
    WebElement interestField=driver.findElement(By.xpath("//*[@id=\"interestRateEmiCal\"]"));
    WebElement calculateButton=driver.findElement(By.xpath("//*[@id=\"submitbuttonEmiCalid\"]"));
    amountField.clear();
    interestField.clear();
    amountField.sendKeys(prop.get("needamount").toString());
    interestField.sendKeys(string);
    Thread.sleep(1000);
    tenure.click();
    
    tenureDropDown20.click();
    Thread.sleep(1000);
    calculateButton.click();
}

public static void  showWarning(WebDriver driver, String string) {
	String expectedWarning = string;
	WebElement warning=driver.findElement(By.xpath("//*[@id=\"interestRateEmiCalError\"]"));
	String actualWarning=warning.getText();
	System.out.println("Actual Popup Text: " + actualWarning);
	System.out.println("Expected Popup Text: " + expectedWarning);
	Assert.assertEquals(actualWarning, expectedWarning);
}
}
