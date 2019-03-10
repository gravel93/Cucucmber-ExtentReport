@FunctionalTest
Feature: ShoppingCard Feature

  Scenario: verify shopping card functionality
    Given User should be in ShoppingCard
    When Click on continue btn and choose item ShouldBeKindToday and add to card
    Then User Should successfully add item to the bracket