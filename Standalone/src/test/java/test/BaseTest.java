package test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.CancelledOrderPage;
import pages.CompletedOrderPage;
import pages.HomePage;
import pages.MySearchPage;
import pages.RateResultPage;
import pages.RateSummaryPage;
import pages.SignInPage;

public class BaseTest {
	
   public SignInPage SI;
   public HomePage HP;
   public MySearchPage MS;
   public RateResultPage RR;
   public RateSummaryPage RS;
   public CompletedOrderPage CO;
   public CancelledOrderPage CAP;
	public static WebDriver driver;
	
	@BeforeSuite
	public void initBrowser()
	{
        WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--disable-notifications");
		
		options.addArguments("--start-maximized");
	
        driver = new ChromeDriver(options);
		
        driver.get("http://standaloneency.s3-website.us-east-2.amazonaws.com/");
		}
	@BeforeClass
	public void createObject() throws IOException 
	{
	  SI = new SignInPage(driver);
	  HP = new HomePage(driver);
	  MS = new MySearchPage(driver);
	  RR = new RateResultPage(driver);
	  RS = new RateSummaryPage(driver);
	  CO = new CompletedOrderPage(driver);
	 CAP = new CancelledOrderPage(driver);
	}
	
}
