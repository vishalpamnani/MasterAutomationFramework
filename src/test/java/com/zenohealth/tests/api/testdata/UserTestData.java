package com.zenohealth.tests.api.testdata;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.zenohealth.api.pojos.UserDetails;

import lombok.SneakyThrows;

public final class UserTestData {
	
	private UserTestData() {}
	
	
	@SneakyThrows
	public static UserDetails getuserDetails() {
		
		return new ObjectMapper()
				.readValue(new File(System.getProperty("user.dir")+"/src/test/resources/requests/create-user.json"), UserDetails.class);
		
	}

}
