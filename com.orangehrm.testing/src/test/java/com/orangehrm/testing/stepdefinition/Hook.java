//package com.orangehrm.testing.stepdefinition;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import com.orangeHRM.seleniumuiframwork_Object_repository.Loginpage2;
//import com.orangeHRM.seleniumuiframwork_genricutility.Pages;
//
//import io.cucumber.java.After;
//import io.cucumber.java.Before;
//
//public class Hook {
//
//    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();
//    public static Pages pages;
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
//        // ================= INIT PAGES =================
//        pages = new Pages(d);
//
//        // ================= LOGIN (OPTIONAL MOVE TO LOGIN STEP) =================
//        Loginpage2 login = new Loginpage2(d);
//        login.enterUsername("Admin");
//        login.enterPassword("admin123");
//        login.clickLogin();
//
//        System.out.println("Browser launched + Login completed");
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
//    public static WebDriver getDriver() {
//        return driver.get();
//    }
//
//    public static Pages getPages() {
//        return pages;
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
//        try {
//            if (driver.get() != null) {
//                driver.get().quit();
//            }
//        } catch (Exception e) {
//            System.out.println("Driver already closed or crashed");
//        } finally {
//            driver.remove();
//        }
//    }
//
//    public static WebDriver getDriver() {
//        return driver.get();
//    }
//}

//package com.orangehrm.testing.stepdefinition;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import com.orangeHRM.seleniumuiframwork_Object_repository.Loginpage2;
//import com.orangeHRM.seleniumuiframwork_genricutility.Pages;
//
//import io.cucumber.java.After;
//import io.cucumber.java.Before;
//
//public class Hook {
//
//    private static WebDriver driver;
//    public static Pages pages;
//
//    @Before
//    public void setUp() {
//
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("https://opensource-demo.orangehrmlive.com/");
//
//        // Initialize Pages class
//        pages = new Pages(driver);
//
//        // Login (if you want global login for all scenarios)
//        Loginpage2 login = new Loginpage2(driver);
//        login.enterUsername("Admin");
//        login.enterPassword("admin123");
//        login.clickLogin();
//
//        System.out.println("Browser launched + Login completed");
//    }
//
//    @After
//    public void tearDown() {
//        if (driver != null) {
//            driver.quit();
//        }
//    }
//
//    public static WebDriver getDriver() {
//        return driver;
//    }
//
//    public static Pages getPages() {
//        return pages;
//    }
//}


   

package com.orangehrm.testing.stepdefinition;

import com.orangeHRM.seleniumuiframwork_genricutility.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import com.orangeHRM.seleniumuiframwork_Object_repository.Loginpage2;

public class Hook extends Base {

    @Before
    public void setUp() {

        initDriver();
        getDriver().get("https://opensource-demo.orangehrmlive.com/");

        // Login
        Loginpage2 login = new Loginpage2(getDriver());
        login.enterUsername("Admin");
        login.enterPassword("admin123");
        login.clickLogin();

        System.out.println("Login completed via Hook");
    }

    @After
    public void tearDown() {
        quitDriver();
    }
}