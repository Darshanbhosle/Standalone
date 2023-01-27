package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RateSummaryPage {
	@FindBy(xpath="(//*[text()='SELECT'])[1]")
	private WebElement Select;
	
	@FindBy(xpath="(//*[text()='Click for breakdown'])[1]")
	private WebElement ClickForBreakdownOC;
	
	@FindBy(xpath="(//*[text()='Click for breakdown'])[2]")
	private WebElement ClickForBreakdownOFC;
	
	@FindBy(xpath="(//*[text()='keyboard_arrow_down'])[2]")
	private WebElement Usd;
	
	@FindBy(xpath="(//*[text()='INR (Indian Rupees)'])[2]")
	private WebElement Usdselect;
	
	@FindBy(xpath="(//*[text()='keyboard_arrow_down'])[3]")
	private WebElement UsdSelectOnBreakdown;
	
	@FindBy(xpath="(//*[text()='close'])[5]")
	private WebElement CloseBreakdown;
	
	@FindBy(xpath="//*[text()='Click for tariff view']")
	private WebElement TariffView;
	
	@FindBy(xpath="//*[text()='B/L Terms and Conditions,']")
	private WebElement BL_TC;
	
	@FindBy(xpath="//*[text()=' Shipco Transport Terms and Conditions,']")
	private WebElement ShicoTransportTermsAndCondition;
	
	@FindBy(xpath="//*[text()=' CIM/SMGS Terms and Conditions,']")
	private WebElement CimSmgs;
	
	@FindBy(xpath="//*[text()='Shipment Exceptions ']")
	private WebElement ShipmentException;
	
	@FindBy(xpath="(//*[text()='close'])[7]")
	private WebElement ClosePopUp;
	
	@FindBy(xpath="(//*[text()=' NRA Terms'])")
	private WebElement Nraterms;
	
	@FindBy(xpath="(//*[@type='checkbox'])")
	private WebElement CheckBox;
	
	@FindBy(xpath="//*[text()='Order']")
	private WebElement Order;
	
	
	
	WebDriver driver;
	WebDriverWait wait;
	public RateSummaryPage(WebDriver driver) {
	    this.driver = driver;
  	    PageFactory.initElements(driver, this);
	    wait = new WebDriverWait(driver, Duration.ofSeconds(80));
    }
	
	public void clickonselect() {
		Select.click();
	}
	
	public void usdonbanner() {
	    Usd.click();
	    wait.until(ExpectedConditions.elementToBeClickable(Usdselect));
	    Usdselect.click();
	}
	public void clickForBreakdownOC(){
		wait.until(ExpectedConditions.elementToBeClickable(ClickForBreakdownOC));
		ClickForBreakdownOC.click();
		wait.until(ExpectedConditions.elementToBeClickable(UsdSelectOnBreakdown));
		UsdSelectOnBreakdown.click();
		CloseBreakdown.click();
	}
	public void clickForBreakdownOFC(){
		wait.until(ExpectedConditions.elementToBeClickable(ClickForBreakdownOFC));
		ClickForBreakdownOFC.click();
		wait.until(ExpectedConditions.elementToBeClickable(UsdSelectOnBreakdown));
		UsdSelectOnBreakdown.click();
		CloseBreakdown.click();
	}
	public void tariffview() {
		TariffView.click();
		wait.until(ExpectedConditions.elementToBeClickable(ClosePopUp));
		ClosePopUp.click();
	}
	public void bl_tc() {
		BL_TC.click();
		wait.until(ExpectedConditions.elementToBeClickable(ClosePopUp));
		ClosePopUp.click();
	}
	public void shipcotnc() {
		ShicoTransportTermsAndCondition.click();
		wait.until(ExpectedConditions.elementToBeClickable(ClosePopUp));
		ClosePopUp.click();
	}
	public void nraterms() {
		Nraterms.click();
		wait.until(ExpectedConditions.elementToBeClickable(ClosePopUp));
		ClosePopUp.click();
	}
    public void shipmentexception() {
    	ShipmentException.click();
    	wait.until(ExpectedConditions.elementToBeClickable(ClosePopUp));
		ClosePopUp.click();
    }
    
    public void checkbox() {
    	CheckBox.click();
    }
    
    public void order() {
    	wait.until(ExpectedConditions.visibilityOf(Order));
    }
}
