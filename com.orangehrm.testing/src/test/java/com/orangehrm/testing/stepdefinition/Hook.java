   

//package com.orangehrm.testing.stepdefinition;
//
//import com.orangeHRM.seleniumuiframwork_genricutility.Base;
//import io.cucumber.java.After;
//import io.cucumber.java.Before;
//
//import com.orangeHRM.seleniumuiframwork_Object_repository.Loginpage2;
//
//public class Hook extends Base {
//
//    @Before
//    public void setUp() {
//
//        initDriver();
//        getDriver().get("https://opensource-demo.orangehrmlive.com/");
//
//        // Login
//        Loginpage2 login = new Loginpage2(getDriver());
//        login.enterUsername("Admin");
//        login.enterPassword("admin123");
//        login.clickLogin();
//
//        System.out.println("Login completed via Hook");
//    }
//
//    @After
//    public void tearDown() {
//        quitDriver();
//    }
//}

//package com.orangehrm.testing.stepdefinition;
//
//import com.aventstack.extentreports.*;
//import com.orangeHRM.seleniumuiframwork_genricutility.*;
//
//import io.cucumber.java.*;
//
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//
//import com.orangeHRM.seleniumuiframwork_Object_repository.Loginpage2;
//
//public class Hook extends Base {
//
//    static ExtentReports extent = ExtentReport.getInstance();
//
//    @Before
//    public void setUp(Scenario scenario) {
//
//        initDriver();
//        getDriver().get("https://opensource-demo.orangehrmlive.com/");
//
//        // 🔥 Create Extent Test
//        ExtentTest test = extent.createTest(scenario.getName());
//        ExtentTestManager.setTest(test);
//
//        // Login
//        Loginpage2 login = new Loginpage2(getDriver());
//        login.enterUsername("Admin");
//        login.enterPassword("admin123");
//        login.clickLogin();
//    }
//
//    @After
//    public void tearDown(Scenario scenario) {
//
//        if (scenario.isFailed()) {
//
//            // Screenshot file
//            String path = ScreenshotUtil.captureScreenshot(
//                getDriver(),
//                scenario.getName().replaceAll(" ", "_")
//            );
//
//            // Attach to Extent
//            ExtentTestManager.getTest().fail("Test Failed")
//                    .addScreenCaptureFromPath(path);
//
//            // Attach to Cucumber
//            byte[] screenshot = ((TakesScreenshot) getDriver())
//                    .getScreenshotAs(OutputType.BYTES);
//
//            scenario.attach(screenshot, "image/png", scenario.getName());
//
//        } else {
//            ExtentTestManager.getTest().pass("Test Passed");
//        }
//
//        quitDriver();
//    }
//
//    @AfterAll
//    public static void flushReport() {
//        extent.flush(); // 🔥 VERY IMPORTANT
//    }
//}


package com.orangehrm.testing.stepdefinition;

import com.aventstack.extentreports.*;
import com.orangeHRM.seleniumuiframwork_genricutility.*;
import com.orangeHRM.seleniumuiframwork_Object_repository.Loginpage2;

import io.cucumber.java.*;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Hook extends Base {

    static ExtentReports extent = ExtentReport.getInstance();

    WebDriver driver;

    @Before
    public void setUp(Scenario scenario) {

        // ================= DRIVER INIT =================
        initDriver();
        driver = getDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/");

        // ================= EXTENT REPORT =================
        ExtentTest test = extent.createTest(scenario.getName());
        ExtentTestManager.setTest(test);

        // ================= LOGIN =================
        doLogin(driver);
    }

    // ================= LOGIN METHOD =================
    public void doLogin(WebDriver driver) {

        Loginpage2 login = new Loginpage2(driver);
        login.enterUsername("Admin");
        login.enterPassword("admin123");
        login.clickLogin();
    }

    @After
    public void tearDown(Scenario scenario) {

        if (scenario.isFailed()) {

            String path = ScreenshotUtil.captureScreenshot(
                driver,
                scenario.getName().replaceAll(" ", "_")
            );

            ExtentTestManager.getTest()
                .fail("Test Failed")
                .addScreenCaptureFromPath(path);

            byte[] screenshot = ((TakesScreenshot) driver)
                .getScreenshotAs(OutputType.BYTES);

            scenario.attach(screenshot, "image/png", scenario.getName());

        } else {
            ExtentTestManager.getTest().pass("Test Passed");
        }

        quitDriver();
    }

    @AfterAll
    public static void flushReport() {
        extent.flush();
    }
}
