package com.zenohealth.driver;

import static com.zenohealth.config.factory.ConfigFactory.getConfig;

import java.util.Objects;

import org.openqa.selenium.WebDriver;

import com.zenohealth.driver.entity.MobileDriverData;
import com.zenohealth.driver.entity.WebDriverData;
import com.zenohealth.driver.factory.DriverFactory;
import com.zenohealth.enums.MobilePlatformType;

public final class Driver {

	private Driver() {
	}

	// local web, remote web, local mobile, remote mobile

	public static void initDriverForWeb() {

		if (Objects.isNull(DriverManager.getDriver())) {

			WebDriverData webDriverData = WebDriverData.builder().browserType(getConfig().browser())
					.remoteRunModeType(getConfig().browserRemoteRunMode()).runModeType(getConfig().browserRunMode())
					.build();
			WebDriver driver = DriverFactory.getDriverForWeb(webDriverData);
			DriverManager.setDriver(driver);
		}

	}

	public static void initDriverForMobile() {
		MobileDriverData mobileDriverData = MobileDriverData.builder().mobilePlatformType(MobilePlatformType.ANDROID)
				.mobileRemoteModeType(getConfig().mobileRemoteRunMode()).runModeType(getConfig().mobileRunMode())
				.build();
		WebDriver driver = DriverFactory.getDriverForMobile(mobileDriverData);
		DriverManager.setDriver(driver);

	}

	public static void quitDriver() {

		if (Objects.nonNull(DriverManager.getDriver())) {

			DriverManager.getDriver().quit();
			DriverManager.unload();

		}

	}

}
