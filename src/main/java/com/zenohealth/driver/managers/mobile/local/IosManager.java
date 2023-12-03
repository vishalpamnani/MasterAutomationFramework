package com.zenohealth.driver.managers.mobile.local;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.zenohealth.config.factory.ConfigFactory;

import io.appium.java_client.remote.MobileCapabilityType;

public final class IosManager {
	
	private IosManager(){}

	
		public static WebDriver getDriver() {
			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.IOS);
			capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
			capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPad touch (7th generation)" );
			capabilities.setCapability(MobileCapabilityType.APP, System.getProperty("user.dir")+"/ios-app.zip" );
			
			return new RemoteWebDriver(ConfigFactory.getConfig().localAppiumServerURL(), capabilities) ;
		}
	

}
