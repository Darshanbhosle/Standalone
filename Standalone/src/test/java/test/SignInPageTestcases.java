package test;

import java.io.IOException;

import org.testng.annotations.Test;

import listeners.TestNGListeners;
import utility.ReadDataFromPropFile;

public class SignInPageTestcases extends TestNGListeners {
	@Test(priority = 1)
	public void validateLogin() throws IOException {

		test.info("Entering credentials");
		SI.loginToApplication(ReadDataFromPropFile.readConfigData("username"), ReadDataFromPropFile.readConfigData("password"));
		test.info("Entered creds are: "+ReadDataFromPropFile.readConfigData("username")+" "+ReadDataFromPropFile.readConfigData("password"));
		
		test.info("Entered pin");

	}


}
