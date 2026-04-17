package com.orangeHRM.seleniumuiframwork_Object_repository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LeaveListPage {
	
	@FindBy(xpath = "//label[contains(text(),'From Date')]/parent::div/following-sibling::div//input")
	WebElement fromDate;
	
	@FindBy(xpath = "//label[contains(text(),'To Date')]/parent::div/following-sibling::div//input")
	WebElement toDate;
	
	@FindBy(xpath = "//label[contains(text(),'Show Leave with Status')]/parent::div/following-sibling::div/descendant::div[@class='oxd-select-text oxd-select-text--active']")
	WebElement showLeaveWithStatus;
	
	@FindBy(xpath = "//label[contains(text(),'Leave Type')]/parent::div/following-sibling::div")
	WebElement leaveType;
	
	@FindBy(xpath = "//label[contains(text(),'Employee Name')]/parent::div/following-sibling::div//input")
	WebElement employeeName;
	
	@FindBy(xpath = "//label[contains(text(),'Sub Unit')]/parent::div/following-sibling::div")
	WebElement subUnit;
	
	@FindBy(xpath = "[type='submit']")
	WebElement assignBtn;
	
}
