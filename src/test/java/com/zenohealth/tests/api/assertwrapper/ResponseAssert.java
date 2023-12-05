package com.zenohealth.tests.api.assertwrapper;

import org.assertj.core.api.AbstractAssert;
import org.assertj.core.api.SoftAssertions;

import io.restassured.response.Response;

public class ResponseAssert extends AbstractAssert<ResponseAssert, Response>{
	
	private SoftAssertions softAssertions;

	private ResponseAssert(Response response) {
		super(response, ResponseAssert.class);
		softAssertions = new SoftAssertions();
		
	}
	
	public static ResponseAssert assertThat(Response response) {
		return new ResponseAssert(response);
	}
	
	
	public ResponseAssert statusCodeIs(int expectedStatusCode) {
		softAssertions.assertThat(actual.statusCode())
				.isEqualTo(expectedStatusCode);
		return this;
	}

}
