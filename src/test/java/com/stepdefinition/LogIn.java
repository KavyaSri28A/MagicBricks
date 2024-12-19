package com.stepdefinition;

import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.setup.BaseSteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogIn {
	 WebDriver driver;
	WebDriverWait wait;
	Actions mouse;
	@Given("The User is on the HomePage of Magic Bricks")
	public void the_user_is_on_the_home_page_of_magic_bricks() throws IOException {
	    // Write code here that turns the phrase above into concrete actions
	    driver=BaseSteps.setupBrowser();
	    wait=new WebDriverWait(driver, Duration.ofSeconds(30));
	}

	@When("The User clicks on the LOGIN button")
	public void the_user_clicks_on_the_login_button() throws InterruptedException {
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
	    
	}

	@When("The User Provides the Mobile Number to login as {string}")
	public void the_user_provides_the_details_to_login_as_follows(String mobile) throws InterruptedException {
	    
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
	    phoneNumber.sendKeys(mobile);
	    Thread.sleep(10000);
	    WebElement nextButton=driver.findElement(By.id("btnStep1"));
	    nextButton.click();
	    Thread.sleep(10000);
	    WebElement continueButton=driver.findElement(By.xpath("//*[@id=\"verifyOtpDiv\"]/div[2]/div[3]/button"));
	    continueButton.click();
	    
	}

	@Then("the user should be logged in so that they could see some functionality")
	public void the_user_should_be_logged_in_so_that_they_could_see_some_functionality() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(10000);
		try {
			Thread.sleep(10000);
			WebElement popupCross=driver.findElement(By.xpath("//*[@id=\"userOnboardingWidget\"]/div/div[1]"));
			popupCross.click();
		}
		catch(Exception e) {
			Thread.sleep(10000);
		}
		WebElement loggedInTerm=driver.findElement(By.xpath("//*[@id=\"commercialIndex\"]/header/section[1]/div/div[2]/div[2]/a"));
		loggedInTerm.click();
	    try {
	    	WebElement newElement=driver.findElement(By.xpath("/html/body/header/section[1]/div/div[2]/div[2]/div/div[1]/ul[2]/li[4]/a"));
	    	wait.until(ExpectedConditions.elementToBeClickable(newElement)).click();
	    	System.out.println("Login Successfull");
	    }
	    catch(Exception e){
	    	System.out.println("Login Unsuccessfull");
	    }
	}
}
