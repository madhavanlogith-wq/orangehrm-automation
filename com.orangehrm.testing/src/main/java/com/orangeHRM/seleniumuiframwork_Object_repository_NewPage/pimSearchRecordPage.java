package com.orangeHRM.seleniumuiframwork_Object_repository_NewPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orangeHRM.seleniumuiframwork_genricutility.Base;

public class pimSearchRecordPage extends Base {

	public pimSearchRecordPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//label[contains(text(),'Employee Name')]/../..//input")
	private WebElement employee_Name;
	
	@FindBy(xpath = "//a[contains(text(),'Custom')]")
	private WebElement customField ;
	
	@FindBy(xpath = "//button[.=' Add ']")
	private WebElement addButton ;
	
	@FindBy(xpath = "//label[contains(text(),'Field')]/parent::div/following-sibling::div/descendant::input")
	private WebElement fieldName ;
	
	@FindBy(xpath = "//label[contains(text(),'Screen')]/parent::div/following-sibling::div")
	private WebElement screen;
	
	@FindBy(xpath = "//span[contains(text(),'Personal Details')]")
	private WebElement screenDroupDown;
	
	@FindBy(xpath = "//label[contains(text(),'Type')]/parent::div/following-sibling::div")
	private WebElement type;

	@FindBy(xpath = "//span[contains(text(),'Text or Number')]")
	private WebElement typeDroupDown;
	
	@FindBy(xpath = "//label[contains(text(),'Select Options')]/parent::div/following-sibling::div")
	private WebElement typeSelectOption;
	
	@FindBy(xpath = "//button[.=' Save ']")
	private WebElement saveButton;
	

}
