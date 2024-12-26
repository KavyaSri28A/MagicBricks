package com.runner;

import io.cucumber.junit.CucumberOptions;

@CucumberOptions(features="src/test/resources/Features/Buy.feature",
				glue="com.stepdefinition",
				plugin= {"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter"})
public class TestRunnerExtendedTestNG {

}
