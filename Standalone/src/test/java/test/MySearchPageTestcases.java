package test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import listeners.TestNGListeners;

public class MySearchPageTestcases extends TestNGListeners {

	
	
	
	
	WebDriver driver;
	@Test(priority=0)
	public void Click_on_Mysearch() {
		MS.mysearch();
	}
	@Test(priority=1)
	public void click_on_showby() throws InterruptedException {
		MS.showby();
	}
	@Test(priority=2)
	public void click_on_showby_dropdown_lcl() {
		MS.click_on_lcl_search();
	}
	@Test(priority=3)
	public void Click_on_search_Field() {
		MS.search();
	}
	@Test(priority=4)
	public void Click_on_itemsperpage() {
		MS.itemsperpage();
	}
	@Test(priority=5)
	public void click_on_itemsperpage_dropdown() {
		MS.dropdown_element_of_itemsperpage();
	}
	
	
	@Test(priority=6)
	public void click_on_lastMonth() {
		MS.lastmonth();
	}
	
	@Test(priority=7)
	public void click_on_last2Month() {
		MS.last2month();
	}
	
	@Test(priority=8)
	public void click_on_currentMonth() {
		MS.currentmonth();
	}
	
	@Test(priority=9)
	public void Click_on_searchLCL() {
		MS.click_on_lcl_search();
	}
}
