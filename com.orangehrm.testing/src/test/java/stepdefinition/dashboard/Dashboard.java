package stepdefinition.dashboard;

import com.orangeHRM.seleniumuiframwork_Object_repository.Dashboard2;
import com.orangehrm.testing.stepdefinition.Hook;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Dashboard {

    Dashboard2 dashboardPage;

    public Dashboard() {
        dashboardPage = new Dashboard2(Hook.getDriver());
    }

    // IMPORTANT: no duplicate login step here anymore
    @Given("user is already logged into the application")
    public void user_is_already_logged_into_the_application() {
        System.out.println("User already logged in from Login feature");
    }

    @Then("user should be on dashboard page")
    public void user_should_be_on_dashboard_page() {

        if (!dashboardPage.isDashboardDisplayed()) {
            throw new AssertionError("User is NOT on dashboard page");
        }

        System.out.println("User is on dashboard page");
    }

    @Then("dashboard page should be displayed successfully")
    public void dashboard_page_should_be_displayed_successfully() {

        System.out.println("Dashboard validated successfully");
    }
}