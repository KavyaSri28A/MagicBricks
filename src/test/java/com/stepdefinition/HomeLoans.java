package com.stepdefinition;

import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.parameters.FileReading;
import com.setup.BaseSteps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomeLoans {
	WebDriver driver;
	WebDriverWait wait;
	Actions mouse;
	Properties prop;
	@Given("User is on Home Page of Magic Bricks")
	public void user_is_on_home_page_of_magic_bricks() throws IOException {
		prop=FileReading.reader();
		driver=BaseSteps.setupBrowser();
	    wait=new WebDriverWait(driver, Duration.ofSeconds(30));
	}

	@When("User clicks on Home Loans option")
	public void user_clicks_on_home_loans_option() throws InterruptedException {
		mouse=new Actions(driver);
		Thread.sleep(5000);
		WebElement homeLoanHeading=driver.findElement(By.xpath("//*[@id=\"commercialIndex\"]/header/section[2]/div/ul/li[4]/a"));
		homeLoanHeading.click();
		Thread.sleep(5000);
		WebElement homeLoanButton=driver.findElement(By.xpath("//*[@id=\"homeloanDrop\"]/div/div[1]/ul/li[1]/a"));
		homeLoanButton.click();
		
	}

	@When("User gives the following details along with some more details")
	public void user_gives_the_following_details_along_with_some_more_details(DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	    System.out.println("The upcoming Functions");
	}

	@When("User gives more details")
	public void user_gives_more_details() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("The upcoming Functions");
	}

	@Then("User should be navigated to the verification page")
	public void user_should_be_navigated_to_the_verification_page() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("The upcoming Functions");
	}

	@Then("User should be able to get the loan availabilities of given details")
	public void user_should_be_able_to_get_the_loan_availabilities_of_given_details() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("The upcoming Functions");
	}

	@When("User clicks on the Balance Transfer")
	public void user_clicks_on_the_balance_transfer() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("The upcoming Functions");
	}

	@When("User provides the following details")
	public void user_provides_the_following_details(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	    System.out.println("The upcoming Functions");
	}

	@Then("User should be able to see the Difference of old interest and new interest to pay")
	public void user_should_be_able_to_see_the_difference_of_old_interest_and_new_interest_to_pay() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("The upcoming Functions");
	}

	@When("User selects {string} Bank Partner")
	public void user_selects_bank_partner(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("The upcoming Functions");
	}

	@When("User provides details for a loan")
	public void user_provides_details_for_a_loan() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("The upcoming Functions");
	}

	@Then("It should show the available schemes of the loans in {string} bank")
	public void it_should_show_the_available_schemes_of_the_loans_in_bank(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("The upcoming Functions");
	}

	@When("User clicks on the Home Loan EMI Calculator")
	public void user_clicks_on_the_home_loan_emi_calculator() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("The upcoming Functions");
	}

	@When("User Provides the following details")
	public void user_Provides_the_following_details(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	    System.out.println("The upcoming Functions");
	}

	@Then("It should show the details of the Loan in a table format")
	public void it_should_show_the_details_of_the_loan_in_a_table_format() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("The upcoming Functions");
	}

	@When("User clicks on Home Loan Interest Rate")
	public void user_clicks_on_home_loan_interest_rate() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("The upcoming Functions");
	}

	@Then("User should be navigated to a page with the tabular details of Home Loan Interest Rate")
	public void user_should_be_navigated_to_a_page_with_the_tabular_details_of_home_loan_interest_rate() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("The upcoming Functions");
	}

	@Then("User should get the calculation part along with the Table")
	public void user_should_get_the_calculation_part_along_with_the_table() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("The upcoming Functions");
	}

	@When("User clicks on {string} home loan EMI calculator")
	public void user_clicks_on_home_loan_emi_calculator(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("The upcoming Functions");
	}

	@Then("The page should provide {string} bank EMI Details")
	public void the_page_should_provide_bank_emi_details(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("The upcoming Functions");
	}

	@When("User clicks on {string} home loan interest rate")
	public void user_clicks_on_home_loan_interest_rate(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("The upcoming Functions");
	}

	@Then("The page should provide {string} bank Interest Details")
	public void the_page_should_provide_bank_interest_details(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("The upcoming Functions");
	}
}
