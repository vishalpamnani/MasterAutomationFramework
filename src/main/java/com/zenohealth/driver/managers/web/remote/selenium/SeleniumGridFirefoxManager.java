package com.zenohealth.driver.managers.web.remote.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.zenohealth.config.factory.ConfigFactory;

public final class SeleniumGridFirefoxManager {
	
	private SeleniumGridFirefoxManager(){}

	public static WebDriver getDriver() {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setBrowserName("FIREFOX");
		return new RemoteWebDriver(ConfigFactory.getConfig().seleniumGridURL(), capabilities);
		
	}

}
