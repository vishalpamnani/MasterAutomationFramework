package com.zenohealth.tests;

import org.testng.annotations.Test;

public class DemoTest {
	
	@Test
	public void testLogin() {
		
		System.out.println(com.zenohealth.config.ConfigFactory.getConfig().browser());
		
	}

}
