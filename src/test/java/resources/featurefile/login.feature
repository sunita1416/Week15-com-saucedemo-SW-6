@smoke
Feature: Login Test
  As a user I want to login into saucedemo homepage

  Scenario: As a User I should login successfully with valid credentials
    Given I am on homepage
    When I enter username "standard_user"
    And I enter password "secret_sauce"
    And I click on login
    Then I should be able to login successfully and see "Products"

