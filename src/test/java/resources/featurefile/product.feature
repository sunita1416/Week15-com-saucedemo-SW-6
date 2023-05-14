Feature: Product page

  Scenario: Verify that six products are displayed on the product page
    Given I am on homepage
    And I enter username "standard_user"
    And I enter password "secret_sauce"
    And I click on login
    Then I should be able to login successfully and see "Products"
    Then Verify that six products are displayed on the product page