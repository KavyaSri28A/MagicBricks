	package com.stepdefinition;

import java.io.IOException;
//import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.pages.BalanceTransfer;
import com.pages.BankParnersInterestDetails;
import com.pages.BankPartnersFunction;
import com.pages.CalculatorCommon;
import com.pages.CalculatorNegativeScenario;
import com.pages.HomeLoansFunction;
import com.parameters.FileReading;
import com.parameters.ScreenshotFile;
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
	BaseSteps basestep;
	@Given("User is on Home Page of Magic Bricks")
	public void user_is_on_home_page_of_magic_bricks() throws IOException {
		basestep=new BaseSteps();
		prop=FileReading.reader();
		driver=basestep.setupBrowser();
		System.out.println(driver);
	    wait=new WebDriverWait(driver, Duration.ofSeconds(30));
	}

	@When("User clicks on Home Loans option")
	public void user_clicks_on_home_loans_option() throws InterruptedException {
		mouse=new Actions(driver);
		HomeLoansFunction.clickHomeLoans(driver);
	}

	@When("User gives the following details along with some more details")
	public void user_gives_the_following_details_along_with_some_more_details(DataTable dataTable) throws InterruptedException {
		HomeLoansFunction.putDetailsOne(dataTable, mouse, driver, prop,wait);
	}

	@Then("User should be navigated to the verification page")
	public void user_should_be_navigated_to_the_verification_page() throws IOException, InterruptedException {
	    HomeLoansFunction.compareOutput(driver, prop);
	    Thread.sleep(3000);
	    ScreenshotFile.clickScreenshot(driver, (String)prop.get("sspath"));
	    Thread.sleep(3000);
	    driver.quit();
	}


	@When("User clicks on the Balance Transfer")
	public void user_clicks_on_the_balance_transfer() throws InterruptedException {
		BalanceTransfer.clickBalanceTransfer(driver);
	}

	@When("User provides the following loan details")
	public void user_provides_the_following_details(DataTable dataTable) throws InterruptedException {
		BalanceTransfer.enterDetailsAndCompare(dataTable, driver,wait);
	}

	@Then("User should be able to see the Difference of old interest and new interest to pay")
	public void user_should_be_able_to_see_the_difference_of_old_interest_and_new_interest_to_pay(DataTable dataTable) throws InterruptedException {
		BalanceTransfer.compareOutput(driver, prop,dataTable);
		driver.quit();
	}

	@When("User selects {string} Bank Partner")
	public void user_selects_bank_partner(String string) throws InterruptedException {
		BankPartnersFunction.enterBankPartner(driver);
	}

	@When("User provides details for a loan")
	public void user_provides_details_for_a_loan() throws InterruptedException {
		BankPartnersFunction.enterDetails(mouse, driver, prop, wait);
	}

	@Then("It should show the otp verification")
	public void it_should_show_the_available_schemes_of_the_loans_in_bank() {
	    // Write code here that turns the phrase above into concrete actions
		BankPartnersFunction.checkResult(driver, prop);
		driver.quit();
	}

	@When("User clicks on the Home Loan EMI Calculator")
	public void user_clicks_on_the_home_loan_emi_calculator() throws InterruptedException {
		CalculatorCommon.clickCalculator(driver);
	}

	@When("User Provides the details")
	public void user_Provides_the_following_details() throws InterruptedException, IOException {
		CalculatorCommon.enterdetails(driver, prop, mouse);
	}

	@Then("It should go to  the otp verification page")
	public void it_should_show_the_details_of_the_loan_in_a_table_format() {
	    // Write code here that turns the phrase above into concrete actions
		CalculatorCommon.compareresult(driver, prop);
		driver.quit();
	}
	
	@When("User clicks on the Home Loan EMI CalculatorN")
	public void user_clicks_on_the_home_loanemi_calculator() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		CalculatorNegativeScenario.getCalculatorPage(driver);
		}
	
	@When("User Provides the details and rate of interest as {string}")
	public void user_provides_the_details_and_rate_of_interest_as(String string) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		CalculatorNegativeScenario.enterUserDetails(string, driver, mouse, prop);
	}
	
	@Then("It should show the warning {string}")
	public void it_should_show_the_warning(String string) {
	    // Write code here that turns the phrase above into concrete actions
		CalculatorNegativeScenario.getComparisson(string, driver);
		driver.quit();
	}
	@When("User clicks on {string} home loan interest rate")
	public void user_clicks_on_home_loan_interest_rate(String string) throws InterruptedException {
		BankParnersInterestDetails.getInterestPage(driver);
	}

	@Then("The page should provide {string} bank Interest Details")
	public void the_page_should_provide_bank_interest_details(String string) throws InterruptedException, IOException {
		BankParnersInterestDetails.compareResult(driver, mouse, prop);
	    driver.quit();
	}

}
