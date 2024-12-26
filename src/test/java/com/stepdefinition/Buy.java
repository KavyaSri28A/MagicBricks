package com.stepdefinition;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.pages.Findanagent;
import com.pages.Localitiesinbangalore;
import com.pages.ReadytoMove;
import com.pages.TipsandGuides;
import com.pages.negative;
import com.pages.officespaceinbangalore;
import com.parameters.ExcelReader;
import com.parameters.FileReader;

import io.cucumber.datatable.DataTable;
//import dev.failsafe.internal.util.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class Buy {
	WebDriver driver;
    WebDriverWait wait;
    Properties prop;
	
	
	@Given("the user is on the MagicBricks homepage1")
	public void the_user_is_on_the_magic_bricks_homepage1() throws IOException {
	    // Write code here that turns the phrase above into concrete actions
	    driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(ExcelReader.geturl());
        wait = new WebDriverWait(driver, Duration.ofSeconds(30)); 
	}

	@When("the user clicks on the Buy option")
	public void the_user_clicks_on_the_buy_option() throws InterruptedException {
	   
       ReadytoMove.buyoption(driver);
	}

	@When("the user selects the Ready-to-Move option")
	public void the_user_selects_the_ready_to_move_option() throws InterruptedException {

     ReadytoMove.readytomove(driver);
   	
            
        
	}

	@When("the user selects Posted By as Owner")
	public void the_user_selects_posted_by_as_owner() throws InterruptedException {
		ReadytoMove.postbyowner(driver, wait);
	  
	}


    @When("the user selects Top localities as {string}")
    public void the_user_selects_top_localities_as(String locality1) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    
	  ReadytoMove.localitysarjapur(driver);
	    
	}
	
	
	@Then("the user will be presented with properties based on the selected preferences")
	public void the_user_will_be_presented_with_properties_based_on_the_selected_preferences() {
		ReadytoMove.resultoffilters(driver);
    }
 
   


    @Given("the user is on the Magicbricks homepage2")
    public void the_user_is_on_the_magic_bricks_homepage2() throws IOException {
    	 driver = new ChromeDriver();
         driver.manage().window().maximize();
         driver.get(ExcelReader.geturl());
         wait = new WebDriverWait(driver, Duration.ofSeconds(30)); 
    }

    @When("the user selects on the Buy option")
    public void the_user_selects_on_the_buy_option() throws InterruptedException {
    	Localitiesinbangalore.buyoption1(driver);
        
    }

    @When("the user selects the Localities in Bangalore")
    public void the_user_selects_the_localities_in_bangalore() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
    	
    	Localitiesinbangalore.localitiesinbangalore(driver);
    	
    }

    @When("the user selects filter price\\/sqft")
    public void the_user_selects_filter_price_sqft() throws InterruptedException {
    	Localitiesinbangalore.filterpricepersqft(driver);
	     
	        
    }

    @Then("the user should see the localities in Bangalore filtered by the selected price range")
    public void the_user_should_see_the_localities_in_bangalore_filtered_by_the_selected_price_range() 
    {
    	Localitiesinbangalore.localitiefiltered1(driver);


}

    @Given("the user is on the MagicBricks homepage3")
    public void the_user_is_on_the_magic_bricks_homepage3() throws IOException {
    	 driver = new ChromeDriver();
         driver.manage().window().maximize();
         driver.get(ExcelReader.geturl());
         wait = new WebDriverWait(driver, Duration.ofSeconds(30)); 
    }

    @When("the user selects on Buy option2")
    public void the_user_selects_on_buy_option2() throws InterruptedException {
    	  TipsandGuides.buyoption2(driver);
    }
       
    

    @When("the user selects Tips and Guide")
    public void the_user_selects_tips_and_guide() throws InterruptedException {
    	
    	 TipsandGuides.TipsandGuides(driver);
    	
    }

    @When("the user Selects Localities")
    public void the_user_selects_localities() throws InterruptedException 
    {
    	 TipsandGuides.selectslocality(driver);
	        
    
    	
    }
    
    @When("the user Enter Locality1 and Locality2 and click compare")
    public void the_user_enter_locality1_and_locality2_and_click_compare(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
    	TipsandGuides.locality1andlocality2(driver, dataTable);
        
    }

    @Then("the user should see localities and projects comaparison")
    public void the_user_should_see_localities_and_projects_comaparison() {
    	TipsandGuides.localitiescomapred(driver);

    }
 
   @Given("the user is on the MagicBricks homepage4")
    public void the_user_is_on_the_magic_bricks_homepage4() throws IOException {
       
	   driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.get(ExcelReader.geturl());
       wait = new WebDriverWait(driver, Duration.ofSeconds(30)); 
    }

    @When("the user selects the Buy option3")
    public void the_user_selects_the_buy_option3() throws InterruptedException {
    	Findanagent.buyoption3(driver);
    }

    @When("the user selects on Find an Agent")
    public void the_user_selects_on_find_an_agent() throws InterruptedException {
    	Findanagent.findanagent(driver);
    }

  
    @When("the user selects the city and Localities filter")
    public void the_user_selects_the_city_and_localities_filter() throws InterruptedException {
    	Findanagent.cityandlocalitiesfilter(driver);
	       
    }
        
    
   @Then("the user should get Agents based on selected criteria")
    public void the_user_should_get_agents_based_on_selected_criteria() throws InterruptedException {
    	Findanagent.agentsfiltered(driver);
    }
    
    @Given("the user is on the MagicBricks homepage5")
    public void the_user_is_on_the_magic_bricks_homepage5() throws IOException {
       
    	 driver = new ChromeDriver();
         driver.manage().window().maximize();
         driver.get(ExcelReader.geturl());
         wait = new WebDriverWait(driver, Duration.ofSeconds(30));  
    	
    }

    @When("the user selects the Buy option4")
    public void the_user_selects_the_buy_option4() throws InterruptedException {
    	officespaceinbangalore.buyoption4(driver);
    	
    }

    @When("the user selects office space in bangalore")
    public void the_user_selects_office_space_in_bangalore() throws InterruptedException {
    	officespaceinbangalore.officespaceinbangalore1(driver); 
    }

    @When("the user selects new projects and sort office space by price low to high")
    public void the_user_selects_new_projects_and_sort_office_space_by_price_low_to_high() throws InterruptedException {
    
    	officespaceinbangalore.sortbyprice(driver);
   	
    }

    @Then("the user should get office space based on filter")
    public void the_user_should_get_office_space_based_on_filter() throws InterruptedException {
    officespaceinbangalore.officespacefiltered(driver);
    }
    
    @Given("the user is on the MagicBricks homepage6")
    public void the_user_is_on_the_magic_bricks_homepage6() throws IOException {
    	 driver = new ChromeDriver();
         driver.manage().window().maximize();
         driver.get(ExcelReader.geturl());
         wait = new WebDriverWait(driver, Duration.ofSeconds(30)); 
    	
    }

    @When("the user selects the Buy option5")
    public void the_user_selects_the_buy_option5() throws InterruptedException {
    	negative.buyoption5(driver);
        
    }

    @When("the user selects tips and guide")
    public void the_user_selects_tips_and_guide1() throws InterruptedException {
    	
    	negative.tipsandguides1(driver);
    }

    @When("the user Enter locality1 and locality2 and click compare")
    public void the_user_enter_locality1_and_locality2_and_click_compare() throws InterruptedException {
        	negative.enterlocalities(driver);
        
    }

    @Then("the user should get Please enter a different locality name")
    public void the_user_should_get_please_enter_a_different_locality_name() throws IOException, InterruptedException {
        
    	negative.enteradiffrentlocalityname(driver, prop);
    	
    }
   
    }



    
    
    





    