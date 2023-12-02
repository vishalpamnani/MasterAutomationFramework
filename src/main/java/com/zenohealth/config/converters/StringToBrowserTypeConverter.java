package com.zenohealth.config.converters;

import java.lang.reflect.Method;

import org.aeonbits.owner.Converter;

import com.zenohealth.enums.BrowserType;

import java.util.Map;

public class StringToBrowserTypeConverter implements Converter<BrowserType>{

	
	public BrowserType convert(Method method, String browserName) {
		Map<String, BrowserType> stringBrowserTypeMap = Map.
				of("CHROME", BrowserType.CHROME,
				"FIREFOX", BrowserType.FIREFOX);
		
		return stringBrowserTypeMap.getOrDefault(browserName.toUpperCase(), BrowserType.CHROME);
	}

}
