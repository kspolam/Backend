Feature:
  Scenario:
    Given User is on Home page
    When User searches for a product "Mobile Phone"
    And User enters password as "admin123"
    Then User should be able to login sucessfully