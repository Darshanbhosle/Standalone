package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DashBoardPage {

	@FindBy(xpath="//*[text()='dashboard']")
	private WebElement Dashboard;
	
	@FindBy(xpath="//*[text()='keyboard_arrow_right']")
	private WebElement Rightarrow;
	
	@FindBy(xpath="//*[text()='keyboard_arrow_left']")
	private WebElement Leftarrow;
	
	@FindBy(xpath="//*[text()='Documents']")
	private WebElement Document;
	
	@FindBy(xpath="//*[text()='Messages']")
	private WebElement Messages;
	
	@FindBy(xpath="//*[text()='Milestones']")
	private WebElement Milestones;
	
	@FindBy(xpath="//*[text()='Customer']")
	private WebElement Customer;
	
	@FindBy(xpath="//*[text()='GlobeAssist']")
	private WebElement GlobeAssist;
	
	@FindBy(xpath="//*[text()='share']")
	private WebElement Share;
	
	@FindBy(xpath="//*[@formcontrolname='to']")
	private WebElement To;
	
	@FindBy(xpath="//*[@formcontrolname='cc']")
	private WebElement Cc;
	
	@FindBy(xpath="//*[@formcontrolname='message']")
	private WebElement Message;
	
	@FindBy(xpath="//*[@formcontrolname='close']")
	private WebElement Close;
	
	@FindBy(xpath="//*[@id='mat-select-13']")
	private WebElement Show;
	
	@FindBy(xpath="//*[@id='mat-select-14']")
	private WebElement ShowBy;
	
	@FindBy(xpath="//*[@id='mat-select-15']")
	private WebElement ShowOrderBy;
	
	
	WebDriver driver;
	WebDriverWait wait;
    public DashBoardPage(WebDriver driver) {
		this.driver = driver;
  		PageFactory.initElements(driver, this);
	    wait = new WebDriverWait(driver, Duration.ofSeconds(80));
    }
    }
