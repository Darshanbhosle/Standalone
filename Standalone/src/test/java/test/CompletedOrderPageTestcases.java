package test;

import org.testng.annotations.Test;

import listeners.TestNGListeners;

public class CompletedOrderPageTestcases extends TestNGListeners {
	 @Test(priority=0)
	public void Click_On_CompletedOrder() {
		CO.completedOrder();
	}
	 @Test(priority=1)
	public void Click_On_currentmonth() {
	    CO.currentmonth();
    }
	 @Test(priority=2)
	public void Click_On_Lastmonth() {
		CO.lastmonth();
	}
	 @Test(priority=3)
	public void Click_On_Last2month() {
		CO.last2month();
	}
	 @Test(priority=4)
	public void Click_On_AllMonth() {
		CO.all();
	}
	 @Test(priority=5)
	public void Click_On_ViewDocument() {
		CO.Click_On_ViewDocument();
	}
	 @Test(priority=6)
	public void Click_On_ItemsPerPage() {
		CO.itemsperpage();
	}
	 @Test(priority=7)
	public void Click_On_RightArrow() {
		CO.rightarrow();
	}
	 @Test(priority=8)
	public void Click_On_LeftArrow() {
		CO.leftarrow();
	}
}
