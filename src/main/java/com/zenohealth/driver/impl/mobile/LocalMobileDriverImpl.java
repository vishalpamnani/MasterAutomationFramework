package com.zenohealth.driver.impl.mobile;

import org.openqa.selenium.WebDriver;

import com.zenohealth.driver.IMobileDriver;
import com.zenohealth.driver.entity.MobileDriverData;
import com.zenohealth.driver.factory.mobile.local.LocalMobileDriverFactory;

public class LocalMobileDriverImpl implements IMobileDriver{

	@Override
	public WebDriver getDriver(MobileDriverData driverData) {
		
		return LocalMobileDriverFactory.getDriver(driverData.getMobilePlatformType());
	}

}
