Feature: Select populator
  Scenario: Select populator by id
    Given user is on login page
    When user is logged in with valid credentials
    Then user should see the workplace
    When User types id "12" in the populator combobox
    Then user should see the populator option and select it
    And populator should be selected successfully