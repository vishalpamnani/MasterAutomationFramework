package com.zenohealth.driver.factory.web.remote;

import org.openqa.selenium.WebDriver;

import com.zenohealth.config.factory.ConfigFactory;
import com.zenohealth.enums.BrowserType;
import com.zenohealth.enums.RemoteRunModeType;

public final class RemoteDriverFactory {

	private RemoteDriverFactory() {
	}

	public static WebDriver getDriver(RemoteRunModeType remoteRunModeType, BrowserType browserType) {

		if (remoteRunModeType == RemoteRunModeType.SELENIUM) {
			return SeleniumGridFactory.getDriver(browserType);

		} else if (remoteRunModeType == RemoteRunModeType.SELENOID) {
			return SelenoidFactory.getDriver(browserType);

		} else if (remoteRunModeType == RemoteRunModeType.BROWSER_STACK) {
			return BrowserStackFactory.getDriver(browserType);

		}

		return null;

	}

}
