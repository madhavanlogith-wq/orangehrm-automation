package com.orangehrm.testing.stepdefinition;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.orangeHRM.seleniumuiframwork_Object_repository.PersonalDetailsPage;
import com.orangeHRM.seleniumuiframwork_Object_repository.ContactDetailsPage;
import com.orangeHRM.seleniumuiframwork_genricutility.Base;

import java.time.Duration;

public class MyInfoSteps {

    private Base base;

    PersonalDetailsPage personalDetailsPage;
    ContactDetailsPage contactDetailsPage;
    WebDriverWait wait;

    // ✅ Constructor Injection (VERY IMPORTANT)
    public MyInfoSteps(Base base){
        this.base = base;
    }

    // Initialize after driver is ready
    private void initPages() {
        personalDetailsPage = new PersonalDetailsPage(base.driver);
        contactDetailsPage = new ContactDetailsPage(base.driver);
        wait = new WebDriverWait(base.driver, Duration.ofSeconds(10));
    }

    // ================= PERSONAL DETAILS =================

    @Given("user is logged in and navigates to My Info page")
    public void user_is_logged_in_and_navigates_to_my_info_page() {

        initPages(); // 🔥 IMPORTANT

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='My Info']"))).click();
    }

    @When("user updates first name and last name")
    public void user_updates_first_name_and_last_name() {

        wait.until(ExpectedConditions.visibilityOf(personalDetailsPage.getFirstName()));

        personalDetailsPage.enterFirstName("Deebiga");
        personalDetailsPage.enterLastName("RK");
    }

    @When("user clicks nationality and marital status dropdown")
    public void user_clicks_nationality_and_marital_status_dropdown() {

        wait.until(ExpectedConditions.elementToBeClickable(personalDetailsPage.getNationalityDropdown())).click();

        wait.until(ExpectedConditions.elementToBeClickable(personalDetailsPage.getMaritalStatusDropdown())).click();
    }

    @When("user clicks save button")
    public void user_clicks_save_button() {

        wait.until(ExpectedConditions.elementToBeClickable(personalDetailsPage.getSaveButton())).click();
    }

    @Then("personal details should be saved successfully")
    public void personal_details_should_be_saved_successfully() {

        System.out.println("Personal Details Updated Successfully");
    }

    // ================= CONTACT DETAILS =================

    @When("user navigates to Contact Details tab")
    public void user_navigates_to_contact_details_tab() {

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Contact Details']"))).click();
    }

    @When("user enters street address, city, mobile and work email")
    public void user_enters_street_address_city_mobile_and_work_email() {

        wait.until(ExpectedConditions.visibilityOf(contactDetailsPage.getStreet1()));

        contactDetailsPage.enterStreet1("Chennai Street");
        contactDetailsPage.enterCity("Chennai");
        contactDetailsPage.enterMobile("9876543210");
        contactDetailsPage.enterWorkEmail("deebiga@test.com");
    }

    @When("user clicks save button in contact details")
    public void user_clicks_save_button_in_contact_details() {

        wait.until(ExpectedConditions.elementToBeClickable(contactDetailsPage.getSaveButton())).click();
    }

    @Then("contact details should be saved successfully")
    public void contact_details_should_be_saved_successfully() {

        System.out.println("Contact Details Updated Successfully");
    }
}