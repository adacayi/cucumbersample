Feature: Login
  This feature deals with the login functionality of the application

  Scenario: Logging with correct user name and password
    Given I navigate to the login page of the application
    And I enter the following for Login
      | UserName | Password |
      | admin    | password |
    And I click login button
    Then I should see the userform page

  Scenario Outline: Logging with correct user name and password with Scenario Outline
    Given I navigate to the login page of the application
    And I enter <UserName> and <Password>
    And I click login button
    Then I should see the userform page

    Examples:
      | UserName | Password |
      | admin    | password |
      | testing  | qa       |
