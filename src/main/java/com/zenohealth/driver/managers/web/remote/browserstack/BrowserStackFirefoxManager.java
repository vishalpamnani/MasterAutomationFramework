package com.zenohealth.driver.managers.web.remote.browserstack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.zenohealth.config.factory.BrowserStackConfigFactory;

public class BrowserStackFirefoxManager {
	
	private BrowserStackFirefoxManager(){}
	
	public static WebDriver getDriver() {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("browser", "firefox");
		capabilities.setCapability("browser_version", "latest");
		capabilities.setCapability("os", "Windows");
		capabilities.setCapability("os_version", "10");
		
		return new RemoteWebDriver(BrowserStackConfigFactory.getConfig().browserStackURL(), capabilities);
	}

}
