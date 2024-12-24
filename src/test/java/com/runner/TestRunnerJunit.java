package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= { "src/test/resources/Features/HomeLoans.feature","src/test/resources/Features/HomeLoans.feature"},
				glue="com.stepdefinition",
				plugin= {"pretty","html:target/cucumber-reports.html"})
public class TestRunnerJunit {

}
