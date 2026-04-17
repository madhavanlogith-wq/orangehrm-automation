Feature: Recruitment Module - Candidate and Vacancy Management

  As an HR Manager
  I want to manage candidates and vacancies in the Recruitment module
  So that I can efficiently handle hiring process


  Background:
    Given User launches the browser
    And User navigates to OrangeHRM login page
    When User enters valid username and password
    And User clicks on login button
    Then User should land on dashboard


  # =========================
  # Scenario 1 - Add Candidate
  # =========================

  Scenario: Add candidate with valid mandatory details
    Given User navigates to Recruitment module
    When User clicks on Add Candidate button
    And User enters candidate details
      | FirstName | John |
      | LastName  | Doe |
      | Email     | john.doe@example.com |
    And User clicks Save button
    Then Candidate should be added successfully


  # =========================
  # Scenario 2 - Add Vacancy
  # =========================

  Scenario: Create vacancy with valid details
    Given User navigates to Recruitment > Vacancies section
    When User clicks on Add Vacancy button
    And User enters vacancy details
      | JobTitle      | Software Engineer |
      | HiringManager | Admin |
    And User clicks Save button
    Then Vacancy should be created successfully


  # =========================
  # Scenario 3 - Candidate Search + View
  # =========================

  Scenario: Search and view candidate details
    Given User navigates to Candidate list page
    When User searches candidate "John Doe"
    And User clicks on the candidate result
    Then Candidate details should be displayed correctly


  # =========================
  # Scenario 4 - Vacancy Search + View
  # =========================

  Scenario: Search and view vacancy details
    Given User navigates to Vacancy list page
    When User searches vacancy "Software Engineer"
    And User clicks on the vacancy result
    Then Vacancy details should be displayed correctly


  # =========================
  # Scenario 5 - Positive Input Validation
  # =========================

  Scenario: System accepts valid input data for candidate and vacancy
    Given User is on Recruitment module
    When User enters valid data in all mandatory fields
    Then System should accept inputs without errors


  # =========================
  # Scenario 6 - Negative Validation
  # =========================

  Scenario: System shows error when mandatory fields are empty
    Given User is on Add Candidate or Add Vacancy page
    When User leaves mandatory fields empty
    And User clicks Save button
    Then System should display validation error messages
    And Record should not be created