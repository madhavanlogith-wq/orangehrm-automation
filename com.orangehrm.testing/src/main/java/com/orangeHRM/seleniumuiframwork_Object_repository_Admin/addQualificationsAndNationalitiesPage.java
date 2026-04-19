package com.orangeHRM.seleniumuiframwork_Object_repository_Admin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orangeHRM.seleniumuiframwork_genricutility.Base;

public class addQualificationsAndNationalitiesPage extends Base {


    public addQualificationsAndNationalitiesPage() {
        PageFactory.initElements(driver, this);
    }

    // ================= NAVIGATION =================

    @FindBy(xpath = "//span[text()='Qualifications ']")
    private WebElement qualificationsMenu;

    @FindBy(xpath = "//a[text()='Nationalities']")
    private WebElement nationalitiesMenu;

    // ================= COMMON BUTTONS =================

    @FindBy(xpath = "//button[normalize-space()='Add']")
    private WebElement addButton;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement saveButton;

    @FindBy(xpath = "//p[.='Successfully Saved']")
    private WebElement successMessage;

    // ================= SKILLS =================

    @FindBy(linkText = "Skills")
    private WebElement skillsOption;

    @FindBy(xpath = "//label[text()='Name']/../following-sibling::div//input")
    private WebElement skillNameField;

    @FindBy(xpath = "//label[text()='Description']/../following-sibling::div//textarea")
    private WebElement skillDescriptionField;

    // ================= LICENSES =================

    @FindBy(linkText = "Licenses")
    private WebElement licensesOption;

    @FindBy(xpath = "//label[text()='Name']/../following-sibling::div//input")
    private WebElement licenseNameField;

    // ================= MEMBERSHIPS =================

    @FindBy(linkText = "Memberships")
    private WebElement membershipsOption;

    @FindBy(xpath = "//label[text()='Name']/../following-sibling::div//input")
    private WebElement membershipNameField;

    // ================= EDUCATION =================
    @FindBy(linkText = "Education")
    private WebElement educationOption;

    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
    private WebElement educationNameField;

    // ================= NATIONALITY =================

    @FindBy(xpath = "//label[text()='Name']/../following-sibling::div//input")
    private WebElement nationalityNameField;

    // ================= GETTER =================

	public WebElement getQualificationsMenu() {
		return qualificationsMenu;
	}

	public WebElement getNationalitiesMenu() {
		return nationalitiesMenu;
	}

	public WebElement getAddButton() {
		return addButton;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}

	public WebElement getSuccessMessage() {
		return successMessage;
	}

	public WebElement getSkillsOption() {
		return skillsOption;
	}

	public WebElement getSkillNameField() {
		return skillNameField;
	}

	public WebElement getSkillDescriptionField() {
		return skillDescriptionField;
	}

	public WebElement getLicensesOption() {
		return licensesOption;
	}

	public WebElement getLicenseNameField() {
		return licenseNameField;
	}

	public WebElement getMembershipsOption() {
		return membershipsOption;
	}

	public WebElement getMembershipNameField() {
		return membershipNameField;
	}

	public WebElement getEducationOption() {
		return educationOption;
	}

	public WebElement getEducationNameField() {
		return educationNameField;
	}

	public WebElement getNationalityNameField() {
		return nationalityNameField;
	}



 
}
