package com.sample.stepdef;

import java.net.URI;
import java.net.URISyntaxException;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.internal.RequestSpecificationImpl;
import io.restassured.response.Response;

public class MemberStepDef {
	
	RequestSpecBuilder builder = null;
	RequestSpecificationImpl requst = null;
	String url = null;
	Response response = null;
	
	public MemberStepDef() {
		builder = new RequestSpecBuilder();
		builder.addFilter(new RequestLoggingFilter());
		builder.addFilter(new ResponseLoggingFilter());
		requst = (RequestSpecificationImpl) RestAssured.given().spec(builder.build());
	}
	
	@Given("url is {string}")
	public void urlsIs(String url) throws Throwable {
		this.url = url;
	}
	
	@When("method is get")
	public void methodIsGet() throws URISyntaxException {
		response = requst.get(new URI(url));
	}
	
	@Then("the status code should be {int}")
	public void statuscode(int statusCode) {
		Assert.assertEquals(statusCode, response.getStatusCode());
	}

}
