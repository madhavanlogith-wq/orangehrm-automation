//package com.orangehrm.testing.stepdefinition;
//
//import org.openqa.selenium.WebDriver;
//import com.orangehrm.testing.stepdefinition.Hook;
//import org.testng.Assert;
//
//import com.orangeHRM.selemiumuiframework_Object_repository.claim.My_Claims;
//import com.orangeHRM.selemiumuiframework_Object_repository.claim.Submit_Claim;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class Claim {
//
//    WebDriver driver;
//    Submit_Claim submitClaimPage;
//    My_Claims myClaimsPage;
//
//    public Claim() {
//        this.driver = Hook.getDriver();
//        this.submitClaimPage = new Submit_Claim(driver);
//        this.myClaimsPage = new My_Claims(driver);
//    }
//
//    // ================= SUBMIT CLAIM FLOW =================
//
//    @Given("user is on dashboard")
//    public void user_is_on_dashboard() {
//        System.out.println("User is on dashboard");
//    }
//
//    @When("user navigates to Submit Claim section")
//    public void user_navigates_to_submit_claim_section() {
//        submitClaimPage.openClaimModule();
//        submitClaimPage.openSubmitClaimTab();
//    }
//
//    @When("user selects event as {string}")
//    public void user_selects_event_as(String event) {
//        submitClaimPage.selectEvent(event);
//    }
//
//    @When("user selects currency as {string}")
//    public void user_selects_currency_as(String currency) {
//        submitClaimPage.selectCurrency(currency);
//    }
//
//    @When("user enters remarks {string}")
//    public void user_enters_remarks(String remarks) {
//        submitClaimPage.enterRemarks(remarks);
//    }
//
//    @When("user clicks on Create button")
//    public void user_clicks_on_create_button() {
//        submitClaimPage.clickCreate();
//    }
//
//    @Then("user should be navigated to claim details page")
//    public void user_should_be_navigated_to_claim_details_page() {
//        System.out.println("Claim details page opened");
//    }
//
//    @When("user clicks Submit button")
//    public void user_clicks_submit_button() {
//        submitClaimPage.clickSubmit();
//        submitClaimPage.waitForSubmission();
//    }
//
//    @Then("claim should be submitted successfully")
//    public void claim_should_be_submitted_successfully() {
//
//        String url = driver.getCurrentUrl();
//
//        Assert.assertTrue(
//            url.contains("/claim/submitClaim/id/"),
//            "Claim not submitted. Actual URL: " + url
//        );
//    
//    }
//
//    // ================= MY CLAIMS FLOW =================
//
//    @When("user navigates to Claim module")
//    public void user_navigates_to_claim_module() {
//        submitClaimPage.openClaimModule();
//    }
//
//    @When("user clicks on My Claims section")
//    public void user_clicks_on_my_claims_section() {
//        myClaimsPage.openMyClaims();
//    }
//
//    @When("user enters reference ID {string}")
//    public void user_enters_reference_id(String refId) {
//        myClaimsPage.enterReferenceId(refId);
//    }
//
//    @When("user selects reference ID from dropdown")
//    public void user_selects_reference_id_from_dropdown() {
//        myClaimsPage.selectReferenceFromDropdown();
//    }
//
//    @When("user clicks on Search button")
//    public void user_clicks_on_search_button() {
//        myClaimsPage.clickSearch();
//    }
//
//    @When("user clicks on View button for the claim")
//    public void user_clicks_on_view_button_for_the_claim() {
//        myClaimsPage.clickView();
//    }
//
//    @Then("user should be redirected to claim details page")
//    public void user_should_be_redirected_to_claim_details_page() {
//        System.out.println("Navigated to Claim Details Page");
//    }
//
//    @Then("URL should contain claim id")
//    public void url_should_contain_claim_id() {
//
//        String url = driver.getCurrentUrl();
//
//        Assert.assertTrue(
//                url.matches(".*/claim/submitClaim/id/\\d+"),
//                "URL is not in expected format. Actual URL: " + url
//        );
//    }
//}


//package com.orangehrm.testing.stepdefinition;
//
//import org.openqa.selenium.WebDriver;
//import org.testng.Assert;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import com.orangeHRM.seleniumuiframwork_genricutility.Pages;
//
//public class Claim {
//
//    WebDriver driver;
//    Pages pages;
//
//    public Claim() {
//        this.driver = Hook.getDriver();
//        this.pages = new Pages(driver);
//    }
//
//    // ================= SUBMIT CLAIM FLOW =================
//
//    @Given("user is on dashboard")
//    public void user_is_on_dashboard() {
//        System.out.println("User is on dashboard");
//    }
//
//    @When("user navigates to Submit Claim section")
//    public void user_navigates_to_submit_claim_section() {
//        Pages.submitClaim.openClaimModule();
//        Pages.submitClaim.openSubmitClaimTab();
//    }
//
//    @When("user selects event as {string}")
//    public void user_selects_event_as(String event) {
//        Pages.submitClaim.selectEvent(event);
//    }
//
//    @When("user selects currency as {string}")
//    public void user_selects_currency_as(String currency) {
//        Pages.submitClaim.selectCurrency(currency);
//    }
//
//    @When("user enters remarks {string}")
//    public void user_enters_remarks(String remarks) {
//        Pages.submitClaim.enterRemarks(remarks);
//    }
//
//    @When("user clicks on Create button")
//    public void user_clicks_on_create_button() {
//        Pages.submitClaim.clickCreate();
//    }
//
//    @Then("user should be navigated to claim details page")
//    public void user_should_be_navigated_to_claim_details_page() {
//
//        Assert.assertTrue(
//            driver.getCurrentUrl().contains("/claim/submitClaim"),
//            "Not navigated to Claim Details page. URL: " + driver.getCurrentUrl()
//        );
//    }
//
//    @When("user clicks Submit button")
//    public void user_clicks_submit_button() {
//        Pages.submitClaim.clickSubmit();
//        Pages.submitClaim.waitForSubmission();
//    }
//
//    @Then("claim should be submitted successfully")
//    public void claim_should_be_submitted_successfully() {
//
//        String url = driver.getCurrentUrl();
//
//        Assert.assertTrue(
//            url.contains("/claim/submitClaim/id/"),
//            "Claim not submitted. Actual URL: " + url
//        );
//    }
//
//    // ================= MY CLAIMS FLOW =================
//
//    @When("user navigates to Claim module")
//    public void user_navigates_to_claim_module() {
//        Pages.submitClaim.openClaimModule();
//    }
//
//    @When("user clicks on My Claims section")
//    public void user_clicks_on_my_claims_section() {
//        Pages.myClaims.openMyClaims();
//    }
//
//    @When("user enters reference ID {string}")
//    public void user_enters_reference_id(String refId) {
//        Pages.myClaims.enterReferenceId(refId);
//    }
//
//    @When("user selects reference ID from dropdown")
//    public void user_selects_reference_id_from_dropdown() {
//        Pages.myClaims.selectReferenceFromDropdown();
//    }
//
//    @When("user clicks on Search button")
//    public void user_clicks_on_search_button() {
//        Pages.myClaims.clickSearch();
//    }
//
//    @When("user clicks on View button for the claim")
//    public void user_clicks_on_view_button_for_the_claim() {
//        Pages.myClaims.clickView();
//    }
//
//    @Then("user should be redirected to claim details page")
//    public void user_should_be_redirected_to_claim_details_page() {
//
//        Assert.assertTrue(
//            driver.getCurrentUrl().contains("/claim/submitClaim"),
//            "Not redirected to Claim Details page. URL: " + driver.getCurrentUrl()
//        );
//    }
//
//    @Then("URL should contain claim id")
//    public void url_should_contain_claim_id() {
//
//        String url = driver.getCurrentUrl();
//
//        Assert.assertTrue(
//            url.matches(".*/claim/submitClaim/id/\\d+"),
//            "URL is not in expected format. Actual URL: " + url
//        );
//    }
//}


//package com.orangehrm.testing.stepdefinition;
//
//import org.openqa.selenium.WebDriver;
//import org.testng.Assert;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import com.orangeHRM.seleniumuiframwork_genricutility.Pages;
//
//public class Claim {
//
//    WebDriver driver;
//    Pages pages;
//
//    public Claim() {
//        this.driver = Hook.getDriver();
//        this.pages = new Pages(driver);
//    }
//
//    @Given("user is on dashboard")
//    public void user_is_on_dashboard() {
//        System.out.println("User is on dashboard");
//    }
//
//    @When("user navigates to Submit Claim section")
//    public void user_navigates_to_submit_claim_section() {
//        pages.getSubmitClaim().openClaimModule();
//        pages.getSubmitClaim().openSubmitClaimTab();
//    }
//
//    @When("user selects event as {string}")
//    public void user_selects_event_as(String event) {
//        pages.getSubmitClaim().selectEvent(event);
//    }
//
//    @When("user selects currency as {string}")
//    public void user_selects_currency_as(String currency) {
//        pages.getSubmitClaim().selectCurrency(currency);
//    }
//
//    @When("user enters remarks {string}")
//    public void user_enters_remarks(String remarks) {
//        pages.getSubmitClaim().enterRemarks(remarks);
//    }
//
//    @When("user clicks on Create button")
//    public void user_clicks_on_create_button() {
//        pages.getSubmitClaim().clickCreate();
//    }
//
//    @Then("user should be navigated to claim details page")
//    public void user_should_be_navigated_to_claim_details_page() {
//
//        Assert.assertTrue(
//            driver.getCurrentUrl().contains("/claim/submitClaim"),
//            "Not navigated to Claim Details page. URL: " + driver.getCurrentUrl()
//        );
//    }
//
//    @When("user clicks Submit button")
//    public void user_clicks_submit_button() {
//        pages.getSubmitClaim().clickSubmit();
//        pages.getSubmitClaim().waitForSubmission();
//    }
//
//    @Then("claim should be submitted successfully")
//    public void claim_should_be_submitted_successfully() {
//
//        String url = driver.getCurrentUrl();
//
//        Assert.assertTrue(
//            url.contains("/claim/submitClaim/id/"),
//            "Claim not submitted. Actual URL: " + url
//        );
//    }
//
//    @When("user navigates to Claim module")
//    public void user_navigates_to_claim_module() {
//        pages.getSubmitClaim().openClaimModule();
//    }
//
//    @When("user clicks on My Claims section")
//    public void user_clicks_on_my_claims_section() {
//        pages.getMyClaims().openMyClaims();
//    }
//
//    @When("user enters reference ID {string}")
//    public void user_enters_reference_id(String refId) {
//        pages.getMyClaims().enterReferenceId(refId);
//    }
//
//    @When("user selects reference ID from dropdown")
//    public void user_selects_reference_id_from_dropdown() {
//        pages.getMyClaims().selectReferenceFromDropdown();
//    }
//
//    @When("user clicks on Search button")
//    public void user_clicks_on_search_button() {
//        pages.getMyClaims().clickSearch();
//    }
//
//    @When("user clicks on View button for the claim")
//    public void user_clicks_on_view_button_for_the_claim() {
//        pages.getMyClaims().clickView();
//    }
//
//    @Then("user should be redirected to claim details page")
//    public void user_should_be_redirected_to_claim_details_page() {
//
//        Assert.assertTrue(
//            driver.getCurrentUrl().contains("/claim/submitClaim"),
//            "Not redirected to Claim Details page. URL: " + driver.getCurrentUrl()
//        );
//    }
//
//    @Then("URL should contain claim id")
//    public void url_should_contain_claim_id() {
//
//        String url = driver.getCurrentUrl();
//
//        Assert.assertTrue(
//            url.matches(".*/claim/submitClaim/id/\\d+"),
//            "URL is not in expected format. Actual URL: " + url
//        );
//    }
//}

package com.orangehrm.testing.stepdefinition;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;
import com.orangeHRM.seleniumuiframwork_genricutility.Pages;

public class Claim {

    WebDriver driver;
    Pages pages;

    public Claim() {
        this.driver = Hook.getDriver();
        this.pages = new Pages(driver);
    }

    @Given("user is on dashboard")
    public void user_is_on_dashboard() {
        System.out.println("User is on dashboard");
    }

    // ================= SUBMIT CLAIM =================

    @When("user navigates to Submit Claim section")
    public void user_navigates_to_submit_claim_section() {
        pages.submitClaim.openClaimModule();
        pages.submitClaim.openSubmitClaimTab();
    }

    @When("user selects event as {string}")
    public void user_selects_event_as(String event) {
        pages.submitClaim.selectEvent(event);
    }

    @When("user selects currency as {string}")
    public void user_selects_currency_as(String currency) {
        pages.submitClaim.selectCurrency(currency);
    }

    @When("user enters remarks {string}")
    public void user_enters_remarks(String remarks) {
        pages.submitClaim.enterRemarks(remarks);
    }

    @When("user clicks on Create button")
    public void user_clicks_on_create_button() {
        pages.submitClaim.clickCreate();
    }

    @Then("user should be navigated to claim details page")
    public void user_should_be_navigated_to_claim_details_page() {

        Assert.assertTrue(
            driver.getCurrentUrl().contains("/claim/submitClaim"),
            "Not navigated to Claim Details page. URL: " + driver.getCurrentUrl()
        );
    }

    @When("user clicks Submit button")
    public void user_clicks_submit_button() {
        pages.submitClaim.clickSubmit();
        pages.submitClaim.waitForSubmission();
    }

    @Then("claim should be submitted successfully")
    public void claim_should_be_submitted_successfully() {

        String url = driver.getCurrentUrl();

        Assert.assertTrue(
            url.contains("/claim/submitClaim/id/"),
            "Claim not submitted. Actual URL: " + url
        );
    }

    // ================= MY CLAIMS =================

    @When("user navigates to Claim module")
    public void user_navigates_to_claim_module() {
        pages.submitClaim.openClaimModule();
    }

    @When("user clicks on My Claims section")
    public void user_clicks_on_my_claims_section() {
        pages.myClaims.openMyClaims();
    }

    @When("user enters reference ID {string}")
    public void user_enters_reference_id(String refId) {
        pages.myClaims.enterReferenceId(refId);
    }

    @When("user selects reference ID from dropdown")
    public void user_selects_reference_id_from_dropdown() {
        pages.myClaims.selectReferenceFromDropdown();
    }

    @When("user clicks on Search button")
    public void user_clicks_on_search_button() {
        pages.myClaims.clickSearch();
    }

    @When("user clicks on View button for the claim")
    public void user_clicks_on_view_button_for_the_claim() {
        pages.myClaims.clickView();
    }

    @Then("user should be redirected to claim details page")
    public void user_should_be_redirected_to_claim_details_page() {

        Assert.assertTrue(
            driver.getCurrentUrl().contains("/claim/submitClaim"),
            "Not redirected to Claim Details page. URL: " + driver.getCurrentUrl()
        );
    }

    @Then("URL should contain claim id")
    public void url_should_contain_claim_id() {

        String url = driver.getCurrentUrl();

        Assert.assertTrue(
            url.matches(".*/claim/submitClaim/id/\\d+"),
            "URL is not in expected format. Actual URL: " + url
        );
    }
}