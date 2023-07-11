Feature: login to test parameter functionality
  
 Scenario Outline: check login with siff data is successful with valid cridentials
     Given browser is open
    And user is on login page
    When user enters username and password
    And user clicks on login button
    Then user is navigated to the home page
    
 Examples:
|username||password|
|demo||1234| 
|demo1||123|  

