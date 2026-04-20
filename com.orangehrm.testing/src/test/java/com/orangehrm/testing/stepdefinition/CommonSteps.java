//package com.orangehrm.testing.stepdefinition;
//
//import org.openqa.selenium.WebDriver;
//import io.cucumber.java.en.Given;
//import com.orangeHRM.seleniumuiframwork_genricutility.Pages;
//
//public class CommonSteps {
//
//    WebDriver driver;
//    Pages pages;
//
//    public CommonSteps() {
//        this.driver = Hook.getDriver();
//        this.pages = new Pages(driver);
//    }
//
//    @Given("user is on Time page")
//    public void user_is_on_time_page() {
//
//        // Navigate using Page Object (NOT locator in step)
//        pages.getAttendance().openTimeModule();
//    }
//}

package com.orangehrm.testing.stepdefinition;

import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Given;
import com.orangeHRM.seleniumuiframwork_genricutility.Pages;

public class CommonSteps {

    WebDriver driver;
    Pages pages;

    public CommonSteps() {
        this.driver = Hook.getDriver();
        this.pages = new Pages(driver);
    }

    @Given("user is on Time page")
    public void user_is_on_time_page() {

        // PageFactory style access
        pages.attendance.openTimeModule();
    }
}