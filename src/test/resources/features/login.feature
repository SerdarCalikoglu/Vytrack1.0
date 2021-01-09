Feature: log in

  Scenario: log in with invalid user name
    Given User is on log in page
    When User log in with "invalid" user name
    And User log in with "driver_password" password
    And User enter the submit button
    Then User should see the following message "Invalid user name or password."

  Scenario: log in with invalid user name
    Given User is on log in page
    When User log in with "driver_username" user name
    And User log in with "invalid" password
    And User enter the submit button
    Then User should see the following message "Invalid user name or password."

  Scenario: log in with invalid user name
    Given User is on log in page
    When User log in with "driver_username" user name
    And User log in with "driver_password" password
    And User enter the submit button
    Then User should see the current url "https://qa3.vytrack.com/"
    Then User should see "John Doe" as a username

  Scenario: log in with invalid user name
    Given User is on log in page
    When User log in with "sales_manager_username" user name
    And User log in with "sales_manager_password" password
    And User enter the submit button
    Then User should see the current url "https://qa3.vytrack.com/"
    Then User should see "Peyton Harber" as a username

  Scenario: log in with invalid user name
    Given User is on log in page
    When User log in with "store_manager_username" user name
    And User log in with "store_manager_password" password
    And User enter the submit button
    Then User should see the current url "https://qa3.vytrack.com/"
    Then User should see "Marcella Huels" as a username



  @wip
Scenario Outline:
  Given User is on log in page
  When User log in with "<user>" as a username
  And User log in with "<password>" as a user password
    And User enter the submit button
  And User should see the current url "https://qa3.vytrack.com/"
  Then User should see "<username>" as a username
    Examples:
      | user|password|username|
      |driver_username|driver_password|John Doe|
      |sales_manager_username|sales_manager_password|Peyton Harber|
      |store_manager_username|store_manager_password|Marcella Huels|
