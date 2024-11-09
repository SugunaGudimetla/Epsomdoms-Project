package com.Epsomdoms.PageRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class WelcomePage {

	// Intialization

	public WelcomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// Declaration

	@FindBy(id = "name")
	private WebElement nametextfield;

	@FindBy(id = "email")
	private WebElement emailtextfield;

	@FindBy(id = "password")
	private WebElement pwdtextfield;

	@FindBy(id = "mobile")
	private WebElement mobiletextfield;

	@FindBy(xpath = "//input[@type='datetime-local']")
	private WebElement dobfield;

	@FindBy(id = "female")
	private WebElement gendercheckbox;

	@FindBy(id = "bangalore")
	private WebElement placecheckbox;

	@FindBy(xpath = "//select[@name='country1']")
	private WebElement countrydropdown;

	@FindBy(xpath = "//textarea[@id='feedback']")
	private WebElement feedbacktextfield;

	@FindBy(xpath = "//input[@type='file']")
	private WebElement FileUploadbutton;

	@FindBy(xpath = "//input[@type='submit']")
	private WebElement Registerbutton;

	@FindBy(xpath = "//a[contains(text(),'Contact')]")
	private WebElement Contactus;

	// Utilization

	public WebElement getNametextfield() {
		return nametextfield;
	}

	public WebElement getEmailtextfield() {
		return emailtextfield;
	}

	public WebElement getPwdtextfield() {
		return pwdtextfield;
	}

	public WebElement getMobiletextfield() {
		return mobiletextfield;
	}

	public WebElement getDobfield() {
		return dobfield;
	}

	public WebElement getGendercheckbox() {
		return gendercheckbox;
	}

	public WebElement getPlacecheckbox() {
		return placecheckbox;
	}

	public WebElement getCountry() {
		return countrydropdown;
	}

	public WebElement getTextarea() {
		return feedbacktextfield;
	}

	public WebElement getFileUpload() {
		return FileUploadbutton;
	}

	public WebElement getRegister() {
		return Registerbutton;
	}

	public WebElement getContactus() {
		return Contactus;
	}

}
