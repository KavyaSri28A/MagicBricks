package com.stepdefinition;

import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.pages.BathroomDesignPage;
import com.pages.BedroomDesignPage;
import com.pages.ClickHomeInterior;
import com.pages.ErrorPageCostCalculator;
import com.pages.HomeLoanEMI;
import com.pages.InteriorCostCalculatorPage;
import com.pages.OneBHKDesigns;
import com.pages.OneBHKPage;
import com.parameters.ExcelReader;
import com.parameters.FileReading;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class homeinteriors {


	//private static WebDriver driver;
	static WebDriver driver;
WebDriverWait wait;
String currentWindowHandle;
Properties prop;
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
        prop=FileReading.reader();
         
        
       
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
	public void the_user_clicks_on_contact_now_button_on_any_one_designer_in_list() throws InterruptedException, IOException {

		
		ClickHomeInterior.bookYourSpot(driver, wait, currentWindowHandle);
		ClickHomeInterior.screenShotMethod("scenario", driver);
        
		 
		
	}

	@Then("a pop-up should display to fill the details")
	public void a_pop_up_should_display_to_confirm_the_contact_by_the_relationship_manager_rm() throws InterruptedException {
		
        
		ClickHomeInterior.popUpDetails(driver, wait, prop);
		
	}



	@Given("the user is on the Homepage of Magicbricks")
	public void the_user_is_on_the_homepage_of_magicbricks() throws IOException {
		ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        options.addArguments("--start-maximized"); // Start browser maximized
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(options);
        wait = new WebDriverWait(driver, Duration.ofSeconds(100));
        driver.get(ExcelReader.geturl());
        prop=FileReading.reader();
		
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
//BedroomDesignPage

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

//BathroomDesignPage

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
	public void a_popup_will_show_to_fill_the_details_on_bathroom_design_requirements() throws InterruptedException, IOException {

		
		BathroomDesignPage.fillDetails(driver, wait, FirstWindow, prop);
		driver.quit();
	}

	
	//InteriorCostCalculatorPage

	@When("the user selects Full Home Interior Cost Calculator")
	public void the_user_selects_full_home_interior_cost_calculator() throws InterruptedException {
		
		InteriorCostCalculatorPage.getCostCalculatorPage(driver, wait);
		
	}

	@When("User selects the BHK type and select squarefeet needed")
	public void user_selects_the_bhk_type_and_select_squarefeet_needed() throws InterruptedException {
		
		InteriorCostCalculatorPage.getBHKDetails(driver, wait, currentWindowHandle);
	}
	
	@When("clicks the Next button")
	public void clicks_the_next_button() throws InterruptedException {
		InteriorCostCalculatorPage.clickNext(driver);
	}

	@Then("User should fill the user details to get verified")
	public void user_should_fill_the_user_details_to_get_verified(io.cucumber.datatable.DataTable dataTable) throws InterruptedException, IOException {
		InteriorCostCalculatorPage.getUserDetails(driver, wait,dataTable);
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


	@When("User clicks on the Home Loan EMI Calculator")
	public void user_clicks_on_the_home_loan_emi_calculator() throws InterruptedException {
		
		WebElement homeLoans =driver.findElement(By.xpath("//*[@id=\"commercialIndex\"]/header/section[2]/div/ul/li[4]/a"));
        wait.until(ExpectedConditions.elementToBeClickable(homeLoans));

        Actions actions = new Actions(driver);//

        actions.moveToElement(homeLoans);
        Thread.sleep(1000);
        homeLoans.click();
        WebElement loan = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//*[@id=\"homeloanDrop\"]/div/div[3]/ul/li[1]/a")));
            Thread.sleep(100);
            loan.click();
            Thread.sleep(10000);

        
	}

	@When("User Provides the details and rate of interest as {string}")
	public void user_provides_the_details_and_rate_of_interest_as(String string) throws InterruptedException {
		HomeLoanEMI.clickEMI(driver, string, prop);
	}

	@Then("It should show the warning {string}")
	public void it_should_show_the_warning(String string) {
		HomeLoanEMI.showWarning(driver, string);
		driver.quit();
		//"Min interest starts from 8%"
	}





}
