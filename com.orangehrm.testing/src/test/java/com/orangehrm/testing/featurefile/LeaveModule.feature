Feature: Leave Module

  Scenario: Apply Leave

    When navigate to leave module
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
    
    When click on My Leave
    And select Myleave From Date "2026-05-02" 
    And select Myleave To Date "2026-05-03"
    And select Leave Type
    Then verify all filter fields are cleared
    
    Scenario: Admin adds leave entitlement to individual employee with valid data
    When navigate to Leave module
    And click on Entitlements dropdown
    And click on Add Entitlements
    And select "Individual Employee"
    And enter Employee Name "John"
    And select Leave Type "Annual"
    And select Leave Period "2026-01-01 to 2026-12-31"
    And click on Save button
    Then verify success message "Leave entitlement successfully added"
    
    Scenario: User generates report by selecting Leave Period
    When navigate to Leave module
    And click on Reports dropdown
    And click on My Leave Entitlements and Usage Report
    And select Leave Period "2026-01-01 to 2026-12-31"
    And click on Generate button
    Then verify report is generated successfully
    
    Scenario: Admin configures leave period with valid data
    When navigate to Leave module
    And click on Leave Period
    And select Start Month "January"
    And select Start Date "01"
    And click on Save button
    Then verify success message "Leave Period saved successfully"