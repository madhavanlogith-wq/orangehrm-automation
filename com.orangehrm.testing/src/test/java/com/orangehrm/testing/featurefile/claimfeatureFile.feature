Feature: Claims Module

Scenario: Submit claim successfully and verify submission

When user navigates to Submit Claim section
And user selects event as "Accommodation"
And user selects currency as "Indian Rupee"
And user enters remarks "Business trip claim"
And user clicks on Create button
Then user should be navigated to claim details page
When user clicks Submit button
Then claim should be submitted successfully