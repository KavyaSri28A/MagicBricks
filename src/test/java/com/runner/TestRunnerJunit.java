package com.runner;

import org.junit.runner.RunWith;

 
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
 
@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/Features/homeinteriors.feature",
		glue="com.stepdefinition",plugin= {"pretty","html:FinalReports/cucumber-reports.html"})

public class TestRunnerJunit {

}
