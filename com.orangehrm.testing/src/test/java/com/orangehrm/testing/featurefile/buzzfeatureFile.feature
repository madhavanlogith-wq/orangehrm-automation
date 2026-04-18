Feature: Buzz Module

Background:
  Given user is logged into the application
  And user is on buzz page

Scenario: Create and post content
  When user enters "hello"
  And user clicks post
  Then post should be created successfully

#Scenario: Validate minimum character length for Buzz post
 # When user enters content less than minimum characters
  #And user clicks post
  #Then validation message should be displayed