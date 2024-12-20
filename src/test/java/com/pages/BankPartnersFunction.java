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

//import io.cucumber.datatable.DataTable;

public class BankPartnersFunction {
	public static void checkResult(WebDriver driver,Properties prop) {
		WebElement verificationText=driver.findElement(By.cssSelector("body > section.mb-hl__form-box__wrapper > div.mb-hl__form-box__wrapper__lt > div.mb-hl__form-box.active > div.mb-hl__page-title"));
	    String actual=verificationText.getText();
	    String expected=(String) prop.get("expected");
	    Assert.assertEquals(actual,expected);
	}
	public static void enterBankPartner(WebDriver driver) throws InterruptedException {
		Thread.sleep(5000);
		WebElement homeLoanHeading=driver.findElement(By.xpath("//*[@id=\"commercialIndex\"]/header/section[2]/div/ul/li[4]/a"));
		homeLoanHeading.click();
		Thread.sleep(5000);
	    WebElement bankPartnerLoan=driver.findElement(By.xpath("//*[@id=\"homeloanDrop\"]/div/div[2]/ul/li[3]/a"));
	    bankPartnerLoan.click();
	}
public static void enterDetails(Actions mouse,WebDriver driver,Properties prop,WebDriverWait wait) throws InterruptedException {
	mouse=new Actions(driver);
	Thread.sleep(5000);
    String mainWindowHandle=driver.getWindowHandle();
    Set<String> windowHandles=driver.getWindowHandles();
    for(String handle:windowHandles) {
    	if(!handle.equals(mainWindowHandle)) {
    		driver.switchTo().window(handle);
    	}
    }
    String amount=(String) prop.get("loanAmount");
    String mobile=(String) prop.get("mobile");
    WebElement loanAmountField=driver.findElement(By.xpath("//*[@id=\"loanAmount\"]"));
    loanAmountField.click();
    loanAmountField.sendKeys(amount);
    WebElement mobileNumberField=driver.findElement(By.xpath("//*[@id=\"mobileNumber\"]"));
    mobileNumberField.click();
    mobileNumberField.sendKeys(mobile);
    System.out.println(amount+mobile);
//    }
    
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
}
