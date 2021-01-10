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


  Scenario: log in as a driver

    Given User is on log in page
    When User log in with "driver_username" user name
    And User log in with "driver_password" password
    And User enter the submit button
    When User should see the following list
    |Fleet|
    |Customers|
    |Activities|
    |System    |
    Then User should see "https://qa3.vytrack.com/" as current url
    And User should see "John Doe" as a user name

  Scenario: log in as a sales manager

    Given User is on log in page
    When User log in with "sales_manager_username" user name
    And User log in with "sales_manager_password" password
    And User enter the submit button
    When User should see the following list
      |Dashboards|
      |Fleet|
      |Customers|
      |Sales    |
      |Activities|
      |Marketing |
      |Reports & Segments|
      |System    |
    Then User should see "https://qa3.vytrack.com/" as current url
    And User should see "Peyton Harber" as a user name
  @wip
  Scenario: log in as a sales manager
    Given User is on log in page
    When User log in with "store_manager_username" user name
    And User log in with "store_manager_password" password
    And User enter the submit button
    When User should see the following list
      |Dashboards|
      |Fleet|
      |Customers|
      |Sales    |
      |Activities|
      |Marketing |
      |Reports & Segments|
      |System    |
    Then User should see "https://qa3.vytrack.com/" as current url
    And User should see "Marcella Huels" as a user name

