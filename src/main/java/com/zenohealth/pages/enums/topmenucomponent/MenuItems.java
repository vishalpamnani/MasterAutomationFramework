package com.zenohealth.pages.enums.topmenucomponent;

public enum MenuItems {
	
	HEALTH_RESOURCE_CENTER ("Health Resource Center"),
	VITAMINS_NUTRITION("Vitamins & Nutrition"),
	DIABETES("Diabetes");
	
	private final String name;
	
	public String getName() {
		return name;
	}
	
	MenuItems(String name){
		this.name = name;
	}

}
