package com.orangehrm.testing.stepdefinition;

import java.io.IOException;

import org.openqa.selenium.edge.EdgeDriver;

import com.orangeHRM.seleniumuiframwork_genricutility.AllUtilityFunctions;
import com.orangeHRM.seleniumuiframwork_genricutility.Base;
import com.orangeHRM.seleniumuiframwork_genricutility.Pages;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends AllUtilityFunctions {

    private Base base;

    // Constructor Injection
    public Hooks(Base base) {
        this.base = base;
    }

    @Before
    public void setup() throws IOException {

        // Launch Browser
        base.driver = new EdgeDriver();

        // Load properties file
        initProperties("./src/test/resources/Reader/commondata.properties");

        String URL = getPropertyValue("url");
        String USER = getPropertyValue("username");
        String PASS = getPropertyValue("password");

        // Browser setup
        configMaximizedBrowser(base.driver);
        implicit(base.driver);

        // Open application
        base.driver.get(URL);

        // Load all page objects
        Pages.loadAllPages(base.driver);

        // Login
        Pages.loginPage.loginPage(USER, PASS);
    }

    @After
    public void teardown() {

        // Logout
        Pages.dashboardPage.logout();

        // Close browser
        base.driver.quit();
    }
}
