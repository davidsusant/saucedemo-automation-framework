Feature: Login

  Background:
    Given user is on the SauceDemo login page

  Scenario: Login with valid credentials
    When user enters username "standard_user"
    And user enters password "secret_sauce"
    And user clicks login button
    Then user should be redirected to products page

  Scenario: Login with locked out user
    When user enters username "locked_out_user"
    And user enters password "secret_sauce"
    And user clicks login button
    Then error message "Epic sadface: Sorry, this user has been locked out" should be displayed

  Scenario: Login with invalid username
    When user enters username "invalid_user"
    And user enters password "secret_sauce"
    And user clicks login button
    Then error message "Epic sadface: Username and password do not match" should be displayed

  Scenario: Login with invalid password
    When user enters username "standard_user"
    And user enters password "invalid_password"
    And user clicks login button
    Then error message "Epic sadface: Username and password do not match" should be displayed

  Scenario: Login with empty credentials
    When user enters username ""
    And user enters password ""
    And user clicks login button
    Then error message "Epic sadface: Username is required" should be displayed

  Scenario: Login with empty username
    When user enters username ""
    And user enters password "secret_sauce"
    And user clicks login button
    Then error message "Epic sadface: Username is required" should be displayed

  Scenario: Login with empty password
    When user enters username "standard_user"
    And user enters password ""
    And user clicks login button
    Then error message "Epic sadface: Password is required" should be displayed