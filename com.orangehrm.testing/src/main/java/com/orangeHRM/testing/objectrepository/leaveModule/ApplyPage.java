package com.orangeHRM.testing.objectrepository.leaveModule;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;


public class ApplyPage {
	
	@FindBy(css = "[class='oxd-select-text-input']")
	WebElement leaveType;
	
	@FindBy(xpath = "//label[contains(text(),'From')]/parent::div/following-sibling::div/descendant::input")
	WebElement fromDate;
	
	@FindBy(xpath = "//label[contains(text(),'To')]/parent::div/following-sibling::div/descendant::input")
	WebElement toDate;
	
	@FindBy(xpath = "//label[contains(text(),'Partial')]/parent::div/following-sibling::div")
	WebElement partialDays;
	
	@FindBy(xpath = "//label[contains(text(),'Start')]/parent::div/following-sibling::div")
	WebElement startDay;
	
	@FindBy(css = "[class='oxd-textarea oxd-textarea--active oxd-textarea--resize-vertical']")
	WebElement comments;
	
	@FindBy(css = "[type=\"submit\"]")
	WebElement saveApplyBtn;

	public WebElement getLeaveType() {
		return leaveType;
	}

	public WebElement getFromDate() {
		return fromDate;
	}

	public WebElement getToDate() {
		return toDate;
	}
	
	
	public WebElement getPartialDays() {
		return partialDays;
	}
	
	
	public WebElement getStartDay() {
		return startDay;
	}

	public WebElement getComments() {
		return comments;
	}

	public WebElement getSaveApplyBtn() {
		return saveApplyBtn;
	}
	
	
//	public void apply() {
//		
//	}

	
}
