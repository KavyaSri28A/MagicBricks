package com.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.datatable.DataTable;

import static org.junit.Assert.assertTrue;

import java.time.Duration;

public class LoginMB {

    WebDriver driver;

    @Given("The User is on the HomePage of Magic Bricks" )
    public void the_user_is_on_the_home_page_of_magic_bricks() {
        // Initialize WebDriver and open the Magic Bricks homepage
        driver = new ChromeDriver();
        driver.get("https://www.magicbricks.com");
    }

    @When("The User clicks on the LOGIN button")
    public void the_user_clicks_on_the_login_button() {
        // Locate and click the Login button on the homepage
    	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"commercialIndex\"]/header/section[1]/div/div[2]/div[2]/a"));
        loginButton.click();
       // "//*[@id=\"commercialIndex\"]/header/section[1]/div/div[2]/div[2]/div/div[2]/a"
    }

    @When("The User Provides the details to login as follows")
    public void the_user_provides_the_details_to_login_as_follows(DataTable dataTable) {
        // Retrieve mobile number from the data table
        String mobileNumber = dataTable.cell(1, 0); // Assuming 1st row and 1st column contains the mobile number

        // Locate the mobile number input field and provide the details
        WebElement mobileNumberField = driver.findElement(By.id("mobileNo"));
        mobileNumberField.sendKeys(mobileNumber);

        // Submit the login form (assuming the login button to submit is inside the login page)
        WebElement loginSubmitButton = driver.findElement(By.id("loginBtn"));
        loginSubmitButton.click();
    }

    @Then("the user should be logged in so that they could see some functionality")
    public void the_user_should_be_logged_in_so_that_they_could_see_some_functionality() {
        // Validate if login was successful
        try {
            // Example validation: check for an element that indicates a successful login
            WebElement loggedInElement = driver.findElement(By.id("loggedInElementId")); // Replace with a valid element
            assertTrue(loggedInElement.isDisplayed());
        } catch (Exception e) {
            System.out.println("Login failed");
        } finally {
            driver.quit();
        }
    }
}
