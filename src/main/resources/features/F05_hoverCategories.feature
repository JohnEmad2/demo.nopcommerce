@smoke
Feature:F05 | select random one of the three main categories
  Scenario: random one of the three main categories
  Given user selects random one of the three main categories
  And user should hover on the selected category
  And after hovering, user selects random one of the three sub categories
 Then Chosen categories