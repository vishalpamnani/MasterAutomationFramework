package com.zenohealth.pages.pagecomponents.categorydetailpage;

import org.openqa.selenium.By;

import com.zenohealth.pages.CategoryDetailPage;
import com.zenohealth.pages.SubCategoryDetailPage;
import com.zenohealth.pages.enums.topmenucomponent.ShopByCategoryItems;
import com.zenohealth.utils.PageActionsHelper;

public class ShopByCategoryComponent {

	private static final String CATEGORY = "//div[text()='Protein Supplements']/parent::a";

	public SubCategoryDetailPage clickCategory(ShopByCategoryItems shopByCategoryItems) {
		String xpath = String.format(CATEGORY, shopByCategoryItems.getName());
		PageActionsHelper.waitAndClick(By.xpath(xpath));
		return new SubCategoryDetailPage();

	}

}
