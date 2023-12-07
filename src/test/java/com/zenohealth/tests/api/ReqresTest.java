package com.zenohealth.tests.api;

import java.io.IOException;

import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.zenohealth.api.ReqresApi;
import com.zenohealth.api.pojos.UserDetails;
import com.zenohealth.tests.api.assertwrapper.ResponseAssert;
import com.zenohealth.tests.api.testdata.UserTestData;

import io.restassured.response.Response;

public class ReqresTest {
	
	
	
	@Test
	void testListUsersApi() { //Intention -> Make a api call and get the response
		
		Response response = ReqresApi.getUsers();
		int actualStatusCode = response.statusCode();
		
		//Assertions
		Assertions.assertThat(actualStatusCode)
			.isEqualTo(200);
	}
	
	@Test
	void createNewUser() throws StreamReadException, DatabindException, IOException {
		UserDetails userDetails = UserTestData.getuserDetails();
		
		Response response = ReqresApi.createUsers(userDetails);
		
		//Assertions
		
		ResponseAssert.assertThat(response)
			.statusCodeIs(201);
		
		
	}

}
