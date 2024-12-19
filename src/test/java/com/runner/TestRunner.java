package com.runner;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
	    features = "src/test/resources/features/rent_property_search.feature",
	    glue = "stepDefinitions",
	    plugin = {"pretty", "html:target/cucumber-report.html"}
	)


public class TestRunner extends AbstractTestNGCucumberTests{

}