
Feature: Click on the Cart icon

  Scenario:User able to click on the Cart icon
    Given user click on the Cart icon
    Then cart page should be displayed
    And user able to see title "YOUR CART"

  Scenario: User able to click on the remove button
      Given user click on the remove button
      And user can remove the item
  @User
  Scenario: User able to click CheckOut button
    Given user click on the checkout button
    And checkout page should be displayed
  @User
  Scenario: User able to click on the ContinueShopping button
    Given user click on the ContinueShopping button
    And user able to see BasePage Icon