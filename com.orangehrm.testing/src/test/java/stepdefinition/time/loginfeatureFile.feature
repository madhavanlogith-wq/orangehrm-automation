Feature: Login Functionality

Scenario: User logs in with valid credentials

Given user is on login page
When user enters username "Admin"
And user enters password "admin123"
And user clicks on login button
Then user should be redirected to dashboard