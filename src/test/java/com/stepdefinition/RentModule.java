package com.stepdefinition;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.pages.RentPages;
import com.setup.BaseSteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RentModule {
	private RentPages rentPages;
	private WebDriver driver=BaseSteps.getDriver();
	
	@Given("The user is on the MagicBricks Home Page")
	public void the_user_is_on_the_magic_bricks_homepage() throws IOException {
		rentPages=new RentPages(driver);
        RentPages.homepage();
        
	}

	@When("User provides the following details1")
	public void user_provides_the_following_details1(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
        RentPages.wh1sc1();
	}

	@When("User clicks the {string} button")
	public void user_clicks_the_button(String string) throws Throwable {
        RentPages.wh2sc1();
        
	}

	@Then("the system should display a list of 1BHK flats in Bangalore with rents less than or equal to ₹{double}")
	public void the_system_should_display_a_list_of_1bhk_flats_in_bangalore_with_rents_less_than_or_equal_to_₹(Double double1) throws InterruptedException, IOException {
		RentPages.thsc1();
		
	}

	@When("user provides the Following details2")
	public void user_provides_the_following_details2(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
        RentPages.wh1sc2();
	}

	@When("the user clicks on the {string} button")
	public void the_user_clicks_on_the_button(String string) throws InterruptedException {
        RentPages.wh2sc2();
	}

	@Then("the system should display a list of Agricultural Lands for rent in New Delhi")
	public void the_system_should_display_a_list_of_agricultural_lands_for_rent_in_new_delhi() throws IOException {
		RentPages.thsc2();
	}

	@When("the user enters a valid location {string} in the location search field")
	public void the_user_enters_a_valid_location_in_the_location_search_field(String string) throws InterruptedException, IOException {
        RentPages.wh1sc4();
	}

	@When("the user clicks {string} button")
	public void the_user_clicks_button(String string) {
		RentPages.wh2sc4();
	}

	@Then("the system should display a list of rental properties in Bangalore")
	public void the_system_should_display_a_list_of_rental_properties_in_bangalore() {
		RentPages.thsc4();
	}

	@When("User provides the Following Details5")
	public void user_provides_the_following_details5(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
        RentPages.whsc5();
	}
	
	@Then("the system should display a list of rental properties in Hyderabad that are immediately available")
	public void the_system_should_display_a_list_of_rental_properties_in_hyderabad_that_are_immediately_available() throws IOException {
	    RentPages.thsc5();
	    }

	@When("User provides following details6")
	public void user_provides_following_details6(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
        RentPages.wh1sc6();
	}

	@When("The User clicking the {string} button")
	public void the_user_clicking_the_button(String string) throws InterruptedException {
        RentPages.wh2sc6();
	}

	@Then("the system displays a list of Residentail Flats for rent in Mumbai")
	public void the_system_displays_a_list_of_residentail_flats_for_rent_in_mumbai() {
	    RentPages.thsc6();
	}
	
	@When("User provides following details3")
	public void user_provides_following_details3(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
        RentPages.whsc3();
	}

	@Then("the system should display Buy vs Rent and Tax")
	public void the_system_should_display_buy_vs_rent_and_Tax() {
		RentPages.thsc3();
		rentPages.screenShotMethod("sc3");
	}
	
	@When("the user clicks on Find an Agent under the RENT section")
	public void the_user_clicks_on_find_an_agent_under_the_rent_section() throws InterruptedException {
		RentPages.whsc();
	}

	@When("the user enters different locations {string} for rental properties")
	public void the_user_enters_different_locations_for_rental_properties(String locations) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    // Call the wh2sc method and pass the locations list
	    RentPages.wh2sc(locations);
	    //throw new io.cucumber.java.PendingException();
	}
	


	@Then("the user gets valid results for the entered location")
	public void the_user_gets_enter_a_valid_location() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		RentPages.thsc();
	}



}
