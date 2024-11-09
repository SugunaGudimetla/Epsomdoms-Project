package com.Epsomdoms.PageRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	// Intialization

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
