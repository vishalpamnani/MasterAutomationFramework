package com.zenohealth.driver.factory.mobile.local;

import org.openqa.selenium.WebDriver;

import com.zenohealth.config.factory.ConfigFactory;
import com.zenohealth.driver.managers.mobile.local.AndroidManager;
import com.zenohealth.driver.managers.mobile.local.IosManager;
import com.zenohealth.driver.managers.web.local.ChromeManager;
import com.zenohealth.driver.managers.web.local.FirefoxManager;
import com.zenohealth.enums.BrowserType;
import com.zenohealth.enums.MobilePlatformType;

public final class LocalMobileDriverFactory {

	private LocalMobileDriverFactory() {
	}

	public static WebDriver getDriver(MobilePlatformType mobilePlatformType) {

		
		return (isPlatformAndroid(mobilePlatformType)) 
				? AndroidManager.getDriver() 
				: IosManager.getDriver();
		
	}

	private static boolean isPlatformAndroid(MobilePlatformType mobilePlatformType) {
		return mobilePlatformType == MobilePlatformType.ANDROID;
	}

}
