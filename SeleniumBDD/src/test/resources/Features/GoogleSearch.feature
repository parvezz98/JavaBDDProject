Feature: Check Google search functinality 
Scenario: Validate google search is working

Given Browseris open
And User is in google search page
When user enter a tect in google search box
And hits enter
Then user is navigated to search result page