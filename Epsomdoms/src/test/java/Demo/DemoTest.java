package Demo;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class DemoTest {
	
	@Test
	public void demoTest() {
		// Create theSparkReport
		ExtentSparkReporter spark = new ExtentSparkReporter("./AdvanceReports/report.html");

		// Configure the SparkReport Information
		spark.config().setDocumentTitle("Regression Testing for the LearningSeleniumPage");
		spark.config().setReportName("RegressionSuite");
		spark.config().setTheme(Theme.DARK);

		// Create the Extent report
		ExtentReports report = new ExtentReports();

		// Attach the Spark Report and ExtentReport
		report.attachReporter(spark);

		// Configure the System Information in Extent Report
		report.setSystemInfo("DeviceName:", "Harry");
		report.setSystemInfo("OperatingSystem:", "WINDOWS 11");
		report.setSystemInfo("Browser:", "Chrome");
		report.setSystemInfo("BrowserVersion:", "chrome-128.0.6613.85");

		// Create Test Information
		ExtentTest test = report.createTest("Regressiontest");

		// Steps Information
		test.log(Status.INFO, "Step1:Launching the Browser Succesfully");
		test.log(Status.PASS, "Step2:Navigating To Application via URL Sucessfully");
		test.log(Status.PASS, "Step3:Verified the webPage Sucessfully");

		if ("Harry".equals("Harry")) {
			test.log(Status.PASS, "Step4:Verified the WebElement is Displayed");
		} else {
			test.log(Status.FAIL, "Step4:Verified the WebElement is Not Displayed");
		}

	//	test.log(Status.SKIP, "Step5:Element is Hidden");

		// Flush the Report Information
		report.flush();
		System.out.println("Execution Done");

	}
	@Test
	public void DemoTest2() {
		
	}
	
	@Test
	public void DemoTest3() {
	

}
	@Test
	public void DemoTest4() {
		
	}
	
	@Test
	public void DemoTest5() {
		
	}
}
