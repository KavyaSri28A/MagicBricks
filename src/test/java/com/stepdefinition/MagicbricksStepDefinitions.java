package com.stepdefinition;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.pages.S4AgentFeatures;
import com.pages.S5AgentDeatilsPage;
import com.pages.S6SalesEnquiry;
import com.pages.S7RentAdpack;
import com.pages.S3EstimatedWorth;
import com.pages.S1PlaceOrderButton;
import com.pages.S2RecommededADpack;
import com.parameters.ExcelReader;
import com.setup.ExtraFunctions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MagicbricksStepDefinitions {

    WebDriver driver;
    WebDriverWait wait;
    String FirstWindow;
    String SecondWindow;
    
//////////////////////////////////////////////////Scenario 1////////////////////////////////////////////////////////////////////////////////////

    // Step 1: Given the user is on the Magicbricks home page
    @Given("the user is on the Magicbricks home page")
    public void the_user_is_on_the_magicbricks_home_page() throws IOException {
    	ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        options.addArguments("--start-maximized"); // Start browser maximized
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(options);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get(ExcelReader.geturl());
    }

    // Step 2: When User clicks on SELL option
    @When("User clicks on SELL option")
    public void user_clicks_on_sell_option() throws InterruptedException {
    	S1PlaceOrderButton.user_clicks_sell(driver, wait);
    	
    }

    // Step 3: And the user click on property valuation option
    @When("the user click on property valuation option")
    public void the_user_click_on_property_valuation_option() {
    	S1PlaceOrderButton.user_clicks_property(driver, wait, FirstWindow);
    }
      
 
    // Step 4: And the user click on the Buy Now button
    @When("the user click on the Buy Now button")
    public void the_user_click_on_the_buy_now_button() throws InterruptedException {
    	S1PlaceOrderButton.user_clicks_BuyNow_button(driver, wait);
      
    	}
    	
    
    
    // Step 5: Then the user is navigated to Property Services page
    @Then("the user is navigated to Place Order button")
    public void the_user_is_navigated_to_place_order_button() {
    	S1PlaceOrderButton.user_clicks_PlaceOrder(driver);
    }

   
 

    
//////////////////////////////////////////////////Scenario 2////////////////////////////////////////////////////////////////////////////////////


@Given("the user is logged into the Magicbricks app")
public void the_user_is_logged_into_the_magicbricks_app() throws FileNotFoundException, InterruptedException {
	
	
	ChromeOptions options = new ChromeOptions();
    options.addArguments("--disable-notifications");
    options.addArguments("--start-maximized"); 
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver(options);
    driver.get("https://www.magicbricks.com");
    wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    driver=ExtraFunctions.loginFunction(driver);
  
}

@When("User clicks on AD Package option")
public void user_clicks_on_ad_package_option() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
 	S2RecommededADpack.user_click_AD_package(driver, wait);
}


@When("select property for as Rent")
public void select_property_for_as_rent() {
	 S2RecommededADpack.user_select_Rent(driver, wait, SecondWindow, FirstWindow);
}

@When("select property type as PG\\/Flatmate")
public void select_property_type_as_pg_flatmate() throws InterruptedException {
	 S2RecommededADpack.user_select_PG_Flatmate(wait);
	}


@Then("the user is looking for the recommeded AD package")
public void the_user_is_looking_for_the_recommeded_ad_package() {
	 S2RecommededADpack.user_click_recommededADpack(driver);
   
}


//////////////////////////////////////////////////////////////Scenario3//////////////////////////////////////////////////////////////////////



@Given("the user is on the Magicbricks homepage")
public void the_user_is_on_the_magicbricks_homepage() {
	ChromeOptions options = new ChromeOptions();
    options.addArguments("--disable-notifications");
    options.addArguments("--start-maximized"); // Start browser maximized
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver(options);
    wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    driver.get("https://www.magicbricks.com");
}

  
   

@When("the user hovers over SELL and selects PropWorth")
public void the_user_hovers_over_sell_and_selects_prop_worth() throws InterruptedException {
   S3EstimatedWorth.user_click_propworth(driver, wait);
 		
}

@When("the user enters the property details and clicks on Get Estimate")
public void the_user_enters_the_property_details_and_clicks_on_get_estimate() throws InterruptedException {
	S3EstimatedWorth.user_enter_details(driver, wait, SecondWindow, FirstWindow);

}

@Then("the user should be redirected to the PropWorth estimate page")
public void the_user_should_be_redirected_to_the_prop_worth_estimate_page() throws InterruptedException {
	S3EstimatedWorth.user_click_propworth_esitimatepage(driver, wait);
}

@Then("the page should contain the text {string}")
public void the_page_should_contain_the_text(String string) {
   S3EstimatedWorth.contains_text(driver);   
}



////////////////////////////////////////////////////////////////////Scenario 4//////////////////////////////////////////////////////////////////////




@When("the user clicks on Find an Agent under the SELL section")
public void the_user_clicks_on_find_an_agent_under_the_sell_section() throws InterruptedException {
   S4AgentFeatures.user_clicks_find_agent(driver, wait);
}

@When("the user clicks on the Deatils of Agent button for a specific agent")
public void the_user_clicks_on_the_contact_agent_button_for_a_specific_agent() {
  S4AgentFeatures.user_click_details(driver, wait, FirstWindow);
 
}

@Then("the user should be redirected to a contact form page")
public void the_user_should_be_redirected_to_a_contact_form_page() throws InterruptedException {
	Thread.sleep(5000);
  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"topAgentCard\"]/div[1]/div[1]/div[2]/div[2]/a[2]"))).click();//to click on view details options
}

@Then("the user finds the detilas of the agent")
public void the_user_finds_the_detilas_of_the_agent() {
	S4AgentFeatures.deatils_agent(driver, wait, FirstWindow, SecondWindow);
	 		
  
}


////////////////////////////////////////////////////////////////////Scenario 5////////////////////////////////////////////////////////////



@When("the user clicks on the Contact Agent option for a specific agent and fill details")
public void the_user_clicks_on_the_contact_agent_option_for_a_specific_agent_and_fill_details(io.cucumber.datatable.DataTable dataTable) {
	String name = null,mail = null,num = null;
   List<Map<String,String>> data = dataTable.asMaps(String.class,String.class);
	for(Map<String,String> row:data)
	{
		 name = row.get("name");
		 mail =row.get("e-mail");
		 num =row.get("number");
	
   
}
	S5AgentDeatilsPage.user_fillsdeatils(driver, wait, FirstWindow, name, mail, num);

}


@Then("the user clicks on submit")
public void the_user_clicks_on_submit() {
	S5AgentDeatilsPage.user_submit(driver);
 }





/////////////////////////////////////////////////////////////////Scenario 6/////////////////////////////////////////////////////



@When("the user clicks on Sales Enquiry under the SELL section")
public void the_user_clicks_on_sales_enquiry_under_the_sell_section() throws InterruptedException {
	S6SalesEnquiry.userclick_sales_enquiry(driver, wait);
}

@When("the user selects a letter from the alphabet to filter cities starting with that letter")
public void the_user_selects_a_letter_from_the_alphabet_to_filter_cities_starting_with_that_letter() throws InterruptedException {
  S6SalesEnquiry.select_letter(driver, wait, FirstWindow);
   
}

@Then("the user should see a list of cities starting with the selected letter on the screen")
public void the_user_should_see_a_list_of_cities_starting_with_the_selected_letter_on_the_screen() {
   WebElement ele = driver.findElement(By.xpath("//*[@id='branchOfficesTable']/div[1]/ul/li[30]/div[1]"));
	Assert.assertTrue(ele.isDisplayed());
}



///////////////////////////////////////////////////////////////////////Scenario 7/////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////Negative Scenario/////////////////////////////////////////////////////////////////////////



@When("the user clicks on Sell\\/Rent Ad package")
public void the_user_clicks_on_sell_rent_ad_package() throws InterruptedException {
    S7RentAdpack.user_click_rentADpack(driver, wait);
}

@Then("the user fills the data")
public void the_user_fills_the_data() {
	S7RentAdpack.user_fillsdata(driver, wait, FirstWindow);
    
}

@Then("the user clicks on Request Call Back option")
public void the_user_clicks_on_request_call_back_option() {
	S7RentAdpack.user_clicks_requestcallback(driver);
}



}
