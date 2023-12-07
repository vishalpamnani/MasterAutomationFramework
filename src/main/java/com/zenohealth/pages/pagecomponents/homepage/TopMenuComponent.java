package com.zenohealth.pages.pagecomponents.homepage;


import org.openqa.selenium.By;

import com.zenohealth.pages.CartPage;
import com.zenohealth.pages.enums.topmenucomponent.MenuItems;
import com.zenohealth.utils.PageActionsHelper;

public class TopMenuComponent {
	
	private static final String MENU = "//span[text()='%s']/parent::a";
	//private static final String SUB_MENU = "//span[text()='%s']/parent::a";
	private static final String CART_ICON = ".CartCounter__cart-img___3xOz1.CartCounter__cart-black___RXZ58";
	
	public TopMenuComponent clickMenuItem(MenuItems menuItems) {
		String  xpath = String.format(MENU, menuItems.getName());
		PageActionsHelper.waitAndClick(By.xpath(xpath));
		return this;
	}
	
//	public TopMenuComponent clickSubMenuItem(SubMenuItems subMenuItems) {
//		String  xpath = String.format(SUB_MENU, subMenuItems.getName());
//		PageActionsHelper.waitAndClick(By.xpath(xpath));
//		return this;
//	}
	
	public CartPage clickCartIcon() {
		PageActionsHelper.waitAndClick(By.cssSelector(CART_ICON));
		return new CartPage();
	}
			

}
