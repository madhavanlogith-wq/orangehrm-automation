//package com.orangehrm.testing.stepdefinition;
//
//import io.cucumber.java.After;
//import io.cucumber.java.Before;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import com.orangeHRM.seleniumuiframwork_Object_repository.Loginpage2;
//
//public class Hook {
//
//    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();
//
//    @Before
//    public void setUp() {
//
//        WebDriver d = new ChromeDriver();
//        driver.set(d);
//
//        d.manage().window().maximize();
//        d.get("https://opensource-demo.orangehrmlive.com/");
//
//        // Login
//        Loginpage2 login = new Loginpage2(d);
//        login.enterUsername("Admin");
//        login.enterPassword("admin123");
//        login.clickLogin();
//
//        System.out.println("Login completed via Hook");
//    }
//
//    @After
//    public void tearDown() {
//        if (driver.get() != null) {
//            driver.get().quit();
//            driver.remove();
//        }
//    }
//
//    // SINGLE SOURCE OF DRIVER
//    public static WebDriver getDriver() {
//        return driver.get();
//    }
//}

//package com.orangehrm.testing.stepdefinition;
//
//import io.cucumber.java.After;
//import io.cucumber.java.Before;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import com.orangeHRM.seleniumuiframwork_Object_repository.Loginpage2;
//
//public class Hook {
//
//    private static WebDriver driver;
//
//    @Before
//    public void setUp() {
//
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//
//        driver.get("https://opensource-demo.orangehrmlive.com/");
//
//        // ✅ Login
//        Loginpage2 login = new Loginpage2(driver);
//        login.enterUsername("Admin");
//        login.enterPassword("admin123");
//        login.clickLogin();
//
//        System.out.println("Login completed via Hook");
//    }
//
//    @After
//    public void tearDown() {
//        if (driver != null) {
//            driver.quit();
//        }
//    }
//
//    // ✅ SINGLE SOURCE OF DRIVER
//    public static WebDriver getDriver() {
//        return driver;
//    }
//}
//
//

package com.orangehrm.testing.stepdefinition;

import io.cucumber.java.Before;
import io.cucumber.java.After;
import utils.DriverFactory;

public class Hook {

    @Before
    public void setUp() {
        DriverFactory.initDriver();   // start browser
    }

    @After
    public void tearDown() {
        DriverFactory.quitDriver();   // close browser
    }
}
