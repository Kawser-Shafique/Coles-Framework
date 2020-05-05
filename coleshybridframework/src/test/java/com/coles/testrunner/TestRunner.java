package com.coles.testrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions (
		
		features = {"Features"},
		glue = {"com.coles.steps"},
		tags = {"@colessearch"}
		
		)
public class TestRunner extends AbstractTestNGCucumberTests {

}
