package com.zenohealth.driver.managers.web.remote.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


import com.zenohealth.config.factory.ConfigFactory;

public class SeleniumGridChromeManager {

	public static WebDriver getDriver() {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setBrowserName("CHROME");
		return new RemoteWebDriver(ConfigFactory.getConfig().seleniumGridURL(), capabilities);
	}

}
