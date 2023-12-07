package com.zenohealth.pages.pagecomponents.cartpage;

import org.openqa.selenium.By;

import com.zenohealth.driver.DriverManager;

public class ProductListComponent {
	
	private static final String DELETE_ICON = "//img[@alt='delete item']";
	
	public Boolean isDeleteVisible() {
		return DriverManager.getDriver().findElement(By.xpath(DELETE_ICON)).isDisplayed();
	}

}
