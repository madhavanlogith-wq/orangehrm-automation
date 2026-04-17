package com.orangeHRM.seleniumuiframwork_Object_repository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddEntitlementsPage {
	@FindBy(css = "[placeholder=\"Type for hints...]")
	WebElement empName;
	
	@FindBy(xpath = "//label[contains(text(),'Leave Type')]/parent::div/following-sibling::div/descendant::div[@data-v-67d2aedf]")
	WebElement leaveType;
	
	@FindBy(xpath = "//label[contains(text(),'Leave Period')]/parent::div/following-sibling::div/descendant::div[@class='oxd-select-text oxd-select-text--active']")
	WebElement leavePeriod;
	
	@FindBy(xpath = "//label[contains(text(),'Entitlement')]/parent::div/following-sibling::div//input")
	WebElement entitlement;
	
	@FindBy(css = "[type='submit']")
	WebElement saveBtn;
}
