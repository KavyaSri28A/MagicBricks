package com.runner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = { "src/test/resources/Features/HomeLoans.feature","src/test/resources/Features/HomeLoans.feature"},
				glue="com.stepdefinition",
				plugin= {"pretty","html:target/cucumber-reports.html"})
public class TestRunnerParellal extends AbstractTestNGCucumberTests{
	@Override
	@DataProvider(parallel=true)
	public Object[][] scenarios(){
		return super.scenarios();
	}
}
