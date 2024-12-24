package com.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
	    features = "src/test/resources/Features/rent.feature",
	    glue = {"com.stepdefinition","com.setup"},
	    plugin = {"pretty", "html:target/cucumber-report.html"}
	)


public class TestRunner extends AbstractTestNGCucumberTests{

}