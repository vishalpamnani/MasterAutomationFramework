package com.zenohealth.utils;

import org.openqa.selenium.By;

import com.zenohealth.driver.DriverManager;

public class PageActionsHelper {
	
	private PageActionsHelper(){}
	
	public static void waitAndClick(By by) {
		DriverManager.getDriver().findElement(by).click();
	}
	
	public static void waitAndSendKeys(By by, String value) {
		DriverManager.getDriver().findElement(by).sendKeys(value);
	}
	
	public static void refreshPage() {
		DriverManager.getDriver().navigate().refresh();
	}

}
