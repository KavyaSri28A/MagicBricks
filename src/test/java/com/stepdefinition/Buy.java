package com.stepdefinition;
import java.time.Duration;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

//import dev.failsafe.internal.util.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class Buy {
	WebDriver driver;
    WebDriverWait wait;
	
	
	/*@Given("the user is on the MagicBricks homepage1")
	public void the_user_is_on_the_magic_bricks_homepage1() {
	    // Write code here that turns the phrase above into concrete actions
	    driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.magicbricks.com");
        wait = new WebDriverWait(driver, Duration.ofSeconds(30)); 
	}

	@When("the user clicks on the Buy option")
	public void the_user_clicks_on_the_buy_option() throws InterruptedException {
	   
        WebElement buyOption = driver.findElement(By.id("buyheading"));
       Thread.sleep(1000);  // Wait until Buy option is clickable
        buyOption.click();
	}

	@When("the user selects the Ready-to-Move option")
	public void the_user_selects_the_ready_to_move_option() throws InterruptedException {
//		 wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.linkText("Ready to Move"))));
		Thread.sleep(1000);
	    // Write code here that turns the phrase above into concrete actions
		WebElement readyToMove = driver.findElement(By.linkText("Ready to Move"));
        Thread.sleep(3000);
        readyToMove.click();
     
   	
            
        
	}

	@When("the user selects Posted By as Owner")
	public void the_user_selects_posted_by_as_owner() throws InterruptedException {
		String MainWindow=driver.getWindowHandle();
	   	 Set<String> s1=driver.getWindowHandles();		
	        for(String i:s1) {
	        	if(!i.equals(MainWindow)) {
	        		driver.switchTo().window(i);
	        	}
	        }
	        Thread.sleep(10000);
	        WebElement postedBy = driver.findElement(By.xpath("//*[@id=\"body\"]/div[1]/div/div[2]/div[5]/div/div[1]/div"));//*[@id="body"]/div[1]/div/div[2]/div[5]/div/div[1]/div
	        Thread.sleep(10000);
//	        wait.until(ExpectedConditions.elementToBeClickable(postedBy));
	        postedBy.click();
	        WebElement owner=driver.findElement(By.xpath("//*[@id=\"body\"]/div[1]/div/div[2]/div[5]/div/div[2]/div[1]/div[2]/div[1]/label"));
	        Thread.sleep(1000);
	        owner.click();
	        
	  
	}


@When("the user selects Top localities as sarjapur roads")
public void the_user_selects_top_localities_as_sarjapur_roads() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    
	    WebElement toplocalities=driver.findElement(By.xpath("//*[@id=\"body\"]/div[1]/div/div[2]/div[1]/div/div[1]/div"));
	    Thread.sleep(1000);
	    toplocalities.click();
	    WebElement sarjapur=driver.findElement(By.xpath("//*[@id=\"body\"]/div[1]/div/div[2]/div[1]/div/div[2]/div[1]/div[2]/div[2]/label"));
	    Thread.sleep(1000);
	    sarjapur.click();
	    WebElement done=driver.findElement(By.xpath("//*[@id=\"body\"]/div[1]/div/div[2]/div[1]/div/div[2]/div[3]"));
	    Thread.sleep(5);
	    done.click();
	    
	}
	
	
	@Then("the user will be presented with properties based on the selected preferences")
	public void the_user_will_be_presented_with_properties_based_on_the_selected_preferences() {
		WebElement Propertservicepage=driver.findElement(By.xpath("//*[@id=\"body\"]/div[4]/div/div/div[1]/div[3]/h1"));
    	String actual=Propertservicepage.getText();
    	System.out.println(actual);
    	String expected="Flats for Sale in Bangalore";
      //  wait.until(ExpectedConditions.urlContains("property-services"));
      Assert.assertEquals(actual, expected);
    }
 
   
    public void close_browser1() {
        if (driver != null) {
           driver.quit();
        }
    }

    @Given("the user is on the Magicbricks homepage2")
    public void the_user_is_on_the_magic_bricks_homepage2() {
        // Write code here that turns the phrase above into concrete actions
    	 driver = new ChromeDriver();
         driver.manage().window().maximize();
         driver.get("https://www.magicbricks.com");
         wait = new WebDriverWait(driver, Duration.ofSeconds(30)); 
    }

    @When("the user selects on the Buy option")
    public void the_user_selects_on_the_buy_option() throws InterruptedException {
    	WebElement buyOption = driver.findElement(By.id("buyheading"));
       Thread.sleep(1000) ;// Wait until Buy option is clickable
        buyOption.click();
        
    }

    @When("the user selects the Localities in Bangalore")
    public void the_user_selects_the_localities_in_bangalore() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
    	
    	WebElement locality=driver.findElement(By.linkText("Localities in Bangalore"));
    	Thread.sleep(1000);
    	locality.click();
    	
    	
    }

    @When("the user selects filter price\\/sqft")
    public void the_user_selects_filter_price_sqft() throws InterruptedException {
    	String MainWindow=driver.getWindowHandle();
	   	 Set<String> s1=driver.getWindowHandles();		
	        for(String i:s1) {
	        	if(!i.equals(MainWindow)) {
	        		driver.switchTo().window(i);
	        	}
	        }
	        Thread.sleep(10000);
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("window.scrollBy(0, 500);"); 
	       
	      WebElement filter=driver.findElement(By.xpath("//*[@id=\"priceText\"]"));
	     Thread.sleep(1000);
	     filter.click();
	     Thread.sleep(1000);
	     
	     WebElement min=driver.findElement(By.xpath("//*[@id=\"budgetPerSqftMin\"]"));
	     Thread.sleep(1000);
	     min.click();
	     WebElement value1=driver.findElement(By.xpath("//*[@id=\"minRange\"]/ul/li[2]"));
	     Thread.sleep(1000);
	     value1.click();
	     WebElement max=driver.findElement(By.xpath("//*[@id=\"budgetPerSqftMax\"]"));
	     Thread.sleep(1000);
	     max.click();
	     WebElement value2=driver.findElement(By.xpath("//*[@id=\"maxRange\"]/ul/li[7]"));
	     Thread.sleep(1000);
	     value2.click();
	  
	    WebElement done=driver.findElement(By.xpath("//*[@id=\"budgetLi\"]/div[2]/div[4]/a"));
	    Thread.sleep(1000);
	    done.click();
	    
	    
	     
	        
    }

    @Then("the user should see the localities in Bangalore filtered by the selected price range")
    public void the_user_should_see_the_localities_in_bangalore_filtered_by_the_selected_price_range() 
    {
    	WebElement Propertservicepage=driver.findElement(By.xpath("//*[@id=\"autoLoadLocalities\"]/div[1]/div[1]/div[4]/div[1]"));
    	String actual=Propertservicepage.getText();
    	System.out.println(actual);
    	String expected="175 Projects available";
        Assert.assertEquals(actual, expected);
    }
 
   
    public void close_browser() {
        if (driver != null) {
           driver.quit();
        
    }


}
}*/
    @Given("the user is on the MagicBricks homepage3")
    public void the_user_is_on_the_magic_bricks_homepage3() {
        // Write code here that turns the phrase above into concrete actions
    	driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.magicbricks.com");
        wait = new WebDriverWait(driver, Duration.ofSeconds(30)); 
    }

    @When("the user selects on Buy option2")
    public void the_user_selects_on_buy_option2() throws InterruptedException {
    	  WebElement buyOption = driver.findElement(By.id("buyheading"));
          Thread.sleep(1000);  // Wait until Buy option is clickable
           buyOption.click();
    }
       
    

    @When("the user selects Tips and Guide")
    public void the_user_selects_tips_and_guide() throws InterruptedException {
    	WebElement tipsandguide = driver.findElement(By.linkText("Tips and Guides"));
    	Thread.sleep(1000);
    	tipsandguide.click();
    	
    	
    }

    @When("the user Selects Localities")
    public void the_user_selects_localities() throws InterruptedException 
    {
    	String MainWindow=driver.getWindowHandle();
	   	 Set<String> s1=driver.getWindowHandles();		
	        for(String i:s1) {
	        	if(!i.equals(MainWindow)) {
	        		driver.switchTo().window(i);
	        	}
	        }
    	Thread.sleep(1000);
    	 JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("window.scrollBy(0, 500);"); 
	        Thread.sleep(1000);
	     WebElement local=driver.findElement(By.xpath("//*[@id=\"compareSectionWrapper\"]/div/div[2]/div[1]/label[1]"));
	     Thread.sleep(1000);
	     local.click();
	     
	        
    
    	
    }
    

    @When("the user Enter Locality1 and Locality2 and click compare")
    public void the_user_enter_locality1_and_locality2_and_click_compare() throws InterruptedException {
    	WebElement comapare1=driver.findElement(By.xpath("//*[@id=\"locOne\"]"));
    	Thread.sleep(1000);
    	comapare1.click();
    	Thread.sleep(1000);
    	comapare1.sendKeys("Medavakkam, Chennai");
    	comapare1.sendKeys(Keys.ENTER);
    	WebElement compare2=driver.findElement(By.xpath("//*[@id=\"locTwo\"]"));
    	Thread.sleep(1000);
    	compare2.click();
    	Thread.sleep(1000);
    	compare2.sendKeys("Sarjapur Road, Bangalore");
    	compare2.sendKeys(Keys.ENTER);
    	WebElement compbutton=driver.findElement(By.xpath("//*[@id=\"localities\"]/div/div[4]/input"));
    	Thread.sleep(1000);
    	compbutton.click();
    	Thread.sleep(1000);
    	String MainWindow=driver.getWindowHandle();
	   	 Set<String> s1=driver.getWindowHandles();		
	        for(String i:s1) {
	        	if(!i.equals(MainWindow)) {
	        		driver.switchTo().window(i);
	        	}
	        }
    	JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 2000);"); 
    	
    	
    	
    	//WebElement local1=driver.findElement(By.xpath("//*[@id=\"keyword_suggestOne\"]/div[14]/a"));
    	//Thread.sleep(1000);
    	//local1.click();
    	//WebElement local2=driver.findElement(By.xpath("//*[@id=\"keyword_suggestTwo\"]/div[8]/a"));
    	//Thread.sleep(1000);
    	//local2.click();
      
    	
    }

    @Then("the user should see localities and projects comaparison")
    public void the_user_should_see_localities_and_projects_comaparison() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}

    