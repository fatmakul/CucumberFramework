Feature: Sauce Labs Login
@login
  Scenario: Valid Login
    Given I am in the Login Page
    When I enter valid username
    And I enter valid password
    And I click on the login page
    Then I see the home page

  Scenario: Invalid Login
    Given I am in the Login Page
    When I enter invalid username
    And I enter invalid password
    And I click on the login page
    Then I see the error message