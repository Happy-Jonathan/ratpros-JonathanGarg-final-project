Feature: Validate User Profile information

  Background: Navigate to login form

    When Click login button
    When Enter username "HappyUsername8" and password "HappyPassword"
    When Click login sign in button
    When Click profile button

  Scenario: Validate profile information

    Then Validate profile information

  Scenario:

    Then Click logout button