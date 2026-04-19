package com.orangeHRM.seleniumuiframwork_genricutility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {

	public static WebDriver driver;
	 public static WebDriverWait wait;

	    public void initializeWait() {
	        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    }

	    public void waitForVisibility(WebElement element) {
	        wait.until(ExpectedConditions.visibilityOf(element));
	    }

	    public void waitForClick(WebElement element) {
	        wait.until(ExpectedConditions.elementToBeClickable(element));
	    }
}
