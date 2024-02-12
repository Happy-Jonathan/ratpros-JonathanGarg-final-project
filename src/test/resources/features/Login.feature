Feature: Validate Login

  Background: Navigate to login form

    When Click login button

  Scenario: Validate login is functional

    When Enter username "supervisor" and password "tek_supervisor"
    When Click login sign in button
    Then Validate page is Customer Service Portal

  Scenario:  Log into account using incorrect username

    When Enter username "stupidvisor" and password "tek_supervisor"
    When Click login sign in button
    Then Validate login error message

  Scenario:  Log into account using incorrect password

    When Enter username "supervisor" and password "tek_stupidvisor"
    When Click login sign in button
    Then Validate login error message


