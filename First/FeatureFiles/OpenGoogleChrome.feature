@tag
Feature: This is to Test Google Search

  @tag1
  Scenario: Google Search
    Given user enters in google.com
    When users enters search term as "current affairs"
    And click search button or hit enter button in the keyboard
    Then user should see the search results
