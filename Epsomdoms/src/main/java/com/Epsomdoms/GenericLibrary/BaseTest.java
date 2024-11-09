package com.Epsomdoms.GenericLibrary;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.Epsomdoms.ExcelFileLibrary.ReadExcelFile;
import com.Epsomdoms.PageRepository.PageManagment;
import com.Epsomdoms.PropertyFileLibrary.ReadPropertyFile;
import com.Epsomdoms.WebDriverLibrary.WebDriverUtility;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

/**
 *This class is used for configure All PreCondition and Post Condition for TestScript
 *And Also Intializing All the Library-Utility class
 *
 * 
 * @author SURYA REDDY*/

public class BaseTest {

	public PageManagment pagemanagmentobj;
	public WebDriverUtility webdriverobj;
	public ReadExcelFile excelutilityobj;
	public ReadPropertyFile propertyfileobj;
	public String username;
	public ExtentSparkReporter spark;
	public ExtentReports report;
	public ExtentTest test;

	@BeforeSuite
	public void suiteSetup() {
		// Create theSparkReport
		spark = new ExtentSparkReporter("./AdvanceReports/report.html");

		// Configure the SparkReport Information
		spark.config().setDocumentTitle("Regression Testing for the LearningSeleniumPage");
		spark.config().setReportName("RegressionSuite||Verification of WelcomePage");
		spark.config().setTheme(Theme.STANDARD);

		// Create the Extent report
		report = new ExtentReports();

		// Attach the Spark Report and ExtentReport
		report.attachReporter(spark);

		// Configure the System Information in Extent Report
		report.setSystemInfo("DeviceName:", "Harry");
		report.setSystemInfo("OperatingSystem:", "WINDOWS 11");
		report.setSystemInfo("Browser:", "Chrome");
		report.setSystemInfo("BrowserVersion:", "chrome-128.0.6613.85");

	}

	@AfterSuite
	public void suiteTerminateSetup() {

		// Flush the Report Information
		report.flush();

	}

	@Parameters({ "browsername", "weburl" })
	@BeforeClass

	public void browserSetup(String browser, String url) {

		// Create Object for all the Respository/Utility
		createObjects();

		// fetch the username from Excel File

		username = excelutilityobj.readSingleData("RegisterData", 1, 1);

		///Scanner sc = new Scanner(System.in);
		///System.out.println("Enter the browser");
		///String browsername = sc.next();
		// Step 1: Launch the Browser----->Chrome,Edge,Safari

		webdriverobj.launchBrowser(browser);

		Reporter.log("Step1: Launch the Browser Success", true);

		// Maximize the browser
		webdriverobj.maximizeTheBrowser();
		Reporter.log("Step 1.1: Maximized the Brower Success", true);

		// Step 2 : Navigating to the Application via URL
	
		webdriverobj.navigateToApplication(url);
		Reporter.log("Step2 :Navigation to the Application via URL Success", true);

	}

	
	@AfterClass
	public void terminateBrowser() {
		//Step10:Close the Browser
		webdriverobj.closeAllBrowser();
		Reporter.log("Step10: Close the Browser Success", true);
	}

	///////

	public void createObjects() {
		webdriverobj = new WebDriverUtility();
		excelutilityobj = new ReadExcelFile();
	    propertyfileobj=new ReadPropertyFile();

	}

}
