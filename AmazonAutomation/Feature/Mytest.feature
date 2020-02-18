
Feature: Login functionality of amazon website with multiple credentials

  

  
  Scenario Outline: Verification of login button with multiple users
    Given Open the Chrome and launch the application
    
    When  Enter the <email> and <password>
    
    Then Login to the application

    Examples: 
      | email                    | password  | 
      | rupamdhar95@gmail.com    | rupam123# | 
      | qarupampromact@gmail.com | test1234 | 
      | rupamdhar95@gmail.com    | rupam123## | 