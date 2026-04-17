package com.orangeHRM.seleniumuiframwork_Object_repository;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
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

    @FindBy(name = "username")
    private WebElement userName;

    @FindBy(name = "password")
    private WebElement passWord;

    @FindBy(css = "[type='submit']")
    private WebElement logIn;

    // ================= ACTION METHODS =================

    public void enterUsername(String username) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                org.openqa.selenium.By.name("username")
        ));
        userName.sendKeys(username);
    }

    public void enterPassword(String password) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                org.openqa.selenium.By.name("password")
        ));
        passWord.sendKeys(password);
    }

    public void clickLogin() {
        wait.until(ExpectedConditions.elementToBeClickable(logIn)).click();
    }

    public void login(String username, String password) {
        enterUsername(username);
        enterPassword(password);
        clickLogin();
    }

    public boolean isDashboardDisplayed() {
        return driver.getCurrentUrl().contains("dashboard");
    }
}


