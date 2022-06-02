package com.sample;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@CucumberOptions(plugin = { "html:target/cucumber-html-report", "json:target/cucumber.json" },
features = {"src/test/resources/feature" },
glue = {"com/sample/stepdef" },
monochrome = true, snippets = SnippetType.CAMELCASE)
@RunWith(Cucumber.class)
public class GreetingRunner {

}
