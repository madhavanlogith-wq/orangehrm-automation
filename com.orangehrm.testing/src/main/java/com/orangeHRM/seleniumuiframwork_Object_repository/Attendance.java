package com.orangeHRM.seleniumuiframwork_Object_repository;

import java.time.Duration;
import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.*;

public class Attendance {

    WebDriver driver;
    WebDriverWait wait;

    public Attendance(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @FindBy(xpath = "//span[normalize-space()='Time']")
    WebElement timeMenu;

    @FindBy(xpath = "//span[contains(text(),'Attendance')]")
    WebElement attendanceSection;

    @FindBy(xpath = "//a[normalize-space()='Punch In/Out']")
    WebElement punchPage;

    // ✅ FIXED LOCATOR (TEXT BASED = STABLE)
    @FindBy(xpath = "//button[contains(.,'In')]")
    WebElement punchInBtn;

    public void openTimeModule() {
        wait.until(ExpectedConditions.elementToBeClickable(timeMenu)).click();
    }

    public void openAttendanceSection() {
        wait.until(ExpectedConditions.elementToBeClickable(attendanceSection)).click();
    }

    public void openPunchSection() {
        wait.until(ExpectedConditions.elementToBeClickable(punchPage)).click();
    }

    public void clickPunchIn() {
        wait.until(ExpectedConditions.elementToBeClickable(punchInBtn)).click();
    }

    public boolean isPunchInButtonGone() {
        try {
            wait.until(ExpectedConditions.invisibilityOf(punchInBtn));
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}