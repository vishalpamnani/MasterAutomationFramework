package com.zenohealth.pages;

import com.zenohealth.pages.pagecomponents.categorydetailpage.ShopByCategoryComponent;
import com.zenohealth.pages.pagecomponents.categorydetailpage.TopDealsComponent;
import com.zenohealth.pages.pagecomponents.homepage.TopMenuComponent;

public class CategoryDetailPage {
	
	private ShopByCategoryComponent shopByCategoryComponent;
	private TopDealsComponent topDealsComponent;
	private TopMenuComponent topMenuComponent;
	
	public CategoryDetailPage() {
		this.topDealsComponent = new TopDealsComponent();
		this.shopByCategoryComponent = new ShopByCategoryComponent();
	}

	public TopDealsComponent getTopDealsComponent() {
		return topDealsComponent;
	}

	public TopMenuComponent getTopMenuComponent() {
		return topMenuComponent;
	}
	
	public ShopByCategoryComponent getShopByCategoryComponent() {
		return shopByCategoryComponent;
	}

}
