package com.zenohealth.pages;

import com.zenohealth.pages.pagecomponents.cartpage.ProductListComponent;

public class CartPage {
	
	private ProductListComponent productListComponent;
	
	public CartPage() {
		this.productListComponent = new ProductListComponent();
	}

	public ProductListComponent getProductListComponent() {
		return productListComponent;
	}
	
	
	

}
