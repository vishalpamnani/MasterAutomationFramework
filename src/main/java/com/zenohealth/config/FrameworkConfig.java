package com.zenohealth.config;

import org.aeonbits.owner.Config;
import org.openqa.selenium.remote.BrowserType;

import com.zenohealth.config.converters.StringToBrowserTypeConverter;


@Config.Sources({
	"system:properties",
	"system:env",
	"file:${user.dir}/src/test/resources/config.properties"
})
public interface FrameworkConfig extends Config {
	
	@DefaultValue("CHROME")
	@ConverterClass(StringToBrowserTypeConverter.class)
	BrowserType browser();

}
