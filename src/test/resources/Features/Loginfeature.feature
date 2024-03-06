@tag
Feature: Test the login functinality of Orange hrm application
  I want to use this template for my feature file

  @tag1
  Scenario: Test the valid login
    Given user is on login page
    When user enters "admin" and "admin123"
    And click on login button
    Then user should land on homepage
    Then close the browser
