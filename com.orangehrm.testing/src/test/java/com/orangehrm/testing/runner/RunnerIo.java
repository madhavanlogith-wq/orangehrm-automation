package com.orangehrm.testing.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"C:\\Users\\acer\\git\\orangehrm-automation\\com.orangehrm.testing\\src\\test\\java\\com\\orangehrm\\testing\\featurefile\\LeaveModule.feature"},
		glue = "com.orangehrm.testing.stepdefinition",
		dryRun = false
		)
public class RunnerIo extends AbstractTestNGCucumberTests{

}

// .src/test/java/com/orangehrm/testing/featurefile/LeaveModule.feature