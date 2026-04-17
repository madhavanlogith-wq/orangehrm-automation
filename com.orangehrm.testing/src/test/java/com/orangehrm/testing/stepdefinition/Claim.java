package com.orangehrm.testing.stepdefinition;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;

import com.orangeHRM.seleniumuiframwork_Object_repository.Submit_Claim;

public class Claim {

    WebDriver driver;
    Submit_Claim claimPage;

    public Claim() {
        this.driver = Hook.getDriver();
        claimPage = new Submit_Claim(driver);
    }

    @Given("user is on dashboard")
    public void user_is_on_dashboard() {
        System.out.println("User is on dashboard");
    }

    @When("user navigates to Submit Claim section")
    public void user_navigates_to_submit_claim_section() {
        claimPage.openClaimModule();     // CLICK CLAIM MENU FIRST
        claimPage.openSubmitClaimTab();
    }

    @When("user selects event as {string}")
    public void user_selects_event_as(String event) {
        claimPage.selectEvent(event);
    }

    @When("user selects currency as {string}")
    public void user_selects_currency_as(String currency) {
        claimPage.selectCurrency(currency);
    }

    @When("user enters remarks {string}")
    public void user_enters_remarks(String remarks) {
        claimPage.enterRemarks(remarks);
    }

    @When("user clicks on Create button")
    public void user_clicks_on_create_button() {
        claimPage.clickCreate();
    }

    @Then("user should be navigated to claim details page")
    public void user_should_be_navigated_to_claim_details_page() {
        System.out.println("Claim details page opened");
    }

    @When("user clicks Submit button")
    public void user_clicks_submit_button() {
    	claimPage.clickSubmit();
    	claimPage.waitForSubmission();
    }

    @Then("claim should be submitted successfully")
    public void claim_should_be_submitted_successfully() {

        if (!claimPage.isClaimSubmitted()) {
            throw new AssertionError("Claim submission failed (UI state not changed)");
        }

        System.out.println("Claim submitted successfully (Submit gone + Cancel visible)");
    }
}