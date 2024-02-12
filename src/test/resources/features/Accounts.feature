Feature: Validate Profile Accounts information

  Background: Navigate to login form

    When Click login button
    When Enter username "supervisor" and password "tek_supervisor"
    When Click login sign in button
    When Click accounts button

  Scenario: Validate accounts table showing 5 rows

    Then Validate 5 rows of accounts data are present

  Scenario: Validate accounts table showing 10 rows

    When Click show "10"
    Then Validate 10 rows of accounts data are present

  Scenario: Validate accounts table showing 25 rows

    When Click show "25"
    Then Validate 25 rows of accounts data are present

  Scenario: Validate accounts table showing 50 rows

    When Click show "50"
    Then Validate 50 rows of accounts data are present
