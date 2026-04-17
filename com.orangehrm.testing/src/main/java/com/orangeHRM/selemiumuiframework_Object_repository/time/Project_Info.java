package com.orangeHRM.selemiumuiframework_Object_repository.time;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.*;

public class Project_Info {

    WebDriver driver;
    WebDriverWait wait;

    public Project_Info(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    // ================= LOCATORS =================

    @FindBy(xpath = "//span[normalize-space()='Project Info']")
    WebElement projectInfoSection;

    @FindBy(xpath = "//a[normalize-space()='Projects']")
    WebElement projectTab;

    @FindBy(xpath = "//button[contains(.,'Add')]")
    WebElement addProjectBtn;

    @FindBy(xpath = "//label[contains(text(),'Name')]/parent::div/following-sibling::div/descendant::input[@class='oxd-input oxd-input--active']")
    WebElement projectNameInput;

    @FindBy(xpath = "//label[contains(text(),'Customer')]/parent::div/following-sibling::div/descendant::input")
    WebElement customerNameInput;

    @FindBy(xpath = "//div[@role='option']")
    List<WebElement> customerOptions;

    @FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")
    WebElement saveBtn;

    @FindBy(xpath = "//p[contains(@class,'toast-message')]")
    WebElement successMsg;

    // ================= ACTION METHODS =================

    public void navigateToProjectInfo() {
        wait.until(ExpectedConditions.elementToBeClickable(projectInfoSection)).click();
    }

    public void clickProjectTab() {
        wait.until(ExpectedConditions.elementToBeClickable(projectTab)).click();
    }

    public void clickAddProject() {
        wait.until(ExpectedConditions.elementToBeClickable(addProjectBtn)).click();
    }

    public void enterProjectName(String name) {
        wait.until(ExpectedConditions.visibilityOf(projectNameInput)).clear();
        projectNameInput.sendKeys(name);
    }

    public void enterCustomerNameAndSelect(String searchText) {

        WebElement input = wait.until(
                ExpectedConditions.visibilityOf(customerNameInput)
        );

        input.clear();
        input.sendKeys(searchText);

        // wait for dropdown to load
        wait.until(driver -> customerOptions.size() > 0);
        wait.until(ExpectedConditions.visibilityOfAllElements(customerOptions));

        // select using keyboard
        input.sendKeys(Keys.ARROW_DOWN);
        input.sendKeys(Keys.ENTER);
    }

    public void clickSave() {
        wait.until(ExpectedConditions.elementToBeClickable(saveBtn)).click();
    }

    public String getSuccessMessage() {
        return wait.until(ExpectedConditions.visibilityOf(successMsg)).getText();
    }
}