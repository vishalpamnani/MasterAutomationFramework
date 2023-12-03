package com.zenohealth.config.converters;

import java.lang.reflect.Method;

import org.aeonbits.owner.Converter;

import com.zenohealth.enums.RemoteRunModeType;

public class StringToRemoteRunModeTypeConverter implements Converter<RemoteRunModeType> {

	@Override
	public RemoteRunModeType convert(Method method, String remoteMode) {
		return RemoteRunModeType.valueOf(remoteMode.toUpperCase());
	}

}
