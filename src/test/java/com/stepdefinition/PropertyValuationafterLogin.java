package com.stepdefinition;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class PropertyValuationafterLogin {

    WebDriver driver;
    WebDriverWait wait;
    

@Given("that user is on the Magicbricks home page")
public void that_user_is_on_the_Magicbricks_home_page() throws InterruptedException {
	    	ChromeOptions options = new ChromeOptions();
	        ChromeOptions options1 = new ChromeOptions();
	        driver = new ChromeDriver(options1);
	        Thread.sleep(10000);
	        options.addArguments("--disable-notifications");
	 //driver = new ChromeDriver(options);
	        WebDriverManager.chromedriver().setup();
	       // ChromeOptions options1 = new ChromeOptions();
	      //  driver = new ChromeDriver(options1);
	        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        driver.get("https://www.magicbricks.com/?reqFrom=OA");
	    
}

@When("the User clicks on SELL option")
public void the_user_clicks_on_sell_option() {
    // Write code here that turns the phrase above into concrete actions
  //  throw new io.cucumber.java.PendingException();
    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='commercialIndex']/header/section[2]/div/ul/li[3]/a"))).click();

}
@When(" the user click on property valuation option")
public void the_user_click_on_property_valuation_option() {
	 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Property Valuation']"))).click();
	 
	 String MainWindow=driver.getWindowHandle();
	 Set<String> s1=driver.getWindowHandles();		
     Iterator<String> i1=s1.iterator();
     while(i1.hasNext())			
     {		
         String ChildWindow=i1.next();		
         		
         if(!MainWindow.equalsIgnoreCase(ChildWindow))			
         {    
        	 driver.switchTo().window(ChildWindow);
         
	 //driver.get("https://www.magicbricks.com/propertyservices/property-valuation");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		// Scroll the page slowly in steps
		WebElement  clickOn= driver.findElement(By.xpath("//*[@id=\"pkgpriceSec\"]/a[2]"));
		js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath("//*[@id=\"propValpkg\"]/div/div[2]")));
	      
		//js.executeScript("arguments[0].scrollIntoView({ behavior: 'smooth', block: 'center' });", clickOn);

		clickOn.click();
		}
	    
     }
}


@Then("tThe user is navigated to Propert Services page")
public void t_the_user_is_navigated_to_propert_services_page() {
    // Write code here that turns the phrase above into concrete actions
  //  throw new io.cucumber.java.PendingException();
}

@Then("the user clicks on Place Order button")
public void the_user_clicks_on_place_order_button() {
    // Write code here that turns the phrase above into concrete actions
   // throw new io.cucumber.java.PendingException();
	 
}
public void close_browser() {
	        if (driver != null) {
	           driver.quit();
	        }
	    }
}





