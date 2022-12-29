@LoginWith2users
Feature: Orange HRM Login 

  
  Scenario Outline:  Login with correct credentials 
    Given person should be in Orange HRM login page
    When user enter valid "<username>" and "<password>" as per the given below
    When clicks on the login button 
    Then user navigate to homepage or landing page
    Examples:
    |username||password|
    |Admin||admin123|
    |Admin||admin1&3|