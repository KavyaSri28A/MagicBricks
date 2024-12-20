package com.pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.datatable.DataTable;

public class BalanceTransfer {
	public static void clickBalanceTransfer(WebDriver driver) throws InterruptedException {
		Thread.sleep(5000);
		WebElement homeLoanHeading=driver.findElement(By.xpath("//*[@id=\"commercialIndex\"]/header/section[2]/div/ul/li[4]/a"));
		homeLoanHeading.click();
		Thread.sleep(5000);
		WebElement balanceTransfer=driver.findElement(By.xpath("//*[@id=\"homeloanDrop\"]/div/div[1]/ul/li[2]/a"));
		balanceTransfer.click();
	}
	public static void enterDetailsAndCompare(DataTable dataTable,WebDriver driver,WebDriverWait wait) throws InterruptedException {
		String mainWindowHandle=driver.getWindowHandle();
	    Set<String> windowHandles=driver.getWindowHandles();
	    for(String handle:windowHandles) {
	    	if(!handle.equals(mainWindowHandle)) {
	    		driver.switchTo().window(handle);
	    	}
	    }
		List<Map<String,String>> detail=dataTable.asMaps(String.class,String.class);
		List<WebElement> fields=new ArrayList<>();
		List<String> keys=new ArrayList<>();
		keys.add("Amount");
		keys.add("Rate");
		keys.add("Tenure");
		keys.add("paidEMI");
		keys.add("NewRate");
		keys.add("ProcessingFee");
		keys.add("newtenure");
		Thread.sleep(3000);
		WebElement LoanAmount=driver.findElement(By.id("laltc"));
		WebElement oldTenure=driver.findElement(By.id("ltltc"));
		WebElement oldInterest=driver.findElement(By.id("rltc"));
		WebElement paidInstalment=driver.findElement(By.id("ipltc"));
		WebElement newTenure=driver.findElement(By.id("nltltc"));
		WebElement newInterest=driver.findElement(By.id("nrltc"));
		WebElement prosFee=driver.findElement(By.id("pfltc"));
		fields.add(LoanAmount);
		fields.add(oldInterest);
		fields.add(oldTenure);
		fields.add(paidInstalment);
		fields.add(newInterest);
		fields.add(prosFee);
		fields.add(newTenure);
		Thread.sleep(5000);
		for(Map<String,String> data:detail) {
			for(int j=0;j<data.size();j++) {
				WebElement field=fields.get(j);
				field.clear();
				System.out.println(keys.get(j)+" : "+data.get(keys.get(j)));
				String Data=data.get(keys.get(j));
				field.sendKeys(Data);
			}
		}
		Thread.sleep(5000);
		WebElement takenEl=driver.findElement(By.xpath("//*[@id=\"loanTransferCalculator\"]/div/div[1]/div/div[4]/input"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView({ behavior: 'smooth', block: 'center' });", takenEl);
		WebElement compare=driver.findElement(By.xpath("//*[@id=\"loanTransferCalculator\"]/div/div[1]/div/div[4]/input"));
		
		wait.until(ExpectedConditions.elementToBeClickable(compare));
		compare.click();
	}
	public static void compareOutput(WebDriver driver,Properties prop) {
		WebElement message=driver.findElement(By.id("messageDiv"));
		WebElement lose=driver.findElement(By.id("messageAmountDiv"));
		String actualMessage=message.getText();
		String actualLoseAmount=lose.getText();
		String expectedMessage=prop.getProperty("messageOfBalanceTransfer");
		String expectedloseAmount=prop.getProperty("loseAmount");
		System.out.println(actualMessage + actualLoseAmount);
		System.out.println(expectedMessage + expectedloseAmount);
		Assert.assertEquals(actualLoseAmount, expectedloseAmount);
	}
}
