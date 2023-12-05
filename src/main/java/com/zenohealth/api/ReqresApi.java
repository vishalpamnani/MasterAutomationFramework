package com.zenohealth.api;

import com.zenohealth.api.pojos.UserDetails;
import com.zenohealth.config.factory.ApiConfigFactory;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public final class ReqresApi {

	private ReqresApi() {}

	
	private static final String LIST_USERS_ENDPOINT = ApiConfigFactory.getConfig().listUsersEndpoint();
	private static final String CREATE_USERS_ENDPOINT = ApiConfigFactory.getConfig().listUsersEndpoint();

	public static Response getUsers() {

		return BaseRequestSpecification.getDefaultRequestSpec()
				.queryParam("page", 2)
				.get(LIST_USERS_ENDPOINT);

	}
	
	public static Response createUsers(UserDetails userDetails) {
		return BaseRequestSpecification.getDefaultRequestSpec()
				.contentType(ContentType.JSON)
				.body(userDetails)
				.post(CREATE_USERS_ENDPOINT);
		}

}
