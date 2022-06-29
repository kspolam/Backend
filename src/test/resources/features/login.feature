Feature: login with different users
  Scenario Outline: Login with different type of possiblities
    Given User is on application landing page
    When User clicks on login button
    Then User is displayed on login page
    When user enteres "<username>" in username field
    And user enters "<passworkd>" in password field
    And user clicks on singin button
    Then user should see failure message

    Examples:
      | username | password|
      |kspolam   |Kumar@1984|
      |lambdike  |heyufool  |
      |rightUser |wrongPass |
      |wruser    |rightPas  |



