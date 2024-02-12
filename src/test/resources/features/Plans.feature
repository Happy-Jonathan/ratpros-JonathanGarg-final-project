Feature: Validate Profile Plans information

  Background: Navigate to login form

    When Click login button
    When Enter username "supervisor" and password "tek_supervisor"
    When Click login sign in button
    When Click plans button

  Scenario: Validate plans table

    Then Validate 4 rows of data are present

  Scenario: Validate plans dates

    Then Validate Date Created is current date and Date Expired is the day after