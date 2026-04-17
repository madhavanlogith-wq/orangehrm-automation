package com.orangeHRM.seleniumuiframwork_Object_repository;

import java.time.Duration;
import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.*;

public class Submit_Claim {

    WebDriver driver;
    WebDriverWait wait;

    public Submit_Claim(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    // ===== LOCATORS =====

    @FindBy(xpath = "//span[normalize-space()='Claim']")
    WebElement claimMenu;

    @FindBy(xpath = "//a[normalize-space()='Submit Claim']")
    WebElement submitClaim;

    @FindBy(xpath = "//label[contains(.,'Event')]/following::div[1]")
    WebElement eventDropdown;

    @FindBy(xpath = "//label[contains(.,'Currency')]/following::div[1]")
    WebElement currencyDropdown;

    @FindBy(xpath = "//textarea")
    WebElement remarksArea;

    @FindBy(xpath = "//button[contains(.,'Create')]")
    WebElement createButton;

    @FindBy(xpath = "//button[contains(.,'Submit')]")
    WebElement submitButton;

    // ===== ACTIONS =====

    public void openClaimModule() {
        wait.until(ExpectedConditions.elementToBeClickable(claimMenu)).click();
    }

    public void openSubmitClaimTab() {
        wait.until(ExpectedConditions.elementToBeClickable(submitClaim)).click();
    }

    public void selectEvent(String event) {
        wait.until(ExpectedConditions.elementToBeClickable(eventDropdown)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//span[text()='" + event + "']")
        )).click();
    }

    public void selectCurrency(String currency) {
        wait.until(ExpectedConditions.elementToBeClickable(currencyDropdown)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//span[text()='" + currency + "']")
        )).click();
    }

    public void enterRemarks(String remark) {
        wait.until(ExpectedConditions.visibilityOf(remarksArea)).sendKeys(remark);
    }

    public void clickCreate() {
        wait.until(ExpectedConditions.elementToBeClickable(createButton)).click();
    }

    public void clickSubmit() {
        wait.until(ExpectedConditions.elementToBeClickable(submitButton)).click();

        wait.until(ExpectedConditions.invisibilityOf(submitButton));
    }
    
    public void waitForSubmission() {

        wait.until(ExpectedConditions.or(
            ExpectedConditions.invisibilityOf(submitButton),
            ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//button[contains(.,'Cancel')]")
            )
        ));
    }

    public boolean isClaimSubmitted() {

        boolean submitGone = driver.findElements(
            By.xpath("//button[contains(.,'Submit')]")
        ).isEmpty();

        boolean cancelVisible = driver.findElements(
            By.xpath("//button[contains(.,'Cancel')]")
        ).size() > 0;

        return submitGone && cancelVisible;
    }
    }
