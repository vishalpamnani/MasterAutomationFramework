package com.zenohealth.driver.factory;

import org.openqa.selenium.WebDriver;

import com.zenohealth.driver.entity.MobileDriverData;
import com.zenohealth.driver.entity.WebDriverData;
import com.zenohealth.driver.impl.mobile.LocalMobileDriverImpl;
import com.zenohealth.driver.impl.mobile.RemoteMobileDriverImpl;
import com.zenohealth.driver.impl.web.LocalWebDriverImpl;
import com.zenohealth.driver.impl.web.RemoteWebDriverImpl;
import com.zenohealth.enums.RunModeType;

public final class DriverFactory {
	
	private DriverFactory(){}
	
	public static WebDriver getDriverForWeb(WebDriverData webDriverData){
        return webDriverData.getRunModeType() == RunModeType.LOCAL
        ? new LocalWebDriverImpl().getDriver(webDriverData)
        : new RemoteWebDriverImpl().getDriver(webDriverData);
        
    }
    public static WebDriver getDriverForMobile(MobileDriverData mobileDriverData){
        return mobileDriverData.getRunModeType() == RunModeType.LOCAL
        ? new LocalMobileDriverImpl().getDriver(mobileDriverData)
        : new RemoteMobileDriverImpl().getDriver(mobileDriverData);
        
    }
}
