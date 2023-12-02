package com.zenohealth.driver;

import org.openqa.selenium.WebDriver;

import com.zenohealth.config.ConfigFactory;
import com.zenohealth.driver.managers.ChromeManager;
import com.zenohealth.driver.managers.FirefoxManager;
import com.zenohealth.enums.BrowserType;

public final class LocalDriverFactory {

	private LocalDriverFactory() {
	}

	public static WebDriver getDriver() {

		WebDriver driver = null;
		if (isBrowserChrome()) {
			driver = ChromeManager.getDriver();
		}

		else {
			driver = FirefoxManager.getDriver();
		}

		return driver;
	}

	private static boolean isBrowserChrome() {
		return ConfigFactory.getConfig().browser() == BrowserType.CHROME;
	}

}
