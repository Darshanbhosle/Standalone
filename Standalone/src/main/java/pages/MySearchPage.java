package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MySearchPage {
	
	@FindBy(xpath="//*[@class='mat-select-value']")
	private WebElement ShowBy;
	
	@FindBy(xpath="(//span[text()='LCL '])")
	private WebElement LCL;
	
	@FindBy(xpath="//*[text()='FCL ']")
	private WebElement FCL;
	
	@FindBy(xpath="//*[@placeholder='Enter a keyword...']")
	private WebElement Search;
	
	@FindBy(xpath="(//div[@class='mat-select-arrow'])[2]")
	private WebElement ItemsPerPage;
	
	@FindBy(xpath="(//*[text()='5'])[1]")
	private WebElement Five;
	
	@FindBy(xpath="//*[text()='10']")
	private WebElement Ten;
	
	@FindBy(xpath="//*[text()='25']")
	private WebElement TwentyFive;
	
	@FindBy(xpath="//*[text()='100']")
	private WebElement Hundered;
	
	@FindBy(xpath="(//*[@class='mat-paginator-icon'])[1]")
	private WebElement LeftArrow;
	
	@FindBy(xpath="(//*[@class='mat-paginator-icon'])[2]")
	private WebElement RightArrow;
	
	@FindBy(xpath="//*[text()='Current Month']")
	private WebElement CurrentMonth;
	
	@FindBy(xpath="//*[text()='Last Month']")
	private WebElement LastMonth;
	
	@FindBy(xpath="//*[@aria-posinset='3']")
	private WebElement Last2Month;
	
	@FindBy(xpath="(//*[text()=' Search '])[1]")
	private WebElement SearchLcl;
	
	@FindBy(xpath="(//*[text()='search'])")
	private WebElement MySearch;
	
	
	     WebDriver driver;
		 WebDriverWait wait;
		public MySearchPage(WebDriver driver) {
			this.driver = driver;
	  		PageFactory.initElements(driver, this);
		    wait = new WebDriverWait(driver, Duration.ofSeconds(80));
	}
		
		
		public void showby() throws InterruptedException {
			wait.until(ExpectedConditions.elementToBeClickable(ShowBy));
			ShowBy.click();
			Thread.sleep(1000);
		}
		public void lcl() throws InterruptedException {
			Thread.sleep(1000);
			wait.until(ExpectedConditions.elementToBeClickable(LCL));
			LCL.click();
		}
		public void search() {
			wait.until(ExpectedConditions.elementToBeClickable(Search));
			Search.sendKeys("a");
		}
		
		public void itemsperpage() {
			wait.until(ExpectedConditions.elementToBeClickable(ItemsPerPage));
			ItemsPerPage.click();
		}
		public void dropdown_element_of_itemsperpage() {
			
	    JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("(//*[text()='5'])[1]")));
			  
			wait.until(ExpectedConditions.elementToBeClickable(Five));
			Five.click();
			wait.until(ExpectedConditions.elementToBeClickable(ItemsPerPage));
			ItemsPerPage.click();
			wait.until(ExpectedConditions.elementToBeClickable(Ten));
			Ten.click();
			wait.until(ExpectedConditions.elementToBeClickable(ItemsPerPage));
			ItemsPerPage.click();
			wait.until(ExpectedConditions.elementToBeClickable(TwentyFive));
			TwentyFive.click();
			wait.until(ExpectedConditions.elementToBeClickable(ItemsPerPage));
			ItemsPerPage.click();
			wait.until(ExpectedConditions.elementToBeClickable(Hundered));
			Hundered.click();
		}
		
		public void click_on_lcl_search() {
			wait.until(ExpectedConditions.elementToBeClickable(LCL));
			LCL.click();
		}
		
		public void lastmonth() {
		    LastMonth.click();
		}

		public void last2month() {
		    Last2Month.click();
		}
		public void currentmonth() {
			CurrentMonth.click();
		}
		public void mysearch() {
			wait.until(ExpectedConditions.elementToBeClickable(MySearch));
			MySearch.click();
		}
		public void searchlcl() {
			wait.until(ExpectedConditions.elementToBeClickable(SearchLcl));
			SearchLcl.click();
		  }
		  
}
