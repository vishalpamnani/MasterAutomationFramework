package com.zenohealth.config.factory;

import org.aeonbits.owner.ConfigCache;

import com.zenohealth.config.BrowserStackConfig;

public final class BrowserStackConfigFactory {
	
	public static BrowserStackConfig getConfig() {
		return ConfigCache.getOrCreate(BrowserStackConfig.class);
	}

}
 