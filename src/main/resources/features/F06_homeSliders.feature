@smoke

Feature: clicking on slider
  Scenario: user click on slider to review the product
    Given  user click on slider button
    And user reviews the result of that click


    Scenario: second slider is clickable on home page
      Given user click on the second slider button
      And user reviews the second result of that click
