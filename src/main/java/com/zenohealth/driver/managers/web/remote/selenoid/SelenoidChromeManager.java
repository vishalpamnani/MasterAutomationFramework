package com.zenohealth.driver.managers.web.remote.selenoid;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.zenohealth.config.factory.ConfigFactory;

public class SelenoidChromeManager {

	public static WebDriver getDriver() {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		
		capabilities.setCapability("browserName", "chrome");
		capabilities.setCapability("browserVersion", "110.0");
		capabilities.setCapability("enableVNC", true);
		capabilities.setCapability("enableVideo", false);

		return new RemoteWebDriver(ConfigFactory.getConfig().selenoidURL(), capabilities);
	}

}
