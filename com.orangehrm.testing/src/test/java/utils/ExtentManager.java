package utils;

import com.aventstack.extentreports.*;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {

    private static ExtentReports extent;

    public static ExtentReports getReport() {

        if (extent == null) {
            ExtentSparkReporter spark = new ExtentSparkReporter("./Reports/ExtentReport.html");

            extent = new ExtentReports();
            extent.attachReporter(spark);

            extent.setSystemInfo("Tester", "Aswin");
            extent.setSystemInfo("Project", "OrangeHRM");
        }

        return extent;
    }
}