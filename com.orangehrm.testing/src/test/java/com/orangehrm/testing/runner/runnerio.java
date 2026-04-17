package com.orangehrm.testing.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features= {"./src/test/java/com/orangehrm/testing/featurefile/AdminUserManagement.feature"},
glue="stepdefinition",
dryRun=false)

public class runnerio extends AbstractTestNGCucumberTests{

}
