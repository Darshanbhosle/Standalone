package pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	@FindBy(xpath="(//*[@ng-reflect-ng-class='[object Object]'])[1]")
	private WebElement AboutUS;
	
	@FindBy(xpath="//*[@aria-posinset='1']")
	private WebElement Ocean_LCL;
	
	@FindBy(xpath="//*[@aria-posinset='2']")
	private WebElement Ocean_FCL;
	
	@FindBy(xpath="//*[@aria-posinset='3']")
	private WebElement Air;
	
	@FindBy(xpath="//*[@aria-posinset='4']")
	private WebElement Rail;
	
	@FindBy(xpath="//*[@ng-reflect-name='from']")
	private WebElement OriginCFS;
	
	@FindBy(xpath="//*[@ng-reflect-name='to']")
	private WebElement DestinationCFS;
	
	@FindBy(xpath="//*[text()='Aarhus, Denmark']")
	private WebElement OriginCFSplace;
	
	@FindBy(xpath="//*[text()='Atlanta, USA']")
	private WebElement DestinationCFSplace;
	
    @FindBy(xpath="//*[text()='30']")
	private WebElement Daterandom;
    
    @FindBy(xpath="//*[@aria-label='Open calendar']")
    private WebElement Calender;
    
    @FindBy(xpath="//*[text()='UOM']")
    private WebElement UOM;
    
    @FindBy(xpath="//*[text()='apps']")
    private WebElement VolumeCalculator;
    
    @FindBy(xpath="//*[text()='DOOR TO CFS ']")
    private WebElement DOORTOCFS;
    
    @FindBy(xpath="//*[text()='CFS TO DOOR ']")
    private WebElement CFSTODOOR;
    
    @FindBy(xpath="//*[text()='DOOR TO DOOR ']")
    private WebElement DOORTODOOR;
    
    @FindBy(xpath="//*[@aria-label='Select Origin Country']")
    private WebElement SelectOriginCountry;
    
    @FindBy(xpath="//*[@ng-reflect-value='Australia']")
    private WebElement SelectOriginCountryplace;
    
    @FindBy(xpath="//*[@ng-reflect-name='fromZipcode']")
    private WebElement zipforAll;
    
    @FindBy(xpath="//*[text()='2233']")
    private WebElement pickupzipcodeplace;
    
    @FindBy(xpath="//*[text()='AUBRI']")
    private WebElement OriginCFSPlaceforD2C;
    
    @FindBy(xpath="(//*[text()='close'])[2]")
    private WebElement CloseAboutUs;
    
    @FindBy(xpath="//*[@class='chat']")
    private WebElement ChatBot;
    
    @FindBy(xpath="//*[text()='Drag & Drop files']")
    private WebElement DragnDrop;
    
    @FindBy(xpath="//*[text()='PORT TO PORT ']")
    private WebElement PortToPort;
    
    @FindBy(xpath="//*[text()='DOOR TO PORT ']")
    private WebElement DoorToPort;
    
    @FindBy(xpath="//*[text()='PORT TO DOOR ']")
    private WebElement PortToDoor;
    
    @FindBy(xpath="//*[@formcontrolname='from']")
    private WebElement From;
    
    @FindBy(xpath="//*[@formcontrolname='to']")
    private WebElement To;
    
    @FindBy(xpath="//*[text()='Aalesund, 15, Norway']")
    private WebElement FromPlace;
    
    @FindBy(xpath="//*[text()='Baltimore, MD, United States']")
    private WebElement ToPlace;
    
	@FindBy(xpath="//*[@id='mat-input-34']")
	private WebElement CargoDeliveryZipCode;
    
	@FindBy(xpath="//*[text()='20001']")
	private WebElement CargoDeliveryZipCodePlace;
    
	@FindBy(xpath="(//*[text()='My Searches '])")
	private WebElement MySearch;
	
	@FindBy(xpath="(//*[text()='Dashboard '])")
	private WebElement DashBoard;
	
	@FindBy(xpath="//*[text()='Cancel']")
	private WebElement Cancel;
	
	@FindBy(xpath="//*[text()='Sydney, Australia']")
	private WebElement CfsToDoorOrigin;
	
	@FindBy(xpath="//*[@aria-label='Delivery zip code']")
	private WebElement DeliveryZipCode;
	
	@FindBy(xpath="//*[text()='00501']")
	private WebElement DeliveryZipCodePlace;
	
    WebDriver driver;
	WebDriverWait wait;
	public HomePage(WebDriver driver) {
		this.driver = driver;
  		PageFactory.initElements(driver, this);
		 wait = new WebDriverWait(driver, Duration.ofSeconds(80));
}
	
	public void aboutus() {
		
		//click on aboutus on homepage
		AboutUS.click();
wait.until(ExpectedConditions.elementToBeClickable(CloseAboutUs));
		CloseAboutUs.click();
		
}
	
	public void chatbot() throws AWTException {
		Robot rb = new Robot();
		StringSelection ss= new StringSelection("C:\\Users\\joela\\Pictures\\Field is required overlapps with pick and delivery zip code.jpg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
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
		wait.until(ExpectedConditions.elementToBeClickable(DeliveryZipCode));
		DeliveryZipCode.click();
		wait.until(ExpectedConditions.elementToBeClickable(DeliveryZipCodePlace));
		DeliveryZipCodePlace.click();
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
		zipforAll.sendKeys("2233");
		wait.until(ExpectedConditions.elementToBeClickable(pickupzipcodeplace));
		pickupzipcodeplace.click();;
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
	
	public void port2port(){
	   Ocean_FCL.click();
	   wait.until(ExpectedConditions.elementToBeClickable(From));
	   From.click();
	   wait.until(ExpectedConditions.elementToBeClickable(FromPlace));
	   FromPlace.click();
	   wait.until(ExpectedConditions.elementToBeClickable(To));
	   To.click();
	   wait.until(ExpectedConditions.elementToBeClickable(ToPlace));
}
	
	public void port2door() {
		PortToDoor.click();
		CargoDeliveryZipCode.sendKeys("20001");
		wait.until(ExpectedConditions.elementToBeClickable(CargoDeliveryZipCodePlace));
		CargoDeliveryZipCodePlace.click();
	}
	
	public void mysearch() {
		wait.until(ExpectedConditions.visibilityOf(MySearch));
	}
	
	public void dashboard() {
		wait.until(ExpectedConditions.visibilityOf(DashBoard));
	}
	
	
	
	
}
