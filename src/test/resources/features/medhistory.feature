Feature:
  Scenario: Test medical history layout
    Given User is on workplace page
    Then select a populator
    And Go to "medical history" tab
    And Select the "General" Section
    And fill the below details
    |firstname|lastname|age|gender|
    |Kumar    |polam   |35 |M     |
    |Lavanya  |polam   |26 |F     |
    |karthik  |Polam   |10 |M     |
    |Riya     |Polam   |8  |F     |
    Then select the "BP" section
    And fill the below details
