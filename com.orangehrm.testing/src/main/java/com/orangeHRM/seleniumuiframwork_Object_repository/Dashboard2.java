package com.orangeHRM.seleniumuiframwork_Object_repository;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Dashboard2 {

    WebDriver driver;
    WebDriverWait wait;

    public Dashboard2(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    // ================= LOCATORS =================

    @FindBy(linkText = "PIM")
    private WebElement pimLink;

    @FindBy(css = ".oxd-userdropdown-tab")
    private WebElement logoutDropdown;

    @FindBy(xpath = "//a[text()='Logout']")
    private WebElement logoutButton;

    @FindBy(linkText = "Recruitment")
    private WebElement recruitmentLink;

    // ================= ACTION METHODS =================

    public void clickPim() {
        wait.until(ExpectedConditions.elementToBeClickable(pimLink)).click();
    }

    public void clickRecruitment() {
        wait.until(ExpectedConditions.elementToBeClickable(recruitmentLink)).click();
    }

    public void openLogoutDropdown() {
        wait.until(ExpectedConditions.elementToBeClickable(logoutDropdown)).click();
    }

    public void clickLogout() {
        wait.until(ExpectedConditions.elementToBeClickable(logoutButton)).click();
    }

    public void logout() {
        openLogoutDropdown();
        clickLogout();
    }

    // ================= VALIDATION =================

    public boolean isDashboardDisplayed() {
        return driver.getCurrentUrl().contains("dashboard");
    }
}