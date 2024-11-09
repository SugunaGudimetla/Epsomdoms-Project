package com.Epsomdoms.WebDriverLibrary;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;




/**
 * This Class Provide the Reusable Methods To Perform All Browser Related Actions
 * 
 * 
 * @author SURYA REDDY*/
public class WebDriverUtility {
	public static WebDriver driver_static;
	public WebDriver driver;
	public Select selectobj;
	public Actions actionsobj;
	public Robot robotsobj;
	public WebDriverWait wait;

	/**
	 *This Method Used To Launch The Specific Browser
	 *@param String Browser Name
	 *@return void*/
	public void launchBrowser(String browser) {

		// Step 1: Launch the Browser----->Chrome,Edge,Safari
		switch (browser) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver_static=driver;
			break;
		case "Edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			driver_static=driver;
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver_static=driver;
			break;
		default:
			System.out.println("Incorrect Browser");
			break;
		}
	}
   /**
    *This Method is Used to Navigate to Specified Browser
    *@param String
    *@return void*/	
	public  void navigateToApplication(String url) {
		driver.get(url);
	}
    
   /**
    * This Method is used to Maximize the Browser
    * @param 
    * @return void*/	
	public  void maximizeTheBrowser() {
		driver.manage().window().maximize();
	}

	
    /**
     * This Method is used to close the Browser
     * @param
     * @return void*/    
	public  void closeTheBrowser() {
		driver.close();

	}
    
    /**
     * This Method is used to closeAllBrowsers
     * @param
     * @return void*/	
	public void closeAllBrowser() {
		driver.quit();
	}
 
    /**
     * This method is used to perform Implicitly Wait
     * @param long duration
     * @return void*/	
	public  void waitImplicitly(long duration) {
		driver.manage().timeouts().implicitlyWait(duration, TimeUnit.SECONDS);

	}

	/**
	 * This Method is used to Perform Explicitly Wait
	 * @param long duration,WebElement element
	 * @return void*/
	public  void waitExplicitly(long duration, WebElement element) {
	    wait = new WebDriverWait(driver, duration);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
     
	/**
	 * This Method is used to select the Dropdown by index
	 * @param WebElement element, int index
	 * @return void */
	
	public void selectOptionInDropdown(WebElement element, int index) {
		selectobj.selectByIndex(index);
	}

	/**
	 * This Method is used to select the Dropdown by Visibletext
	 * @param WebElement element, String visisbletext
	 * @return void */
	
	public void selectOptionInDropdown(WebElement element, String visibletext) {
		selectobj.selectByVisibleText(visibletext);
	}
 
	/**
	 * This Method is used to select the Dropdown by Value
	 * @param String value, WebElement element
	 * @return void */
	
	public void selectOptionInDropdown(String value, WebElement element) {
		selectobj.selectByValue(value);
	}
    
	/**
	 * This Method is used to Perform MouseHovering by using moveToElement
	 * @param WebElement element
	 * @return void */
	
	public void mouseHovering(WebElement element) {
		actionsobj.moveToElement(element).perform();
	}

	/**
	 * This Method is used to perform keypress
	 * @param 
	 * @return void */
	
	public void pressTheKey() {
		robotsobj.keyPress(KeyEvent.VK_PAGE_DOWN);
	}
	/**
	 * This Method is used to perform keyRelease
	 * @param 
	 * @return void */
	
	public void ReleaseTheKey() {
		robotsobj.keyRelease(KeyEvent.VK_PAGE_DOWN);
	}
	
	/**
	 * This Method is used handle simple Alert
	 * @param 
	 * @return void */
	public void alertPopupAccept() {
		driver.switchTo().alert().accept();
	}
    
	/**
	 * This Method is used handle Confirmation Alert
	 * @param 
	 * @return void */
	public void alertPopupDismiss() {
		driver.switchTo().alert().dismiss();
	}
    
	/**
	 * This Method is used to Switch Control to Frame by Index
	 * @param 
	 * @return void */
	public void switchControlToFrame() {
		driver.switchTo().frame(0);
	}

	/**
	 * This Method is used to Switch Control to Frame by Webelement Referenece
	 * @param WebElement element
	 * @return void */
	public void switchControlToFrame(WebElement element) {
		driver.switchTo().frame(element);
	}

	/**
	 * This Method is used to Switch Control to main Page
	 * @param 
	 * @return void */
	public void switchBackControlToMain() {
		driver.switchTo().defaultContent();
	}
    
	/**
	 * This Method is used to Switch Control to Particular Window
	 * @param String windowaddress
	 * @return void */
	public void switchControlToWindow(String windowaddress) {
		driver.switchTo().window(windowaddress);
	}

}
