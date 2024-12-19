package com.stepdefinition;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.pages.RentPages;

//import org.testng.Assert;
//import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


//import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class Rent {
	static WebDriver driver;
	WebDriverWait wait;
	
	@Given("the user is on the MagicBricks homepage")
	public void the_user_is_on_the_magic_bricks_homepage() {
		driver = new EdgeDriver();
		driver.get("https://www.magicbricks.com");
		driver.manage().window().maximize();
		//ChromeOptions options = new ChromeOptions();
        //options.addArguments("--disable-notifications");
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	}
        
	
	@When("User provides the following details1")
	public void user_provides_the_following_details1(io.cucumber.datatable.DataTable dataTable) throws InterruptedException  {
		RentPages.verifyRent();
	}

	@When("User clicks the {string} button")
	public void user_clicks_the_button(String string) {
		RentPages.verifyRentCondition();
        //driver.quit();

	}

	@Then("the system should display a list of 1BHK flats in Bangalore with rents less than or equal to ₹{double}")
	public void the_system_should_display_a_list_of_2bhk_flats_in_bangalore_with_rents_less_than_or_equal_to_₹(Double double1) {
	    throw new io.cucumber.java.PendingException();
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        WebElement homePage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".header.item")));
//        Assert.assertTrue(homePage.isDisplayed(), "Home Page not displayed");
	}

	@When("user provides the Following details2")
	public void user_provides_the_following_details2(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		RentPages.verify();
       
	}

	@When("the user clicks the {string} button")
	public void the_user_clicks_the_button(String string) {
		RentPages.verifyRentCondition();
	}

	@Then("the system should display a list of Agricultural Lands for rent in New Delhi")
	public void the_system_should_display_a_list_of_agricultural_lands_for_rent_in_new_delhi() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User provides following details3")
	public void user_provides_following_details3(io.cucumber.datatable.DataTable dataTable) {
	    
	    throw new io.cucumber.java.PendingException();
	}

//	@When("The User clicks the {string} button")
//	public void the_user_clicks_the_button(String string) {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}

	@Then("the system should display a list of Commercial Office Spaces for rent in Chittoor")
	public void the_system_should_display_a_list_of_commercial_office_spaces_for_rent_in_chittoor() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("the user enters a valid location {string} in the location search field")
	public void the_user_enters_a_valid_location_in_the_location_search_field(String string) {
		RentPages.verRenCond();
		
	}

	@When("the user clicks {string} button")
	public void the_user_clicks_button(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("the system should display a list of rental properties in Jaipur")
	public void the_system_should_display_a_list_of_rental_properties_in_jaipur() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User provides the Following Details5")
	public void user_provides_the_following_details5(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		RentPages.vRC();
	    //driver.quit();
	}

	/*
	 * @When("The User clicks {string} button") public void
	 * the_user_clicks_button(String string) { // Write code here that turns the
	 * phrase above into concrete actions throw new
	 * io.cucumber.java.PendingException(); }
	 */
	
	@Then("the system should display a list of rental properties in Hyderabad that are immediately available")
	public void the_system_should_display_a_list_of_rental_properties_in_hyderabad_that_are_immediately_available() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	
}
