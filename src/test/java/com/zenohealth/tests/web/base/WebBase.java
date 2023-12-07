package com.zenohealth.tests.web.base;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.zenohealth.driver.Driver;

public class WebBase {
	
	@BeforeMethod
	public void setup() {
		Driver.initDriverForWeb();
		
	}
	
	@AfterMethod
	public void tearDown() {
		Driver.quitDriver();
	}

}
