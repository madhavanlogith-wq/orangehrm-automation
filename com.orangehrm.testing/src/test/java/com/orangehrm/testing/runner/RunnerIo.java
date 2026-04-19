package com.orangehrm.testing.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features= {"./src/test/java/com/orangehrm/testing/featurefile/orgAndQua.feature","./src/test/java/com/orangehrm/testing/featurefile/addEmp.feature","./src/test/java/com/orangehrm/testing/featurefile/addJobTitle.feature","./src/test/java/com/orangehrm/testing/featurefile/AdminUserManagement.feature","./src/test/java/com/orangehrm/testing/featurefile/cusData.feature"},
glue = {"com.orangehrm.testing.stepdefinition"},
dryRun = false
		)
public class RunnerIo extends AbstractTestNGCucumberTests{

}