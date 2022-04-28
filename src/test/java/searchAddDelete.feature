Feature: AddSearchDeleteTest

  Scenario:

    Given go to website
    And search product
    And select product
    And add basket
    When go to basket
    Then delete product

