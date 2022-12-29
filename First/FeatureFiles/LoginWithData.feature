@tag
Feature: Login functionality in orange HRM application

  @tag1
  Scenario: User login with valid credentials 
    Given user be in the orange HRM login page
    When user enter valid credentials username: "Admin" and password : "admin123"
    And clicks login button
    Then user should see the homepage
