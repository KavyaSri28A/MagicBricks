package com.pages;

import java.io.IOException;
import java.util.Properties;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.parameters.ExcelReader;

public class BankParnersInterestDetails {
	public static void getInterestPage(WebDriver driver) throws InterruptedException {
		Thread.sleep(5000);
		WebElement homeLoanHeading=driver.findElement(By.xpath("//*[@id=\"commercialIndex\"]/header/section[2]/div/ul/li[4]/a"));
		homeLoanHeading.click();
		Thread.sleep(3000);
		WebElement homeLoanInterestRate=driver.findElement(By.xpath("//*[@id=\"homeloanDrop\"]/div/div[5]/ul/li[1]/a"));
		homeLoanInterestRate.click();
	}
	public static void compareResult(WebDriver driver,Actions mouse,Properties prop) throws InterruptedException, IOException {
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
	    WebElement sbiDetail=driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/section/div/div[1]/div[1]/div/table[1]/tbody/tr[1]/td"));
	    String expected=ExcelReader.getData(2, 0, 0);
		String actual=sbiDetail.getText();
		Assert.assertEquals(expected, actual);
	}
}
