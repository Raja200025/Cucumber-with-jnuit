@taggedHooks
Feature: Test Tagged Hooks

  @first
  Scenario: This is first scenario
    Given this is first first step
    When this is second step
    Then this is third step

  @second
  Scenario: This is second scenario
    Given this is first first step
    When this is second step
    Then this is third step

  @third
  Scenario: this is third scenario
    Given this is first first step
    When this is second step
    Then this is third step
