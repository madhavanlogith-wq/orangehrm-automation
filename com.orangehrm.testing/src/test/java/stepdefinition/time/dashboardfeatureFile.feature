Feature: Dashboard Functionality

Scenario: Verify user lands on dashboard after login

Given user is already logged into the application
Then user should be on dashboard page
And dashboard page should be displayed successfully