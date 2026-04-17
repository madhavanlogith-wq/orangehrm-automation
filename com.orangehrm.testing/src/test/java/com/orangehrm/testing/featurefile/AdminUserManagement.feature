Feature: OrangeHRM Admin Module Automation

  Background:
    Given user launches browser and opens application
    When user enters valid username "Admin" and password "admin123"
    And user clicks login button
    Then user should see dashboard page with all elements

  # ================= ADD USER =================

  Scenario: Add new user with all fields
    When user clicks add button
    And user selects user role "Admin"
    And user enters employee name "Linda Anderson"
    And user selects status "Enabled"
    And user enters username "user12345"
    And user enters password "Admin@123"
    And user enters confirm password "Admin@123"
    And user clicks save button
    Then user should be added successfully

  # ================= ADD JOB TITLE =================

  Scenario: Add new job title with all fields
    When user navigates to job titles
    And user clicks add button
    And user enters job title "Lead Data Analyst"
    And user enters job description "Responsible for data analysis and reporting"
    And user uploads job specification file "sample.pdf"
    And user adds job note "This is a senior level role"
    And user clicks save button
    Then job title should be added successfully
  # ================= LOCATION =================

  Scenario: Add new location
    When user navigates to locations
    And user clicks add button
    And user enters location name "Chennai Office"
    And user selects country "India"
    And user enters city "Chennai"
    And user enters address "OMR Road"
    And user clicks save button
    Then location should be added successfully

  # ================= QUALIFICATIONS =================

  Scenario: Add new skill
    When user navigates to skills
    And user clicks add button
    And user enters skill name "Java Automation"
    And user enters skill description "Selenium with Java"
    And user clicks save button
    Then skill should be added successfully

  Scenario: Add new license
    When user navigates to licenses
    And user clicks add button
    And user enters license name "PMP Certification"
    And user clicks save button
    Then license should be added successfully

  Scenario: Add new membership
    When user navigates to memberships
    And user clicks add button
    And user enters membership name "IEEE"
    And user clicks save button
    Then membership should be added successfully

  Scenario: Add new education
    When user navigates to education
    And user clicks add button
    And user enters education name "Masters Degree"
    And user clicks save button
    Then education should be added successfully

  # ================= NATIONALITIES =================

  Scenario: Add new nationality
    When user navigates to nationalities
    And user clicks add button
    And user enters nationality "Indian-Test"
    And user clicks save button
    Then nationality should be added successfully