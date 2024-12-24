package com.stepdefinition;

import java.io.IOException;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.pages.BathroomDesignPage;
import com.pages.BedroomDesignPage;
import com.pages.ClickHomeInterior;
import com.pages.ErrorPageCostCalculator;
import com.pages.InteriorCostCalculatorPage;
import com.pages.OneBHKDesigns;
import com.pages.OneBHKPage;
import com.parameters.ExcelReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class homeinteriors {


	//private static WebDriver driver;
	static WebDriver driver;
WebDriverWait wait;
String currentWindowHandle;
static String secondURL;
	@Given("the user is on the Magicbricks Homepage")
	public void the_user_is_on_the_magicbricks_homepage() throws IOException {
		   // Set Chrome options to disable notifications
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        options.addArguments("--start-maximized"); // Start browser maximized
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(options);
        wait = new WebDriverWait(driver, Duration.ofSeconds(100));
        driver.get(ExcelReader.geturl());
         
        
       
	}
	@When("The user clicks on Home Interiors")
    public void the_user_clicks_on_home_interiors() throws InterruptedException {
		
		ClickHomeInterior.clickHomeInt(driver, wait);
        
    }

    @When("the user selects Interior Design Services under Home Interiors")
    public void the_user_selects_interior_design_services_under_home_interiors() throws InterruptedException{
        // Wait for the element to be visible and clickable
    	
    	ClickHomeInterior.ClickInteriorDesignService(driver, wait);
        
    }


	@When("the user clicks on book your spot now button under Home Interior Mega Expo in Bangalore")
	public void the_user_clicks_on_contact_now_button_on_any_one_designer_in_list() throws InterruptedException {

		
		ClickHomeInterior.bookYourSpot(driver, wait, currentWindowHandle);
        
		 
		
	}

	@Then("a pop-up should display to fill the details")
	public void a_pop_up_should_display_to_confirm_the_contact_by_the_relationship_manager_rm() throws InterruptedException {
		
        
		ClickHomeInterior.popUpDetails(driver, wait);
		
	}

//	@Then("the pop-up offers to {string} with a provided phone number")
//	public void the_pop_up_offers_to_with_a_provided_phone_number(String string) throws InterruptedException {
//
//		Thread.sleep(20000);   
//		WebElement popup=driver.findElement(By.xpath("//*[@id=\"int-contact-popup\"]/div/div[2]/div[1]/div[2]"));
//		//*[@id="int-contact-popup"]/div/div[2]/div[1]/div[2]
//                                                                                                                                                             
//
//		String actualText = popup.getText().replaceAll("\\s+", " ").trim();
//        System.out.println("Actual Popup Text (Normalized): " + actualText);
//
//        // Expected text, normalized
//        String expectedText = "Our Relationship Manager (RM) will reach out to you shortly".replaceAll("\\s+", " ").trim();
//
//        // Print expected text for debugging
//        System.out.println("Expected Popup Text (Normalized): " + expectedText);
//
//        // Compare actual text with expected text
//        Assert.assertTrue("Popup text does not match expected content!", actualText.contains(expectedText));
//    	//Assert.assertEquals(actual, Expected);
//    	driver.quit();
//       // wait.until(ExpectedConditions.urlContains("property-services"));
//       //.assertEquals(actual, expected);
//       
//	}


	@Given("the user is on the Homepage of Magicbricks")
	public void the_user_is_on_the_homepage_of_magicbricks() throws IOException {
		ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        options.addArguments("--start-maximized"); // Start browser maximized
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(options);
        wait = new WebDriverWait(driver, Duration.ofSeconds(100));
        driver.get(ExcelReader.geturl());
		
	}

	@When("the user clicks on 1BHK interior design under Full Home Interior Designs")
	public void the_user_clicks_on_1bhk_interior_design_under_full_home_interior_designs() throws InterruptedException {
		
		OneBHKPage.clicksOneBHKDesign(driver, wait);
            
	    
	}

	@When("click on the Get an Estimate for your home button")
	public void click_on_the_get_an_estimate_for_your_home_button() throws InterruptedException {

		OneBHKPage.getEstimate(driver, wait, currentWindowHandle);
	   
	    
	}

	@Then("click which city user want")
	public void click_which_city_user_want() throws InterruptedException {
		
		OneBHKPage.clickCity(driver, wait);
		
	}

	@Then("user clicks continue")
	public void user_clicks_continue() throws InterruptedException {
		OneBHKPage.clickContinue(driver, wait);
	}

	@Given("the user is on the 1BHK Design Ideas page")
	public void the_user_is_on_the_1bhk_design_ideas_page() throws InterruptedException, IOException {
		driver=new ChromeDriver();
		ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
		driver.get(ExcelReader.getSecondUrl());
		Thread.sleep(1000);
		//*[@id="intsrpbhkPages"]/div[1]/div[1]/div/div[2]/div[2]/div[2]/div[2]/ul/li[1]/label
	}

	@When("the user clicks on the city they needed")
	public void the_user_clicks_on_the_city_they_needed() throws InterruptedException {
		OneBHKDesigns.getCity(driver, wait);

	}

	@When("the user selects the cost to be between {int}-{int} lakhs")
	public void the_user_selects_the_cost_to_be_between_lakhs(Integer int1, Integer int2) throws InterruptedException {
		OneBHKDesigns.selectCost(driver, wait);
	}

	@Then("the user should show all those interior design ideas")
	public void the_user_should_show_all_those_interior_design_ideas() throws InterruptedException {
		
		OneBHKDesigns.showDesigns(driver, wait);
	}

@Given("the user is on the Homepage of Magicbricks1")
	public void the_user_is_on_the_homepage_of_magicbricks1() throws InterruptedException, IOException {
	
	ChromeOptions options = new ChromeOptions();
    options.addArguments("--disable-notifications");
    options.addArguments("--start-maximized"); // Start browser maximized
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver(options);
    wait = new WebDriverWait(driver, Duration.ofSeconds(100));
    driver.get(ExcelReader.geturl()); 
	}
//

	@When("The user clicks Bedroom Design Ideas")
	public void the_user_clicks_bedroom_design_ideas() throws InterruptedException {
		
		BedroomDesignPage.bedroomDesign(driver, wait);

	}
	@When("User selects style as luxury")
	public void user_selects_style_as_luxury() throws InterruptedException {
		BedroomDesignPage.styleLuxury(driver, wait);
		
	}

	@When("click the price estimate button for the specified bedroom design")
	public void click_the_price_estimate_button_for_the_specified_bedroom_design() throws InterruptedException {
	      
		
		BedroomDesignPage.estimatePrice(driver, wait);
	       
	}
	String FirstWindow;
	@Then("a popup will show to fill the details on interior design requirements")
	public void a_popup_will_show_to_fill_the_details_on_interior_design_requirements() throws InterruptedException {
		
		BedroomDesignPage.fillPopUp(driver, wait, FirstWindow);
	}



	@When("The user clicks Bathroom Design Ideas")
	public void the_user_clicks_bathroom_design_ideas() throws InterruptedException {
		BathroomDesignPage.bathroomDesign(driver, wait);
        
	}
	@When("User selects style as simple")
	public void user_selects_style_as_simple() throws InterruptedException {
		BathroomDesignPage.styleSimple(driver, wait,currentWindowHandle);
	}

	@When("User clicks Price Estimate button for the specified bathroom design")
	public void user_clicks_price_estimate_button_for_the_specified_bathroom_design() throws InterruptedException {
		BathroomDesignPage.estimatePrice(driver, wait);
	}
	@Then("A popup will show to fill the details on bathroom design requirements")
	public void a_popup_will_show_to_fill_the_details_on_bathroom_design_requirements() throws InterruptedException {

		
		BathroomDesignPage.fillDetails(driver, wait, FirstWindow);
	}


	@When("the user selects Full Home Interior Cost Calculator")
	public void the_user_selects_full_home_interior_cost_calculator() throws InterruptedException {
		
		InteriorCostCalculatorPage.getCostCalculatorPage(driver, wait);
		
	}

	@When("User selects the BHK type and select squarefeet needed and clicks the Next button")
	public void user_selects_the_bhk_type_and_select_squarefeet_needed_and_clicks_the_next_button() throws InterruptedException {
		
		InteriorCostCalculatorPage.getBHKDetails(driver, wait, currentWindowHandle);
	}
	
	@Then("User should fill the user details to get verified")
	public void user_should_fill_the_user_details_to_get_verified() throws InterruptedException {
		
		InteriorCostCalculatorPage.getUserDetails(driver, wait);
		
		}
	@When("the user  selects full Home Interior Cost Calculator1")
	public void the_user_selects_full_home_interior_cost_calculator1() throws InterruptedException {
		ErrorPageCostCalculator.bhkDetails(driver, wait);
	}

	@When("User click estimate cost button without filling the user details")
	public void user_click_estimate_cost_button_without_filling_the_user_details() throws InterruptedException {
		
		ErrorPageCostCalculator.estimateButton(driver, wait, currentWindowHandle);
	}

	@Then("Page will display an error asking the user to select the manadatory options")
	public void page_will_display_an_error_asking_the_user_to_select_the_manadatory_options() throws InterruptedException {
		
		ErrorPageCostCalculator.getErrorData(driver, wait);
	}


}
