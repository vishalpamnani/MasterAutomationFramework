package com.zenohealth.pages.pagecomponents.homepage;

import org.openqa.selenium.By;

import com.zenohealth.driver.DriverManager;
import com.zenohealth.pages.HomePage;
import com.zenohealth.utils.PageActionsHelper;

public class IframeComponent {
	
	private static final String I_FRAME = "google_ads_iframe_67416580/DWEB_ROADBLOCK_900x493_PROD_0";
	private static final String CLOSE_ICON = "//svg[@xmlns='http://www.w3.org/2000/svg']";
	
	public IframeComponent switchToFrame() {
		DriverManager.getDriver().switchTo().frame(DriverManager.getDriver().findElement(By.id(I_FRAME)));
		return this;
	}
	
	public void refreshPage() {
		PageActionsHelper.refreshPage();
	}
//	public IframeComponent closeIframe() {
//		PageActionsHelper.waitAndClick(By.xpath(CLOSE_ICON));
//		return this;
//		
//	}

}
