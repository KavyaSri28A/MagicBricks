package com.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/Features",
glue="stepdefinition",
plugin= {"pretty","html:target/cucumber-reports.html"})
public class TestRunnerTestNG extends AbstractTestNGCucumberTests{

}
