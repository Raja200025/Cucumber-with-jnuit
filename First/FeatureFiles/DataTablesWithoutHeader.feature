@samplelogin
Feature: Orange HRM Login Functionality

  Scenario: Login with valid credentials
    Given user should be on the orange HRM Login page
    When user enter the valid username and password
      | Admin |  | admin123 |
    And user click the login button
