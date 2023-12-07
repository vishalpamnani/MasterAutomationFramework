package com.zenohealth.pages.pagecomponents.subcategorydetailpage;

import org.openqa.selenium.By;

import com.zenohealth.pages.pagecomponents.homepage.TopMenuComponent;
import com.zenohealth.utils.PageActionsHelper;

public class TopDealsOnCategoryComponent {
	
	private static final By ADD_BUTTON = By.xpath("(//div[text()='ADD'])[3]");

	public TopMenuComponent clickOnAdd() {
		PageActionsHelper.waitAndClick(ADD_BUTTON);
		return new TopMenuComponent();
	}
	

}
