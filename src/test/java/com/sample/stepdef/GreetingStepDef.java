package com.sample.stepdef;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.ui.ModelMap;

import com.sample.controller.service.GreetingService;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.spring.CucumberContextConfiguration;

@CucumberContextConfiguration
@ContextConfiguration(classes = GreetingService.class)
public class GreetingStepDef {
	
	@Autowired GreetingService service;
	
	@Given("I want to greet person.")
	public void scenario_fruits() {
		System.out.println("I want to greet person.");
	}
	
	@When("I send name {string}.")
	public void scenario_fruit(String name) {
		service.greet(name, new ModelMap());
		System.out.println(service.greet(name, new ModelMap()));
	}
	
	@Then("verify greeting {string}.")
	public void scenario_fruit_color(String name) {
		System.out.println("color is :: "+name);
	}

}
