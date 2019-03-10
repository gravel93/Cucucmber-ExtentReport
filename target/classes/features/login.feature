@FunctionalTest
Feature: Log in into account

  Scenario: Log in with valid cradential 
    Given user should be in login page
    When enter valid username and password to inputs
    Then User Should successfully loged in into account

