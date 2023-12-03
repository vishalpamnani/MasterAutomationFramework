package com.zenohealth.driver.factory.web.remote;


import java.util.EnumMap;
import java.util.Map;
import java.util.function.Supplier;

import org.openqa.selenium.WebDriver;

import com.zenohealth.driver.managers.web.remote.browserstack.BrowserStackChromeManager;
import com.zenohealth.driver.managers.web.remote.browserstack.BrowserStackFirefoxManager;
import com.zenohealth.enums.BrowserType;

public class BrowserStackFactory {
	
	private BrowserStackFactory(){}
	
	
	private static final Map<BrowserType, Supplier<WebDriver>> MAP =
            new EnumMap<>(BrowserType.class);

    static {
        MAP.put(BrowserType.CHROME, BrowserStackChromeManager::getDriver);
        MAP.put(BrowserType.FIREFOX, BrowserStackFirefoxManager::getDriver);
    }

    public static WebDriver getDriver(BrowserType browserType){
        return MAP.get(browserType).get();
    }
}
