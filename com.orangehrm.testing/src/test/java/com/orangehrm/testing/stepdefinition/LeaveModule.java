package com.orangehrm.testing.stepdefinition;

import org.openqa.selenium.Keys;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.orangeHRM.seleniumuiframwork_genricutility.AllUtilityFunction;
import com.orangeHRM.seleniumuiframwork_genricutility.Base;
import com.orangeHRM.seleniumuiframwork_genricutility.Pages;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LeaveModule {
	private Base base;
	Actions action;
	
	public LeaveModule(Base base) {
		this.base=base;
	}
//	@When("navigate to leave module")
//	public void navigate_to_leave_module() {
//		Pages.dashboardpage.getLeaveLink().click();
//		
//	}
	@When("navigate to leave module for  apply")
	public void navigate_to_leave_module_for_apply() {
		Pages.dashboardpage.getLeaveLink().click();
	}

	@When("click on Apply")
	public void click_on_apply() {
		Pages.leavepage.getApplyBtn().click();
	}
	@When("select Leave Type {string}")
	public void select_leave_type(String string) {
	  WebElement ele = Pages.apply.getLeaveType();
	  AllUtilityFunction.selectDropdownUsingKeyboard(base.driver, ele, 1);
	}
	@When("select From Date {string}")
	public void select_from_date(String fromDate) {
		WebElement ele= Pages.apply.getFromDate();
		ele.clear();
		ele.sendKeys(fromDate);
	}
	@When("select To Date {string}")
	public void select_to_date(String toDate) {
		WebElement ele = Pages.apply.getToDate();
	    ele.click();
	    ele.sendKeys(Keys.CONTROL + "a");
	    ele.sendKeys(Keys.DELETE);
	    ele.sendKeys(toDate);
	    ele.sendKeys(Keys.TAB); // trigger UI update
	}
	@When("select Partial Date")
	public void select_partial_date() {
	    WebElement ele= Pages.apply.getPartialDays();
	    AllUtilityFunction.selectDropdownUsingKeyboard(base.driver, ele, 2);
	}
	@When("select Start Day")
	public void select_start_day() {
		 WebElement ele= Pages.apply.getStartDay();
		    AllUtilityFunction.selectDropdownUsingKeyboard(base.driver, ele, 2);
	}

	@When("enter Comments {string}")
	public void enter_comments(String Comments) {
	    Pages.apply.getComments().sendKeys(Comments);
	}
	@When("click on Apply button")
	public void click_on_apply_button() {
	    Pages.apply.getSaveApplyBtn().click();
	}
	@Then("verify success message {string}")
	public void verify_success_message(String string) {
	    
	}
	
	@When("navigate to leave module for myleave")
	public void navigate_to_leave_module_for_myleave() {
		Pages.dashboardpage.getLeaveLink().click();
	}

	@When("click on My Leave")
	public void click_on_my_leave() {
	   Pages.leavepage.getMyLeaveBtn().click();
	}
	@When("select Myleave From Date {string}")
	public void select_myleave_from_date(String fromDate) {
		WebElement ele= Pages.myleave.getFromDate();
		ele.clear();
		ele.sendKeys(fromDate);
	}
	@When("select Myleave To Date {string}")
	public void select_myleave_to_date(String toDate) {
		WebElement ele = Pages.apply.getToDate();
	    ele.click();
	    ele.sendKeys(Keys.CONTROL + "a");
	    ele.sendKeys(Keys.DELETE);
	    ele.sendKeys(toDate);
	    ele.sendKeys(Keys.TAB); // trigger UI update
	}
	@When("select Leave Type")
	public void select_leave_type() {
	    WebElement ele= Pages.myleave.getLeaveType();
	    ele.sendKeys(Keys.DELETE);
	    ele.sendKeys("CAN - FMLA");
	    ele.sendKeys(Keys.TAB); // trigger UI update
	    
	}
	@When("click on myleave search button")
	public void click_on_myleave_search_button() {
	   Pages.myleave.getSearchBtn();
	}
	@Then("verify all filter fields are cleared")
	public void verify_all_filter_fields_are_cleared() {
	  
	}
	



}
