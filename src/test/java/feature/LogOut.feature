Feature: Admin Logout

  @regression

  Scenario: I should be logged out successfully

    Given I am already logged in
    When I click on Logout button
    Then I should be able to log out successfully
    And see success message