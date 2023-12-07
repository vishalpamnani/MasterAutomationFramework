package com.zenohealth.pages;

import com.zenohealth.pages.pagecomponents.categorydetailpage.ShopByCategoryComponent;
import com.zenohealth.pages.pagecomponents.homepage.TopMenuComponent;
import com.zenohealth.pages.pagecomponents.subcategorydetailpage.TopBrandsComponent;
import com.zenohealth.pages.pagecomponents.subcategorydetailpage.TopDealsOnCategoryComponent;

public class SubCategoryDetailPage {
	
	private ShopByCategoryComponent shopByCategoryComponent;
	private TopDealsOnCategoryComponent topDealsOnCategoryComponent;
	private TopMenuComponent topMenuComponent;
	private TopBrandsComponent topBrandsComponent;
	
	public SubCategoryDetailPage(){
		this.topDealsOnCategoryComponent = new TopDealsOnCategoryComponent();
		this.shopByCategoryComponent = new ShopByCategoryComponent();
		this.topMenuComponent = new TopMenuComponent();
		this.topBrandsComponent = new TopBrandsComponent();
		
	}

	public TopDealsOnCategoryComponent getTopDealsOnCategoryComponent() {
		return topDealsOnCategoryComponent;
	}

	public TopMenuComponent getTopMenuComponent() {
		return topMenuComponent;
	}
	
	public ShopByCategoryComponent getShopByCategoryComponent() {
		return shopByCategoryComponent;
	}
	
	public TopBrandsComponent getTopBrandsComponent() {
		return topBrandsComponent;
	}


}
