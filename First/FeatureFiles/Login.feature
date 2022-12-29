@tag
Feature: Login functionality in orange HRM application

  @tag1
  Scenario: User login with valid credentials
    Given user be on orange HRM login page
    When user enter valid username and valid password
    And click the login button
    Then user should navigate to homepage
