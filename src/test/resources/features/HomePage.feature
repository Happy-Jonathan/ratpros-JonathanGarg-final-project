Feature: Validate Home Page

  Scenario: Validate home page title

    Given Browser opens to insurance app
    Then Validate home page title is TEK Insurance UI
    Then Quit browser

  Scenario: Validate Create Primary Account button

    Given Browser opens to insurance app
    Then Validate Create Primary Account button exists
    Then Quit browser