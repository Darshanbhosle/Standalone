package listeners;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReport {
	

	
		static ExtentReports extent;
		public static ExtentReports extentReportGenerator()
		{
			String path = System.getProperty("user.dir")+"\\reports\\standalone.html";
		
			ExtentHtmlReporter reporter = new ExtentHtmlReporter(path);
			
			reporter.config().setTheme(Theme.DARK);
			
			reporter.config().setReportName("Standalone execution report");
			
			extent = new ExtentReports();
			
			extent.attachReporter(reporter);
			
			extent.setSystemInfo("Project name", "Standalone");
			
			extent.setSystemInfo("Executed by", "Darshan Bhosale");
			
			extent.setSystemInfo("Environment used", "");
			
			return extent;
		
		}
		
		
		
		

	}

