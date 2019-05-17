Feature: Create Contacts functionality


  Scenario: I am warned when trying to create a new contact with a short phone number
    Given I am logged in as admin
    When I click on 'Add'
    Then I should see a warning that the phone number is too short
    
