package com.zenohealth.driver.impl.web;

import org.openqa.selenium.WebDriver;

import com.zenohealth.driver.IWebDriver;
import com.zenohealth.driver.entity.WebDriverData;
import com.zenohealth.driver.factory.web.local.LocalDriverFactory;

public class LocalWebDriverImpl implements IWebDriver {

	@Override
	public WebDriver getDriver(WebDriverData driverData) {
		return LocalDriverFactory.getDriver(driverData.getBrowserType());
	}

}
