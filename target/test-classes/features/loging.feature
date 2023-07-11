Feature: login to test login functionality

  Scenario: check login is successful with valid cridentials
    Given user is on login page
    When user enters username and password
    And user clicks on login button
    Then user is navigated to the home page

 
