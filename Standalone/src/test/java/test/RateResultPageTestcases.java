package test;

import org.testng.annotations.Test;

import listeners.TestNGListeners;

public class RateResultPageTestcases extends TestNGListeners{

	@Test(priority=0)
	public void ClickOnSearch() {
		RR.search();
	}
	
	@Test(priority=1)
	public void clickOn_cfstocfs() {
		RR.cfs2cfs();
	}
	@Test(priority=2)
	public void clickOn_Doortocfs() {
		RR.door2cfs();
	}
	@Test(priority=3)
	public void clickOn_cfstodoor() {
		RR.cfs2door();
	}
	@Test(priority=4)
	public void clickOn_DoorToDoor() {
		RR.door2door();
	}
	@Test(priority=5)
	public void ClickOn_RateBreakdownPopup() {
		RR.rateBreakdown();
		RR.USDdropdown();
	}
	@Test(priority=6)
	public void ClickOn_VesselTracker() {
		RR.vesseltracker();
	}
	@Test(priority=7)
	public void CheckBoxes() {
		RR.directcheckbox();
		RR.ACLUcheckbox();
	}
	@Test(priority=8)
	public void click_on_select() {
		RR.select();
	}
}
