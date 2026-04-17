package pages;

import org.openqa.selenium.By;

import com.orangehrm.testing.utilities.BaseClass;

public class LoginPage {

    By username = By.name("username");
    By password = By.name("password");
    By loginBtn = By.xpath("//button[@type='submit']");

    public void openURL() {
        BaseClass.driver.get("https://opensource-demo.orangehrmlive.com/");
    }

    public void login(String user, String pass) {
        BaseClass.driver.findElement(username).sendKeys(user);
        BaseClass.driver.findElement(password).sendKeys(pass);
        BaseClass.driver.findElement(loginBtn).click();
    }
}