package com.orangeHRM.seleniumuiframwork_Object_repository_Admin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orangeHRM.seleniumuiframwork_genricutility.Base;
import com.orangeHRM.seleniumuiframwork_genricutility.Pages;

public class addJobTitlePage extends Base{
	public addJobTitlePage() {
        PageFactory.initElements(driver, this);
    }
	
//  ==Job page navigation==
    
  @FindBy(xpath = "//span[text()='Job ']")
  private WebElement jobMenu;

  @FindBy(linkText = "Job Titles")
  private WebElement jobTitlesOption;
  
  @FindBy(xpath = "//button[.=' Add ']")
  private WebElement addButtonjob;

  // ===== JOB TITLE FIELDS =====
  
  @FindBy(xpath = "//label[text()='Job Title']/../following-sibling::div//input")
  private WebElement jobTitleField;

  @FindBy(css = "[placeholder='Type description here']")
  private WebElement jobDescriptionField;

  @FindBy(xpath = "//textarea[@placeholder=\"Add note\"]")
  private WebElement noteField;
  
  @FindBy(css = "[class='oxd-file-div oxd-file-div--active']")
  private WebElement job_Specification;
  
  
  @FindBy(xpath= "//button[.=' Save ']")
  private WebElement saveJobTitle;
  
  @FindBy(xpath= "//p[.='Successfully Saved']")
  private WebElement verifyjob;


  public WebElement getVerifyjob() {
	return verifyjob;
}

  public WebElement getJobMenu() {
	return jobMenu;
  }


  public WebElement getJobTitlesOption() {
	return jobTitlesOption;
  }


  public WebElement getAddButtonjob() {
	return addButtonjob;
  }


  public WebElement getJobTitleField() {
	return jobTitleField;
  }



  public WebElement getJobDescriptionField() {
	return jobDescriptionField;
  }


  public WebElement getNoteField() {
	return noteField;
  }


  public WebElement getJob_Specification() {
	return job_Specification;
  }


  public WebElement getSaveJobTitle() {
	return saveJobTitle;

  }
  public void setJobMenu() {
		getJobMenu().click();
}


  public void setJobTitlesOption() {
		getJobTitlesOption().click();
  }


  public void setAddButtonjob() {
		getAddButtonjob().click();
  }


  public void setJobTitleField(String jobTitleField) {
	  Pages.jt.getJobTitleField().sendKeys(jobTitleField);
  }


  public void setJobDescriptionField(String jobDescriptionField) {
	  Pages.jt.getJobDescriptionField().sendKeys(jobDescriptionField);
  }


  public void setNoteField(String noteField) {
	  Pages.jt.getNoteField().sendKeys(noteField);
  }


  public void setJob_Specification(String job_Specification) {
	  String filePath = System.getProperty("user.dir") + "/src/test/resources/" + job_Specification;

	    Pages.jt.getJob_Specification().sendKeys(filePath);
  }


  public void setSaveJobTitle() {
	  Pages.jt.getSaveJobTitle().click();
  }

  }

