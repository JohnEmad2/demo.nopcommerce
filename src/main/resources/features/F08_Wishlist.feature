@smoke
Feature: Add to wishlist
  Scenario: user add product to wishlist
    Given user clicks on the wishlist of a product
    When verify success message and background









  Scenario: user add and remove product to wishlist
    Given user clicks on the wishlist of a product
    And user checks the wishlist
    And remove the item
    Then user checks the wishlist get empty