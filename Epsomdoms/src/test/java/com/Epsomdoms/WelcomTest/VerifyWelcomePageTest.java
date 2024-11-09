package com.Epsomdoms.WelcomTest;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.Epsomdoms.GenericLibrary.BaseTest;
import com.Epsomdoms.JavaLibrary.JavaUtility;
import com.Epsomdoms.PageRepository.PageManagment;
import com.aventstack.extentreports.Status;

public class VerifyWelcomePageTest extends BaseTest {

	@Test(priority = 1)
	public void verifyWelcomePageWithValidInput() {

		// Create Test Information
		test = report.createTest("verifyWelcomePagewithValidInput");

		// Steps Information

		test.log(Status.INFO, "<<.......Execution Started Successfully......>>");

		// Execute the Pre-Condition------->1.Launch the browser,2.Navigate to URL
		test.log(Status.INFO, "Step1:Launching the Browser Succesfully");

		// Implicit wait
		webdriverobj.waitImplicitly(20);

		// Verify the welcome page Using Title
		String Extitle = "Learning Selenium";
		test.log(Status.PASS, "Title Verified");

		Assert.assertEquals(Extitle, webdriverobj.driver.getTitle());
		test.log(Status.PASS, "Title Verified");

		// Create an Object for PageManager
		pagemanagmentobj = new PageManagment(webdriverobj.driver);

		// Verify the name TestField
		boolean result = pagemanagmentobj.intiWelcomepage().getNametextfield().isDisplayed();

		Assert.assertTrue(result);
		test.log(Status.PASS, "Element Verified:Name TextField is Displayed");

		// Step 3 : Perform Action---->Clear
		pagemanagmentobj.intiWelcomepage().getNametextfield().clear();
		test.log(Status.PASS, "Step 3:Clear Action done Successfully for name Text field");

		// Step 4 : Perform Action---->Sendkeys
		pagemanagmentobj.intiWelcomepage().getNametextfield().sendKeys("Suguna");
		test.log(Status.PASS, "Step 4:SendKeys Actions Done Successfully");

		// Step 4a :
		pagemanagmentobj.intiWelcomepage().getEmailtextfield().sendKeys("mandasuguna97@gmail.com");
		test.log(Status.PASS, "Step 4a : SendKeys Actions Done Successfully");

		// Step 4b :
		pagemanagmentobj.intiWelcomepage().getPwdtextfield().sendKeys("Suguna@15");
		test.log(Status.PASS, "Step 4b : SendKeys Actions Done Successfully");

		// Step 4c:
		pagemanagmentobj.intiWelcomepage().getMobiletextfield().sendKeys("8374145818");
		test.log(Status.PASS, "Step 4c : SendKeys Actions Done Successfully");

		// Step 4d:
		pagemanagmentobj.intiWelcomepage().getDobfield().sendKeys("15--08--98");
		test.log(Status.PASS, "Step 4d : SendKeys Actions Done Successfully");

		// Step 5: Perform Action----->Click
		pagemanagmentobj.intiWelcomepage().getGendercheckbox().click();
		test.log(Status.PASS, "Step 5 : Click Actions Done Successfully");

		// Step 5a :
		pagemanagmentobj.intiWelcomepage().getPlacecheckbox().click();
		test.log(Status.PASS, "Step 5a : Click Actions Done Successfully");

		// Step 6 :
		Select s1 = new Select(pagemanagmentobj.intiWelcomepage().getCountry());
		s1.selectByVisibleText("USA");
		test.log(Status.PASS, "Step 6 : Drop Down Done Successfully");

		// Step 7 :
		pagemanagmentobj.intiWelcomepage().getTextarea().sendKeys("Epsomdoms is a best product");
		test.log(Status.PASS, "Step 7 :Feedback Entered Successfully");

		// Step 8 :
		pagemanagmentobj.intiWelcomepage().getFileUpload().sendKeys("C:\\Users\\SURYA REDDY\\Downloads");
		test.log(Status.PASS, "Step 8 : File Uploaded Succesfully");

		// Step 9 :
		pagemanagmentobj.intiWelcomepage().getRegister().click();
		test.log(Status.PASS, "Step 9: Registration Done Successfully");

		JavaUtility javaUtility = new JavaUtility();
		// See the Execution
		javaUtility.pause(3000);

		// Soft Assert Statement
		SoftAssert softassertobj = new SoftAssert();

		// Step10:Verify the "ContackUs" HyperLink
		softassertobj.assertEquals("Contact Us", pagemanagmentobj.intiWelcomepage().getContactus().getText());
		test.log(Status.PASS, "Step 10:Verified Text Successfully-Contact Us HyperLink");
		softassertobj.assertAll();

		// Execution Log or Status
		test.log(Status.INFO, "Execution Completed Successfully......>");

	}

	@Test(priority = 2, invocationCount = 2, dependsOnMethods = "verifyWelcomePageWithValidInput")
	public void l() {

		// Create Test Information
		test = report.createTest("verifyWelcomePagewithInValidInput");

		// Steps Information

		test.log(Status.INFO, "<<.......Execution Started Successfully......>>");

		// Execute the pre-condition---->1.Launch the browser,2.Navigate to URL

		// Implicit wait
		webdriverobj.waitImplicitly(20);

		// Verify the welcome page Using Title
		String Extitle = "Learning Selenium";
		String Actitle = webdriverobj.driver.getTitle();

		Assert.assertEquals(Actitle, Extitle);
		test.log(Status.PASS, "Title Verified" + Actitle);

		// Create an Object for PageManager
		pagemanagmentobj = new PageManagment(webdriverobj.driver);

		// Verify the name TestField
		boolean result = pagemanagmentobj.intiWelcomepage().getNametextfield().isDisplayed();

		Assert.assertTrue(result);
		test.log(Status.PASS, "Element Verified:Name TextField is Displayed");

		// Step 3 : Perform Action---->Clear
		pagemanagmentobj.intiWelcomepage().getNametextfield().clear();
		test.log(Status.PASS, "Step 3:Clear Action done Successfully for name Text field");

		// Step 4 : Perform Action---->Sendkeys
		pagemanagmentobj.intiWelcomepage().getNametextfield().sendKeys("NNNNNNNN");
		test.log(Status.PASS, "Step 4:SendKeys Actions Done Successfully");

		// Step 4a :
		pagemanagmentobj.intiWelcomepage().getEmailtextfield().sendKeys("buigui");
		test.log(Status.PASS, "Step 4a : SendKeys Actions Done Successfully");

		// Step 4b :
		pagemanagmentobj.intiWelcomepage().getPwdtextfield().sendKeys("nbjhbj");
		test.log(Status.PASS, "Step 4b : SendKeys Actions Done Successfully");

		// Step 4c:
		pagemanagmentobj.intiWelcomepage().getMobiletextfield().sendKeys("jhuhbjkh");
		test.log(Status.PASS, "Step 4c : SendKeys Actions Done Successfully");

		// Step 4d:
		pagemanagmentobj.intiWelcomepage().getDobfield().sendKeys("18--11--99");
		test.log(Status.PASS, "Step 4d : SendKeys Actions Done Successfully");

		// Step 5: Perform Action----->Click
		pagemanagmentobj.intiWelcomepage().getGendercheckbox().click();
		test.log(Status.PASS, "Step 5 : Click Actions Done Successfully");

		// Step 5a :
		pagemanagmentobj.intiWelcomepage().getPlacecheckbox().click();
		test.log(Status.PASS, "Step 5a : Click Actions Done Successfully");

		// Step 6 :
		Select s1 = new Select(pagemanagmentobj.intiWelcomepage().getCountry());
		s1.selectByVisibleText("USA");
		test.log(Status.PASS, "Step 6 : Drop Down Done Successfully");

		// Step 7 :
		pagemanagmentobj.intiWelcomepage().getTextarea().sendKeys("Epsomdoms is a best product");
		test.log(Status.PASS, "Step 7 :Feedback Entered Successfully");

		// Step 8 :
		pagemanagmentobj.intiWelcomepage().getFileUpload().sendKeys("C:\\Users\\SURYA REDDY\\Downloads");
		test.log(Status.PASS, "Step 8 : File Uploaded Succesfully");

		// Step 9 :
		pagemanagmentobj.intiWelcomepage().getRegister().click();
		test.log(Status.PASS, "Step 9: Registration Done Successfully");

		JavaUtility javaUtility = new JavaUtility();
		// See the Execution
		javaUtility.pause(3000);

		// To Make the Explicit TestScropt Fail
		// Assert.fail();

		// Execute thePostCondition--->Terminate the Browser
		// Execution Log or Status
		test.log(Status.INFO, "<.......Execution Completed Successfully......>");

	}
}
