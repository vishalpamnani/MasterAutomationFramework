package com.zenohealth.driver;

import org.openqa.selenium.WebDriver;

import com.zenohealth.driver.entity.MobileDriverData;

public interface IMobileDriver  {
	
	WebDriver getDriver(MobileDriverData driverData);

}
