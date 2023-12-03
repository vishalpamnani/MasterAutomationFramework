package com.zenohealth.tests.web;

import org.testng.annotations.Test;

import com.zenohealth.config.factory.BrowserStackConfigFactory;
import com.zenohealth.tests.web.base.WebBase;

public class DemoTest extends WebBase {
	
	@Test
	public void testLogin() {
		
		
		System.out.println(BrowserStackConfigFactory.getConfig().browserStackURL());
		
	}

}
