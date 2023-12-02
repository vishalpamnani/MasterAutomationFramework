package com.zenohealth.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.zenohealth.config.ConfigFactory;
import com.zenohealth.enums.BrowserType;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Driver {

	static WebDriver driver = null;

	public static void initDriver() { //LocalDriverFactory

		WebDriver driver = LocalDriverFactory.getDriver();
		driver.get("https://google.co.in");

	}

	public static void quitDriver() {
		driver.quit();
	}

}
