package com.stepdefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RentModule {
	WebDriver driver;
	WebDriverWait wait;
	Actions mouse;
	
	@Given("The user is on the MagicBricks Home Page")
	public void the_user_is_on_the_magic_bricks_homepage() {
		ChromeOptions options = new ChromeOptions();
	    options.addArguments("--disable-notifications");
//	    options.addArguments("--start-maximized"); // Start browser maximized
	    
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://www.magicbricks.com");
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        //wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"tabRENT\"]"))).click();

 
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@When("User provides the following details1")
	public void user_provides_the_following_details1(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		//WebElement loc = driver.findElement(By.xpath("//*[@id=\"commercialIndex\"]/header/section[1]/div/div[1]/div[2]/a"));
		//loc.click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='commercialIndex']/header/section[1]/div/div[1]/div[2]/a"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"commercialIndex\"]/header/section[1]/div/div[1]/div[2]/div/div[1]/div[3]/ul/li[2]/a"))).click();
        Thread.sleep(1000);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"tabRENT\"]"))).click(); //Rent
		Thread.sleep(1000);
        //mouse=new Actions(driver);
        //WebElement loc = driver.findElement(By.xpath("//*[@id=\"commercialIndex\"]/header/section[1]/div/div[1]/div[1]/a")); //Magic Bricks
        //mouse.moveToElement(loc);
        //wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='commercialIndex']/header/section[1]/div/div[1]/div[2]/a"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.id("propType_rent"))).click(); //PropType
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"10002_10003_10021_10022\"]"))).click(); //Flat
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"10001_10017\"]"))).click(); //House/Villa
        Thread.sleep(1000);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"10002_10003_10021_10022\"]"))).click(); //Flat
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"11700\"]"))).click(); //1BHK
        Thread.sleep(1000);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"searchFormHolderSection\"]/section/div/div[1]/div[3]/div[3]/div[1]"))).click(); //Budget
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"budgetMax\"]"))).click(); //Maximum
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"maxBhkIndex_2\"]"))).click(); //15,000
      
	}

	@When("User clicks the {string} button")
	public void user_clicks_the_button(String string) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
       // Thread.sleep(10000);
        
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"searchFormHolderSection\"]/section/div/div[1]/div[3]/div[4]"))).click(); //Search
        //Thread.sleep(10000);
	}

	@Then("the system should display a list of 1BHK flats in Bangalore with rents less than or equal to ₹{double}")
	public void the_system_should_display_a_list_of_1bhk_flats_in_bangalore_with_rents_less_than_or_equal_to_₹(Double double1) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		Thread.sleep(10000);
		WebElement ele =driver.findElement(By.xpath("//*[@id=\"body\"]/div[4]/div/div/div[1]/div[2]/h1"));
		String actual=ele.getText();
		System.out.println(actual);
		
	}

	@When("user provides the Following details2")
	public void user_provides_the_following_details2(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
	    //throw new io.cucumber.java.PendingException();
		Thread.sleep(1000);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"commercialIndex\"]/header/section[1]/div/div[1]/div[2]/a"))).click(); //Location 
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"commercialIndex\"]/header/section[1]/div/div[1]/div[2]/div/div[1]/div[3]/ul/li[13]/a"))).click(); //New Delhi
        Thread.sleep(1000);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"tabRENT\"]"))).click(); //Rent
        Thread.sleep(1000);
        wait.until(ExpectedConditions.elementToBeClickable(By.id("propType_rent"))).click(); //PropType
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"10002_10003_10021_10022\"]"))).click(); //Flat
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"10001_10017\"]"))).click(); //House/Villa
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"propType_rent\"]/div[2]/div/div/div[3]/div[1]"))).click(); //Other prop types
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"10005\"]"))).click(); //Agricultural Land

	}

	@When("the user clicks on the {string} button")
	public void the_user_clicks_on_the_button(String string) throws InterruptedException {
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"searchFormHolderSection\"]/section/div/div[1]/div[3]/div[4]"))).click(); //Search
        Thread.sleep(100000);
	}

	@Then("the system should display a list of Agricultural Lands for rent in New Delhi")
	public void the_system_should_display_a_list_of_agricultural_lands_for_rent_in_new_delhi() {
	    //throw new io.cucumber.java.PendingException();
	}

	@When("User provides following details3")
	public void user_provides_following_details3(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	    throw new io.cucumber.java.PendingException();
	}

	@When("The User clicks the {string} button")
	public void the_user_clicks_the_button(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("the system should display a list of Commercial Office Spaces for rent in Chittoor")
	public void the_system_should_display_a_list_of_commercial_office_spaces_for_rent_in_chittoor() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("the user enters a valid location {string} in the location search field")
	public void the_user_enters_a_valid_location_in_the_location_search_field(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"tabRENT\"]"))).click(); //Rent
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"keyword_autoSuggestSelectedDiv\"]/div/div[1]"))).click(); //Location
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"keyword_autoSuggestSelectedDiv\"]/div/div[2]"))).click(); //clear
        WebElement element= driver.findElement(By.xpath("//*[@id=\"keyword\"]"));
        Actions action =new Actions(driver);
        action.click(element).sendKeys("Bangalore").perform();

	}

	@When("the user clicks {string} button")
	public void the_user_clicks_button(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"searchFormHolderSection\"]/section/div/div[1]/div[3]/div[4]"))).click(); //Search

	}

	@Then("the system should display a list of rental properties in Bangalore")
	public void the_system_should_display_a_list_of_rental_properties_in_jaipur() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User provides the Following Details5")
	public void user_provides_the_following_details5(io.cucumber.datatable.DataTable dataTable) {
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"commercialIndex\"]/header/section[1]/div/div[1]/div[2]/a"))).click(); //Location
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"commercialIndex\"]/header/section[1]/div/div[1]/div[2]/div/div[1]/div[3]/ul/li[6]/a"))).click(); //Hyderabad
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"rentheading\"]"))).click(); //Rent Heading
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='Immediately Available']"))).click(); //Immediately Available

	}

	@When("The User clicks on {string} button")
	public void the_user_clicks_on_button(String string) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
        Thread.sleep(10000);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"searchFormHolderSection\"]/section/div/div[1]/div[3]/div[4]"))).click(); //Search
        Thread.sleep(10000);
		
	}

	@Then("the system should display a list of rental properties in Hyderabad that are immediately available")
	public void the_system_should_display_a_list_of_rental_properties_in_hyderabad_that_are_immediately_available() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User provides following details6")
	public void user_provides_following_details6(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		Thread.sleep(1000);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"commercialIndex\"]/header/section[1]/div/div[1]/div[2]/a"))).click(); //Location
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"commercialIndex\"]/header/section[1]/div/div[1]/div[2]/div/div[1]/div[3]/ul/li[11]/a"))).click(); //Mumbai
        Thread.sleep(1000);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"tabRENT\"]"))).click(); //Rent
        wait.until(ExpectedConditions.elementToBeClickable(By.id("propType_rent"))).click(); //PropType
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"10002_10003_10021_10022\"]"))).click(); //Flat
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"10001_10017\"]"))).click(); //House/Villa
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"10002_10003_10021_10022\"]"))).click(); //Flat
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"11704\"]"))).click(); //5BHK
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"searchFormHolderSection\"]/section/div/div[1]/div[3]/div[3]/div[1]"))).click(); //Budget
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"budgetMax\"]"))).click(); //Maximum
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"maxBhkIndex_0\"]"))).click(); //5,000

	}

	@When("The User clicking the {string} button")
	public void the_user_clicking_the_button(String string) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"searchFormHolderSection\"]/section/div/div[1]/div[3]/div[4]"))).click(); //Search
        Thread.sleep(10000);
        //driver.close();
	}

	@Then("the system displays a list of Residentail Flats for rent in Mumbai")
	public void the_system_displays_a_list_of_residentail_flats_for_rent_in_mumbai() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}


}
