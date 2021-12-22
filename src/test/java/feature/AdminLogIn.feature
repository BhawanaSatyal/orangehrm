Feature: Admin Login
  @regression
  Scenario: I want to Log in as Admin User


    Given I am on Login Page
    When I enter admin log in username
    And I enter valid password
    And I click on log in submit button
    Then I should be logged in successfully
