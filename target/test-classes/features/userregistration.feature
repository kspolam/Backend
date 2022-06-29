Feature: User registration
  Scenario: User registration with different data
    Given When User is on registration page
    When User enters following details
    |Kumar|swamy|kspolam@gmail.com|
    |karthik|polam|kspolam@gmai.com|
    Then user should be registered successfully