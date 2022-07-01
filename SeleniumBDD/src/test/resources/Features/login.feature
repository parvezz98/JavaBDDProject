
Feature: feature to test login functionality


  Scenario: Check login is succesfull with valid crrdentials
    Given user is on login page
    When user enters username and password
    And click on login button
    Then user is naviagted to home page
