package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {

    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public static void initDriver() {
        driver.set(new ChromeDriver());
        driver.get().manage().window().maximize();
    }

    public static WebDriver getDriver() {
        if (driver.get() == null) {
            throw new RuntimeException("Driver not initialized. Check @Before hook.");
        }
        return driver.get();
    }

    public static void quitDriver() {
        if (driver.get() != null) {
            driver.get().quit();
            driver.remove();
        }
    }
}