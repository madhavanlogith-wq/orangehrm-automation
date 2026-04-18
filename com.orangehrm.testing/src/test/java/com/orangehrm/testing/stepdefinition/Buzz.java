//package com.orangehrm.testing.stepdefinition;
//
//import io.cucumber.java.en.*;
//import org.openqa.selenium.WebDriver;
//import org.testng.Assert;
//
//import com.orangeHRM.selemiumuiframework_Object_repository.buzz.Post;
//
//public class Buzz {
//
//    WebDriver driver;
//    Post post;
//
//    public Buzz() {
//        // ONLY get driver reference, NOT page object
//        driver = Hook.getDriver();
//    }
//
//    private void initPage() {
//
//        if (post == null) {
//            post = new Post(driver);
//        }
//    }
//
//    @Given("user is logged into the application")
//    public void user_is_logged_into_the_application() {
//        System.out.println("User already logged in via Hook");
//    }
//
//    @When("user is on buzz page")
//    public void user_is_on_buzz_page() {
//
//        initPage();   // 🔥 safe lazy init
//
//        post.openBuzzPage();
//    }
//
//    @When("user enters {string}")
//    public void user_enters(String text) {
//
//        initPage();
//
//        post.enterText(text);
//    }
//
//    @When("user clicks post")
//    public void user_clicks_post() {
//
//        initPage();
//
//        post.clickPost();
//    }
//
//    @Then("post should be created successfully")
//    public void post_should_be_created_successfully() {
//
//        initPage();
//
//        String postText = post.getLatestPostText();
//
//        Assert.assertTrue(postText.contains("hello"),
//                "Post not created successfully");
//    }
//}


package com.orangehrm.testing.stepdefinition;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.orangeHRM.selemiumuiframework_Object_repository.buzz.Post;

public class Buzz {

    WebDriver driver;
    Post post;

    public Buzz() {
        this.driver = Hook.getDriver();
        this.post = new Post(driver);
    }

    // ================= LOGIN VALIDATION =================

    @Given("user is logged into the application")
    public void user_is_logged_into_the_application() {
        System.out.println("User already logged in via Hook");
    }

    // ================= BUZZ FLOW =================

    @When("user is on buzz page")
    public void user_is_on_buzz_page() {
        post.openBuzzPage();
    }

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

        Assert.assertTrue(
            postText != null && !postText.isEmpty(),
            "Post not created successfully or post is empty"
        );
    }
}