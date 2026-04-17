Feature: Time Module

Background:
  Given user is logged in as admin
  And user is on time page

Scenario: Punch in successfully
  When user clicks punch in
  Then punch in should be successful

Scenario: View attendance records
  When user navigates to attendance records
  Then attendance records should be displayed

Scenario: View project reports
  When user selects project report option
  Then project reports should be displayed

Scenario: View activities under selected project
  When user selects a project
  Then system should display all activities under that project

Scenario: No records when project not available
  When user selects a project with no records
  Then system should display "No Records Found"

Scenario: Add new project with valid details
  When user enters valid project details
  And user clicks save
  Then project should be added successfully

Scenario: Verify newly added project is listed
  When user views project list
  Then newly added project should be displayed