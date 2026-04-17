package com.orangehrm.testing.stepdefinition;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.orangeHRM.seleniumuiframwork_Object_repository.AddUserPage;
import com.orangeHRM.seleniumuiframwork_genricutility.Base;
import com.orangeHRM.seleniumuiframwork_genricutility.Pages;

import io.cucumber.java.en.*;

public class addUserTest extends Base {

   
    // ================= LOGIN =================

    @Given("user launches browser and opens application")
    public void user_launches_browser_and_opens_application() {
        // handled by Hooks
    }

    @When("user enters valid username {string} and password {string}")
    public void user_enters_valid_username_and_password(String username, String password) {
        driver.findElement(By.name("username")).sendKeys(username);
        driver.findElement(By.name("password")).sendKeys(password);
    }

    @When("user clicks login button")
    public void user_clicks_login_button() {
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }

    @Then("user should see dashboard page with all elements")
    public void user_should_see_dashboard_page_with_all_elements() {
        Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"));
    }

    // ================= COMMON =================

    @When("user clicks add button")
    public void user_clicks_add_button() {
    	Pages.aup.getAddButton().click();
    }

    @When("user clicks save button")
    public void user_clicks_save_button() {
    	Pages.aup.getSaveButton().click();
    }

    // ================= ADD USER =================

    @When("user selects user role {string}")
    public void user_selects_user_role(String role) {
    	Pages.aup.getUserRoleDropdown().click();
        driver.findElement(By.xpath("//span[text()='" + role + "']")).click();
    }

    @When("user enters employee name {string}")
    public void user_enters_employee_name(String name) {
    	Pages.aup.getEmployeeNameTextField().sendKeys(name);
    }

    @When("user selects status {string}")
    public void user_selects_status(String status) {
    	Pages.aup.getStatusDropdown().click();
        driver.findElement(By.xpath("//span[text()='" + status + "']")).click();
    }

    @When("user enters username {string}")
    public void user_enters_username(String username) {
    	Pages.aup.getUsernameTextField().sendKeys(username);
    }

    @When("user enters password {string}")
    public void user_enters_password(String password) {
    	Pages.aup.getPasswordTextField().sendKeys(password);
    }

    @When("user enters confirm password {string}")
    public void user_enters_confirm_password(String password) {
    	Pages.aup.getConfirmPasswordTextField().sendKeys(password);
    }

    @Then("user should be added successfully")
    public void user_should_be_added_successfully() {
        Assert.assertTrue(driver.getPageSource().contains("Success"));
    }

    // ================= JOB TITLE =================

    @When("user navigates to job titles")
    public void user_navigates_to_job_titles() {
    	Pages.aup.getJobMenu().click();
    	Pages.aup.getJobTitlesOption().click();
    }

    @When("user enters job title {string}")
    public void user_enters_job_title(String title) {
    	Pages.aup.getJobTitleField().sendKeys(title);
    }

    @When("user enters job description {string}")
    public void user_enters_job_description(String desc) {
    	Pages.aup.getJobDescriptionField().sendKeys(desc);
    }

    @When("user uploads job specification file {string}")
    public void user_uploads_job_specification_file(String file) {
        driver.findElement(By.xpath("//input[@type='file']"))
              .sendKeys(System.getProperty("user.dir") + "/testdata/" + file);
    }

    @When("user adds job note {string}")
    public void user_adds_job_note(String note) {
        Pages.aup.getNoteField().sendKeys(note);
    }

    @Then("job title should be added successfully")
    public void job_title_should_be_added_successfully() {
        Assert.assertTrue(driver.getPageSource().contains("Success"));
    }

    // ================= LOCATION =================

    @When("user navigates to locations")
    public void user_navigates_to_locations() {
    	Pages.aup.getOrganizationMenu().click();
    	Pages.aup.getLocationsOption().click();
    }

    @When("user enters location name {string}")
    public void user_enters_location_name(String name) {
    	Pages.aup.getLocationName().sendKeys(name);
    }

    @When("user selects country {string}")
    public void user_selects_country(String country) {
        driver.findElement(By.xpath("//label[text()='Country']/../following-sibling::div"))
              .click();
        driver.findElement(By.xpath("//span[text()='" + country + "']")).click();
    }

    @When("user enters city {string}")
    public void user_enters_city(String city) {
    	Pages.aup.getCityField().sendKeys(city);
    }

    @When("user enters address {string}")
    public void user_enters_address(String address) {
        driver.findElement(By.xpath("//label[text()='Address']/../following-sibling::div//textarea"))
              .sendKeys(address);
    }

    @Then("location should be added successfully")
    public void location_should_be_added_successfully() {
        Assert.assertTrue(driver.getPageSource().contains("Success"));
    }

    // ================= QUALIFICATIONS =================

    @When("user navigates to skills")
    public void user_navigates_to_skills() {
    	Pages.aup.getQualificationsMenu().click();
    	Pages.aup.getSkillsOption().click();
    }

    @When("user enters skill name {string}")
    public void user_enters_skill_name(String name) {
    	Pages.aup.getSkillName().sendKeys(name);
    }

    @When("user enters skill description {string}")
    public void user_enters_skill_description(String desc) {
    	Pages.aup.getSkillDescription().sendKeys(desc);
    }

    @Then("skill should be added successfully")
    public void skill_should_be_added_successfully() {
        Assert.assertTrue(driver.getPageSource().contains("Success"));
    }

    // LICENSE
    @When("user navigates to licenses")
    public void user_navigates_to_licenses() {
    	Pages.aup.getQualificationsMenu().click();
    	Pages.aup.getLicensesOption().click();
    }

    @When("user enters license name {string}")
    public void user_enters_license_name(String name) {
    	Pages.aup.getLicenseName().sendKeys(name);
    }

    @Then("license should be added successfully")
    public void license_should_be_added_successfully() {
        Assert.assertTrue(driver.getPageSource().contains("Success"));
    }

    // MEMBERSHIP
    @When("user navigates to memberships")
    public void user_navigates_to_memberships() {
    	Pages.aup.getQualificationsMenu().click();
    	Pages.aup.getMembershipsOption().click();
    }

    @When("user enters membership name {string}")
    public void user_enters_membership_name(String name) {
    	Pages.aup.getMembershipName().sendKeys(name);
    }

    @Then("membership should be added successfully")
    public void membership_should_be_added_successfully() {
        Assert.assertTrue(driver.getPageSource().contains("Success"));
    }

    // EDUCATION
    @When("user navigates to education")
    public void user_navigates_to_education() {
    	Pages.aup.getQualificationsMenu().click();
    	Pages.aup.getEducationOption().click();
    }

    @When("user enters education name {string}")
    public void user_enters_education_name(String name) {
    	Pages.aup.getEducationName().sendKeys(name);
    }

    @Then("education should be added successfully")
    public void education_should_be_added_successfully() {
        Assert.assertTrue(driver.getPageSource().contains("Success"));
    }

    // NATIONALITY
    @When("user navigates to nationalities")
    public void user_navigates_to_nationalities() {
    	Pages.aup.getNationalitiesOption().click();
    }

    @When("user enters nationality {string}")
    public void user_enters_nationality(String name) {
    	Pages.aup.getNationalityName().sendKeys(name);
    }

    @Then("nationality should be added successfully")
    public void nationality_should_be_added_successfully() {
        Assert.assertTrue(driver.getPageSource().contains("Success"));
    }
}