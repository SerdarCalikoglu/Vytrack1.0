Feature: log in
@wip
  Scenario: log in with invalid user name
    Given User is on log in page
    When User log in with "invalid" user name
    And User log in with "valid" password
    And User enter the submit button
    Then User should see the following message "Invalid user name or password.."