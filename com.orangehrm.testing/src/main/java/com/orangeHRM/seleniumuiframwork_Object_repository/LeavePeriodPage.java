package com.orangeHRM.seleniumuiframwork_Object_repository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LeavePeriodPage {
	
	@FindBy(xpath = "//label[contains(text(),'Start Month')]/parent::div/following-sibling::div/descendant::div[@class='oxd-select-text oxd-select-text--active']")
	WebElement startMonth;
	
	@FindBy(xpath = "//label[contains(text(),'Start Date')]/parent::div/following-sibling::div/descendant::div[@class='oxd-select-text oxd-select-text--active']")
	WebElement startDate;
	
	@FindBy(css = "[type='submit']")
	WebElement saveBtn;
	
}
