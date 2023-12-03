package com.zenohealth.config.factory;

import org.aeonbits.owner.ConfigCache;

import com.zenohealth.config.FrameworkConfig;

public final class ConfigFactory {
	
	private ConfigFactory() {}
	
	public static FrameworkConfig getConfig() {
		return ConfigCache.getOrCreate(FrameworkConfig.class);
	}

}
