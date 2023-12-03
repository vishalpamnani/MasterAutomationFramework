package com.zenohealth.tests.mobile.base;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.zenohealth.driver.Driver;

public class MobileBase {
	
	@BeforeMethod
	public void setup() {
		Driver.initDriverForMobile();
	}
	
	@AfterMethod
	public void tearDown() {
		Driver.quitDriver();
	}

}
