package com.orangehrm.testing.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(
        features = "src/test/java/com/orangehrm/testing/featurefile",
        glue = "com.orangehrm.testing.stepdefinition",
        plugin = {
                "pretty",
                "html:target/cucumber-report.html"
        },
        monochrome = true
)
public class RunnerIo extends AbstractTestNGCucumberTests {

    // 🔥 THIS IS REQUIRED FOR PARALLEL EXECUTION
    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}