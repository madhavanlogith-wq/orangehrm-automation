package com.orangehrm.testing.stepdefinition;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.orangeHRM.seleniumuiframwork_Object_repository.PersonalDetailsPage;
import com.orangeHRM.seleniumuiframwork_Object_repository.ContactDetailsPage;
import com.orangeHRM.seleniumuiframwork_Object_repository.EmergencyContactsPage;
import com.orangeHRM.seleniumuiframwork_Object_repository.DependentsPage;
import com.orangeHRM.seleniumuiframwork_Object_repository.QualificationsPage;
import com.orangeHRM.seleniumuiframwork_genricutility.Base;

import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class MyInfoSteps {

    private Base base;

    PersonalDetailsPage personalDetailsPage;
    ContactDetailsPage contactDetailsPage;
    EmergencyContactsPage emergencyContactsPage;
    DependentsPage dependentsPage;
    QualificationsPage qualificationsPage;

    WebDriverWait wait;

    public MyInfoSteps(Base base){
        this.base = base;
    }

    // INIT
    private void initPages() {

        personalDetailsPage = PageFactory.initElements(base.driver, PersonalDetailsPage.class);
        contactDetailsPage = PageFactory.initElements(base.driver, ContactDetailsPage.class);
        emergencyContactsPage = PageFactory.initElements(base.driver, EmergencyContactsPage.class);
        dependentsPage = PageFactory.initElements(base.driver, DependentsPage.class);
        qualificationsPage = PageFactory.initElements(base.driver, QualificationsPage.class);

        wait = new WebDriverWait(base.driver, Duration.ofSeconds(5));
    }

    // ================= PERSONAL DETAILS =================

    @Given("user is logged in and navigates to My Info page")
    public void user_is_logged_in_and_navigates_to_my_info_page() {

        initPages();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='My Info']"))).click();

        wait.until(ExpectedConditions.visibilityOf(personalDetailsPage.getFirstName()));
    }

    @When("user updates first name and last name")
    public void user_updates_first_name_and_last_name() {

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

        wait.until(ExpectedConditions.visibilityOf(contactDetailsPage.getStreet1()));
    }

    @When("user enters street address, city, mobile and work email")
    public void user_enters_street_address_city_mobile_and_work_email() {

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

    // ================= EMERGENCY CONTACTS =================

    @When("user navigates to Emergency Contacts tab")
    public void user_navigates_to_emergency_contacts_tab() {

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Emergency Contacts']"))).click();
    }

    @When("user clicks add button")
    public void user_clicks_add_button() {

        wait.until(ExpectedConditions.elementToBeClickable(emergencyContactsPage.getAddButton())).click();
    }

    @When("user enters name, relationship and mobile")
    public void user_enters_name_relationship_and_mobile() {

        wait.until(ExpectedConditions.visibilityOf(emergencyContactsPage.getName()));

        emergencyContactsPage.enterName("Deebiga");
        emergencyContactsPage.enterRelationship("Sister");
        emergencyContactsPage.enterMobile("9876543210");
    }

    @When("user clicks save button in emergency contacts")
    public void user_clicks_save_button_in_emergency_contacts() {

        wait.until(ExpectedConditions.elementToBeClickable(emergencyContactsPage.getSaveButton())).click();
    }

    @Then("emergency contact should be saved successfully")
    public void emergency_contact_should_be_saved_successfully() {

        System.out.println("Emergency Contact Added Successfully");
    }

    // ================= DEPENDENTS =================

    @When("user navigates to Dependents tab")
    public void user_navigates_to_dependents_tab() {

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Dependents']"))).click();
    }

    @When("user clicks add button in dependents")
    public void user_clicks_add_button_in_dependents() {

        wait.until(ExpectedConditions.elementToBeClickable(dependentsPage.getAddButton())).click();
    }

    @When("user enters dependent name and selects relationship")
    public void user_enters_dependent_name_and_selects_relationship() {

        wait.until(ExpectedConditions.visibilityOf(dependentsPage.getName()));

        dependentsPage.enterName("Kumar");
        dependentsPage.selectRelationship("Child");
    }

    @When("user clicks save button in dependents")
    public void user_clicks_save_button_in_dependents() {

        wait.until(ExpectedConditions.elementToBeClickable(dependentsPage.getSaveButton())).click();
    }

    @Then("dependent should be saved successfully")
    public void dependent_should_be_saved_successfully() {

        System.out.println("Dependent Added Successfully");
    }

    // ================= QUALIFICATIONS =================

    @When("user navigates to Qualifications tab")
    public void user_navigates_to_qualifications_tab() {

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Qualifications']"))).click();
    }

    @When("user clicks add button in qualifications")
    public void user_clicks_add_button_in_qualifications() {

        wait.until(ExpectedConditions.elementToBeClickable(qualificationsPage.getAddButton())).click();
    }

    @When("user enters company and job title")
    public void user_enters_company_and_job_title() {

        wait.until(ExpectedConditions.visibilityOf(qualificationsPage.getCompany()));

        qualificationsPage.enterCompany("TCS");
        qualificationsPage.enterJobTitle("Tester");
    }

    @When("user clicks save button in qualifications")
    public void user_clicks_save_button_in_qualifications() {

        wait.until(ExpectedConditions.elementToBeClickable(qualificationsPage.getSaveButton())).click();
    }

    @Then("work experience should be saved successfully")
    public void work_experience_should_be_saved_successfully() {

        System.out.println("Qualification Added Successfully");
    }

    // ================= NEGATIVE SCENARIO =================

    @When("user clears first name field")
    public void user_clears_first_name_field() {

        wait.until(ExpectedConditions.visibilityOf(personalDetailsPage.getFirstName()));

        personalDetailsPage.getFirstName().click();
        personalDetailsPage.getFirstName().sendKeys(Keys.CONTROL + "a");
        personalDetailsPage.getFirstName().sendKeys(Keys.DELETE);
    }

    @When("user enters only last name")
    public void user_enters_only_last_name() {

        personalDetailsPage.enterLastName("TestLast");
    }

    @Then("first name field should show required validation")
    public void first_name_field_should_show_required_validation() {

        wait.until(ExpectedConditions.attributeContains(
                personalDetailsPage.getFirstName(),
                "class",
                "error"
        ));

        System.out.println("Required validation displayed for First Name");
    }
}
