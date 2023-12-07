package com.zenohealth.tests.web;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.zenohealth.pages.HomePage;
import com.zenohealth.pages.enums.topmenucomponent.ShopByCategoryItems;
import com.zenohealth.pages.pagecomponents.cartpage.ProductListComponent;
import com.zenohealth.tests.web.base.WebBase;

public class OneMgCheckoutFlowTest extends WebBase {

	@Test
	public void testAddToCart() throws InterruptedException {

	ProductListComponent productlistComponent = new HomePage()
			.switchToIframeAndDismiss()
			.navigateToCategoryDetailPage()
			.getShopByCategoryComponent()
			.clickCategory(ShopByCategoryItems.VITAMINS_AND_SUPPLEMENTS)
			.getTopDealsOnCategoryComponent()
			.clickOnAdd()
			.clickCartIcon()
			.getProductListComponent();
	
	Thread.sleep(3000);
					
		Assert.assertTrue(productlistComponent.isDeleteVisible());

	}

}
