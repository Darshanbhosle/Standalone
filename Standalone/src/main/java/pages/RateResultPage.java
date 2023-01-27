package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RateResultPage {
	
	@FindBy(xpath="(//span[text()=' Search '])[1]")
	private WebElement Search;
	
	@FindBy(xpath="//*[text()='DOOR TO CFS']")
    private WebElement DOORTOCFS;
    
    @FindBy(xpath="//*[text()='CFS TO DOOR ']")
    private WebElement CFSTODOOR;
    
    @FindBy(xpath="//*[text()='DOOR TO DOOR']")
    private WebElement DOORTODOOR;
    
    @FindBy(xpath="//*[@ng-reflect-name='from']")
	private WebElement OriginCFS;
	
	@FindBy(xpath="//*[@ng-reflect-name='to']")
	private WebElement DestinationCFS;
	
	@FindBy(xpath="//*[text()='UOM']")
    private WebElement UOM;
    
    @FindBy(xpath="//*[text()='apps']")
    private WebElement VolumeCalculator;
    
    @FindBy(xpath="//*[@aria-label='Open calendar']")
    private WebElement Calender;
    
    @FindBy(xpath="//*[text()='30']")
	private WebElement Daterandom;
    
    @FindBy(xpath="//*[@ng-reflect-name='fromZipcode']")
    private WebElement zipforAll;
    
    @FindBy(xpath="//*[text()='2233']")
    private WebElement pickupzipcodeplace;
    
	@FindBy(xpath="//*[text()='Aarhus, Denmark']")
	private WebElement OriginCFSplace;
	
	@FindBy(xpath="//*[text()='Atlanta, USA']")
	private WebElement DestinationCFSplace;
	
	@FindBy(xpath="//*[@aria-label='Select Origin Country']")
	private WebElement SelectOriginCountry;
	    
	@FindBy(xpath="//*[@ng-reflect-value='Australia']")
    private WebElement SelectOriginCountryplace;
    
	@FindBy(xpath="//*[text()='Cancel']")
	private WebElement Cancel;
	
	@FindBy(xpath="//*[text()='Sydney, Australia']")
	private WebElement CfsToDoorOrigin;
	
	@FindBy(xpath="(//*[@class='h4 vessel'])[1]")
	private WebElement VesselTracker;
	
	@FindBy(xpath="(//*[@title='Zoom in'])")
	private WebElement zoom_in;
	
	@FindBy(xpath="(//*[@title='Zoom out'])")
	private WebElement zoom_out;
	
	@FindBy(xpath="(//*[@title='close'])")
	private WebElement closeVesseltracker;
	
	@FindBy(xpath="(//*[text()='close'])[6]")
	private WebElement CloseRateBreakDown;
	
	@FindBy(xpath="(//*[text()=' keyboard_arrow_down'])[1]")
	private WebElement RateBreakdown;
	
	@FindBy(xpath="(//*[text()='keyboard_arrow_down'])[2]")
	private WebElement USD;
	
	@FindBy(xpath="//*[text()='EUR - (Euro)']")
	private WebElement USDplace;
	
	@FindBy(xpath="(//*[@class='mat-checkbox-inner-container'])[1]")
	private WebElement DirectCheckBox;
	
	@FindBy(xpath="(//*[@class='mat-checkbox-inner-container'])[1]")
	private WebElement ACLUCheckBox;
	
	@FindBy(xpath="(//*[text()='SELECT'])[1]")
	private WebElement Select;
	
	
;	
	WebDriver driver;
	WebDriverWait wait;
	
	public RateResultPage(WebDriver driver) {
		this.driver = driver;
  		PageFactory.initElements(driver, this);
		 wait = new WebDriverWait(driver, Duration.ofSeconds(80));
}
	public void search() {
		wait.until(ExpectedConditions.elementToBeClickable(Search));
		Search.click();
	}

	public void cfs2cfs() {
		OriginCFS.click();
		wait.until(ExpectedConditions.elementToBeClickable(OriginCFSplace));
		OriginCFSplace.click();
		wait.until(ExpectedConditions.elementToBeClickable(DestinationCFS));
		DestinationCFS.click();
		wait.until(ExpectedConditions.elementToBeClickable(DestinationCFSplace));
		DestinationCFSplace.click();
		Calender.click();
		wait.until(ExpectedConditions.elementToBeClickable(Daterandom));
		Daterandom.click();
}
	
	public void door2cfs() {
		DOORTOCFS.click();
		wait.until(ExpectedConditions.elementToBeClickable(SelectOriginCountry));
		SelectOriginCountry.click();
		wait.until(ExpectedConditions.elementToBeClickable(SelectOriginCountryplace));
		SelectOriginCountryplace.click();
		wait.until(ExpectedConditions.elementToBeClickable(zipforAll));
		zipforAll.sendKeys("2233");
		wait.until(ExpectedConditions.elementToBeClickable(pickupzipcodeplace));
		pickupzipcodeplace.click();
		wait.until(ExpectedConditions.elementToBeClickable(OriginCFS));
		OriginCFS.click();
		wait.until(ExpectedConditions.elementToBeClickable(OriginCFSplace));
		OriginCFSplace.click();
		wait.until(ExpectedConditions.elementToBeClickable(DestinationCFS));
		DestinationCFS.click();
		wait.until(ExpectedConditions.elementToBeClickable(DestinationCFSplace));
		DestinationCFSplace.click();
		Calender.click();
		Daterandom.click();
		UOM.click();
		VolumeCalculator.click();
		Cancel.click();
		
}
	public void cfs2door() {
		CFSTODOOR.click();
		wait.until(ExpectedConditions.elementToBeClickable(OriginCFS));
		OriginCFS.click();
		wait.until(ExpectedConditions.elementToBeClickable(CfsToDoorOrigin));
		CfsToDoorOrigin.click();
		wait.until(ExpectedConditions.elementToBeClickable(DestinationCFS));
		DestinationCFS.click();
		wait.until(ExpectedConditions.elementToBeClickable(DestinationCFSplace));
		DestinationCFSplace.click();
		wait.until(ExpectedConditions.elementToBeClickable(zipforAll));
		zipforAll.click();
		wait.until(ExpectedConditions.elementToBeClickable(pickupzipcodeplace));
		pickupzipcodeplace.click();
		Calender.click();
		Daterandom.click();
		UOM.click();
		VolumeCalculator.click();
		Cancel.click();
}
	public void door2door() {
		DOORTODOOR.click();
		wait.until(ExpectedConditions.elementToBeClickable(SelectOriginCountry));
		SelectOriginCountry.click();
		wait.until(ExpectedConditions.elementToBeClickable(SelectOriginCountryplace));
		SelectOriginCountryplace.click();
		wait.until(ExpectedConditions.elementToBeClickable(zipforAll));
		zipforAll.click();
		wait.until(ExpectedConditions.elementToBeClickable(pickupzipcodeplace));
		pickupzipcodeplace.click();
		wait.until(ExpectedConditions.elementToBeClickable(OriginCFS));
		OriginCFS.click();
		wait.until(ExpectedConditions.elementToBeClickable(OriginCFSplace));
		OriginCFSplace.click();
		wait.until(ExpectedConditions.elementToBeClickable(DestinationCFS));
		DestinationCFS.click();
		wait.until(ExpectedConditions.elementToBeClickable(DestinationCFSplace));
		DestinationCFSplace.click();
		Calender.click();
		Daterandom.click();
		UOM.click();
		VolumeCalculator.click();
		Cancel.click();
}
   public void vesseltracker() {
	   VesselTracker.click();
	   wait.until(ExpectedConditions.elementToBeClickable(zoom_in));
	   zoom_in.click();
	   wait.until(ExpectedConditions.elementToBeClickable(zoom_out));
	   zoom_out.click();
	   closeVesseltracker.click();
}
   public void rateBreakdown() {
	  RateBreakdown.click();
	   
}
  public void USDdropdown() {
	 wait.until(ExpectedConditions.elementToBeClickable(USD));
	 USD.click();
	 USDplace.click();
	 CloseRateBreakDown.click();
}
  public void directcheckbox() {
	  DirectCheckBox.click();
}
  public void ACLUcheckbox() {
	  ACLUCheckBox.click();
}
public void select() {
	wait.until(ExpectedConditions.visibilityOf(Select));
}
  
  
  
  
  




}