package com.zenohealth.config.factory;

import org.aeonbits.owner.ConfigCache;

import com.zenohealth.config.ApiConfig;

public class ApiConfigFactory {
	
	private ApiConfigFactory(){}
	
	public static ApiConfig getConfig() {
		return ConfigCache.getOrCreate(ApiConfig.class);
	}

}
