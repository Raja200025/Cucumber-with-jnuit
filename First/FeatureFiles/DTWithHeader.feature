@tag
Feature: Orange HRM Login 

  @tag1
  Scenario: Login with user given credentials 
    Given user should go the orange HRM login page
    When user enter valid username and valid password as per the given below
    |username||password|
    |Admin||admin123|
    And clicks the login button present in the login page
    Then user should able to see the homepage or landing page
