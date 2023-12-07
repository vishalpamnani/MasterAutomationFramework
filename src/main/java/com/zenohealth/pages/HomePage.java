package com.zenohealth.pages;

import com.zenohealth.pages.enums.topmenucomponent.MenuItems;
import com.zenohealth.pages.enums.topmenucomponent.SubMenuItems;
import com.zenohealth.pages.pagecomponents.homepage.IframeComponent;
import com.zenohealth.pages.pagecomponents.homepage.TopMenuComponent;

public class HomePage {
	
	private TopMenuComponent topMenuComponent;
	private IframeComponent	iFrameComponent;
	
	public HomePage() {
		this.topMenuComponent = new TopMenuComponent();
		this.iFrameComponent = new IframeComponent();
	}

	public TopMenuComponent getTopMenuComponent() {
		return topMenuComponent;
	}
	
	public HomePage switchToIframeAndDismiss() {
		iFrameComponent
			.switchToFrame()
			.refreshPage();
		return new HomePage();
	}
	
	public CategoryDetailPage navigateToCategoryDetailPage() {
		topMenuComponent
			.clickMenuItem(MenuItems.VITAMINS_NUTRITION);
		return new CategoryDetailPage();
	}

}
