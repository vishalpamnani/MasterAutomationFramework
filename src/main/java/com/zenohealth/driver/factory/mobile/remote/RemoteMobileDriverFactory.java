package com.zenohealth.driver.factory.mobile.remote;

import org.openqa.selenium.WebDriver;

import com.zenohealth.config.factory.ConfigFactory;
import com.zenohealth.driver.factory.mobile.remote.BrowserStackMobileFactory;
import com.zenohealth.enums.BrowserType;
import com.zenohealth.enums.MobilePlatformType;
import com.zenohealth.enums.MobileRemoteModeType;
import com.zenohealth.enums.RemoteRunModeType;

public final class RemoteMobileDriverFactory {

	private RemoteMobileDriverFactory() {
	}

	public static WebDriver getDriver(MobileRemoteModeType mobileRemoteModeType, MobilePlatformType mobilePlatformType) {

		if (mobileRemoteModeType == MobileRemoteModeType.BROWSER_STACK) {
			return BrowserStackMobileFactory.getDriver(mobilePlatformType);

//		} else if (mobileRemoteModeType == MobileRemoteModeType.SAUCE_LABS) {
//			return SauceLabsFactory.getDriver(mobilePlatformType);

		} 

		return null;

	}

}
