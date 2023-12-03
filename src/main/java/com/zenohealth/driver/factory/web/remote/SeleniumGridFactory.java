package com.zenohealth.driver.factory.web.remote;

import org.openqa.selenium.WebDriver;

import com.zenohealth.driver.managers.web.remote.selenium.SeleniumGridChromeManager;
import com.zenohealth.driver.managers.web.remote.selenium.SeleniumGridFirefoxManager;
import com.zenohealth.enums.BrowserType;

public final class SeleniumGridFactory {

	private SeleniumGridFactory() {
	}

	public static WebDriver getDriver(BrowserType browserType) {

		return browserType == BrowserType.CHROME 
				? SeleniumGridChromeManager.getDriver()
				: SeleniumGridFirefoxManager.getDriver();

	}

}
