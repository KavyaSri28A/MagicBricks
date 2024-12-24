package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
	    features = "src/test/resources/Features/rent.feature",
	    glue = { "com.stepdefinition","com.setup"})
public class TestRunnerJunit {

}
