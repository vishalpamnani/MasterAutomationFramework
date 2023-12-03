package com.zenohealth.config;

import java.net.URL;

import org.aeonbits.owner.Config;
import com.zenohealth.enums.BrowserType;
import com.zenohealth.enums.MobileRemoteModeType;
import com.zenohealth.enums.RemoteRunModeType;
import com.zenohealth.enums.RunModeType;
import com.zenohealth.config.converters.StringToBrowserTypeConverter;
import com.zenohealth.config.converters.StringToMobileRemoteModeTypeConverter;
import com.zenohealth.config.converters.StringToRemoteRunModeTypeConverter;
import com.zenohealth.config.converters.StringToRunModeTypeConverter;
import com.zenohealth.config.converters.StringToURLConverter;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
	"system:properties",
	"system:env",
	"file:${user.dir}/src/test/resources/config.properties"
})
public interface FrameworkConfig extends Config {
	
	@DefaultValue("CHROME")
	@ConverterClass(StringToBrowserTypeConverter.class)
	BrowserType browser();
	
	@Key("runModeBrowser")
	@ConverterClass(StringToRunModeTypeConverter.class)
	RunModeType browserRunMode();
	
	@Key("browserRemoteMode")
	@ConverterClass(StringToRemoteRunModeTypeConverter.class)
	RemoteRunModeType browserRemoteRunMode();
	
	@Key("runModeMobile")
	@ConverterClass(StringToRemoteRunModeTypeConverter.class)
	RunModeType mobileRunMode();
	
	@Key("mobileRemoteMode")
	@ConverterClass(StringToMobileRemoteModeTypeConverter.class)
	MobileRemoteModeType mobileRemoteRunMode();
	
	@ConverterClass(StringToURLConverter.class)
	URL seleniumGridURL();
	
	@ConverterClass(StringToURLConverter.class)
	URL selenoidURL();
	
	@ConverterClass(StringToURLConverter.class)
	@DefaultValue("http://127.0.0.1:4723/wd/hub")
	URL localAppiumServerURL();

}
