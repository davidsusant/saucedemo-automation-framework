Feature: Login

  Background:
    Given user is on the SauceDemo login page

  Scenario: Login with valid credentials
    When user enters username "standard_user"
    And user enters password "secret_sauce"
    And user clicks login button
    Then user should be redirected to products page
    And user should see the products page title