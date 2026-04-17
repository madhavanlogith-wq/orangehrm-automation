package com.orangeHRM.seleniumuiframwork_Object_repository_pim;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orangeHRM.seleniumuiframwork_genricutility.Base;

public class AddUserPage extends Base {

	public AddUserPage() {
        PageFactory.initElements(driver, this);
    }

	
    @FindBy(xpath = "//label[text()='User Role']/../following-sibling::div//div[contains(@class,'select-text')]")
    private WebElement userRoleDropdown;

    @FindBy(xpath = "//div[@role='listbox']//span[text()='Admin']")
    private WebElement adminOption;

    @FindBy(xpath = "//input[@placeholder='Type for hints...']")
    private WebElement employeeNameTextField;

    @FindBy(xpath = "//label[text()='Status']/../following-sibling::div//div[contains(@class,'select-text')]")
    private WebElement statusDropdown;

    @FindBy(xpath = "//div[@role='listbox']//span[text()='Enabled']")
    private WebElement enabledOption;

    @FindBy(xpath = "//label[text()='Username']/../following-sibling::div/input")
    private WebElement usernameTextField;

    @FindBy(xpath = "//label[text()='Password']/../following-sibling::div/input")
    private WebElement passwordTextField;

    @FindBy(xpath = "//label[text()='Confirm Password']/../following-sibling::div/input")
    private WebElement confirmPasswordTextField;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement saveButton;

    
    @FindBy(xpath = "//button[normalize-space()='Add']")
    private WebElement addButton;

    @FindBy(xpath = "//button[normalize-space()='Save']")
    private WebElement saveButton1;

    @FindBy(xpath = "//span[text()='Job ']")
    private WebElement jobMenu;

    @FindBy(linkText = "Job Titles")
    private WebElement jobTitlesOption;

    // ===== JOB TITLE FIELDS =====
    @FindBy(xpath = "//label[text()='Job Title']/../following-sibling::div//input")
    private WebElement jobTitleField;

    @FindBy(xpath = "//textarea")
    private WebElement jobDescriptionField;

    @FindBy(xpath = "//label[text()='Note']/../following-sibling::div//textarea")
    private WebElement noteField;

   

    // ================= ORGANIZATION MENU =================
    @FindBy(xpath = "//span[text()='Organization ']")
    private WebElement organizationMenu;

    @FindBy(linkText = "Locations")
    private WebElement locationsOption;

   

    // ===== LOCATION FIELDS =====
    @FindBy(xpath = "//label[text()='Name']/../following-sibling::div//input")
    private WebElement locationName;

    @FindBy(xpath = "//label[text()='City']/../following-sibling::div//input")
    private WebElement cityField;

    @FindBy(xpath = "//span[text()='Qualifications ']")
    private WebElement qualificationsMenu;

    @FindBy(linkText = "Skills")
    private WebElement skillsOption;

    @FindBy(linkText = "Education")
    private WebElement educationOption;

    @FindBy(linkText = "Licenses")
    private WebElement licensesOption;

    @FindBy(linkText = "Languages")
    private WebElement languagesOption;

    @FindBy(linkText = "Memberships")
    private WebElement membershipsOption;

    @FindBy(xpath = "//label[text()='Name']/../following-sibling::div//input")
    private WebElement skillName;

    @FindBy(xpath = "//textarea")
    private WebElement skillDescription;

    @FindBy(xpath = "//label[text()='Level']/../following-sibling::div//input")
    private WebElement educationName;


    // ===== LICENSE =====
    @FindBy(xpath = "//label[text()='Name']/../following-sibling::div//input")
    private WebElement licenseName;

    // ===== LANGUAGE =====
    @FindBy(xpath = "//label[text()='Name']/../following-sibling::div//input")
    private WebElement languageName;

    
    // ===== MEMBERSHIP =====
    @FindBy(xpath = "//label[text()='Name']/../following-sibling::div//input")
    private WebElement membershipName;

    

    public WebElement getUserRoleDropdown() {
		return userRoleDropdown;
	}

	public void setUserRoleDropdown(WebElement userRoleDropdown) {
		this.userRoleDropdown = userRoleDropdown;
	}

	public WebElement getAdminOption() {
		return adminOption;
	}

	public void setAdminOption(WebElement adminOption) {
		this.adminOption = adminOption;
	}

	public WebElement getEmployeeNameTextField() {
		return employeeNameTextField;
	}

	public void setEmployeeNameTextField(WebElement employeeNameTextField) {
		this.employeeNameTextField = employeeNameTextField;
	}

	public WebElement getStatusDropdown() {
		return statusDropdown;
	}

	public void setStatusDropdown(WebElement statusDropdown) {
		this.statusDropdown = statusDropdown;
	}

	public WebElement getEnabledOption() {
		return enabledOption;
	}

	public void setEnabledOption(WebElement enabledOption) {
		this.enabledOption = enabledOption;
	}

	public WebElement getUsernameTextField() {
		return usernameTextField;
	}

	public void setUsernameTextField(WebElement usernameTextField) {
		this.usernameTextField = usernameTextField;
	}

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}

	public void setPasswordTextField(WebElement passwordTextField) {
		this.passwordTextField = passwordTextField;
	}

	public WebElement getConfirmPasswordTextField() {
		return confirmPasswordTextField;
	}

	public void setConfirmPasswordTextField(WebElement confirmPasswordTextField) {
		this.confirmPasswordTextField = confirmPasswordTextField;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}

	public void setSaveButton(WebElement saveButton) {
		this.saveButton = saveButton;
	}

	public WebElement getAddButton() {
		return addButton;
	}

	public void setAddButton(WebElement addButton) {
		this.addButton = addButton;
	}

	public WebElement getSaveButton1() {
		return saveButton1;
	}

	public void setSaveButton1(WebElement saveButton1) {
		this.saveButton1 = saveButton1;
	}

	public WebElement getJobMenu() {
		return jobMenu;
	}

	public void setJobMenu(WebElement jobMenu) {
		this.jobMenu = jobMenu;
	}

	public WebElement getJobTitlesOption() {
		return jobTitlesOption;
	}

	public void setJobTitlesOption(WebElement jobTitlesOption) {
		this.jobTitlesOption = jobTitlesOption;
	}

	public WebElement getJobTitleField() {
		return jobTitleField;
	}

	public void setJobTitleField(WebElement jobTitleField) {
		this.jobTitleField = jobTitleField;
	}

	public WebElement getJobDescriptionField() {
		return jobDescriptionField;
	}

	public void setJobDescriptionField(WebElement jobDescriptionField) {
		this.jobDescriptionField = jobDescriptionField;
	}

	public WebElement getNoteField() {
		return noteField;
	}

	public void setNoteField(WebElement noteField) {
		this.noteField = noteField;
	}

	public WebElement getOrganizationMenu() {
		return organizationMenu;
	}

	public void setOrganizationMenu(WebElement organizationMenu) {
		this.organizationMenu = organizationMenu;
	}

	public WebElement getLocationsOption() {
		return locationsOption;
	}

	public void setLocationsOption(WebElement locationsOption) {
		this.locationsOption = locationsOption;
	}

	public WebElement getLocationName() {
		return locationName;
	}

	public void setLocationName(WebElement locationName) {
		this.locationName = locationName;
	}

	public WebElement getCityField() {
		return cityField;
	}

	public void setCityField(WebElement cityField) {
		this.cityField = cityField;
	}

	public WebElement getQualificationsMenu() {
		return qualificationsMenu;
	}

	public void setQualificationsMenu(WebElement qualificationsMenu) {
		this.qualificationsMenu = qualificationsMenu;
	}

	public WebElement getSkillsOption() {
		return skillsOption;
	}

	public void setSkillsOption(WebElement skillsOption) {
		this.skillsOption = skillsOption;
	}

	public WebElement getEducationOption() {
		return educationOption;
	}

	public void setEducationOption(WebElement educationOption) {
		this.educationOption = educationOption;
	}

	public WebElement getLicensesOption() {
		return licensesOption;
	}

	public void setLicensesOption(WebElement licensesOption) {
		this.licensesOption = licensesOption;
	}

	public WebElement getLanguagesOption() {
		return languagesOption;
	}

	public void setLanguagesOption(WebElement languagesOption) {
		this.languagesOption = languagesOption;
	}

	public WebElement getMembershipsOption() {
		return membershipsOption;
	}

	public void setMembershipsOption(WebElement membershipsOption) {
		this.membershipsOption = membershipsOption;
	}

	public WebElement getSkillName() {
		return skillName;
	}

	public void setSkillName(WebElement skillName) {
		this.skillName = skillName;
	}

	public WebElement getSkillDescription() {
		return skillDescription;
	}

	public void setSkillDescription(WebElement skillDescription) {
		this.skillDescription = skillDescription;
	}

	public WebElement getEducationName() {
		return educationName;
	}

	public void setEducationName(WebElement educationName) {
		this.educationName = educationName;
	}

	public WebElement getLicenseName() {
		return licenseName;
	}

	public void setLicenseName(WebElement licenseName) {
		this.licenseName = licenseName;
	}

	public WebElement getLanguageName() {
		return languageName;
	}

	public void setLanguageName(WebElement languageName) {
		this.languageName = languageName;
	}

	public WebElement getMembershipName() {
		return membershipName;
	}

	public void setMembershipName(WebElement membershipName) {
		this.membershipName = membershipName;
	}

	public WebElement getNationalitiesOption() {
		return nationalitiesOption;
	}

	public void setNationalitiesOption(WebElement nationalitiesOption) {
		this.nationalitiesOption = nationalitiesOption;
	}

	public WebElement getNationalityName() {
		return nationalityName;
	}

	public void setNationalityName(WebElement nationalityName) {
		this.nationalityName = nationalityName;
	}

	// ================= NATIONALITIES =================
    @FindBy(linkText = "Nationalities")
    private WebElement nationalitiesOption;

    @FindBy(xpath = "//label[text()='Name']/../following-sibling::div//input")
    private WebElement nationalityName;

	
    
}
