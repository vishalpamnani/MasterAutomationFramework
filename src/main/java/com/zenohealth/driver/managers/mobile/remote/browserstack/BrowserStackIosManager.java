package com.zenohealth.driver.managers.mobile.remote.browserstack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.zenohealth.config.factory.BrowserStackConfigFactory;

public final class BrowserStackIosManager {
	
	private BrowserStackIosManager(){}

public static WebDriver getDriver() {
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
	    capabilities.setCapability("app", "bs://067b3d9696fb162c26cd37417fa5cf1a64cdcc87");
	    capabilities.setCapability("device", "Apple iPhone 13");
	    capabilities.setCapability("os_version", "17.0");
	    capabilities.setCapability("project", "First Java Project");
	    capabilities.setCapability("build", "browserstack-build-1");
	    capabilities.setCapability("name", "first_test");
	    return new RemoteWebDriver(BrowserStackConfigFactory.getConfig()
	                                 .browserStackURL(), capabilities);
		
	}
	

}
