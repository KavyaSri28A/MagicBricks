package com.pages;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.parameters.ExcelReader;

public class RentPages {
	static WebDriver driver;
	static WebDriverWait wait;
	static Actions mouse;
	static Properties prop;
	public RentPages(WebDriver driver) {
		//super(driver);
		this.driver = driver;  // Set the WebDriver instance from the parameter
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		ChromeOptions options = new ChromeOptions();
	    options.addArguments("--disable-notifications");
       // PageFactory.initElements(driver, this);
	}
	public static void homepage() throws IOException {
		//ChromeOptions options = new ChromeOptions();
	    //options.addArguments("--disable-notifications");	    
//      driver = new ChromeDriver(options);
//      driver.manage().window().maximize();
//      driver.get("https://www.magicbricks.com");
         //BaseSteps.initializewebDriver();
		File f=new File(System.getProperty("user.dir")+"\\src\\test\\java\\com\\parameters\\home.properties");
        FileInputStream objfile=new FileInputStream(f);
        prop=new Properties();
        prop.load(objfile);
        String url_page=prop.getProperty("URL");
        driver.get(url_page);
        driver.manage().window().maximize();
        //wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        		
	}
	public static void wh1sc1() throws InterruptedException {
		Thread.sleep(1000);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='commercialIndex']/header/section[1]/div/div[1]/div[2]/a"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"commercialIndex\"]/header/section[1]/div/div[1]/div[2]/div/div[1]/div[3]/ul/li[2]/a"))).click();
        Thread.sleep(1000);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"tabRENT\"]"))).click(); //Rent
		Thread.sleep(1000);
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
	
	public static void wh2sc1() {
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"searchFormHolderSection\"]/section/div/div[1]/div[3]/div[4]"))).click(); //Search

	}
	
	public static void thsc1() throws IOException {
		File f=new File(System.getProperty("user.dir")+"\\src\\test\\java\\com\\parameters\\home.properties");
        FileInputStream objfile=new FileInputStream(f);
        prop=new Properties();
        prop.load(objfile);
        String output1=prop.getProperty("t1");
		System.out.println(output1);
		//System.out.println("It displays a list of 1BHK flats in Bangalore.");
	}
	
	public static void wh1sc2() throws InterruptedException {
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
	
	public static void wh2sc2() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"searchFormHolderSection\"]/section/div/div[1]/div[3]/div[4]"))).click(); //Search
        Thread.sleep(10000);
	}
	
	public static void thsc2() throws IOException {
		File f=new File(System.getProperty("user.dir")+"\\src\\test\\java\\com\\parameters\\home.properties");
        FileInputStream objfile=new FileInputStream(f);
        prop=new Properties();
        prop.load(objfile);
        String output=prop.getProperty("t1");
		System.out.println(output);

	}
	
	public static void wh1sc4() throws InterruptedException, IOException {
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='commercialIndex']/header/section[1]/div/div[1]/div[2]/a"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"commercialIndex\"]/header/section[1]/div/div[1]/div[2]/div/div[1]/div[3]/ul/li[2]/a"))).click();
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"tabRENT\"]"))).click(); //Rent
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"keyword_autoSuggestSelectedDiv\"]/div/div[1]"))).click(); //Location
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"keyword_autoSuggestSelectedDiv\"]/div/div[2]"))).click(); //clear
		Thread.sleep(1000);
		
		WebElement element= driver.findElement(By.xpath("//*[@id=\"keyword\"]"));
		Actions action =new Actions(driver);
		action.click(element).sendKeys(ExcelReader.getStrValue()).perform();

	}
	
	public static void wh2sc4() {
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"searchFormHolderSection\"]/section/div/div[1]/div[3]/div[4]"))).click(); //Search

	}
	
	public static void thsc4() {
		String Expected="https://www.magicbricks.com/property-for-sale-rent-in-Bangalore/residential-real-estate-Bangalore?category=R";
		String actual=driver.getCurrentUrl();
		Assert.assertEquals(Expected, actual,"No not same");
		System.out.println("It shows enter a valid location.");
	}
	
	public static void whsc5() throws InterruptedException {
		Thread.sleep(1000);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"commercialIndex\"]/header/section[1]/div/div[1]/div[2]/a"))).click(); //Location
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"commercialIndex\"]/header/section[1]/div/div[1]/div[2]/div/div[1]/div[3]/ul/li[6]/a"))).click(); //Hyderabad
        Thread.sleep(1000);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"rentheading\"]"))).click(); //Rent Heading
        Thread.sleep(1000);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"commercialIndex\"]/header/section[2]/div/ul/li[2]/div/div/div[1]/ul/li[5]/a"))).click(); //Immediately Available

	}
	
	public static void thsc5() throws IOException {
		File f=new File(System.getProperty("user.dir")+"\\src\\test\\java\\com\\parameters\\home.properties");
        FileInputStream objfile=new FileInputStream(f);
        prop=new Properties();
        prop.load(objfile);
        String output3=prop.getProperty("t1");
		System.out.println(output3);

	    //System.out.println("It shows rental properties in Hyderabad that are immediately available.");

	}
	
	public static void wh1sc6() throws InterruptedException {
		Thread.sleep(1000);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"commercialIndex\"]/header/section[1]/div/div[1]/div[2]/a"))).click(); //Location
        Thread.sleep(1000);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"commercialIndex\"]/header/section[1]/div/div[1]/div[2]/div/div[1]/div[3]/ul/li[11]/a"))).click(); //Mumbai
        Thread.sleep(1000);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"tabRENT\"]"))).click(); //Rent
        wait.until(ExpectedConditions.elementToBeClickable(By.id("propType_rent"))).click(); //PropType
        Thread.sleep(1000);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"10002_10003_10021_10022\"]"))).click(); //Flat
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"10001_10017\"]"))).click(); //House/Villa
        Thread.sleep(1000);
        //)
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"10002_10003_10021_10022\"]"))).click(); //Flat
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"11704\"]"))).click(); //5BHK
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"searchFormHolderSection\"]/section/div/div[1]/div[3]/div[3]/div[1]"))).click(); //Budget
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"budgetMax\"]"))).click(); //Maximum
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"maxBhkIndex_0\"]"))).click(); //5,000

	}
	
	public static void wh2sc6() throws InterruptedException {
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"searchFormHolderSection\"]/section/div/div[1]/div[3]/div[4]"))).click(); //Search
        Thread.sleep(10000);
        
	}
	
	public static void thsc6() {
	    System.out.println("It displays a list of Residential Flats for rent in Mumbai.");

	}
	
	public static void whsc3() throws InterruptedException {
		Thread.sleep(1000);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"commercialIndex\"]/header/section[1]/div/div[1]/div[2]/a"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"commercialIndex\"]/header/section[1]/div/div[1]/div[2]/div/div[1]/div[3]/ul/li[14]/a"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"rentheading\"]"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"commercialIndex\"]/header/section[2]/div/ul/li[2]/div/div/div[4]/ul/li[2]/a"))).click();
        String MainWindow = driver.getWindowHandle();
        
		Set<String> windowhandles = driver.getWindowHandles();
		for (String handle : windowhandles) {
			if (!handle.equals(MainWindow)) {
				driver.switchTo().window(handle);
			}
		}
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"buyVsRentCalcSection\"]/div/div[1]/div[2]/div[1]/div[1]/ul/li[3]"))).click();
       
	}
	
	public static void thsc3() {
		WebElement text=driver.findElement(By.xpath("//*[@id=\"bvrGraph\"]/h2"));
		Assert.assertTrue(text.isDisplayed(),"No we are in the wrong Page");
		System.out.println("We Are in the correct page");
	}
	
	public static void whsc() throws InterruptedException {
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='commercialIndex']/header/section[1]/div/div[1]/div[2]/a"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"commercialIndex\"]/header/section[1]/div/div[1]/div[2]/div/div[1]/div[3]/ul/li[2]/a"))).click();
        Thread.sleep(1000);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"tabRENT\"]"))).click();
        Thread.sleep(1000);

	}
	
	
	
	public void screenShotMethod(String fname) {
	    File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
 
	    // Specify the absolute path for the destination folder directly
	    String destinationPath = "C:\\Users\\GUBINDU\\eclipse-workspace\\MagicBricks\\ScreenShots\\" + fname + ".png";
	    File destinationFile = new File(destinationPath);
 
	    try {
	        // Copy the screenshot to the specified location
	        FileUtils.copyFile(screenshotFile, destinationFile);
	        System.out.println("Screenshot saved: " + destinationFile.getAbsolutePath());
	    } catch (IOException e) {
	        System.out.println("Error while saving screenshot: " + e.getMessage());
	    }
	}
	
	public static void wh2sc(String locations) throws InterruptedException {
	    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"keyword_autoSuggestSelectedDiv\"]/div/div[1]"))).click();
	    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"keyword_autoSuggestSelectedDiv\"]/div/div[2]"))).click();
	    Thread.sleep(1000);
	    WebElement searchBox = wait.until(ExpectedConditions.elementToBeClickable(By.id("keyword_autoSuggestSelectedDiv")));
	    searchBox.click();
	    Actions actions = new Actions(driver);
	    actions.moveToElement(searchBox).click().sendKeys(locations).build().perform();
	    wait.until(ExpectedConditions.elementToBeClickable(By.className("mb-search__btn"))).click(); // Click the search button

	}
	public static void thsc() {
		WebElement text=driver.findElement(By.xpath("//*[@id=\"home_page_msg\"]/span"));
		Assert.assertTrue(text.isDisplayed(),"No we are in the wrong Page");
		System.out.println("Enter a valid location or project");
	}
}