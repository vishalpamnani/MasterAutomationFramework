package com.zenohealth.driver;

import org.openqa.selenium.WebDriver;

import com.zenohealth.driver.entity.WebDriverData;

public interface IWebDriver {
	
	WebDriver getDriver(WebDriverData driverData);

}
