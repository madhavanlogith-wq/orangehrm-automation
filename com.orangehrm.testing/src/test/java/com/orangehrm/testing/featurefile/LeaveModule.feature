Feature: Leave Module

  Scenario: Apply Leave

    When navigate to leave module for  apply
    And click on Apply
    And select Leave Type "Personal"
    And select From Date "2026-05-02"
    And select To Date "2026-05-03"
    And select Partial Date
    And select Start Day 
    And enter Comments "Family vacation"
    And click on Apply button
    Then verify success message "Leave request successfully submitted"
    
    Scenario: My Leave
    
    When navigate to leave module for myleave
    When click on My Leave 
    And select Myleave From Date "2026-05-02" 
    And select Myleave To Date "2026-05-03"
    And select Leave Type
    And click on myleave search button
    Then verify all filter fields are cleared
   