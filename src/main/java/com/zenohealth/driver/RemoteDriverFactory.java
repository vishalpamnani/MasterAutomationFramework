package com.zenohealth.driver;

import org.openqa.selenium.WebDriver;

import com.zenohealth.config.ConfigFactory;
import com.zenohealth.enums.RemoteRunModeType;

public final class RemoteDriverFactory {
	
	private RemoteDriverFactory() {}
	
	public static WebDriver getDriver() {
		
		RemoteRunModeType remoteRunModeType = ConfigFactory.getConfig().browserRemoteRunMode();
		
		if(remoteRunModeType == RemoteRunModeType.SELENIUM) {
			
		}else if(remoteRunModeType == RemoteRunModeType.SELENOID) {
			
		}else {
			
		}
		
		return null;
		
	}

}
