package com.orangeHRM.seleniumuiframwork_Object_repository;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Loginpage2 {

    WebDriver driver;
    WebDriverWait wait;

    public Loginpage2(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    // ===== LOCATORS =====
    By userName = By.name("username");
    By passWord = By.name("password");
    By logIn = By.cssSelector("[type='submit']");

    // ===== ACTION METHODS =====

    public void enterUsername(String username) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(userName))
            .sendKeys(username);
    }

    public void enterPassword(String password) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(passWord))
            .sendKeys(password);
    }

    public void clickLogin() {
        wait.until(ExpectedConditions.elementToBeClickable(logIn)).click();
    }

    public boolean isDashboardDisplayed() {
        return driver.getCurrentUrl().contains("dashboard");
    }
}