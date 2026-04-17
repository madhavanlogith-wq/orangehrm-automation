package com.orangeHRM.seleniumuiframwork_Object_repository;

import java.time.Duration;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.orangeHRM.seleniumuiframwork_genricutility.Base;


public class RecruitmentPage  {
	private Base base;
    WebDriverWait wait;

    public RecruitmentPage() {
        PageFactory.initElements(base.driver, this);
        wait = new WebDriverWait(base.driver, Duration.ofSeconds(10));
    }

  

    @FindBy(xpath = "//span[text()='Recruitment']")
    WebElement recruitmentMenu;

    @FindBy(xpath = "//button[contains(., 'Add')]")
    WebElement addBtn;

    @FindBy(name = "firstName")
    WebElement firstName;

    @FindBy(name = "lastName")
    WebElement lastName;

    @FindBy(xpath = "//input[@placeholder='Type here']")
    WebElement email;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement saveBtn;

    @FindBy(xpath = "//div[contains(text(),'Successfully')]")
    WebElement successMsg;



    public void navigateToRecruitment() {
        wait.until(ExpectedConditions.elementToBeClickable(recruitmentMenu)).click();
    }

    public void clickAdd() {
        wait.until(ExpectedConditions.elementToBeClickable(addBtn)).click();
    }

    public void addCandidate(String fname, String lname, String mail) {
        firstName.sendKeys(fname);
        lastName.sendKeys(lname);
        email.sendKeys(mail);
    }

    public void clickSave() {
        wait.until(ExpectedConditions.elementToBeClickable(saveBtn)).click();
    }

    public boolean isCandidateAdded() {
        return successMsg.isDisplayed();
    }
}