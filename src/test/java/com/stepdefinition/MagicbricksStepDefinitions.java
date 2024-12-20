package com.stepdefinition;

import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Iterator;
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

import com.setup.ExtraFunctions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MagicbricksStepDefinitions {

    WebDriver driver;
    WebDriverWait wait;
    String FirstWindow;
    
//////////////////////////////////////////////////Scenario 1////////////////////////////////////////////////////////////////////////////////////

    // Step 1: Given the user is on the Magicbricks home page
    @Given("the user is on the Magicbricks home page")
    public void the_user_is_on_the_magicbricks_home_page() {
    	ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
 //driver = new ChromeDriver(options);
      
      //  ChromeOptions options1 = new ChromeOptions();
        options.addArguments("--start-maximized"); // Start browser maximized
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(options);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://www.magicbricks.com");
    }

    // Step 2: When User clicks on SELL option
    @When("User clicks on SELL option")
    public void user_clicks_on_sell_option() throws InterruptedException {
    	WebElement sell=driver.findElement(By.xpath("//*[@id='commercialIndex']/header/section[2]/div/ul/li[3]/a"));
       wait.until(ExpectedConditions.elementToBeClickable(sell));
       Actions actions0 = new Actions(driver);
       actions0.moveToElement(sell);
    	Thread.sleep(100);
    	sell.click();
    	
    }

    // Step 3: And the user click on property valuation option
    @When("the user click on property valuation option")
    public void the_user_click_on_property_valuation_option() {
    	 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Property Valuation']"))).click();
    	 
    	 FirstWindow=driver.getWindowHandle();
    	 Set<String> s1=driver.getWindowHandles();		
         Iterator<String> i1=s1.iterator();
         while(i1.hasNext())			
         {		
             String ChildWindow=i1.next();		
             		
             if(!FirstWindow.equalsIgnoreCase(ChildWindow))			
             {    
            	 driver.switchTo().window(ChildWindow);
             
    	 //driver.get("https://www.magicbricks.com/propertyservices/property-valuation");
 		JavascriptExecutor js = (JavascriptExecutor) driver;
 		
 		// Scroll the page slowly in steps
 		WebElement  clickOn= driver.findElement(By.xpath("//*[@id=\"pkgpriceSec\"]/a[1]"));
 		js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath("//*[@id=\"propValpkg\"]/div/div[2]")));
 	      
 		//js.executeScript("arguments[0].scrollIntoView({ behavior: 'smooth', block: 'center' });", clickOn);
  
 		clickOn.click();
 		}
    	    
         }
    }
      
 
    // Step 4: And the user click on the Buy Now button
    @When("the user click on the Buy Now button")
    public void the_user_click_on_the_buy_now_button() throws InterruptedException {
        //wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Buy Now']"))).click();
        //driver.get("https://magicbricks.com/propertyservices/property-valuation");
    	driver.switchTo().activeElement();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"generic-page-popup\"]/section")));
        
        WebElement nameField = driver.findElement(By.xpath("//*[@id=\"propVal-login-form\"]/div[2]"));
        Actions actions = new Actions(driver);
        actions.click(nameField).sendKeys("Vicky").perform();
        
        WebElement NUmberField = driver.findElement(By.xpath("//*[@id=\"propVal-login-form\"]/div[3]/div[2]"));
        Actions actions1 = new Actions(driver);
        actions1.click(NUmberField).sendKeys("9677661922").perform();
        
        WebElement emailField = driver.findElement(By.xpath("//*[@id=\"propVal-login-form\"]/div[4]"));
        Actions actions2 = new Actions(driver);
        actions2.click(emailField).sendKeys("vicky23@gamil.com").perform();
        
        WebElement Submit = driver.findElement(By.xpath("//*[@id=\"propVal-login-form\"]/div[5]/div/a"));
                                                       
      //  WebElement submitButton = driver.findElement(By.xpath("//*[@id=\"propVal-login-form\"]/div[5]/div/a"));
        Actions actions3 = new Actions(driver);
        actions3.moveToElement(Submit).click().perform(); // Move to the submit button and click it
      //  String mainwindow=driver.getWindowHandle();
        Thread.sleep(10000);
       driver.switchTo().frame("otp-screen");
        Thread.sleep(10000);
		WebElement Verfy = driver.findElement(By.xpath("//*[@id='verifyOtpDiv']/div[2]/div[3]/button"));
		                                                //*[@id="verifyOtpDiv"]/div[2]/div[3]/button
		Thread.sleep(10000);
		//Actions actions4 = new Actions(driver);
		
		Verfy.click();
		
	//Clicking on BuyNow Button
		driver.switchTo().defaultContent();
 WebElement BuyNow = driver.findElement(By.xpath("//*[@id=\"pkgpriceSec\"]/a[2]"));
 BuyNow.click();
// 
// WebElement PlaceOrder =driver.findElement(By.xpath("//*[@id=\"paymentStrip\"]/a"));
// PlaceOrder.click();
      
    	}
    	    // You can add additional actions for the "Buy Now" button if needed
    	
    
    
    // Step 5: Then the user is navigated to Property Services page
    @Then("the user is navigated to Place Order button")
    public void the_user_is_navigated_to_place_order_button() {
    	WebElement Propertservicepage=driver.findElement(By.xpath("//*[@id=\"item-240781\"]/div[1]/div[2]/div[1]"));
    	String actual=Propertservicepage.getText();
    	System.out.println(actual);
    	String expected="Basic Property Valuation";
       // wait.until(ExpectedConditions.urlContains("property-services"));
        Assert.assertEquals(actual, expected);
        driver.quit();
    }

    // After hook to close the browser after test is done
  //  @io.cucumber.java.After
    public void close_browser() {
        if (driver != null) {
           driver.quit();
        }
    }

    
//////////////////////////////////////////////////Scenario 2////////////////////////////////////////////////////////////////////////////////////


@Given("the user is logged into the Magicbricks app")
public void the_user_is_logged_into_the_magicbricks_app() throws FileNotFoundException, InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	
	
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
    WebElement Popup=driver.findElement(By.xpath("//*[@id=\"userOnboardingWidget\"]/div/div[1]"));
    wait.until(ExpectedConditions.elementToBeClickable(Popup));
    Thread.sleep(100);
    Popup.click();
    
	WebElement sell=driver.findElement(By.xpath("//*[@id='commercialIndex']/header/section[2]/div/ul/li[3]/a"));
    wait.until(ExpectedConditions.elementToBeClickable(sell));
    Actions actions0 = new Actions(driver);
    actions0.moveToElement(sell);
 	Thread.sleep(100);
 	sell.click();
 	//For clicking on AD Package
    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"commercialIndex\"]/header/section[2]/div/ul/li[3]/div/div/div[2]/ul/li[2]/a"))).click();
 	
}
String SecondWindow;
@When("select property for as Rent")
public void select_property_for_as_rent() {
	SecondWindow=driver.getWindowHandle();
	 Set<String> windowHandles=driver.getWindowHandles();
	 for(String i:windowHandles) {
		 if(!i.equals(FirstWindow) && !i.equals(SecondWindow)) {
			 driver.switchTo().window(i);
		 }
	 }
	 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"wrapper\"]/div[2]/div[1]/div/div[2]/form/div/div[1]/div/div[2]/ul/li[2]/label"))).click();
     
}

@When("select property type as PG\\/Flatmate")
public void select_property_type_as_pg_flatmate() throws InterruptedException {
	Thread.sleep(100);
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"pgliId\"]/label"))).click();
	Thread.sleep(20000);
	}
@Then("the user is looking for the recommeded AD package")
public void the_user_is_looking_for_the_recommeded_ad_package() {
	System.out.println("Recommended Pack is:");
	WebElement Recommended =driver.findElement(By.xpath("/html/body/section/div[2]/div[1]/div[2]/div[1]/div[4]/div[2]/div[1]"));
	String actual=Recommended.getText();
	System.out.println(actual);
	//String Expected1 ="Gold";
	
    driver.quit();
	    // Write code here that turns the phrase above into concrete actions
   
}


//////////////////////////////////////////////////////////////Scenario3//////////////////////////////////////////////////////////////////////



@Given("the user is on the Magicbricks homepage")
public void the_user_is_on_the_magicbricks_homepage() {
    // Write code here that turns the phrase above into concrete actions
	ChromeOptions options = new ChromeOptions();
    options.addArguments("--disable-notifications");
    options.addArguments("--start-maximized"); // Start browser maximized
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver(options);
    wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    driver.get("https://www.magicbricks.com");
}

  
  //  ChromeOptions options1 = new ChromeOptions();
   

@When("the user hovers over SELL and selects PropWorth")
public void the_user_hovers_over_sell_and_selects_prop_worth() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	WebElement sell=driver.findElement(By.xpath("//*[@id='commercialIndex']/header/section[2]/div/ul/li[3]/a"));
    wait.until(ExpectedConditions.elementToBeClickable(sell));
    Actions actions0 = new Actions(driver);
    actions0.moveToElement(sell);
 	Thread.sleep(10000);
 	sell.click();
 	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"commercialIndex\"]/header/section[2]/div/ul/li[3]/div/div/div[3]/ul/li[4]/a"))).click();
 	Thread.sleep(10000);
 	
 	
 	
 	
 	
}

@When("the user enters the property details and clicks on Get Estimate")
public void the_user_enters_the_property_details_and_clicks_on_get_estimate() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	 FirstWindow=driver.getWindowHandle();
	 Set<String> s1=driver.getWindowHandles();		
     Iterator<String> i1=s1.iterator();
     while(i1.hasNext())			
     {		
         String ChildWindow=i1.next();		
         		
         if(!FirstWindow.equalsIgnoreCase(ChildWindow))			
         {    
        	 driver.switchTo().window(ChildWindow);
        	

         }
         }       
     WebElement propertname = driver.findElement(By.xpath("//*[@id=\"propworth\"]/div[2]/div[1]/div[3]/div/div/div/div[1]/input"));
     Actions actions5 = new Actions(driver);
     actions5.click(propertname).sendKeys("jaya bheri silicon valley, Kothaguda, Hyderabad").perform();
     
   //  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"propworth\"]/div[2]/div[1]/div[3]/span[2]"))).click();
     WebElement submitprop=driver.findElement(By.xpath("//*[@id=\"propworth\"]/div[2]/div[1]/div[3]/span[2]"));
     Actions action6=new Actions(driver);
     action6.moveToElement(submitprop).click().perform();
     Thread.sleep(10000);
    


}

@Then("the user should be redirected to the PropWorth estimate page")
public void the_user_should_be_redirected_to_the_prop_worth_estimate_page() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	 WebElement propertname = driver.findElement(By.xpath("//*[@id=\"propworth\"]/div[3]/div/div[1]/div[2]/div/div/div[2]/div/div[2]/div/div/div[1]/input"));
     Actions actions7 = new Actions(driver);
     actions7.click(propertname).sendKeys("jaya bheri silicon valley, Kothaguda, Hyderabad").perform();
     Thread.sleep(10000);;
     
 	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"propworth\"]/div[3]/div/div[1]/div[2]/div/div/div[2]/div/div[2]/div/div/div[2]/div/div[2]"))).click();
 	Thread.sleep(10000);
 	//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"propworth\"]/div[3]/div/div[1]/div[2]/div/div/div[2]/div/div[2]/div/div[2]/div[2]/div"))).click();
 	//Thread.sleep(50);
 	
	 WebElement properttype = driver.findElement(By.xpath("//*[@id=\"propworth\"]/div[3]/div/div[1]/div[2]/div/div/div[3]/div/div[2]/div[2]/label"));
     Actions actions8 = new Actions(driver);
     actions8.click(properttype).perform();
     Thread.sleep(10000);
     
     WebElement BHK = driver.findElement(By.xpath("//*[@id=\"propworth\"]/div[3]/div/div[1]/div[2]/div/div/div[4]/div/div[2]/div[2]/label"));
     Actions actions9 = new Actions(driver);
     actions9.click(BHK).perform();
     Thread.sleep(10000);
     JavascriptExecutor js = (JavascriptExecutor) driver;
		
//     WebElement divTag=driver.findElement(By.xpath("//*[@id=\"propworth\"]/div[3]/div/div[1]"));
//     divTag.sendKeys(Keys.PAGE_DOWN);
     
		// Scroll the page slowly in steps
	js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath("//*[@id=\"propworth\"]/div[3]/div/div[1]/div[2]/div/div/div[5]/div/div[1]")));
    Thread.sleep(10000); 
	//js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

		WebElement  coveredArea= driver.findElement(By.xpath("//*[@id=\"propworth\"]/div[3]/div/div[1]/div[2]/div/div/div[5]/div/div[2]/div/input"));

     Actions action10 = new Actions(driver);
     action10.moveToElement(coveredArea).click(coveredArea).sendKeys("2000").build().perform();
     
     Thread.sleep(5000);
     
     wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"propworth\"]/div[3]/div/div[1]/div[2]/div/div/div[11]/div"))).click();

}

@Then("the page should contain the text {string}")
public void the_page_should_contain_the_text(String string) {
    // Write code here that turns the phrase above into concrete actions
	WebElement lastPage =driver.findElement(By.xpath("//*[@id=\"signUp\"]/div[1]"));
	String actual=lastPage.getText();
	System.out.println(actual);
	String Expected ="Enter your details to see the estimated price";
    Assert.assertEquals(actual, Expected);
	driver.quit();
   
}



////////////////////////////////////////////////////////////////////Scenario 4//////////////////////////////////////////////////////////////////////




@When("the user clicks on Find an Agent under the SELL section")
public void the_user_clicks_on_find_an_agent_under_the_sell_section() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	WebElement sell=driver.findElement(By.xpath("//*[@id='commercialIndex']/header/section[2]/div/ul/li[3]/a"));
    wait.until(ExpectedConditions.elementToBeClickable(sell));
    Actions actions0 = new Actions(driver);
    actions0.moveToElement(sell);
 	Thread.sleep(10000);
 	sell.click();
 	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"commercialIndex\"]/header/section[2]/div/ul/li[3]/div/div/div[3]/ul/li[2]/a"))).click();
 	Thread.sleep(10000);
}

@When("the user clicks on the Deatils of Agent button for a specific agent")
public void the_user_clicks_on_the_contact_agent_button_for_a_specific_agent() {
    // Write code here that turns the phrase above into concrete actions
	 FirstWindow=driver.getWindowHandle();
	 Set<String> s1=driver.getWindowHandles();		
     Iterator<String> i1=s1.iterator();
     while(i1.hasNext())			
     {		
         String ChildWindow=i1.next();		
         		
         if(!FirstWindow.equalsIgnoreCase(ChildWindow))			
         {    
        	 driver.switchTo().window(ChildWindow);
        	

         }
         }       
  	wait.until(ExpectedConditions.elementToBeClickable(By.id("cityList"))).click();//To click the drop down
  	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"cityList\"]/option[21]"))).click();//To select the city (varanasi)
  	wait.until(ExpectedConditions.elementToBeClickable(By.id("localityList"))).click();//to select the locality dropdown
  	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"localityList\"]/option[4]"))).click();//To select the locality(paharia)

 
}

@Then("the user should be redirected to a contact form page")
public void the_user_should_be_redirected_to_a_contact_form_page() {
    // Write code here that turns the phrase above into concrete actions
  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"topAgentCard\"]/div[1]/div[1]/div[2]/div[2]/a[2]"))).click();//to click on view details options
}

@Then("the user finds the detilas of the agent")
public void the_user_finds_the_detilas_of_the_agent() {
    // Write code here that turns the phrase above into concrete actions
	SecondWindow=driver.getWindowHandle();
	 Set<String> windowHandles=driver.getWindowHandles();
	 for(String i:windowHandles) {
		 if(!i.equals(FirstWindow) && !i.equals(SecondWindow)) {
			 driver.switchTo().window(i);
		 }
	 }
	 WebElement Details=driver.findElement(By.xpath("//*[@id=\"agentinfoId\"]/div/div[2]/div[1]"));
	 String actual=Details.getText();
	 System.out.println(actual);
	 String Expected="Pramod Malviya";
	 Assert.assertEquals(actual, Expected);
	 		
  
}


////////////////////////////////////////////////////////////////////Scenario 5////////////////////////////////////////////////////////////


@Then("the user clicks on the Contact Agent option for a specific agent")
public void the_user_clicks_on_the_contact_agent_option_for_a_specific_agent() {
    // Write code here that turns the phrase above into concrete actions
	 FirstWindow=driver.getWindowHandle();
	 Set<String> s1=driver.getWindowHandles();		
     Iterator<String> i1=s1.iterator();
     while(i1.hasNext())			
     {		
         String ChildWindow=i1.next();		
         		
         if(!FirstWindow.equalsIgnoreCase(ChildWindow))			
         {    
        	 driver.switchTo().window(ChildWindow);
        	

         }
         }       
   wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"contactBtn9423225\"]"))).click();//To click on the Contact Agent Button
}

@Then("the user fill the details and submit")
public void the_user_fill_the_details_and_submit() {
    // Write code here that turns the phrase above into concrete actions
	 WebElement name = driver.findElement(By.xpath("//*[@id=\"username9423225\"]"));
     Actions actions11 = new Actions(driver);
     actions11.click(name).sendKeys("Jhon").perform();
     
     WebElement mail = driver.findElement(By.xpath("//*[@id=\"userEmail9423225\"]"));
     Actions actions12 = new Actions(driver);
     actions12.click(mail).sendKeys("Jhon@gmail.com").perform();
     
     WebElement num = driver.findElement(By.xpath("//*[@id=\"userMobile9423225\"]"));
     Actions actions13 = new Actions(driver);
     actions13.click(num).sendKeys("9618871371").perform();
     
     WebElement sub = driver.findElement(By.xpath("//*[@id=\"contactObjButton\"]"));
     Actions actions14 = new Actions(driver);
     actions14.click(sub).perform();
     
     WebElement ele=driver.findElement(By.xpath("//*[@id=\"smsWrapper\"]/div[1]/div[1]"));
     String actual=ele.getText();
     System.out.println(actual);
     String Expected="Verify your number";
     Assert.assertEquals(Expected, actual);
     driver.quit();
}



/////////////////////////////////////////////////////////////////Scenario 6/////////////////////////////////////////////////////



@When("the user clicks on Sales Enquiry under the SELL section")
public void the_user_clicks_on_sales_enquiry_under_the_sell_section() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	WebElement sell=driver.findElement(By.xpath("//*[@id='commercialIndex']/header/section[2]/div/ul/li[3]/a"));
    wait.until(ExpectedConditions.elementToBeClickable(sell));
    Actions actions0 = new Actions(driver);
    actions0.moveToElement(sell);
 	Thread.sleep(10000);
 	sell.click();
 	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"commercialIndex\"]/header/section[2]/div/ul/li[3]/div/div/div[2]/ul/li[5]/a"))).click();
 	Thread.sleep(10000);
}

@When("the user selects a letter from the alphabet to filter cities starting with that letter")
public void the_user_selects_a_letter_from_the_alphabet_to_filter_cities_starting_with_that_letter() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	 FirstWindow=driver.getWindowHandle();
	 Set<String> s1=driver.getWindowHandles();		
     Iterator<String> i1=s1.iterator();
     while(i1.hasNext())			
     {		
         String ChildWindow=i1.next();		
         		
         if(!FirstWindow.equalsIgnoreCase(ChildWindow))			
         {    
        	 driver.switchTo().window(ChildWindow);
        	

         }
         }       
   wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"allOfficeContact\"]/div/div/div[1]/a[11]"))).click();//To click on specific letter
   JavascriptExecutor js = (JavascriptExecutor) driver;
	
// WebElement divTag=driver.findElement(By.xpath("//*[@id=\"propworth\"]/div[3]/div/div[1]"));
// divTag.sendKeys(Keys.PAGE_DOWN);
 
	// Scroll the page slowly in steps
   js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath("//*[@id=\"allOfficeContact\"]/div/h2")));
  
   
}

@Then("the user should see a list of cities starting with the selected letter on the screen")
public void the_user_should_see_a_list_of_cities_starting_with_the_selected_letter_on_the_screen() {
    // Write code here that turns the phrase above into concrete actions
   WebElement ele = driver.findElement(By.xpath("//*[@id='branchOfficesTable']/div[1]/ul/li[30]/div[1]"));
	Assert.assertTrue(ele.isDisplayed());
}



///////////////////////////////////////////////////////////////////////Scenario 7/////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////Negative Scenario/////////////////////////////////////////////////////////////////////////



@When("the user clicks on Sell\\/Rent Ad package")
public void the_user_clicks_on_sell_rent_ad_package() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	WebElement sell=driver.findElement(By.xpath("//*[@id='commercialIndex']/header/section[2]/div/ul/li[3]/a"));
    wait.until(ExpectedConditions.elementToBeClickable(sell));
    Actions actions0 = new Actions(driver);
    actions0.moveToElement(sell);
 	Thread.sleep(10000);
 	sell.click();
 	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"commercialIndex\"]/header/section[2]/div/ul/li[3]/div/div/div[1]/ul/li[3]/a"))).click();
 	Thread.sleep(10000);
}

@Then("the user fills the data")
public void the_user_fills_the_data() {
    // Write code here that turns the phrase above into concrete actions
	FirstWindow=driver.getWindowHandle();
	 Set<String> s1=driver.getWindowHandles();		
    Iterator<String> i1=s1.iterator();
    while(i1.hasNext())			
    {		
        String ChildWindow=i1.next();		
        		
        if(!FirstWindow.equalsIgnoreCase(ChildWindow))			
        {    
       	 driver.switchTo().window(ChildWindow);
       	

        }
        }       
    
  //*[@id="requestInfoForm"]/div[1]/div[1]/label
    WebElement name = driver.findElement(By.xpath("//*[@id=\"requestInfoForm\"]/div[1]/div[1]/label"));
    Actions actions13 = new Actions(driver);
    actions13.click(name).sendKeys("Nick").perform();
    
    WebElement num = driver.findElement(By.xpath("//*[@id=\"requestInfoForm\"]/div[2]/div[2]/div[1]/label"));
    Actions actions14 = new Actions(driver);
    actions14.click(num).sendKeys("9618871371").perform();
    
    
}

@Then("the user clicks on Request Call Back option")
public void the_user_clicks_on_request_call_back_option() {
    // Write code here that turns the phrase above into concrete actions
	
	 WebElement button = driver.findElement(By.xpath("//*[@id=\"callBackSubmit\"]"));
	    Actions actions14 = new Actions(driver);
	    actions14.click(button).perform();
	  //*[@id="queryErr"]
	    
	    WebElement caution = driver.findElement(By.xpath("//*[@id=\"queryErr\"]"));
	    String get=caution.getText();
	    System.out.println(get);
	    
}



}
