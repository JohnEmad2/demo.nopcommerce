@smoke
Feature: F03 | Euro symbol

  Scenario: verify Euro Symbol (€) is shown on the 4 products displayed in Home page
    Given user select euro currency
    Then  euro symbol shows on the products displayed in Home page