
Feature: Verify the login

  Scenario: Login to opencart
    Given Launch the URL
    And Navigate the login page
    And enter the username and password
   	When click on login button
    Then I validate the outcomes
    And check more outcomes

  