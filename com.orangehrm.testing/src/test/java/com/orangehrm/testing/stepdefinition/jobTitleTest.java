package com.orangehrm.testing.stepdefinition;

import org.testng.Assert;

import com.orangeHRM.seleniumuiframwork_genricutility.Pages;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class jobTitleTest {
	
	@Given("user is on dashboard page")
	public void user_is_on_dashboard_page() {
	    //// Already handled in Hooks
	}
	@When("user navigates to job titles")
	public void user_navigates_to_job_titles() {
		Pages.d.getAdminLink().click();
		Pages.jt.setJobMenu();
		Pages.jt.setJobTitlesOption();
		Pages.jt.setAddButtonjob();
	   }
	@When("user enters job title {string}")
	public void user_enters_job_title(String jobTitle) {
		Pages.jt.setJobMenu();
		Pages.jt.setJobTitlesOption();
		Pages.jt.setAddButtonjob();
        Pages.jt.setJobTitleField(jobTitle);
	   }
	@When("user enters job description {string}")
	public void user_enters_job_description(String string) {
		Pages.jt.setJobDescriptionField(string);
	}
	@When("user uploads job specification file {string}")
	public void user_uploads_job_specification_file(String fileName) {
		Pages.jt.setJob_Specification(fileName);
	}
	@When("user adds job note {string}")
	public void user_adds_job_note(String string) {
		Pages.jt.setNoteField(string);
		Pages.jt.setSaveJobTitle();
	   }
	@Then("job title should be added successfully")
	public void job_title_should_be_added_successfully() {
		String actualText = Pages.jt.getVerifyjob().getText();
		Assert.assertEquals(actualText, "Successfully Saved");
		System.out.println("Successfully Saved");
	   }


}
