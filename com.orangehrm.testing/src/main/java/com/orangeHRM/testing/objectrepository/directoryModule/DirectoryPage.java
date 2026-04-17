package com.orangehrm.testing.objectrepository.directoryModule;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DirectoryPage {
	
	@FindBy(xpath = "//label[contains(text(),'Employee Name')]/parent::div/following-sibling::div")
	WebElement employeeName;
	
	@FindBy(xpath = "//label[contains(text(),'Job Title')]/parent::div/following-sibling::div")
	WebElement jobTitle;
	
	@FindBy(xpath = "//label[contains(text(),'Locat')]/parent::div/following-sibling::div")
	WebElement location;
	
	@FindBy(css = "[type='submit']")
	WebElement searchBtn;
	
	
}
