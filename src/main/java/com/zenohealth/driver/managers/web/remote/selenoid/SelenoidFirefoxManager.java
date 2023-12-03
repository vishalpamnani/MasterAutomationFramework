package com.zenohealth.driver.managers.web.remote.selenoid;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.zenohealth.config.factory.ConfigFactory;

public final class SelenoidFirefoxManager {
	
	private SelenoidFirefoxManager(){}

	public static WebDriver getDriver() {
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		
		capabilities.setCapability("browserName", "firefox");
		capabilities.setCapability("browserVersion", "99.0");
		capabilities.setCapability("enableVNC", true);
		capabilities.setCapability("enableVideo", false);

		return new RemoteWebDriver(ConfigFactory.getConfig().selenoidURL(), capabilities);
	}

}
