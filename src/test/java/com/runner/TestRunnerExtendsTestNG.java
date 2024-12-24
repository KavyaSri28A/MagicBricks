package com.runner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
			@CucumberOptions(features = "src/test/resources/Features/homeinteriors.feature",

			glue="com.stepdefinition",

			plugin= {"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})

			 

public class TestRunnerExtendsTestNG extends AbstractTestNGCucumberTests {

			 
}
