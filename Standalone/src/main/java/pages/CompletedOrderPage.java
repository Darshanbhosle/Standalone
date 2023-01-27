package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CompletedOrderPage {
	
	@FindBy(xpath="(//*[@width='50px'])[2]")
	private WebElement Completedorder ;
	
	@FindBy(xpath="//*[text()='Current Month']")
	private WebElement CurrentMonth;
	
	@FindBy(xpath="//*[text()='Last Month']")
	private WebElement LastMonth;
	
	@FindBy(xpath="//*[text()='Last 2 Months']")
	private WebElement Last2Month;
	
	
	@FindBy(xpath="//*[text()=' View Documents '][1]")
	private WebElement ViewDocument;
	
	@FindBy(xpath="(//*[text()='close'])[2]")
	private WebElement ClosePopup;
	
	@FindBy(xpath="(//*[text()='All'])")
	private WebElement All ;
	
	@FindBy(xpath="(//*[@class='mat-paginator-icon'])[1]")
	private WebElement LeftArrow;
	
	@FindBy(xpath="(//*[@class='mat-paginator-icon'])[2]")
	private WebElement RightArrow;
	
	@FindBy(xpath="(//*[@role='listbox'])")
	private WebElement ItemsPerPage;
	
	@FindBy(xpath="(//*[text()='6'])")
	private WebElement Six;
	

	
	WebDriver driver;
	WebDriverWait wait;
	
	public CompletedOrderPage(WebDriver driver) {
		this.driver = driver;
  		PageFactory.initElements(driver, this);
		 wait = new WebDriverWait(driver, Duration.ofSeconds(80));
}
	public void itemsperpage() {
		wait.until(ExpectedConditions.elementToBeClickable(ItemsPerPage));
		ItemsPerPage.click();
		Six.click();
}
    public void Click_On_ViewDocument() {
       wait.until(ExpectedConditions.elementToBeClickable(ViewDocument));
	   ViewDocument.click();
	   wait.until(ExpectedConditions.elementToBeClickable(ClosePopup));
	   ClosePopup.click();
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
	public void all() {
		All.click();
}
    public void rightarrow() {
    	RightArrow.click();
}
    public void leftarrow() {
    	LeftArrow.click();
}
    public void completedOrder() {
    	Completedorder.click();
    }







}
