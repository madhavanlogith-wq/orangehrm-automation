package com.orangehrm.testing.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

import io.cucumber.java.en.Given;

public class CommonSteps {

    WebDriver driver = Hook.getDriver();
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

    @Given("user is on Time page")
    public void user_is_on_time_page() {

        // ✅ WAIT for Time menu to be visible
        wait.until(ExpectedConditions.visibilityOfElementLocated(
            By.xpath("//span[normalize-space()='Time']")
        )).click();
    }
}