Feature: Create and validate account

  Background: Navigate to Create Account

    When Navigate to Create Primary Account form

  Scenario: Validate Create Account title

    Then Validate Create Account title is Create Primary Account Holder

  Scenario: Create new account

    When Enter email address "ShibaInuLOL11@aol.com"
    And Enter first name "Happy"
    And Enter gender
    And Enter employment status "Student"
    And Enter title
    And Enter last name "Halloween"
    And Enter marital status
    And Enter date of birth "03222020"
    And Click new account button
    And Enter username "HappyUsername11" and password "HappyPassword" and confirm password "HappyPassword"
    And Click submit button
    And Click login page button
    And Enter username "HappyUsername11" and password "HappyPassword"
    And Click sign in button
    And Click settings button
    Then Validate email address

  Scenario: Create new account using existing email address

    When Enter email address "ShibaInuLOL8@aol.com"
    And Enter first name "Happy"
    And Enter gender
    And Enter employment status "Student"
    And Enter title
    And Enter last name "Halloween"
    And Enter marital status
    And Enter date of birth "03222020"
    And Click new account button
    Then Validate error message
