	Feature: Time Module
	
	Background:
	  Given user is on Time page
	
	Scenario: Punch in successfully
	  When user navigates to attendance section
	  And user opens the punch page
	  And user clicks punch in
	  Then user should be able to punch in
	  
	Scenario: No records when project not available
	When user navigates to reports section
	And user clicks on project reports
	And user clicks on view button
	Then system should display "Required"
	
	Scenario: Add new project with valid details
  When user navigates to project info section
  And user clicks on project tab
  And user clicks on add project
  And user enters new project name "sample"
  And user enters customer name "fr"
  And user selects customer "FreeWave Technologies, Inc."
  And user clicks save
  Then project should be saved successfully