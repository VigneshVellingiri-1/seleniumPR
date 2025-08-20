@test
Feature: data table test
Scenario: to verify that the how the data table is used

Given The user lanched the URL
When The user entered valid user name and password
#|username|password|
|standard_user |
|secret_sauce |
And the user taped login button
Then the user should be logged successfull and navigate to home page
