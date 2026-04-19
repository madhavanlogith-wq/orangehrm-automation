package com.orangehrm.testing.utilities;

import org.openqa.selenium.WebDriver;

public class BaseClass {

    public static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public static void setDriver(WebDriver d) {
        driver.set(d);
    }

    public static WebDriver getDriver() {
        return driver.get();
    }

    public static void unload() {
        driver.remove();
    }
}