package com.orangehrm.testing.objectrepository.maintainance;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccessRecord {

	@FindBy(css = "[placeholder='Type for hints...']")
	WebElement employeeName;
	
	@FindBy(css="[type='submit']")
	WebElement searchBtn;
	
	@FindBy(css = "//button[@data-v-27663eb7]")
	WebElement downlaodBtn;
	
	
}
