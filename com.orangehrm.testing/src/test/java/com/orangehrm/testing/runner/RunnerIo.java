package com.orangehrm.testing.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
	    features = "src/test/java/com/orangehrm/testing/featurefile/claimfeatureFile.feature",
	    glue = {"com.orangehrm.testing.stepdefinition"},
	    plugin = {"pretty", "html:target/report.html"},dryRun =false)

public class RunnerIo extends AbstractTestNGCucumberTests  {

}
