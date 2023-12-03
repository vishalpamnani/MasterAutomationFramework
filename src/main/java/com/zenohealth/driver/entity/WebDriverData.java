package com.zenohealth.driver.entity;

import com.zenohealth.enums.BrowserType;
import com.zenohealth.enums.RemoteRunModeType;
import com.zenohealth.enums.RunModeType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@AllArgsConstructor
@Getter
@Builder
public class WebDriverData {

	private BrowserType browserType;
	private RunModeType runModeType;
	private RemoteRunModeType remoteRunModeType;

}
