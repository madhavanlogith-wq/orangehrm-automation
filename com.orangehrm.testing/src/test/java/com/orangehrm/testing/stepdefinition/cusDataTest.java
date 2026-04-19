package com.orangehrm.testing.stepdefinition;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.orangeHRM.seleniumuiframwork_genricutility.Base;
import com.orangeHRM.seleniumuiframwork_genricutility.Pages;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class cusDataTest extends Base{

	@Given("user navigates to PIM module")
	public void user_navigates_to_pim_module() {
	    Pages.d.setPimLink();
	}
	@When("user clicks on Configuration menu")
	public void user_clicks_on_configuration_menu() {
	    Pages.pcd.setConfigurationMenu();
	}
	@When("user clicks on Custom Fields option")
	public void user_clicks_on_custom_fields_option() {
	   Pages.pcd.setCustomField();
	}
	@When("user clicks on Add button")
	public void user_clicks_on_add_button() {
	    Pages.pcd.setAddButton();
	}
	@When("user enters field name {string}")
	public void user_enters_field_name(String string) {
	    Pages.pcd.setFieldName(string);
	}
	@When("user selects screen {string}")
	public void user_selects_screen(String string) {
	    Pages.pcd.setScreen();
	    Pages.pcd.setScreenDroupDown();
	}
	@When("user selects type {string}")
	public void user_selects_type(String string) {
		Pages.pcd.setType();
		Pages.pcd.setTypeDroupDown();
	}
	
	@When("user clicks on Save button")
	public void user_clicks_on_save_button() {
		Pages.pcd.setSaveButton();
	}
	@Then("custom field should be created successfully")
	public void custom_field_should_be_created_successfully() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		   WebElement messageElement = wait.until(ExpectedConditions.visibilityOf(Pages.pcd.getVerifyCusDara()));
		    String actualMsg = messageElement.getText();
		    Assert.assertEquals(actualMsg,"Successfully Saved");
//			System.out.println(Pages.aujp.getVerifyUserAdded());

	   System.out.println("created successfully");
	}
}
