package com.orangehrm.testing.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
<<<<<<< HEAD
<<<<<<< HEAD

@CucumberOptions(
		features = {"C:\\Users\\acer\\git\\orangehrm-automation\\com.orangehrm.testing\\src\\test\\java\\com\\orangehrm\\testing\\featurefile\\LeaveModule.feature"},
		glue = "com.orangehrm.testing.stepdefinition",
		dryRun = false
		)
public class RunnerIo extends AbstractTestNGCucumberTests{
=======
>>>>>>> refs/remotes/origin/user5

<<<<<<< HEAD
}

// .src/test/java/com/orangehrm/testing/featurefile/LeaveModule.feature
=======
@CucumberOptions(
    features = "src/test/java/com/orangehrm/testing/featurefile/MyInfo.feature",
    glue = "com.orangehrm.testing.stepdefinition",
    dryRun = false
)

public class RunnerIo extends AbstractTestNGCucumberTests {
=======

@CucumberOptions(
	    features = "src/test/java/com/orangehrm/testing/featurefile/timefeatureFile.feature",
	    glue = {"com.orangehrm.testing.stepdefinition"},
	    plugin = {"pretty", "html:target/report.html"},dryRun =false)

public class RunnerIo extends AbstractTestNGCucumberTests  {
>>>>>>> refs/remotes/origin/user3

}
>>>>>>> refs/remotes/origin/user5
