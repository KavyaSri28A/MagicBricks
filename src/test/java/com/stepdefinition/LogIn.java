package com.stepdefinition;
 
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.setup.BaseSteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
 
public class LogIn {
	WebDriver driver;
	@Given("The User is on the HomePage of Magic Bricks")
	public void the_user_is_on_the_home_page_of_magic_bricks() throws IOException {
	    // Write code here that turns the phrase above into concrete actions
	    driver=BaseSteps.setupBrowser();
	}
 
	@When("The User clicks on the LOGIN button")
	public void the_user_clicks_on_the_login_button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		WebElement login_dropdown=driver.findElement(By.xpath("//*[@id=\"commercialIndex\"]/header/section[1]/div/div[2]/div[2]/a"));
		WebElement login_button=driver.findElement(By.xpath("//*[@id=\"commercialIndex\"]/header/section[1]/div/div[2]/div[2]/div/div[2]/a"));
		//WebElement login_button=driver.findElement(By.xpath("//*[@id=\"commercialIndex\"]/header/section[1]/div/div[2]/div[2]/div/div[2]/a"));
		Actions mouse=new Actions(driver);
		mouse.moveToElement(login_dropdown).clickAndHold().perform();
		mouse.moveToElement(login_button);
		Thread.sleep(5000);
		//mouse.perform();
		//System.out.println("clicked");
		Thread.sleep(2000);
	//	login_button.click();
		Thread.sleep(2000);
	}
 
	@When("The User Provides the details to login as follows")
	public void the_user_provides_the_details_to_login_as_follows(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
		Thread.sleep(3000);
	    WebElement phoneNumber=driver.findElement(By.id("emailOrMobile"));
	    phoneNumber.click();
	    Thread.sleep(3000);
	    //9618871371
	    driver.findElement(By.xpath("//*[@id=\"loginType\"]")).sendKeys("9618871371");
	    Thread.sleep(3000);
	}
 
	@Then("the user should be logged in so that they could see some functionality")
	public void the_user_should_be_logged_in_so_that_they_could_see_some_functionality() {
	    // Write code here that turns the phrase above into concrete actions
	    try {
	    	WebElement newElement=driver.findElement(By.xpath("/html/body/header/section[1]/div/div[2]/div[2]/div/div[1]/ul[2]/li[4]/a"));
	    	System.out.println("Login Successfull");
	    }
	    catch(Exception e){
	    	System.out.println("Login Unsuccessfull");
	    }
	}
}
