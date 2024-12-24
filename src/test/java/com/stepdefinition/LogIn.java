package com.stepdefinition;

import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.pages.LoginPage;
import com.parameters.FileReading;
import com.setup.BaseSteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogIn {
	 WebDriver driver;
	WebDriverWait wait;
	Actions mouse;
	Properties prop;
	BaseSteps basestep=new BaseSteps();
	@Given("The User is on the HomePage of Magic Bricks")
	public void the_user_is_on_the_home_page_of_magic_bricks() throws IOException {
	    // Write code here that turns the phrase above into concrete actions
		prop=FileReading.reader();
	    driver=basestep.setupBrowser();
	    wait=new WebDriverWait(driver, Duration.ofSeconds(30));
	}

	@When("The User clicks on the LOGIN button")
	public void the_user_clicks_on_the_login_button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		LoginPage.loginFirstPage(mouse, driver, wait);
	    
	}

	@When("The User Provides the Mobile Number to login as {string}")
	public void the_user_provides_the_details_to_login_as_follows(String mobile) throws InterruptedException {
	    
		LoginPage.enterDetails(driver, mobile, wait);
	    
	}

	@Then("The user should be taken to the otp verification page")
	public void the_user_should_be_logged_in_so_that_they_could_see_some_functionality() throws InterruptedException {
	    
		WebElement verificationheader=driver.findElement(By.id("otpHeader"));
		String actual=verificationheader.getText();
		String expected=(String) prop.get("verifier");
		System.out.println(actual);
		Assert.assertEquals(expected, actual);
//		driver.quit();
//		Thread.sleep(10000);
//		try {
//			Thread.sleep(10000);
//			WebElement popupCross=driver.findElement(By.xpath("//*[@id=\"userOnboardingWidget\"]/div/div[1]"));
//			popupCross.click();
//		}
//		catch(Exception e) {
//			Thread.sleep(10000);
//		}
//		WebElement loggedInTerm=driver.findElement(By.xpath("//*[@id=\"commercialIndex\"]/header/section[1]/div/div[2]/div[2]/a"));
//		loggedInTerm.click();
//	    try {
//	    	WebElement newElement=driver.findElement(By.xpath("/html/body/header/section[1]/div/div[2]/div[2]/div/div[1]/ul[2]/li[4]/a"));
//	    	wait.until(ExpectedConditions.elementToBeClickable(newElement)).click();
//	    	System.out.println("Login Successfull");
//	    }
//	    catch(Exception e){
//	    	System.out.println("Login Unsuccessfull");
//	    }
	}
}
