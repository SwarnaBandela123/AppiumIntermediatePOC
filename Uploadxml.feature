Feature: Create a new project by Uploading xml file
  Scenario: Create a new project by Uploading xml file
    Given Launch MC web application
    When Click on Upload xml file
    And Verify the data in all fields
    And Save project and submit project
    Then New project created by uploaded xml file
