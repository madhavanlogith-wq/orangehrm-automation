package com.orangeHRM.selemiumuiframework_Object_repository.buzz;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Post {
	
	WebDriver driver;

	public Post(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//textarea[@class='oxd-buzz-post-input']")
    WebElement textField;

    @FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--main']")
    WebElement postButton;

    @FindBy(xpath = "(//p[@class='oxd-text oxd-text--p orangehrm-buzz-post-body-text'])[1]")
    WebElement latestPost;

    public void enterText(String text) {
        textField.sendKeys(text);
    }

    public void clickPost() {
        postButton.click();
    }

    public String getLatestPost() {
        return latestPost.getText();
    }


}
