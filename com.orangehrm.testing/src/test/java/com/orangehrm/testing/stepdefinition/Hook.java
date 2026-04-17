package com.orangehrm.testing.stepdefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.orangeHRM.seleniumuiframwork_Object_repository.Loginpage2;
import com.orangeHRM.seleniumuiframwork_genricutility.Base;

public class Hook {

    public static WebDriver driver;
    private Base base;
    
    public Hook(Base base) {
    	this.base=base;
    }

    @Before
    public void setUp() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://opensource-demo.orangehrmlive.com/");

        // LOGIN HERE FOR EVERY SCENARIO
        Loginpage2 login = new Loginpage2(driver);
        login.enterUsername("Admin");
        login.enterPassword("admin123");
        login.clickLogin();

        System.out.println("Login completed via Hook");
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    public static WebDriver getDriver() {
        return driver;
    }
}