package com.orangehrm.testing.stepdefinition;

import io.cucumber.java.en.*;
import utils.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.orangeHRM.selemiumuiframework_Object_repository.buzz.Post;

public class Buzz {

    WebDriver driver;
    Post post;
    
    public Buzz() {
    	this.driver = DriverFactory.getDriver();
    }

    @Given("user is logged into the application")
    public void user_is_logged_into_the_application() {
        System.out.println("User logged in via Hook");
    }

    @When("user is on buzz page")
    public void user_is_on_buzz_page() {
        post.openBuzzPage();
    }

    // ✅ FIXED STEP (accepts string)
    @When("user enters {string}")
    public void user_enters(String text) {
        post.enterText(text);
    }

    @When("user clicks post")
    public void user_clicks_post() {
        post.clickPost();
    }

    @Then("post should be created successfully")
    public void post_should_be_created_successfully() {

        String postText = post.getLatestPostText();
        System.out.println("Post found: " + postText);

        Assert.assertTrue(
            postText.contains("hello"),
            "Post not created successfully"
        );
    }
}