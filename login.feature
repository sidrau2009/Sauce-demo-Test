Feature: feature to test login functionality

  Scenario Outline: Check login is successfull with valid credentials
    Given browser is open
    When user enters <username> and <password>
    And clicks on login button
    Then user is navigated to the home page

    Examples: 
      | username      | password     |
      | standard_user | secret_sauce |