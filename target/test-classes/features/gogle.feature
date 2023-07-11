Feature: feature to test google search functinality

Scenario: validate google search working or not 

Given browser is open
And user in google search page
When user enter a text in serch box
And hits enter
Then user is navigated to serch results

 