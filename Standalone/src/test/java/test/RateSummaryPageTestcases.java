package test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import listeners.TestNGListeners;

public class RateSummaryPageTestcases extends TestNGListeners {

	
	WebDriver driver;
	@Test(priority=0)
	public void ClickOnSelect() {
		RS.clickonselect();
	}
	@Test(priority=1)
	public void Click_on_usd_of_banner() {
	    RS.usdonbanner();
	}
	@Test(priority=2)
	public void Click_on_Oceancharge_ratebreakdown() {
		RS.clickForBreakdownOC();
	}
	@Test(priority=3)
	public void Click_on_OceanFreightcharge_ratebreakdown() {
		RS.clickForBreakdownOFC();
	}
	@Test(priority=4)
	public void verify_ClickonTariffViewPopup() {
		RS.tariffview();
	}
	@Test(priority=5)
    public void verify_ClickOn_ShipcoTransport_TermsAndCondition() {
		RS.shipcotnc();
	}
	@Test(priority=6)
    public void verify_ClickOn_NRA_termsPopup() {
		RS.nraterms();
	}
	@Test(priority=7)
    public void verify_ClickOn_ShipmentExceptionPopup() {
		RS.shipmentexception();
	}
	@Test(priority=8)
    public void ClickOnChekbox() {
    	RS.checkbox();
    }
	@Test(priority=9)
    public void ClickOnOrder() {
    	RS.order();
    }
	
	
}
