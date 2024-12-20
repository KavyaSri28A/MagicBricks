package com.pages;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.datatable.DataTable;

public class HomeLoansFunction {
	public static void clickHomeLoans(WebDriver driver) throws InterruptedException {
		Thread.sleep(5000);
		WebElement homeLoanHeading=driver.findElement(By.xpath("//*[@id=\"commercialIndex\"]/header/section[2]/div/ul/li[4]/a"));
		homeLoanHeading.click();
		Thread.sleep(5000);
		WebElement homeLoanButton=driver.findElement(By.xpath("//*[@id=\"homeloanDrop\"]/div/div[1]/ul/li[1]/a"));
		homeLoanButton.click();
	}
	public static void putDetailsOne(DataTable dataTable,Actions mouse,WebDriver driver,Properties prop,WebDriverWait wait) throws InterruptedException {
		Thread.sleep(5000);
	    String mainWindowHandle=driver.getWindowHandle();
	    Set<String> windowHandles=driver.getWindowHandles();
	    for(String handle:windowHandles) {
	    	if(!handle.equals(mainWindowHandle)) {
	    		driver.switchTo().window(handle);
	    	}
	    }
	    List<Map<String,String>> details=dataTable.asMaps();
	    String mobile,amount;
	    for(Map<String,String> item:details) {
	    	mobile=item.get("mobile");
	    	amount=item.get("amount");
	    WebElement loanAmountField=driver.findElement(By.id("loanAmount"));
	    loanAmountField.click();
	    loanAmountField.sendKeys(amount);
	    WebElement mobileNumberField=driver.findElement(By.xpath("//*[@id=\"mobileNumber\"]"));
	    mobileNumberField.click();
	    mobileNumberField.sendKeys(mobile);
//	    System.out.println("The upcoming Functions");
	    }
	    WebElement propertyCityField=driver.findElement(By.id("PropertyCity"));
	    String City=prop.getProperty("area");
	    propertyCityField.sendKeys(City);
	    Thread.sleep(2000);
	    WebElement city=driver.findElement(By.xpath("//*[@id=\"cityDropdownWebList\"]/li/span"));
	    mouse.moveToElement(city);
	    city.click();
	    Thread.sleep(10000);
	    WebElement propertyFinalizedNo=driver.findElement(By.xpath("//*[@id=\"loan-section\"]/div[2]/div[1]/div[4]/div[2]/div[2]/label"));
	    wait.until(ExpectedConditions.elementToBeClickable(propertyFinalizedNo));
	    propertyFinalizedNo.click();
	    Thread.sleep(3000);
	    WebElement finalizingTime90=driver.findElement(By.xpath("//*[@id=\"PropFinalizedDays\"]/div[2]/div[2]/label"));
	    wait.until(ExpectedConditions.elementToBeClickable(finalizingTime90));
	    finalizingTime90.click();
	    WebElement getLowerInterestCheckBox=driver.findElement(By.xpath("//*[@id=\"getNotifiedForInterestRate\"]/label"));
	    wait.until(ExpectedConditions.elementToBeClickable(getLowerInterestCheckBox));
	    getLowerInterestCheckBox.click();
	    WebElement generateOTP=driver.findElement(By.id("generate-otp"));
	    generateOTP.click();
	}
	public static void compareOutput(WebDriver driver,Properties prop) {
		WebElement outputText=driver.findElement(By.xpath("/html/body/section[1]/div[1]/div[1]/div[1]"));
	    String expected=prop.getProperty("finaltext");
	    String actual=outputText.getText();
	    Assert.assertEquals(expected, actual);
	}
}
