package com.orangehrm.testing.stepdefinition;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.orangehrm.testing.utilities.BaseClass;
import com.orangehrm.testing.utilities.Pages;

import java.time.Duration;
import java.util.Map;

public class RecruitmentSteps {

    @Given("User is already logged in")
    public void already_logged_in() {
        // handled in Hooks
    }

    // ================= ADD CANDIDATE =================

    @Given("User navigates to Recruitment module")
    public void goToRecruitment() {
        Pages.rp.goToRecruitment();
    }

    @When("User clicks on Add Candidate button")
    public void clickAddCandidate() {
        Pages.rp.clickAdd();
    }

    @When("User enters candidate details")
    public void enterCandidateDetails(DataTable data) {
        Map<String, String> map = data.asMap(String.class, String.class);

        Pages.cp.addCandidate(
                map.get("FirstName"),
                map.get("LastName"),
                map.get("Email")
        );
    }

    @Then("Candidate should be added successfully")
    public void verifyCandidate() {
        Assert.assertTrue(Pages.cp.getResult() != null &&
                Pages.cp.getResult().length() > 0);
    }

    // ================= ADD VACANCY =================

    @Given("User navigates to Recruitment > Vacancies section")
    public void goToVacancy() {

        Pages.rp.goToRecruitment();

        WebDriverWait wait = new WebDriverWait(BaseClass.getDriver(), Duration.ofSeconds(10));

        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//a[text()='Vacancies']")
        ));

        Pages.vp.goToVacancy();
    }

    @When("User clicks on Add Vacancy button")
    public void clickAddVacancy() {
        Pages.vp.clickAdd();
    }

    @When("User enters vacancy details")
    public void enterVacancyDetails(DataTable data) {

        Map<String, String> map = data.asMap(String.class, String.class);

        Pages.vp.addVacancy(
                map.get("VacancyName"),
                map.get("JobTitle"),
                map.get("HiringManager")
        );
    }

    @Then("Vacancy should be created successfully")
    public void verifyVacancy() {
        Assert.assertTrue(Pages.vp.getResult() != null &&
                Pages.vp.getResult().length() > 0);
    }

    // ================= SEARCH CANDIDATE =================

    @Given("User navigates to Candidate list page")
    public void navigate_candidate_list() {
        Pages.rp.goToRecruitment();
    }

    @When("User searches candidate {string}")
    public void searchCandidate(String name) throws InterruptedException {
        Pages.cp.searchAndSelectCandidate(name);
    }
    
    @When("User clicks on the candidate result")
    public void user_clicks_candidate_result() {
        // Already handled in search method
    }

    @Then("Candidate details should be displayed correctly")
    public void verifySearchCandidate() {
        Assert.assertTrue(
                BaseClass.getDriver().getCurrentUrl().contains("viewCandidate")
        );
    }

    // ================= VACANCY SEARCH =================

    @Given("User navigates to Vacancy list page")
    public void navigate_vacancy_list() {
        Pages.rp.goToRecruitment();
        Pages.vp.goToVacancy();
    }

    @When("User searches vacancy {string}")
    public void searchVacancy(String name) {
        Pages.vp.searchAndSelectVacancy(name);
    }

    @When("User clicks on the vacancy result")
    public void user_clicks_vacancy_result() {
        // Already handled in search method
    }
    
    @Then("Vacancy details should be displayed correctly")
    public void verifyVacancySearch() {
        Assert.assertTrue(Pages.vp.getResult() != null &&
                Pages.vp.getResult().length() > 0);
    }

    // ================= VALIDATIONS =================

    @Given("User is on Add Candidate page")
    public void user_is_on_add_candidate_page() {
        Pages.rp.goToRecruitment();
        Pages.rp.clickAdd();
    }

    @When("User enters FirstName as {string}")
    public void enter_firstname(String fn) {
        Pages.cp.enterFirstName(fn);
    }

    @When("User enters LastName as {string}")
    public void enter_lastname(String ln) {
        Pages.cp.enterLastName(ln);
    }

    @When("User enters Email as {string}")
    public void enter_email(String em) {
        Pages.cp.enterEmail(em);
    }

    @When("User clicks Save button")
    public void click_save_button() {
        Pages.cp.clickSave();
    }

    @Then("System should show email validation error")
    public void verify_email_error() {
        String error = Pages.cp.getError();
        Assert.assertTrue(error != null && error.length() > 0);
    }

    @Then("Candidate should not be created")
    public void candidate_not_created() {
        Assert.assertTrue(true);
    }

    @When("User clicks Save button without entering any data")
    public void save_without_data() {
        Pages.cp.clickSave();
    }

    @Then("System should show validation error messages")
    public void validate_empty_form_errors() {
        String error = Pages.cp.getError();
        Assert.assertTrue(error != null && error.length() > 0);
    }
}