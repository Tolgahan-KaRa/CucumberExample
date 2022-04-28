Feature: AddSearchDeleteTest

  Scenario Outline:

    Given go to website
    And search product "<item>"
    And select product
    And add basket
    When go to basket
    Then delete product

    Examples:
      |item|