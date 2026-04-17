package com.orangeHRM.seleniumuiframwork_Object_repository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyLeavePage {

	@FindBy(xpath = "//label[contains(text(),'From')]/parent::div/following-sibling::div/descendant::input")
	WebElement fromDate;
	
	@FindBy(xpath = "//label[contains(text(),'To')]/parent::div/following-sibling::div/descendant::input")
	WebElement toDate;
	
	@FindBy(css =  "['oxd-select-text oxd-select-text--active oxd-select-text--error']")
	WebElement showLeaveStatus;
	
	@FindBy(xpath = "//label[contains(text(),'Leave Type')]/parent::div/following-sibling::div/descendant::div[@class='oxd-select-text-input']")
	WebElement leaveType;
	
	@FindBy(css = "[type='submit']")
	WebElement searchBtn;

	public WebElement getFromDate() {
		return fromDate;
	}

	public WebElement getToDate() {
		return toDate;
	}

	public WebElement getShowLeaveStatus() {
		return showLeaveStatus;
	}

	public WebElement getLeaveType() {
		return leaveType;
	}

	public WebElement getSearchBtn() {
		return searchBtn;
	}
	
}
