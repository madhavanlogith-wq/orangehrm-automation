package report;

import org.testng.annotations.Test;
import com.aventstack.extentreports.*;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReport {

    @Test
    public void practice() {

        // Create report object
        ExtentReports report = new ExtentReports();

        // Create reporter
        ExtentSparkReporter spark = new ExtentSparkReporter("./Reports/sample_report.html");

        report.attachReporter(spark);

        // Create test
        ExtentTest test = report.createTest("Sample Test");

        // Logging
        test.info("Started test execution");
        test.pass("Step passed");
        test.fail("Step failed");

        // Flush report
        report.flush();
    }
}