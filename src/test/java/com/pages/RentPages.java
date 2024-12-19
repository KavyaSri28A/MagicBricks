package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class RentPages {

    static WebDriver driver;
	static WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(200));;
    
//    public RentPages(WebDriver driver) {
//        this.driver = driver;
//    }

    public static void verifyRentCondition() {
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"searchFormHolderSection\"]/section/div/div[1]/div[3]/div[4]"))).click();

    }
    
    public static void verifyRent() throws InterruptedException {
    	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"tabRENT\"]"))).click(); // Rent
		WebElement loc5=driver.findElement(By.xpath("//*[@id=\"searchFormHolderSection\"]/section/div/div[1]/div[3]/div[1]"));
		loc5.clear();
		driver.findElement(By.xpath("//section[@id='searchFormHolderSection']//div[1]//div[1]//div[3]//div[1]//div[3]//div[1]//div[3]//div[2]//span[1]")).click();
		Thread.sleep(20);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"propType_rent\"]/div[1]"))).click(); //prop type
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"10002_10003_10021_10022\"]"))).click(); //Flat
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"11700\"]"))).click(); //1BHK
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"11701\"]"))).click(); //2BHK
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"11702\"]"))).click(); //3BHK
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"10001_10017\"]"))).click(); //House Villa
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"10002_10003_10021_10022\"]"))).click(); //flat
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"11700\"]"))).click(); //1BHK
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"searchFormHolderSection\"]/section/div/div[1]/div[3]/div[3]/div[1]"))).click(); //budget
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"budgetMax\"]"))).click(); //max
       wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"maxBhkIndex_2\"]"))).click(); //15000
       wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"searchFormHolderSection\"]/section/div/div[1]/div[3]/div[4]"))).click();
    }
    
    public static void verify() throws InterruptedException {
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"commercialIndex\"]/header/section[1]/div/div[1]/div[2]/a"))).click(); //location
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='New Delhi']"))).click(); // new delhi
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"tabRENT\"]"))).click(); // Rent
        Thread.sleep(20);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"propType_rent\"]/div[1]"))).click(); //prop type
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"10002_10003_10021_10022\"]"))).click(); //Flat
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"11700\"]"))).click(); //1BHK
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"11701\"]"))).click(); //2BHK
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"11702\"]"))).click(); //3BHK
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"10001_10017\"]"))).click(); //House Villa
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"propType_rent\"]/div[2]/div/div/div[3]/div[1]"))).click(); //other Property type
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"10005\"]"))).click(); //Agricultural Land
        //wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"searchFormHolderSection\"]/section/div/div[1]/div[3]/div[4]"))).click();
        //driver.quit();
    }
    public static void verRenCond() {
    	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"tabRENT\"]"))).click(); // Rent
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"keyword_autoSuggestSelectedDiv\"]/div/div[1]"))).click(); //Bangalore location
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"keyword_autoSuggestSelectedDiv\"]/div/div[2]"))).click(); //close bangalore
        WebElement loc=driver.findElement(By.id("keyword"));
        loc.click();
        loc.sendKeys("Vezzupale");
        //Thread.sleep(20);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"searchFormHolderSection\"]/section/div/div[1]/div[3]/div[4]"))).click();
		
    }
    public static void vRC() throws InterruptedException {
    	WebElement loc2 = driver.findElement(By.xpath("//*[@id=\"commercialIndex\"]/header/section[1]/div/div[1]/div[2]/a"));
		loc2.click();
		Thread.sleep(20);
		WebElement loc3 = driver.findElement(By.xpath("//*[@id=\"commercialIndex\"]/header/section[1]/div/div[1]/div[2]/a"));
		loc3.click();
		Thread.sleep(20);
		WebElement loc4 = driver.findElement(By.xpath("//*[@id=\"rentheading\"]"));
		loc4.click();
		Thread.sleep(20);
		WebElement loc5 = driver.findElement(By.xpath("//*[@id=\"commercialIndex\"]/header/section[2]/div/ul/li[2]/div/div/div[1]/ul/li[5]/a"));
		loc5.click();
		Thread.sleep(20);
    }

   
}
