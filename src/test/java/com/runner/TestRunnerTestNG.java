package com.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//public class TestRunnerTestNG {
	@CucumberOptions(features = "src/test/resources/sell.feature",
			         glue="com.stepdefinition",
			         plugin= {"pretty","html:target/cucumber-reports.html"})
	
	public class TestRunnerTestNG extends AbstractTestNGCucumberTests {

}
