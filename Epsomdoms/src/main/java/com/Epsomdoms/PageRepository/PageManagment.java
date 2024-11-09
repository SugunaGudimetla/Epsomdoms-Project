package com.Epsomdoms.PageRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PageManagment {

	public WebDriver driver;
	public LoginPage loginpageobj;
	public RegisterPage registerpageobj;
	public WelcomePage welcomepageobj;

	// Intialization

	public PageManagment(WebDriver driver) {
		this.driver = driver;
	}

	public LoginPage intiloginpage() {

		loginpageobj = new LoginPage(driver);
		return loginpageobj;

	}

	public WelcomePage intiWelcomepage() {
		welcomepageobj = new WelcomePage(driver);
		return this.welcomepageobj;

	}

	public RegisterPage intiRegisterpage() {
		registerpageobj = new RegisterPage(driver);
		return registerpageobj;

	}

}
