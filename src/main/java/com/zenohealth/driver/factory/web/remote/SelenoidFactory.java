package com.zenohealth.driver.factory.web.remote;

import org.openqa.selenium.WebDriver;

import com.zenohealth.driver.managers.web.remote.selenoid.SelenoidChromeManager;
import com.zenohealth.driver.managers.web.remote.selenoid.SelenoidFirefoxManager;
import com.zenohealth.enums.BrowserType;

public final class SelenoidFactory {
	
	private SelenoidFactory(){}
	
	public static WebDriver getDriver(BrowserType browserType) {
		
		return browserType == BrowserType.CHROME 
				? SelenoidChromeManager.getDriver()
				: SelenoidFirefoxManager.getDriver();
		
	}

}
