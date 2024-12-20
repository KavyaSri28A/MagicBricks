package com.pages;

import java.util.Properties;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class CalculatorCommon {
	public static void clickCalculator(WebDriver driver) throws InterruptedException {
		Thread.sleep(5000);
		WebElement homeLoanHeading=driver.findElement(By.xpath("//*[@id=\"commercialIndex\"]/header/section[2]/div/ul/li[4]/a"));
		homeLoanHeading.click();
		Thread.sleep(5000);
		WebElement homeLoanCalculator=driver.findElement(By.xpath("//*[@id=\"homeloanDrop\"]/div/div[3]/ul/li[1]/a"));
		homeLoanCalculator.click();
	}
	public static void enterdetails(WebDriver driver,Properties prop,Actions mouse) throws InterruptedException {
		mouse=new Actions(driver);
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
	    interestField.sendKeys(prop.get("percent").toString());
	    Thread.sleep(10000);
	    tenure.click();
//	    mouse.moveToElement(tenureDropDown20).perform();
//	    
	    tenureDropDown20.click();
	    Thread.sleep(3000);
	    calculateButton.click();
	}
	public static void compareresult(WebDriver driver,Properties prop) {
		WebElement actual=driver.findElement(By.xpath("//*[@id=\"perMonthEmi\"]"));
		String actualAmount=actual.getText();
		String expectedAmount=(String) prop.get("expectedAmount");
		Assert.assertEquals(expectedAmount, actualAmount);
	}
}
