package com.orangehrm.testing.stepdefinition;

import org.testng.Assert;

import com.orangeHRM.seleniumuiframwork_genricutility.Pages;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class addEmpTest {

	@Given("user clicks on Add Employee button")
	public void user_clicks_on_add_employee_button() {
		Pages.d.setPimLink();
	    Pages.aep.setAddButton();
	}
	@When("user enters first name {string}")
	public void user_enters_first_name(String string) {
		Pages.aep.setFirstName(string);
	}
	@When("user enters middle name {string}")
	public void user_enters_middle_name(String string) {
	    Pages.aep.setMiddleName(string);
	}
	@When("user enters last name {string}")
	public void user_enters_last_name(String string) {
	    Pages.aep.setLastName(string);
	}
	@When("user enters employee id {string}")
	public void user_enters_employee_id(String string) {
	    Pages.aep.setType(string);
	}
	@Then("system should display message {string}")
	public void system_should_display_message(String string) {

	    Pages.aep.setSaveButton();
	    String actualText = Pages.aep.getGetVerify().getText();
		Assert.assertEquals(actualText, string);
	    System.out.println("Saved");
	}
	@When("user leaves first name blank")
	public void user_leaves_first_name_blank() {
	    Pages.aep.getFirstName();
	}
	@When("user leaves last name blank")
	public void user_leaves_last_name_blank() {
	    Pages.aep.getMiddleName();
	    Pages.aep.getSaveButton();
	}
	@Then("system should display error message {string}")
	public void system_should_display_error_message(String string) {
		String actualText = Pages.aep.getVerifyError().getText();
		Assert.assertEquals(actualText, string);
		System.out.println("Negative Scenario Exicuted");
	}
}
