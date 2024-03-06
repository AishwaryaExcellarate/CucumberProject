Feature: Test the login functionality of the orange hrm application.

  Scenario Outline: Test the valid login.
    Given user is on login page
    When user enters <username> and <password>
    And click on login button
    Then user should land on homepage
    Then close the browser

    Examples: 
      | username | password |
      | admin    | admin123 |
