package com.orangehrm.testing.stepdefinition;
import com.orangehrm.testing.stepdefinition.Hook;
import utils.DriverFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

import io.cucumber.java.en.Given;

public class CommonSteps {

    WebDriver driver;
    WebDriverWait wait;
    
    public CommonSteps() {
        this.driver = DriverFactory.getDriver();   // ✅ safe access
    }

    @Given("user is on Time page")
    public void user_is_on_time_page() {
    	
    	wait = new WebDriverWait(driver, Duration.ofSeconds(15)); // ✅ create after driver ready


        // ✅ WAIT for Time menu to be visible
        wait.until(ExpectedConditions.visibilityOfElementLocated(
            By.xpath("//span[normalize-space()='Time']")
        )).click();
    }
}