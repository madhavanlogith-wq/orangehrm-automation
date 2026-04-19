package com.orangeHRM.seleniumuiframwork_Object_repository;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
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

    // ===== LOCATORS =====

    By pimLink = By.linkText("PIM");
    By logoutDropdown = By.cssSelector(".oxd-userdropdown-tab");
    By logoutButton = By.xpath("//a[text()='Logout']");
    By recruitmentLink = By.linkText("Recruitment");

    // ===== ACTION METHODS =====

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

    public boolean isDashboardDisplayed() {
        return driver.getCurrentUrl().contains("dashboard");
    }
}