package test;

import org.apache.hc.core5.http2.hpack.HPackDecoder;
import org.testng.annotations.Test;

import listeners.TestNGListeners;

public class HomePageTestcases extends TestNGListeners{
      
	@Test(priority=0)
	public void Click_On_Aboutus() {
		HP.aboutus();
	}
	@Test(priority=1)
	public void oceanlcl_cfstocfs() {
		HP.cfs2cfs();
	}
	@Test(priority=2)
	public void oceanlcl_Doortocfs() {
		HP.door2cfs();
	}
	@Test(priority=3)
	public void oceanlcl_cfstodoor() {
		HP.cfs2door();
	}
	@Test(priority=4)
	public void oceanlcl_DoorToDoor() {
		HP.door2door();
	}
	
	@Test(priority=5)
	public void oceanfcl_porttoport() {
		HP.port2port();
	}
	@Test(priority=6)
	public void oceanfcl_porttodoor() {
		HP.port2door();
	}
	
	@Test(priority=7)
	public void mysearch() {
		HP.mysearch();
	}
	
	@Test(priority=8)
	public void dashboard() {
		HP.dashboard();
	}
}
