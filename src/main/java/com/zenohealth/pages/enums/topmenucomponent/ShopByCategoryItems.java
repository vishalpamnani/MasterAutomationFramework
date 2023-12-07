package com.zenohealth.pages.enums.topmenucomponent;

public enum ShopByCategoryItems {
	
	VITAMINS_AND_SUPPLEMENTS ("Vitamins & Supplements"),
	IMMUNITY_BOOSTERS("Immunity Boosters"),
	NUTRITIONAL_DRINKS("Nutritional Drinks");
	
	private final String name;
	
	public String getName() {
		return name;
	}
	
	ShopByCategoryItems(String name){
		this.name = name;
	}

}
