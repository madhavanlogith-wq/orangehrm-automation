package com.orangehrm.testing.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(
        features = "src/test/java/com/orangehrm/testing/featurefile",
        glue = {"com.orangehrm.testing.stepdefinition"},
        plugin = {
                "pretty",
                "html:target/report.html",
                "json:target/report.json"
        },
        dryRun = false,
        monochrome = true
)
public class RunnerIo extends AbstractTestNGCucumberTests {

    // PARALLEL EXECUTION
    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}


//package com.orangehrm.testing.runner;
//
//import io.cucumber.testng.AbstractTestNGCucumberTests;
//import io.cucumber.testng.CucumberOptions;
//
//@CucumberOptions(
//        features = "src/test/java/com/orangehrm/testing/featurefile/timefeaturefile.feature",
//        glue = {"com.orangehrm.testing.stepdefinition"},
//        plugin = {
//                "pretty",
//                "html:target/report.html",
//                "json:target/report.json"
//        },
//        monochrome = true
//)
//
//public class RunnerIo extends AbstractTestNGCucumberTests {
//}