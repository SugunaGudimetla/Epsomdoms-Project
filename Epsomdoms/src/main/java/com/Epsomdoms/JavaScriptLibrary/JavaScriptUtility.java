package com.Epsomdoms.JavaScriptLibrary;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.Epsomdoms.WebDriverLibrary.WebDriverUtility;

public class JavaScriptUtility {

	public JavascriptExecutor javascriptobj;

	public void enterData_DisabledElement(WebElement element,String data) {
		javascriptobj = (JavascriptExecutor) WebDriverUtility.driver_static;
		javascriptobj.executeScript("arguments[0].value="+data+"", element);
	}

	public void click_DisabledElement(WebElement element,String data) {
		javascriptobj = (JavascriptExecutor) WebDriverUtility.driver_static;
		javascriptobj.executeScript("arguments[0].click()", element);
		

	}

	public void defaultVerticalScrollBy() {
		javascriptobj = (JavascriptExecutor) WebDriverUtility.driver_static;
		javascriptobj.executeScript("window.scrollBy(1000, 1000)");

	}

	public void defaultVerticalscrollTo() {
		javascriptobj = (JavascriptExecutor) WebDriverUtility.driver_static;
		javascriptobj.executeScript("window.scrollTo(1000, 1000)");

	}

	public void scrollUsingView(WebElement element, boolean value) {
		javascriptobj = (JavascriptExecutor) WebDriverUtility.driver_static;
		javascriptobj.executeScript("arguments[0].scrollIntoView(" + value + ");", element);
	}

}
