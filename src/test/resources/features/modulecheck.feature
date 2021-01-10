Feature: Check teh Tab Functuality
  @wip
  Scenario: Click on the tab and choose a module
    Given User is on log in page
    When User enter "driver" credentials
    Then User should land on the application
    And User click on the "Activities" and "Calendar Events"
    Then User should land the page of "Calendar Events - Activities"