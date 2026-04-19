package com.orangehrm.testing.stepdefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.orangehrm.testing.utilities.BaseClass;
import com.orangehrm.testing.utilities.Pages;

import java.time.Duration;

public class Hooks {

    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    @Before
    public void setup() {

        WebDriver d = new EdgeDriver();
        driver.set(d);

        d.manage().window().maximize();
        d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        d.get("https://opensource-demo.orangehrmlive.com/");

        // ✅ FIXED: thread-safe driver
        BaseClass.setDriver(d);

        // Load pages
        Pages.loadAllPages(d);

        // Login
        Pages.lp.login("Admin", "admin123");

        System.out.println("Login done in Thread: " + Thread.currentThread().getId());
    }

    @After
    public void teardown() {

        if (BaseClass.getDriver() != null) {
            BaseClass.getDriver().quit();
            BaseClass.unload();
        }
    }
}