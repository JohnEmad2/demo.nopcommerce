@smoke
Feature: F04 | users could search for products

  Scenario Outline: Searching for 3 main products
    When users enter product name "<search>" to search
    And user click on search button
    Then user find relative product "<search>"
    Examples:
    |search |
    | book  |
    | laptop|
    | nike  |


    Scenario Outline: user could search for product using sku
      Given users enter product serial no "<search>" to search
      When  And user click on search button
      Then user find relative products "<search>"
      Examples:
        | search |
      |    SCI_FAITH  |
      |   APPLE_CAM   |
      |   SF_PRO_11   |

