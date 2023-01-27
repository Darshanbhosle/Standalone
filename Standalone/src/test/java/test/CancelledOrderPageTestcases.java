package test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import listeners.TestNGListeners;

public class CancelledOrderPageTestcases extends TestNGListeners {
 WebDriver driver;
 
 

    @Test(priority=0)
	public void Click_On_CancelledOrder() {
		 CAP.CancelledOrder();
	}
	 @Test(priority=1)
	public void Click_On_currentmonth() {
	     CAP.currentmonth();
    }
	 @Test(priority=2)
	public void Click_On_Lastmonth() {
		 CAP.lastmonth();
	}
	 @Test(priority=3)
	public void Click_On_Last2month() {
		 CAP.last2month();
	}
	 @Test(priority=4)
	public void Click_On_AllMonth() {
		 CAP.all();
	}
	 @Test(priority=5)
	public void Click_On_ViewDocument() {
		 CAP.Click_On_ViewDocument();
	}
	 @Test(priority=6)
	public void Click_On_ItemsPerPage() {
		 CAP.itemsperpage();
	}
	 @Test(priority=7)
	public void Click_On_RightArrow() {
		 CAP.rightarrow();
	}
	 @Test(priority=8)
	public void Click_On_LeftArrow() {
		 CAP.leftarrow();
	}

}
