package com.orangehrm.testing.stepdefinition;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.orangeHRM.seleniumuiframwork_genricutility.Base;
import com.orangeHRM.seleniumuiframwork_genricutility.Pages;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class orgAndQuaTest extends Base {

	@When("user navigates to organization")
	public void user_navigates_to_organization() {
		Pages.d.setAdminLink();
	    Pages.ong.setOrganizationMenu();
	
	}
	@When("user clicks locations link")
	public void user_clicks_locations_link() {
		Pages.ong.setLocationsOption();
	    Pages.ong.setAddButton();
	}
	@When("user enters location name {string}")
	public void user_enters_location_name(String string) {
		Pages.ong.setOrganizationMenu();
	    Pages.ong.setLocationsOption();
		Pages.ong.setAddButton();
	    Pages.ong.setLocationNameField(string);
	}
	@When("user selects country {string}")
	public void user_selects_country(String string) {
		Pages.ong.setCountryDropdown();
		Pages.ong.setCountryOption();
	}
	@When("user enters city {string}")
	public void user_enters_city(String string) {
		Pages.ong.setCityField(string);
	}
	@When("user enters address {string}")
	public void user_enters_address(String string) {
		Pages.ong.setAddressField(string);
	}
	@Then("location should be added successfully")
	public void location_should_be_added_successfully() {
		Pages.ong.setSaveButton();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		   WebElement messageElement = wait.until(ExpectedConditions.visibilityOf(Pages.au.getVerifyUserAdded()));
		    String actualMsg = messageElement.getText();
		    Assert.assertEquals(actualMsg,"Successfully Saved");
		System.out.println("lication added successfully");
	}
}
