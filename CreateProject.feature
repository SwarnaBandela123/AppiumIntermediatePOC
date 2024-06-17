Feature: Open the MC web application and create a new project  
  Scenario: Create new project
    Given Launch MC web application
    When Click on New project
    And Enter the data in all fields
    And Save project and submit project
    Then New project created