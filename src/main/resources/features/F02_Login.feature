@smoke
Feature: F02_Login | users could use login functionality to use their accounts

Background: shared steps for login
  Given User login tap

  Scenario: user could login with valid account
    And user enter valid email and password
    Then user login to the system successfully


  Scenario: user could login with invalid email and password
  And user login with invalid email and password
  And user press on login button
  Then user could not login to the system


