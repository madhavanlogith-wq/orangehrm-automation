Feature: My Info - Personal Details

  Scenario: Update personal details successfully
    Given user is logged in and navigates to My Info page
    When user updates first name and last name
    And user clicks nationality and marital status dropdown
    And user clicks save button
    Then personal details should be saved successfully


  Scenario: Update contact details successfully
    Given user is logged in and navigates to My Info page
    When user navigates to Contact Details tab
    And user enters street address, city, mobile and work email
    And user clicks save button in contact details
    Then contact details should be saved successfully
    