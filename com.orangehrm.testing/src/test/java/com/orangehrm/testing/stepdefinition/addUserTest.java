package com.orangehrm.testing.stepdefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.orangeHRM.seleniumuiframwork_genricutility.Base;
import com.orangeHRM.seleniumuiframwork_genricutility.Pages;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class addUserTest extends Base {

	@Given("user launches browser and opens application")
	public void user_launches_browser_and_opens_application() {
		// Already handled in Hooks
	}
	@When("user enters valid username {string} and password {string}")
	public void user_enters_valid_username_and_password(String string, String string2) {
		// Already handled in Hooks
	}
	@When("user clicks login button")
	public void user_clicks_login_button() {
		// Already handled in Hooks
	}
	@Then("user should see dashboard page with all elements")
	public void user_should_see_dashboard_page_with_all_elements() {
		System.out.println("Logged in to orangHRM");
	}
	@When("user clicks add button")
	public void user_clicks_add_button() {
		Pages.d.setAdminLink();
		Pages.au.setAddButtonUser();
	}
	@When("user selects user role {string}")
	public void user_selects_user_role(String string) {
		Pages.au.setRoledroupdown();
		Pages.au.setSelectRole();
	}
	@When("user enters employee name {string}")
	public void user_enters_employee_name(String empName) {
		Pages.au.setEmployeeNameTextField(empName);
	}

	@When("user selects status {string}")
	public void user_selects_status(String status) {
		Pages.au.setStstusTextField();
	    Pages.au.setEnabledOption();
	   }
	@When("user enters username {string}")
	public void user_enters_username(String string) {
		Pages.au.setUsernameTextField(string);
	}
	@When("user enters password {string}")
	public void user_enters_password(String string) {
		Pages.au.setPasswordTextField(string);
	}
	@When("user enters confirm password {string}")
	public void user_enters_confirm_password(String string) {
		Pages.au.setConfirmPasswordTextField(string);
	}
	@When("user clicks save button")
	public void user_clicks_save_button() {
		Pages.au.setSaveButton();
	}
	@Then("user should be added successfully")
	public void user_should_be_added_successfully() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		   WebElement messageElement = wait.until(ExpectedConditions.visibilityOf(Pages.au.getVerifyUserAdded()));
		    String actualMsg = messageElement.getText();
		    Assert.assertEquals(actualMsg,"Successfully Saved");
//			System.out.println(Pages.aujp.getVerifyUserAdded());

	}

	
   
}