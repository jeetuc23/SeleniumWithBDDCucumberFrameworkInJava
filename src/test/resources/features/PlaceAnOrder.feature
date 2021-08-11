Feature: Login to e-commerce site and place four different product orders and verify

  Scenario: Placing an order after adding to wishlist
    Given I add four different product to my wish list
    When I view my wishlist table
    Then I find total four selected items in my wishlist
    When I search for lowest price product
    And I am able to add the lowest price item to my cart
    Then I am able to verify the item in my cart


