Feature: Test for products should be  added to the cart.
  I want to use this template for my feature file

  Scenario Outline: Testing the adding product to cart functionality.
    Given user is on login page
    When  user enters <username> and <password>
    And   user clicks on login button
    Then  user should be navigating to home page
    Given user is on home page
    When  user should get lists of <productName>
    And   user should add <productName> to the cart
    Then  user should click on carticon
    Given user should be in cartpage
    When  user should verify <productName> in the cartpage
    And   user closed the browser

    Examples: 
      | username      | password     | productName           |
      | standard_user | secret_sauce | Sauce Labs Bike Light |
