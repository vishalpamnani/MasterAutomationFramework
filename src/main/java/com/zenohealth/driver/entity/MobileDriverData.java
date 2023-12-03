package com.zenohealth.driver.entity;

import com.zenohealth.enums.MobilePlatformType;
import com.zenohealth.enums.MobileRemoteModeType;
import com.zenohealth.enums.RunModeType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@AllArgsConstructor
@Getter
@Builder
public class MobileDriverData {

	private MobilePlatformType mobilePlatformType;
	private MobileRemoteModeType mobileRemoteModeType;
	private RunModeType runModeType;
}