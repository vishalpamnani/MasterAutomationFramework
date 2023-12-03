package com.zenohealth.driver.factory.web.local;

import org.openqa.selenium.WebDriver;

import com.zenohealth.config.factory.ConfigFactory;
import com.zenohealth.driver.managers.web.local.ChromeManager;
import com.zenohealth.driver.managers.web.local.FirefoxManager;
import com.zenohealth.enums.BrowserType;

public final class LocalDriverFactory {

	private LocalDriverFactory() {
	}

	public static WebDriver getDriver(BrowserType browserType) {

		
		return (isBrowserChrome(browserType)) 
				? ChromeManager.getDriver() 
				: FirefoxManager.getDriver();
		
	}

	private static boolean isBrowserChrome(BrowserType browserType) {
		return browserType == BrowserType.CHROME;
	}

}
