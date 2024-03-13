#Author
#Date
#Description

Feature: Test login functionality of sauce demo application
  I want to use this template for my feature file

  Scenario: Check login is successfull with valid credentials
    Given user is on login page
    When user enters standard_user and secret_sauce
    And clicks on login button
    Then user is navigating to the homepage
    And  user verifying title of the homepage
    
    Then close the browser