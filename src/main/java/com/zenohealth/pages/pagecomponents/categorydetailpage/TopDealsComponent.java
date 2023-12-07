package com.zenohealth.pages.pagecomponents.categorydetailpage;

import org.openqa.selenium.By;

import com.zenohealth.utils.PageActionsHelper;

public class TopDealsComponent {
	
	private static final By ADD_BUTTON = By.xpath("(//div[text()='ADD'])[3]");

	public TopDealsComponent clickOnAdd() {
		PageActionsHelper.waitAndClick(ADD_BUTTON);
		return this;
	}
	
	
}
