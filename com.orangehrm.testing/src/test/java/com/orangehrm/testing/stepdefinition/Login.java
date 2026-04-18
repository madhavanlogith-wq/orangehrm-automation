package com.orangehrm.testing.stepdefinition;

import org.openqa.selenium.WebDriver;

import utils.DriverFactory;
import com.orangeHRM.seleniumuiframwork_Object_repository.Loginpage2;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {

    WebDriver driver;
    Loginpage2 loginPage;

    @Given("user is on login page")
    public void user_is_on_login_page() {

        // ✅ Get driver from DriverFactory (NOT Hook)
        this.driver = DriverFactory.getDriver();

        // safety check (important in real frameworks)
        if (driver == null) {
            throw new RuntimeException("Driver is null. Ensure initDriver() is called before scenario execution.");
        }

        loginPage = new Loginpage2(driver);

        System.out.println("Driver initialized: " + driver);
    }

    @When("user enters username {string}")
    public void user_enters_username(String username) {
        loginPage.enterUsername(username);
    }

    @When("user enters password {string}")
    public void user_enters_password(String password) {
        loginPage.enterPassword(password);
    }

    @When("user clicks on login button")
    public void user_clicks_on_login_button() {
        loginPage.clickLogin();
    }

    @Then("user should be redirected to dashboard")
    public void user_should_be_redirected_to_dashboard() {

        boolean status = loginPage.isDashboardDisplayed();

        if (!status) {
            throw new AssertionError("Login failed - Dashboard not displayed");
        }

        System.out.println("Login successful - Dashboard displayed");
    }
}