Feature: Pixel store pos

  Background: 
   Given sales exective logged into machine

  @RegressionTest
  Scenario: Executive signup
    Given executive provides the details
    Then signup success

  @smoke @RegressionTest
  Scenario: shopping cart
    Given executive added the items to cart
    When items price is calculated
    Then bill is generated with final amount

  @FunctionalTest
  Scenario Outline: Sales executive signIn
    When Sales provides "<user>" and "<password>"
    Then Login is success


    Examples: 
      | user     |  | password    |
      | Lalitha  |  | Password123 |
      | Markvins |  | kour1234    |
     
     @datadriven
      Scenario: Searching of a product
      When Larry searches for a products in search field
      Then Larry verifies the product availability
      |Head|
      |Hand|
      |Lap|
      