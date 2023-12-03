package com.zenohealth.driver.factory.mobile.remote;

import org.openqa.selenium.WebDriver;

import com.zenohealth.driver.managers.mobile.remote.browserstack.BrowserStackAndroidManager;
import com.zenohealth.driver.managers.mobile.remote.browserstack.BrowserStackIosManager;
import com.zenohealth.enums.MobilePlatformType;

public class BrowserStackMobileFactory {
	
	private BrowserStackMobileFactory(){}
	
	public static WebDriver getDriver(MobilePlatformType mobilePlatformType) {

		return mobilePlatformType == mobilePlatformType.ANDROID 
				? BrowserStackAndroidManager.getDriver()
				: BrowserStackIosManager.getDriver();

	}

}
