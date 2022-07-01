Feature: Test Login Functionality

  Scenario Outline: Check login is succesfull with valid credentials
    Given browser is open
    And user is on home page
    When user enters <username> and <password>
    And user clicks on login
    Then user is naviagted to home page

    Examples: 
      | username | password |
      | Raghav   |    12345 |
      | Ele      |    12345 |
